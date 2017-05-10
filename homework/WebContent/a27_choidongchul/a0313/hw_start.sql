-- ����
-- 1. ename�� ���� ������ @@@�����ε�, �ֱٿ� 5% �λ�� �ݾ��̸�, �۳� ������ @@@�����Դϴ�.
	select ename || '�� ���� ������ ' || sal || '�����ε�, �ֱٿ� 5% �λ�� �ݾ��̸�, �۳� ������ ' || sal / 1.05 ||'�����Դϴ�.' from emp;
-- 2. enmae�� �Ի����� hiredate�Դϴ�.
	select ename || '�� �Ի����� ' || hiredate || '�Դϴ�.' from emp;
-- 3. ��å�� @@@�� @@@�� �μ���ȣ�� @@@�Դϴ�.
	select '��å�� ' || job || '�� ' || ename || '�� �μ���ȣ�� ' || deptno || '�Դϴ�.' from emp;
-- 4. @@@���� ���� ������ ���ʽ��� �ջ���� @@@�Դϴ�.
	select ename  || '���� ���� ������ ���ʽ��� �ջ���� ' || (sal+nvl(comm,0)) || '���� �Դϴ�.' from emp;

	-- ��������1. EMP �߿� �޿��� 2000 �̸��� �Ǵ� ��� ���� �߿� ����� �޿��� ����϶�
	select empno, sal from emp where sal<2000;
-- ��������2. ������ ���ʽ��� �ջ� �ݾ��� 1500 �̸��� ����� �̸�, ����, ���ʽ�, �ջ���� ����ϼ���
	select ename, sal, nvl(comm,0), sal+nvl(comm,0) from emp where sal+nvl(comm,0)<1500; 
-- ��������3. mgr�� null�� ����� job�� �̸�, ������ ����ϼ���
	select ename, job, sal from emp where mgr is null;
-- ��������4. job�� clerk�� ��� �� deptno�� 30�� ����� �̸�, ��å, �μ���ȣ�� ����ϼ���
	select ename, job, deptno from emp where job='CLERK' and deptno=30;
-- ��������5. ������ 2000���� 3000 ���̿� �ִ� ����� �μ���ȣ, �̸�, ������ ����ϼ���
	select deptno, ename, sal from emp where sal>=2000 and sal<=3000; 