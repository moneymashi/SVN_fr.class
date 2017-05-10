/*
	���� 1.
		1) �Ի��� �б⺰ ���� ���� ������ �޴� ��� ���
		2) ������ 3000 ������ ��� �� ����� ������ �ش� ��޺� �ְ� ������ �޴� ����� �̸� ��� ����
		
	���� 2.
		1) �μ���ȣ�� 30�� ��� ��, ���� ���߿� �Ի��� ������� ������ ������ ���
		2) ������ salesman�� ����� �޴� �޿����� �ּұ޿����� ���� �޴� 20�μ� ������� �̸��� �޿��� ���
	
	���� 3.
	name no credate-���ڿ�
*/
-- ���� 1.1
select ename, sal, floor(substr(hiredate,4,2)/4)+1 "�б�" from emp
	where sal in ( select max(sal) from emp group by floor(substr(hiredate,4,2)/4)+1);
-- ���� 1.2
select ename, grade, sal from emp e, salgrade g where e.sal between g.LOSAL and g.HISAL
and sal>=3000
and sal in (select max(sal) from emp e, salgrade g where e.sal BETWEEN g.LOSAL and g.HISAL group by g.grade);
-- ��� �̷����ϳ�

-- ���� 2.1
select * from emp where deptno = 30 and sal>(select sal from emp where hiredate=(select max(hiredate) from emp));
-- �굵 �̷��� �ι� ���°ǰ�
-- ���� 2.2
select ename, sal from emp where deptno=20 and sal>all(select sal from emp where job='SALESMAN');

-- ���� 3.
create table new_emp as
	select ename name,
		empno no,
		to_char(hiredate,'YYYY"�� "MON DD"��"') credate,
		floor(months_between(sysdate,hiredate)/12)+1 "�ٹ�����" from emp;
select * from new_emp;