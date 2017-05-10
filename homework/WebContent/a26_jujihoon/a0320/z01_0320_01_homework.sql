/*
����
emp03 �������̺� ����
1. �Է� empno�� ���� ���������� -1, mgr:clark�� mgr�Է�, sal:��տ���,
	comm:��ü comm�� �հ�
2. ���� ename:'�ű浿', job�� SUPERMAN, hiredate�� �ֱٿ� �Ի���+1
*/
create table emp05
as select * from emp;
select min(empno)-1 from emp05;
select mgr from emp05 where ename='CLARK';
select avg(sal) from emp05;
select sum(nvl(comm, 0)) from emp05;
select max(hiredate)+1 from emp05; 

select * from emp;
insert into emp01(empno, mgr, sal, comm) values( 7368, 7839, 2073, 2200);
update emp01
set ename='�ű浿',
	job='SUPERMAN',
	hiredate=to_date('01/13/1983', 'MM/DD/YYYY')
where empno=7368; 

/*
���� login �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡��
	id@@@�� ȯ���մϴ�. ���� point�� @@@�Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
	�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��..
*/
create table login01(id number(4), password varchar2(20), 
					username varchar2(20), point number(10));
					
/*
����
����Ű ���迡 �ִ� ���̺� �����ϱ�
�������̺� student_main(id,pass,name) : ���̵�, �н�����, �̸�
�������̺� student_point(id,subject, point):���̵� ���� ����
student_main�� student_point id�� foreign key ���踦 �����ϰ�,
student_main�� �����Ͱ� �־�߸� student_point�� �Է��� �� �ְԲ� ó��
*/

create table student_main
(
	id number(2) PRIMARY KEY,
	pass varchar2(14),
	name varchar2(13)
);

CREATE TABLE student_point
(
   id		NUMBER (4) REFERENCES student_main(id),
   subject	VARCHAR2 (10),
   point	NUMBER (4)
);