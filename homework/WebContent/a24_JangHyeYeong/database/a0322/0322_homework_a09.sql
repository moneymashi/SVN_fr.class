/*
����1
1. �Ի��� �б⺰�� ���� ���� ������ �޴� ����� ����ϼ���.
2. ������ 3000�̻��� ��� �߿�, ���(���̺�Ȱ�뵵 ����)�� ����� 
�ش� ��޺��� �ְ� ������ �޴� ����� �̸�, ���, ������ ����ϼ���


*/


/********����1_1**********/
select ename "�̸�", sal "����", floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1 "�Ի� �б�" from emp
where (sal,floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1) 
in (select max(sal),floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1 from emp 
group by floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1); --�Ի�б⺰


select max(sal),floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1 
from emp
group by floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1;

select max(sal) from emp where floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1=1; --2450
select max(sal) from emp where floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1=2; --2975
select max(sal) from emp where floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1=3; --1500
select max(sal) from emp where floor((TO_CHAR(HIREDATE,'MM')-1)/3)+1=4; --5000


/**********���� 1_2*********/
SELECT ENAME, GRADE, SAL FROM EMP, SALGRADE 
WHERE (GRADE, SAL) IN(SELECT GRADE, MAX(SAL) FROM EMP,SALGRADE WHERE SAL BETWEEN LOSAL AND HISAL AND SAL>=3000
GROUP BY GRADE);




/*
����2
 1. �μ���ȣ�� 30�� ��� �߿�, ���� ���߿� �Ի��� ������� ������ ������ ����ϼ���.
 2. ������ 'SALESMAN'�� ����� �޴� �޿����� �ּ� �޿����� ���� �޴� ������� �̸��� �޿���
 ����ϵ� �μ���ȣ 20���� ����� �����Ѵ�. (ANY ������ �̿�)
*/

/********����2_1*********/
SELECT * FROM EMP WHERE SAL>=ALL(SELECT SAL FROM EMP WHERE HIREDATE=(SELECT MAX(HIREDATE) FROM EMP WHERE DEPTNO=30));


/*********����2_2*********/

SELECT ENAME, SAL, DEPTNO FROM EMP 
WHERE DEPTNO!=20 AND SAL>ANY(SELECT SAL FROM EMP WHERE JOB='SALESMAN');

/*
����3
������ ���� ������ ���̺��� �����ϼ���.
�̸�(name) ��ȣ(no) �Ի���(credate)-���ڿ� ���ر��رٹ�����(workyears)
					@@@�� @@�� @@�� 				@@@@
new_emp�� �����ϼ���.
*/


/***���̺�Ʋ ����**/
create table new_emp as select ename name, empno no, 
'                    ' credate,
0 workyears from emp where 1=0;

select * from new_emp;

/***������ ����**/
insert into new_emp 
select ename name, empno no, 
to_char(hiredate, 'YYYY"��" MM"��" DD"��"') credate,
to_char(sysdate,'YYYY')-to_char(hiredate,'YYYY') workyears from emp;

select ename name, empno no, 
to_char(hiredate, 'YYYY"��" MM"��" DD"��"') credate,
to_char(sysdate,'YYYY')-to_char(hiredate,'YYYY')||'��' workyears from emp;


select * from new_emp;



