
/*
1. emp�߿� �޿��� 2000�̸��� �Ǵ� ��� �����߿� ����� �޿��� ����϶�.
2. ������ ���ʽ��� �ջ� �ݾ��� 1500�̸��� ����� �̸�, ����, ���ʽ�, �ջ���� ����ϼ���.
3. mgr�� null�� ����� job�� �̸� ������ ����ϼ���
4. job�� clerk�� ����� deptno�� 30�� ����� �̸�, ��å, �μ���ȣ�� ����ϼ���. 
5. ������ 2000���� 3000���̿� �ִ� ����� �μ���ȣ, �̸�, ������ ����ϼ���.
*/
select empno,sal from emp
where sal<2000;
select ename, sal, nvl(comm,0), (sal+nvl(comm,0)) from emp
where (sal+nvl(comm,0))<1500;

select job, ename, sal from emp
where mgr is null;

select ename, job, deptno from emp
where job= 'CLERK' and deptno = 30;

select deptno, ename, sal from emp
where sal>=2000 and sal<=3000;