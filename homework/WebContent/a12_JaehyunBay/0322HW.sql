/*

	��������.
	1. �Ի����� �б⺰�� ������� ������ �޴»���� ����ϼ���
	2. ������ 3000�� ����߿�, ���(���̺�Ȱ�뵵����)�� ����� �ش��޺� �ְ����� ��

�»���� �̸� ��� ���� ���
	
*/

	select ename, job, sal from emp
	where (job, sal) in (select job, min(sal) 
		from emp 
		group by job
	);
	
	select ename, sal from emp
		where (sal,floor(to_number(to_char(hiredate,'mm'))/4 + 1)) in (select max

(sal), floor(to_number(to_char(hiredate,'mm'))/4 + 1) 
			from emp
			group by floor(to_number(to_char(hiredate,'mm'))/4 + 1)
	);

	select e.ename, sg.grade, e.sal from emp e, salgrade sg
		where (e.sal, sg.grade) in ( select e.sal, sg.grade 
		from emp e, salgrade sg 
		where e.sal between sg.LOSAL and sg.HISAL 
		and e.sal >3000
	);
	select sal from emp;

	
/*
����.
	�μ���ȣ�� 30�λ���߿� , ���� ���߿� �Ի��� ������� ������ ������ ���.
	*/			
	select empno, sal, hiredate
	from emp
	where hiredate >= all(select hiredate 
				from emp
				where sal<3000 );
		

	/*
		t����: 
			1.�μ���ȣ�� 30�λ���߿�, ���� ���߿� �Ի��� ������� ������ ������ ���.
			2. ������ 'SALESMAN'�� ����� �޴� �޿����� 
				�ּұ޿����� ���� �޴� ������� �̸��� �޿��� ����ϵ�
				�μ���ȣ 20���� ����� �����Ѵ�. (ANY������ �̿�.)
	
	*/
	
	
		select ename, sal, hiredate from emp
		where sal >= all(select sal 
							from emp 
							where deptno = 30
		);
		
		select ename, sal from emp 
		where deptno!= 20 
		and sal >= any(select sal 
							from emp 
							where job = 'SALESMAN' and sal >= (select min(sal) from emp));


/*
����: ������ ���� ������ ���̺��� �����ϼ���.
�̸�name ��ȣno �Ի���credate_ ���ڿ���! ���ر��رٹ����� workyears2017
@@@		@@		@@@��	@@��	@@��		@@@@
new_emp�� �����ϼ���.
	
*/
create table new_emp
as select ename name, empno no, to_char('YYYY/MM/DD') credate, floor(months_between(sysdate, hiredate)/12) workyears2017
	from emp
	where 1 = 0;
	




