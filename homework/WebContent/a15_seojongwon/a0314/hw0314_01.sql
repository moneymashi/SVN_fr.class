/*		03��14�� ����		*/

/* ���� 1 */
select*from emp;

--1. ename�� ���� ������ @@@���� �ε�, �ֱٿ� 5%�λ�� �ݾ��̸�, �۳� ������ @@�����̾����ϴ�.
select ename||'�� ���� ������ '||(sal+(sal*0.05))||'�����ε�,
 �ֱٿ� 5%�λ�� �ݾ��̸�, �۳� ������ '||sal||'�����̾����ϴ�.' "���� ����" from emp;

--2. ename�� �Ի����� hiredate �Դϴ�.
select ename||'�� �Ի����� '||hiredate||' �Դϴ�.' "�Ի���" from emp;

--3. ��å�� @@@�� @@@�� �μ���ȣ�� @@@�Դϴ�.
select '��å�� '||job||'�� '||ename||'�� �μ���ȣ�� '||empno||'�Դϴ�.' "Job Nunber" from emp;

--4. @@@���� ���� ����(?)�� ���ʽ�(comm)�� �ջ���� @@@�Դϴ�.
select ename||'���� ���� ����('||sal||')�� ���ʽ�('||comm||')�� �ջ���� '||(sal+comm)||'�Դϴ�.' "�����Ѿ�" from emp;


 
/* �������� */
select*from emp;

-- 1. EMP�߿� �޿��� 2000�̸��� �Ǵ� ��� ���� �߿� ����� �޿��� ����϶�.
select empno "���", sal"�޿�(����)" from emp where sal < 2000;

-- 2. ������ ���ʽ��� �ջ� �ݾ��� 1500�̸��� ����� �̸�, ����, ���ʽ�, �ջ���� ����ϼ���.
select ename "�̸�", sal"����", nvl(comm,0)"���ʽ�", (sal+nvl(comm,0))"�ջ��" from emp where (sal+nvl(comm,0))<1500; 

-- 3. MGR�� NULL�� ��� JOB, �̸�, ������ ����ϼ���.
select job JOB, ename "�̸�", sal "����" from emp where mgr is null;

-- 4. JOB�� CLERK�� ����� DEPTNO�� 30�� ����� �̸�, ��å, 
select ename "�̸�", job "��å" from emp where job='CLERK' and deptno = 30;

-- 5. ������ 2000���� 3000 ���̿� �ִ� ����� �μ���ȣ, �̸�, ������ ����ϼ���.
select deptno "�μ���ȣ", ename "�̸�", sal "����" from emp where sal > 2000 and sal <3000;
