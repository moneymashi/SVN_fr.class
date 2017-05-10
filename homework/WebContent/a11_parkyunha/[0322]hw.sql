/*
����1
1. �Ի��� �б⺰�� ���� ���� ������ �޴� ����� ����ϼ���.
2. ������ 3000�̻��� ����߿�, ���(���̺�Ȱ�뵵 ����)�� �����
	�ش� ��޺� �ְ� ������ �޴� ����� �̸�, ���, ������ ����ϼ���.
*/
-- 1��
select 
	ename 	�̸�, 
	sal		����, 
	floor(to_number(to_char(hiredate, 'MM'))/4+1) �б�
from 
	emp
where 
	(
		floor(to_number(to_char(hiredate, 'MM'))/4+1), 
		sal
	) 
	in (
		select 
			floor(to_number(to_char(hiredate, 'MM'))/4+1), 
			max(sal)
		from 
			emp
		group by
			floor(to_number(to_char(hiredate, 'MM'))/4+1)
		)
order by 
	�б�;


select
	floor(to_number(to_char(hiredate, 'MM'))/4+1) �б�,
	max(sal)
from 
	emp
group by
	floor(to_number(to_char(hiredate, 'MM'))/4+1);

-- 2��
select 
	e.ename, 
	g.GRADE, 
	e.sal
from 
	emp e, 
	salgrade g
where 
	(
		g.grade, 
		e.sal
	)
	in (
		select 
			g.grade, 
			max(e.sal)
		from 
			emp e, 
			salgrade g
		where 
			e.sal between g.LOSAL and g.HISAL
		group by 
			g.grade
	)
	and e.sal >= 3000;

select g.grade, max(e.sal)
from emp e, salgrade g
where e.sal between g.LOSAL and g.HISAL
group by g.grade;

/*
����2
�μ���ȣ�� 30�� ��� �߿�, ���� ���߿� �Ի��� ������� ������ ������ ����ϼ���.
*/
select 
	ename, 
	deptno, 
	sal
from 
	emp
where
	deptno = 30
	and sal >= 
			(select 
				sal 
			 from 
				emp 
			 where 
			 	hiredate >= ALL(select hiredate from emp));
/*
ORA-01796:	this operator cannot be used with lists
Cause:	A relational operator is not allowed in this context. When comparing lists, use only an operator that tests for equivalence, such as =, !=, or IN.
Action:	Rephrase the query so that it only compares lists for equivalence. For example, the following clause is invalid:

WHERE (A,B) > ((C,D), (E,F)) 
It may be necessary to compare individual columns separately. For example, to see if A and B are respectively greater than C and D, use WHERE A>B AND C>D instead of WHERE (A,B)>(C,D).
*/
select ename, hiredate
from emp
where (ename,hiredate) >= ALL(select ename, hiredate from emp); 
/*
����3
������ 'SALESMAN'�� ����� �޴� �޿����� �ּ� �޿����� ���� �޴� ������� �̸��� �޿���
����ϵ� �μ���ȣ 20���� ����� �����Ѵ�. 
1) (ANY������ �̿�)
2) min() �Լ� ���

*/
select 
	ename, 
	sal
from 
	emp
where 
	sal >= ANY( select sal from emp where job='SALESMAN');  
-- 2) sal >= ( select min(sal) from emp where job='SALESMAN');

/*
���� 4
������ ���� ������ ���̺��� �����ϼ���.
�̸�(name)	��ȣ(no)		�Ի���(credate)-���ڿ� 	���ر��� �ٹ�����(workyears)	
						@@@@�� @@�� @@��		@@@@
new_emp �� ����
*/
create table new_emp
as
select
	ename	name,
	empno	no,
	to_char(hiredate, 'YYYY"��" MM"��" DD"��"')		credate,
	floor(months_between(sysdate, hiredate)/12)+1	workyears
from 
	emp;

select * from new_emp;
