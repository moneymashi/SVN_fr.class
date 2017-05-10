-----����1) ������ ���� �������� ������� 10%�ö���...
--- �����, ��������, �λ��, ���������� ����ϼ���.
 select ename, sal, sal*0.1, sal*1.1 from emp;
 
 -----����2) �μ����� �����λ���� �ٸ��� å��.
-- �μ���ȣ ==>10%, 20==> 20%...�λ�.
-- �̸�,�μ���, ����, �λ�ȿ���?
select ename, job, sal, deptno, sal*(1+deptno/100) from emp;
 
 /*
�Ʒ��� �������� �����͸� ��Ÿ������.
1. ename �� ���� ������ @@@�����ε� , �ֱٵ� 5%�λ�� �ݾ��̸�, �۳� ������ @@@�����̾����ϴ�.
2. ename�� �Ի����� hiredate�Դϴ�.
3. ��å@@@ �� @@@�� �μ���ȣ�� @@@�Դϴ�..
4. @@@���� ���翬���� ���ʽ� (comm)�� �ջ���� @@@�Դϴ�.
*/

select '1. ' ||ename || '�� ���翬���� ' || sal || '�����ε�, �ֱٿ� 5%�λ�� �ݾ��̸�, �۳� ������' || sal*100/105 || '�Դϴ�' from emp;
select '2. ' || ename || '�� �Ի����� ' || hiredate|| '�Դϴ�.' from emp;
select '3. ��å' || job || '��' || ename || '�� �μ���ȣ�� ' || deptno|| '�Դϴ�.'  from emp;
select '4. ' || ename || '���� ���翬���� ���ʽ� (' || comm || ') �� �ջ���� '||  (sal+ nvl(comm,0)) || '�� ó���ȴ�.' from emp;

/*
	������ ������ ����� �÷����� ��Ÿ����.
	
	--�÷���	depandname 			upgradeRatio		enterCompany
	--��µ����� (�μ���ȣ)�̸� 	������ 10% 		�Ի�����.
*/
	select  '(' || deptno || ')' ||ename as depandname, sal*0.1 as upgradeRatio, 
			hiredate as enterCompany from emp;

/*
	Ȯ�� ���� 1) -mgr�� ���ϰ����� ����϶�.
				 2) job��  mgr�÷��� ���ϰ����� ����϶�.

*/
select * from emp;
select distinct mgr from emp;
select distinct job, mgr from emp;  --job�̸��� ���Ƶ� mgr�� ���� �޶� �Ѵٽ����� �����ؾ���.

/*	
	1)�μ���ȣ 30�� �����͸� list�ϼ���.
	2) ������ 1000�̸��� ������.
	3) ename�� SMITH�� ������
	4) comm�� null�� ������.  (*) - ���ݱ��� ��� �Լ�Ȱ��.
	5) mgr�� 7698�� �ƴ� ������.

*/
select * from emp;
	select * from emp where deptno =30;
	select * from emp where sal <1000;
	select * from emp where ename = 'SMITH';
	select * from emp where nvl(comm,-1) = -1;
	select * from emp where mgr != 7698;

/*
	��������.
	1. emp�߿� �޿��� 2000�̸��� �Ǵ� ��������߿� ���, �޿��� ���.
	2. ������ ���ʽ��� �ջ�ݾ��� 1500 �̸��� ����� �̸�, ����, ���ʽ�, �ջ���� ���.
	3. mgr�� null�� ����� job, �̸�, ������ ���.
	4. job�� CLERK�� ����߿� deptno�� 30�� ����� �̸�,��å, �μ���ȣ ���.
	5. ������ 2000���� 3000���̿� �ִ� ����� �μ���ȣ,�̸�,������ ���
*/
select * from emp;
select empno "���" , sal "������" from emp where sal<2000;
select ename, sal, comm, (sal + nvl(comm,0)) from emp where (sal + nvl(comm,0)) <1500;
select job, ename, sal, mgr from emp where mgr is NULL;
select ename, job, deptno from emp where job = 'CLERK' AND deptno = 30;
select deptno, ename, sal from emp where sal > 2000 and sal< 3000;



 
 