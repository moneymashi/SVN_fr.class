-- �÷��� �̸�(����) ���̱�!!

select * from emp;
-- empno�� ��Ī���� companyNo�� ����� �ߴ�. ����ϼ���..
-- �÷��� as ��Ÿ�� ��Ī�÷��� alias
select empno as companyNo from emp;
-- ��Ī�� ���α׷� �������� �߿��� �ǹ̸� ������..
-- ��ټ� ���α׷��� ��Ī���� �����ϰ� ����ϴ� ��찡 ����.
-- ex) rs.getString("��Ī/�÷���")
--  as ��ſ� ����(' ')���� ó���Ѵ�.
select '�����'||empno || ' �Դϴ�!' show from emp;
-- ���� application������ rs.getString("show")�� ó���ȴ�.
select * from emp;
-- ������ ������ ����� �÷����� ��Ÿ������..
-- �÷���        depandname   upgradeRatio   enterCompany  
-- ��µ�����  (�μ���ȣ)�̸�    ������ 10%     �Ի�����
select '( '||deptno||' ) '|| ename depandname, sal*0.1 upgradeRatio, 
		hiredate enterCompany from emp;
-- 	���鰪�� ��Ī���� ó���ϱ�..: " "���� ��Ī���� �����ش�.
select ename "name intro" from emp;
-- �ѱ��� ��Ī���� ó���� ����, " "���̿� ó��
select deptno "�μ���ȣ" from emp;

select * from emp;
-- �ߺ��� ó�� : �����ͺ��̽������� ������ ���� �Է��ϴ� ���� ���̺������
-- �Է��ϴ� ���� �����Ѵ�. 
-- �÷��� �ִ� ��� �����Ͱ� �����ؼ��� �ȵȴٴ� ���̴�.
-- �׷���, �Ѱ� �÷����� ��ȸ�� ���� ������ �����Ͱ� ��Ÿ�� �� �ִ�.
select deptno from emp;
-- �϶�, �ϳ� �Ǵ� �ټ��� �÷��� �����Ͱ� ������ ���� filtering ���ִ� ó����
-- �ִµ� �̸� distinct��� �Ѵ�.
-- Ȱ������ select distinct �÷�1, �÷�2.. from ���̺�
select distinct deptno from emp;
select * from emp;
-- Ȯ�ο���1) -mgr�� ���ϰ� ���� ����ϼ���..
-- Ȯ�ο���2) job�� mgr �÷��� ���ϰ� ���� ����ϼ���.
select distinct mgr from emp;
select distinct job, mgr from emp;
/*
����ó��..
Ư���� ������ list���뿡�� �ʿ��� �������� ������� filtering�ϴ� ����
���Ѵ�.
1. ���� ó��..
*/
select * from emp;
-- ������ 3000�̻��� �����͸� list ó��..
-- where �÷��� > ���ǵ�����
select * from emp
where sal>=3000;
-- �����ͺ��̽��� ���̴� �񱳿�����
-- = (*), >, <, >=, <=,   <>,!=(�ٸ���)
select * from emp;
-- 1) �μ���ȣ 30�� �����͸� list �ϼ���..
select * from emp
where deptno=30;
-- 2) ������ 1000�̸��� ������
select * from emp
where sal<1000;
-- 3) ename�� SMITH�� ������
select * from emp where ename='SMITH';
-- 4) COMM�� NULL�� ������(*) - ���ݱ��� ��� �Լ�Ȱ��
select * from emp where nvl(comm,0)=0;
-- 	null���� ��Ÿ���� keyword is null
select * from emp where comm is null; 
--null�� �ƴ� ��, is not null
select * from emp where comm is not null;
-- 5) MGR�� 7698�� �ƴ� ������
select * from emp where mgr != 7698;
-- ���� ���� �ΰ��� ������ ���� ������ list�ϱ�..
-- ���� multi ���ǿ� ���� ó��..
select * from emp;
-- ������ 3000�̻��� ����� �̸��� ������ list
select ename, sal 
from emp
where sal>=3000;
select * from emp;
-- ������ 2000�����̰� ��å�� SALESMAN�� �����
-- �̸�, ��å, ������ ���..
select ename "�̸�", job "��å", sal "����"
from emp
where sal<=2000
and job='SALESMAN';
-- �÷����� ��ҹ��� �������� ������, �����ʹ� ��ҹ��� �����Ѵ�.
-- ��������
-- 1. EMP�߿� �޿��� 2000�̸��� �Ǵ� ��� ���� �߿� ����� �޿��� ����϶�.
select ename, sal from emp where sal<2000;
-- 2. ������ ���ʽ��� �ջ� �ݾ��� 1500�̸��� ����� �̸�, ����, ���ʽ�, 
--    �ջ���� ����ϼ���.
select ename, sal, comm from emp where sal+nvl(comm,0)<1500;
-- 3. MGR�� NULL�� ��� JOB, �̸�, ������ ����ϼ���.
select job, ename, sal from emp where mgr is null;
-- 4. JOB�� CLERK�� ����� DEPTNO�� 30�� ����� �̸�, ��å, 
--    �μ���ȣ�� ����ϼ���
select ename, job, deptno from emp where job = 'CLERK';
-- 5. ������ 2000���� 3000 ���̿� �ִ� ����� �μ���ȣ, 
--    �̸�, ������ ����ϼ���.
select deptno, ename, sal
from emp where sal>=2000 and sal<=3000;
select * from emp;






		
		

