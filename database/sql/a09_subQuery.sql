/* a09_subQuery.sql
subquery?
�ϳ��� select������ �� �ȿ� ���Ե� �� �ϳ��� select ������ ���Ѵ�.
���������� �����ϰ� �ִ� �������� ��������(main query), ���Ե� �� �ϳ���
������ ���� ����(subquery)��� �Ѵ�.
ex) ������̺��� ������ �ְ�� ���� ����� �̸��� ������ list�ϼ���..
SELECT ENAME, SAL   --> MAIN QUERY
FROM EMP
WHERE SAL = ( SELECT MAX(SAL)
              FROM EMP )  --> SUBQUERY
SELECT MAX(@@), ENAM, JOB			   
�ۼ��� ������
1. ���������� �� ������(=,>,<...)�� �����ʿ� ����ؾ� �ϰ�  ��ȣ��
   �ѷ��� �ִ� ���� �Ϲ����̴�.
2. ���������� ���� ������ ����Ǳ� ������ ����ȴ�.

���������� ����
1. ������ ������ ó���Ǵ� ���.
   SELECT *
   FROM ���̺�
   WHERE �÷��� = (SELECT �÷� FROM ���̺� WHERE ����);
   ## ���ϰ� ����: =,>,< (�񱳿����� Ȱ��)
      ���߰� ����: IN, EXIST, ANY, ALL

2. ���̺�� ��ü�� SUBQUERY ó���ϴ� ���..
   SELECT �÷���1+�÷���2, ....
   FROM ( SELECT �÷���1, �÷���2, �Լ�(�÷���3)
            FROM ���̺��
			WHER ����  )
   WHERE ����..			

3. SELECT (SELECT �÷�1 FROM ���̺�� WHERE ����=�������̺� ����1 ),
          �÷�2, �÷�3
    FROM ���̺�
	WHERE ����...		     
			  
*/
-- 1. ���ǰ����� SUBQUERY�� ���Ǵ� ���.
--   EX) ��տ������� ���� ������� �̸��� ������ ����ϼ���.
SELECT ENAME, SAL
FROM EMP
WHERE SAL>( SELECT AVG(SAL)
             FROM EMP );
--   EX) ���ʽ��� �ִ� ������� ��, �ְ��� ����� �̸��� ������ ���ʽ���
--        ����ϼ���..
SELECT ENAME, SAL, COMM
FROM EMP
WHERE COMM =(
SELECT MAX(COMM)
FROM EMP);
--   EX) ���ʽ��� �ִ� ������� ��, ��� ���ʽ����� ����  ����ϼ���..
SELECT AVG(COMM)
FROM EMP
WHERE COMM IS NOT NULL;
--   EX) ������� ��, ��� ���ʽ����� ����  ����ϼ���..
SELECT AVG(NVL(COMM,0))
FROM EMP;
SELECT ENAME, SAL, COMM
FROM EMP
WHERE COMM >(SELECT AVG(COMM)
				FROM EMP
			WHERE COMM IS NOT NULL);
SELECT * FROM EMP;
-- Ȯ�ο���
-- 1. �μ���ȣ�� ���� ���� ����� �̸��� �μ��� ����ϼ���..
SELECT ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = (SELECT MAX(DEPTNO) FROM EMP);
-- 2. ���� �ֱٿ� �Ի��� ����� �̸��� ��å, �Ի����� ����ϼ���.
-- ==> MAX(HIREDATE):�ֱٿ� �Ի���
-- ==> MIN(HIREDATE):���� ���� �Ի��� �Ի���
SELECT ENAME, JOB, HIREDATE
FROM EMP
WHERE HIREDATE = (SELECT MAX(HIREDATE) FROM EMP);
SELECT * FROM EMP;
-- SUBQUERY�� ������� 2�� �̻��� ���..
-- EX) �μ����� �Ի����� �ְ��� ������� �̸��� �Ի����� ����ϼ���.
SELECT DEPTNO, MAX(HIREDATE)
FROM EMP
GROUP BY DEPTNO;
-- 1) ���� ���ǿ� ���� ó��..
SELECT *
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE DEPTNO<30);
-- IN ���п� QUERY�� �־ �ش��ϴ� ������ ������ ������ ó���� �� �ִ�.
-- SAL�� 3000, DEPTNO 20
-- DEPTNO, HIREDATE�� ������ �Ѵ� QUERY�� ���ؼ� ó���� ��..
SELECT ENAME, HIREDATE, DEPTNO
FROM EMP
WHERE (DEPTNO, HIREDATE) IN ( SELECT DEPTNO, MAX(HIREDATE)
	                        FROM EMP
							 GROUP BY DEPTNO);
-- SUBQUERY�� �������	�ΰ� �̻� ���� ����, �ش� �÷��� ������ �´� �÷��� �������־
--  ��� ó���� �����ϰ� �Ѵ�.  (�÷�1, �÷�2 ) IN (SELECT �÷�1, �Լ�(�÷�2) FROM...
SELECT * FROM EMP;
-- Ȯ�ο���
-- 1. JOB(��å��)�� ���� ���� ������ �޴� ����� �̸�, ��å, ������ ����ϼ���..
SELECT ENAME, JOB, SAL
FROM EMP
WHERE (SAL, JOB) IN(
					SELECT MIN(SAL), JOB
				FROM EMP
				GROUP BY JOB);
-- ����(��������)
-- 1. �Ի��� �б⺰�� ���� ���� ������ �޴� ����� ����ϼ���.
select ename, sal, hiredate, floor(to_number(to_char(hiredate,'MM'))/4)+1 term
from emp
where sal in(  
	select max(sal)
	from(select floor(to_number(to_char(hiredate,'MM'))/4)+1 term, sal
			from emp)
	group by term
);



-- 2. ������ 3000 �̻��� ��� �߿�, ���(���̺�Ȱ�뵵 ����)�� �����
-- 	�ش� ��޺� �ְ� ������ �޴� �����  �̸�, ���, ������ ����ϼ���.
select ename, grade, sal 
from emp, salgrade
where (grade, sal) in(
	select grade, max(sal)
	from emp, salgrade
	where sal>=3000
	and sal between losal and hisal
	group by grade);

select * from salgrade;


/*
��� ���̺��� 30�� �Ҽ� ����� �߿��� �޿��� ���� ���� �޴� ��� ����
���� �޿��� ���� ����� �̸��� �޿��� ����ϼ���.
##
30�� �Ҽ� ����� �߿��� �޿��� ���� ���� �޴� ��� 
==> 1) GROUP �Լ��̿�.
    2) ��ü�����͸� SUBQUERY�� �ε��ؼ�..
		== ALL, ANY ..(SUBQUERY)
		ALL : subquery�� ��� ���� ��ġ�� ��.
		<==> ANY, SOME : SUBQUERY�� ������� �ϳ� �̻� ��ġ�ϸ� 
*/
SELECT ENAME, SAL
FROM EMP
WHERE SAL >= ALL(SELECT SAL FROM EMP WHERE DEPTNO=30);
/**/
SELECT SAL FROM EMP WHERE DEPTNO=30;
SELECT ENAME, SAL
FROM EMP
WHERE SAL >= ANY(SELECT SAL FROM EMP WHERE DEPTNO=30);
SELECT * FROM EMP;
-- Ȯ�ο���
-- 1. ������ 3000�̸��� ��� �߿�, �ֱٿ� �Ի��� ����� �����ȣ�� ���� �Ի�����
-- 	����ϼ���
SELECT EMPNO, SAL, HIREDATE
FROM EMP
WHERE HIREDATE >=ALL(
SELECT HIREDATE
FROM EMP
WHERE SAL<3000);
-- ����.
-- 1. �μ���ȣ�� 30�� ��� �߿�, ���� ���߿� �Ի��� ������� ������ ������ ����ϼ���.
select *
from emp
where sal>=any(
			select sal
			from emp
			where hiredate=(select max(hiredate) from emp
			where deptno=30)
			);

-- 2. ������ 'SALESMAN'�� ����� �޴� �޿����� �ּ� �޿����� ���� �޴� ������� �̸���
-- �޿��� ����ϵ� �μ���ȣ 20���� ����� �����Ѵ�. (ANY������ �̿�)
SELECT ENAME, SAL, DEPTNO 
FROM EMP
WHERE SAL>=ANY(
				select SAL
				from emp
				where job='SALESMAN')
AND DEPTNO!=20;

/*
WHERE EXISTS(SUBQUERY)
:�ش� SUBQUERY�� �����Ͱ� �ִ��� ���θ� üũ�ؼ� ���� SQL�� ó���ϰ��� �Ҷ�
Ȱ��ȴ�.
EX) �μ���ȣ�� 30�� �����Ͱ� ������ ��ü ������̺��� LIST �ϼ���..
    ���࿡ �μ���ȣ�� 30���� ������ ��ü ������̺� LIST�� ���� ó���ϰڴ�.
*/
SELECT * 
FROM EMP
WHERE EXISTS(SELECT * FROM EMP WHERE DEPTNO=30);
--  Ư�� ���ǿ� ���ؼ� ��ü ������ �ε� ���θ� ó���ϰ��� �� ��, Ȱ��ȴ�.
-- Ȯ�ο���
-- �����ڹ�ȣ(MGR)�� �������߿� NULL���� ������, �̸��� �����ڹ�ȣ, ��å
--  �� ����ϰ��� �Ѵ�. SQL�� �ۼ��ϼ���..
SELECT ENAME, MGR, JOB
FROM EMP
WHERE EXISTS(SELECT * FROM EMP WHERE MGR IS NULL);
/*
���������� Ȱ���� ���̺� ����, ������ �Է�, ����, ����..

1. ���̺� �����ϱ�..
	1) ������ + ����
		CREATE TABLE �������̺��
		AS SELECT �÷�1, �÷�2 FROM ���̺�  WHERE ����..
	EX) ������ 2000�̻��� ������ �߿�  �����ȣ(no) �����(name), ����(salary), 
	                         �μ��̸�(dname) ��
	    ���̺��� emp001�� ������� �Ѵ�.	
*/
create table emp001
as
SELECT empno no, ename name, sal salary, dname
 FROM EMP A, DEPT B
 where A.DEPTNO=B.DEPTNO
 AND sal>=2000;
SELECT empno no, ename name, sal salary, dname
 FROM EMP A, DEPT B
 where A.DEPTNO=B.DEPTNO
 AND sal>=2000;
/*
 
 */
select * from emp;
drop table emp001;
-- Ȯ�ο��� - emp, salgrade ���̺��� Ȱ���Ͽ�
-- ������ ���� �ű����̺��� �����ϼ���..
-- ������ 1000 �̻� �Ǵ� ������ ��,
-- �����(name), �μ���ȣ(partno), ����(salary), �޿����(grade)
-- �� ��, empgrade ���̺��� �����ϼ���.
create table empgrade
 as
 select ename name, deptno partno, sal salary, grade
 from  emp, salgrade
 where sal between losal and hisal
 and sal>=1000;
select * from empgrade;
-- ��������
-- ������ ���� ������ ���̺��� �����ϼ���.
-- �̸�(name) ��ȣ(no) �Ի���(credate)-���ڿ�   ���ر��رٹ�����(workyears)
-- 					@@@@ �� @@@ �� @@@ ��      @@@@
-- new_emp �� �����ϼ���.
create table new_emp
as
SELECT ENAME name, EMPNO NO, 
TO_CHAR(HIREDATE,'YYYY"��" MM"��" DD"��"') CREDATE,
floor(months_between(sysdate,HIREDATE)/12) workyears
from emp; 
select * from new_emp;

/*
�������� ������ �����ϰ��� �� ��..
where 1=0�� ó�� �ؼ� ���̺��� ����
*/
create table emp_structor
as
select * 
from emp
where 1=0;
select * from emp_structor;
