/*����
�Ʒ��� �������� �����͸� ��Ÿ������
1. ename�� ���� ������ @@@ ���� �ε�, �ֱٿ� 5% �λ�� �ݾ��̸�, �۳� ������ @@@���� �̾����ϴ�
2. ename�� �Ի����� hiredata �Դϴ�
3. ��å@@@�� @@@�� �μ���ȣ�� @@@�Դϴ�
4. @@@���� ���� ������ ���ʽ�(comm)�� �ջ���� @@@�����Դϴ�

*/
select * from emp;
-- 1������
select ename||'�� ���� ������ '||sal||' ���� �ε�, �ֱ� 5% �λ�� �ݾ��̸�, �۳� ������ '|| (sal-sal*5/105) ||' ���� �̾����ϴ�' from emp;
-- 2������
select ename||'�� �Ի����� '||hiredate||' �Դϴ�' from emp;
-- 3������
select '��å '||job||'�� '||ename||'�� �μ���ȣ�� '||deptno||'�Դϴ�' from emp;
-- 4������
select ename||'���� ���� ������ ���ʽ� ('||nvl(comm,0)||')�� �ջ���� '|| (nvl(comm,0)+sal) ||'���� �Դϴ�' from emp;


/*
��������
1. emp�߿� �޿��� 2000�̸��̵Ǵ� ������� �߿� ����� �޿��� ���
2. ������ ���ʽ��� �ջ� �ݾ��� 1500�̸��� ����� �̸�, ����, ���ʽ�, �ջ���� ���
3. mgr�� null�� ����� job�� �̸� ������ ���
4. job�� CLERK�� ����� deptno�� 30�� ����� �̸�, ��å, �μ���ȣ
5. ������ 2000���� 3000���̿� �ִ� ����� �μ���ȣ, �̸�, ������ ���
*/
select * from emp;
select empno, sal from emp where sal<2000;
select ename, sal, comm, sal+nvl(comm,0) from emp where sal+nvl(comm,0)<1500;
select job, sal from emp where mgr is null;
select ename, job, deptno from emp where job='CLERK' and deptno=30;
select deptno, ename, sal from emp where sal>=2000 and sal<=3000;