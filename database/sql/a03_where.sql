select * from emp;
--
/*
or ������ : ��ȸ ���ǿ� �־, �ϳ��� ���Ǹ� �����ϴ���,
�ش� �����Ͱ� ��� ó���Ǵ� ���� ���Ѵ�.
select �÷�
from ���̺��
where �÷�1 = ����1 or �÷�2 = ����2
�������� ���� �÷�1=����1�� �����ϰų�, �÷�2=����2�� ������ �� 
�����Ͱ� ��Ÿ���� ������ �ش� �����͸� ���� list�Ѵ�.
ex) �μ���ȣ�� 30�̰ų� ������� 'SMITH'�� �����͸� list�ϼ���.
*/
select * from EMP 
where deptno=30 or ename='SMITH';
-- Ȯ�ο���) ���ʽ��� �ְų� ��å�� 'SALESMAN'�� ���� ����ϼ���.
select * from emp
where comm is not null or job = 'SALESMAN';
/*
NOT ������
�ش� �������� ���̸� ����, �����̸� ������ ó���Ǿ� ��Ÿ�� �ʿ䰡 ���� ��,
Ȱ���Ѵ�.
�Ϲ�������, ���� �̿ܿ� �����͸� ����Ʈ�ϰ��� �� �� Ȱ��ȴ�.

�μ���ȣ�� 10�� �ƴ� �����͸� ����Ʈ�ϼ��� 
*/
SELECT * FROM EMP 
WHERE not deptno = 10; -- deptno <> 10, deptno !=10 (������ ȿ��)
select * from emp;
--  Ȯ�ο���) ������ 2000~3000�� �ƴ�(2000�̸� �̰ų� 3000�ʰ�)�� ���� not
-- keyword�� Ȱ���ؼ� list �ϼ���.
select * from emp
where not (sal>=2000 and sal<=3000);
-- Ȯ�ο���) ��å�� SALESMAN�� �ƴϰ�, ������ 2000�̻��� ����� LIST�ϼ���
select * from emp
where not job ='SALESMAN'
and sal>=2000;
/*
between and������ 
�������� ������ Ư�� ���� ���̿� ���� ��, Ȱ��Ǵ� Ű�����̴�.
where �÷��� between A and B
�ش� �������� �÷��� ������ A�� B���̿� �ִ� ���� ���Ѵ�.
ex) ������ 2000���� 3000���̿� �ִ� �����͸� list�ϼ���..
*/
select * from emp
where sal between 2000 and 3000;
-- Ȯ�ο��� ����� 7400~7500 ���̿� ������ ������ 2000�̸��̰ų� 3000�ʰ��ϴ�
--         �����͸� list �ϼ���..
select * from emp
where empno between 7400 and 7500
and not (sal between 2000 and 3000);
/*
��¥�� ���� ó��..
�Ի����� 1981/01/01 ���� 1981/12/31 ���̿� �ִ� �����͸� list�ϼ���..
*/
--Ȯ�ο���) �Ի����� 1981�� 12���� �Ի��� ����� �̸��� �μ���ȣ�� ����ϼ���.
select * from EMP 
where EMP.HIREDATE between '1981/12/01' and '1981/12/31';
-- sysdate : ���� ��¥�� ����ִ� ����
select ename, hiredate, sysdate
from emp;
/*
IN ������
	�ش� �����Ϳ� ���� ������ ó���� ��, ���� �����Ϳ� ���� ��ȸ�� �ϰ��� �Ҷ� Ȱ��ȴ�.
	or�����ڿ� ������ ����
	����) �÷��� IN (�ش絥����1, �ش絥����2, �ش絥����3)
*/
select * from EMP;
-- �����ڹ�ȣ�� 7902, 7566, 7839�ΰ��� LIST�ϼ���..
SELECT * FROM emp
where mgr in (7902,7566,7839);
-- Ȯ�ο���) ����̸��� 'SMITH', 'WARD', 'JONES' �� ��� ��, ������ 1000�̸��� �����͸�
--         �̸��� ������ ����ϼ���.
select * from emp
where ename in('SMITH', 'WARD', 'JONES') AND SAL<1000;
/*
like�����ڿ� ���ϵ�ī��(%,_)Ȱ���ϱ�.
Ư�������Ϳ� ���� ���ڿ� ��ü ������ ��Ȯ�ϰ� ���� ���� ��, �˻������� ���� like�����ڿ�
���ϵ�ī�带 Ȱ���ϴ� ����̴�..
����) �˻��÷��� like '%�˻��ҵ�����%';

ex) ������� K�� ������ �����͸� list�ϼ���
*/
select * from emp
where ename like '%K%';
-- ���� K�� �����ϴ� �����͸� list�ҷ���?
select * from emp
where ename like 'K%';
select * from emp;
-- ��å��, MAN���� ������ �����͸� list�ϼ���..
select * from emp
where job like '%MAN';
SELECT * FROM EMP;
-- Ȯ�ο���) ��å��, S�� �����ϴ� �����Ϳ��� ���ʽ��� 300�̰ų� 400�̰ų�, 700�� �����͸�
--       ��å, �����, ���ʽ��� list�ϼ���..
select job, ename, comm
from emp
where job like 'S%'
and comm in(300,400,700);
select * from emp;
/*
���ϵ�ī��(_) ����ϱ�
_���ڼ��� �����ؼ� �ش系���� �˻��ϰ��� �Ҷ�, Ȱ���Ѵ�..

ex) �ι�° ���ڰ� 'A'�� ����� list 
*/
select * from emp
where ename like '_A%'; --�ι�° ���ڰ� A�ε� ���� ��ü ���
-- Ȯ�ο���) ������� 3��° ���ڰ� A�� �������߿�  �޿��� 2000�̻��� ���� list�ϼ���.

select * from emp
where ename like '__A%' and sal > 2000;
/*
NOT LIKE '���̵�ī��(%,_)'�ش� ������ �ƴ� ���� ���
ex) �̸��� 'A'���ڰ� ���Ե��� �ʴ� ����� �˻�.
*/
select * from emp
where ename not like '%A%';
select * from emp;
-- Ȯ�ο���) ��å�� ER�� ������ �ʴ� ������ ��, 1981�⵵�� �Ի��� ����� list�ϼ���..
select * from emp
where job not like '%ER'
AND hiredate between '1981/01/01' and '1981/12/31';
/*
����ó��..
�����ʹ� ������ ���������� ��������, ������������ ����ó���� �� �ִ�.
�׷�, �̿� ���� ���صǴ� �÷��� ���ؾ� �ϸ�, ���� �������� �������������� ǥ���ؾ� �Ѵ�.
����) order by �����÷�1 asc/desc
asc : ���������� ���ϸ� �Ϲ������� �������� ������ ������������ ��µȴ�. default
desc : ���������� ���Ѵ�.
ex) �޿��������� ��������/�������� ���� ����ϼ���..
*/
select * from emp
order by sal asc;
select * from emp
order by sal desc;
-- ex) ��å�� MANAGER�� �����͸� �Ի��� �������� ������������ LIST
SELECT * FROM EMP
WHERE JOB = 'MANAGER'
ORDER BY HIREDATE;
SELECT * FROM EMP;
-- Ȯ�ο���) ���ʽ��� �ִ� �����͸� �������� ������������ �����, �޿�, ���ʽ��� ����ϼ���
SELECT ename, sal, comm FROM EMP
WHERE COMM IS NOT NULL
order by comm desc;
-- ���ı����� ���� ���� 3������ �Ǿ� �ִٸ� ��� �ұ�?
SELECT ename, sal, comm FROM EMP
order by comm desc;
--  comm�� ������ ���� sal�������� �������� ó���Ѵ�.
SELECT ename, sal, comm FROM EMP
order by comm desc, sal desc;
-- Ȯ�ο���
-- 1) �Ի����� ������������ �����ϵ�, �����ȣ, �����, ����, �Ի����� ���
select empno, ename, job, hiredate
from emp
order by hiredate;
-- 2) �����ȣ�� �������� ������������ �����Ͽ� �����ȣ�� ����� ���
select empno, ename
from emp
order by empno desc;
-- 3) �μ� ��ȣ�� ���� ������� ����ϵ� ���� �μ��� ����� �ֱ� �Ի��� ������� ���
-- 	�����ȣ, �Ի���, �����, �޿������� ���
select deptno, hiredate, ename, sal
from emp
order by deptno asc, hiredate desc;

select * from dual;
/*
dual : �����͸� �׽�Ʈ�ϱ� ���� �뵵�� oracle ���� ��ü, �� ������ ��µȴ�. 
�ַ�, ����, �Լ����볻�� Ȯ���ϴµ� Ȱ��
*/
select 10+10 plus, sysdate, 10||'+'||10||'='||(10+10) calcu from dual;

select * from emp;






