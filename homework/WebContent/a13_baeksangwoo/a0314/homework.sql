--���� ���� 
--1. EMP�� �޿��� 2000�̸��� �Ǵ� ��� ���� �߿� ����� �޿��� ����϶�.
--2. ������ ���ʽ��� �ջ� �ݾֱ� 1500�̸��� ����� �̸�, ����, ���ʽ�, �ջ���� ����ϼ���.
--3. MRG�� NULL�� ����� JOB�� �̸� ������ ����ϼ���.
--4. JOB�� CLERK�� ��� �� DEPTNO�� 30�� ����� �̸�, ��å, �μ���ȣ�� ����ϼ���.
--5. ������ 2000���� 3000 ���̿� �ִ� ����� �μ���ȣ, �̸�, ������ ����ϼ���.

select empno, sal from emp where sal < 2000;
select ename, sal, nvl(comm,0), nvl(comm,0) + sal from emp where (nvl(comm,0) + sal) < 1500;
select job, ename, sal from emp where mgr is null;
select ename, job, deptno from emp where job = 'CLERK' and deptno = '30';
select deptno, ename, sal from emp where sal > 2000 and sal < 3000;

--���� : �Ʒ��� �������� �����͸� ��Ÿ������. 
--1. ename�� ���� ������ @@@���� �ε�, �ֱٿ� 5% �λ�� �ݾ��̸�, �۳� ������ @@@�����̾����ϴ�. 
--2. enmae�� �Ի����� hiredater �Դϴ�. 
--3. ��å�� @@@�� @@@�� �μ���ȣ�� @@@�Դϴ�.
--4. @@@���� ���� ������ ���ʽ�(comm)�� �ջ���� @@@�Դϴ�.

select ename||'�� ���� ������'||sal||'���� �ε�, �ֱٿ� 5% �λ�� �ݾ��̸�, �۳� ������'||(sal-(sal*0.05))||'�����̾����ϴ�.' from emp;
select ename ||'�� �Ի����� '|| hiredate ||'�Դϴ�.' from emp;
select '��å��'||job||'�� '||ename||'�� �μ���ȣ�� '||deptno||'�Դϴ�.' from emp;
select ename||'���� ���� ������ ���ʽ��� �ջ���� '|| (nvl(comm,0) + sal) ||'���� �Դϴ�' from emp;