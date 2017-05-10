/*
����1
emp03 �������̺� ����
1. �Է� empno�� ���� ���������� -1, mgr: clark�� mgr�Է�,
	sal:��տ���, comm:��ü comm�� �հ�
2. ���� ename:'�ű浿', job�� SUPERMAN, hiredate�� �ֱٿ� �Ի���+1
*/
create table emp03
as select * from emp;

select * from emp03 order by hiredate;

select avg(sal) from emp03;
select sum(comm) from emp03;
select min(empno) from emp03;
select max(hiredate) from emp03;
select mgr from emp03 where ename='CLARK';

-- ���� : subquery version 1
insert into emp03(empno, mgr, sal, comm)
	values(
		(select min(empno) from emp03)-1,
		(select mgr from emp03 where ename='CLARK'),
		(select avg(sal) from emp03),
		(select sum(comm) from emp03)
		);	
-- ���� : subquery version 2
-- �ñ�����. 7777 �� �ϵ� �ڵ��Ǿ� �ִ� �κп� ������ ������ ������ �ߴµ� �� �׷�������?
insert into emp03(empno, mgr, sal, comm)
	select min(empno), 7777, avg(sal), sum(comm) from emp03;
select min(empno), avg(sal), sum(comm), (select mgr from emp03 where ename='SCOTT') from emp03;
-- �׽�Ʈ �ڵ� --
update emp03
	set ename='�ű浿',
		job='SUPERMAN',
		hiredate=(select max(hiredate) from emp03)+1
	where empno=7368;
	
insert into emp03(empno) values( min(empno) );

insert into emp03(empno) 
	values( (select min(empno) from emp03) );
	
/*
����2
login �Ѵ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡��
id@@@ �� ȯ���մϴ�. ���� point�� @@@ �Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��.
*/
create table CUSTOMER(id VARCHAR2(10), pass VARCHAR2(10), myPoint NUMBER(9));
	

/*
����3
����Ű ���迡 �ִ� ���̺� �����ϱ�
�������̺� student_main
	�������̺� student_main(id, pass, name) : ���̵�, �н�����, �̸�
	�������̺� student_point(id, subject, point) : ���̵�, ����, ����
	student_main�� student_point id�� foreign key ���踦 �����ϰ�,
	student_main�� �����Ͱ� �־�߸� student_point�� �Է��� �� �ְԲ� ó��. 
*/

create table student(
	id 		VARCHAR2(20) primary key,
	pass 	varchar2(20),
	name	varchar2(20)
);

create table student_point(
	id	varchar2(20) references student(id),
	subject VARCHAR2(20),
	point varchar2(10)
);
	