/* ����
emp03 �������̺� ����
1. �Է� empno�� ���� ���������� -1, mgr:clark�� mgr �Է�, sal:��տ���, comm:��ü comm�� �հ�
2. ���� enmae:'�ű浿', job�� superman, hiredate�� �ֱ� �Ի��� + 1
*/
select * from emp;
create table emp01 as select * from emp;
select * from emp01;
select * from emp01 where ename = 'CLARK';
select avg(sal) from emp01;
select sum(nvl(comm,0)) from emp01;
insert into emp01 (empno,mgr,sal,comm) 
	values(999, 7839, 2279.17, 2200);
select * from emp01;
update emp01 set ename='�ű浿', job='superman', 
	hiredate=to_date('1983/12/02','YYYY/MM/DD') where empno = 999;
select * from emp01;

/*
���� : Log in�� �ϴ� ȭ���� ����� ID�� PASSWORD�� üũ�ϰ�, ���� ȭ�鿡�� id@@@ �� ȯ���մϴ�.
���� point�� @@@�Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�. �̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��
*/
create table longin (id varchar2(10), password varchar2(10),
point number(5));
select * from longin;

/* ����
�������̺� student_main(id, pass, name); : ���̵� , �н�����, �̸�
sub���̺� student_point(id, subject, point); ���̵�, ����, ���� 
student_main�� student_point id�� foreign key ���踦 �����ϰ�,
student_main�� �����Ͱ� �־�߸� student_point�� �Է��� �� �ְ� ó������.
*/
create table student_main(
	id varchar2(10) primary key,
	password varchar2(10),
	name varchar2(10)
);
create table student_point(
	id varchar2(10) references student_main(id) ,
	subject varchar2(10),
	point number(10) 
);
select * from student_point;
select * from student_main;
insert into student_main values('hotteok','hotteok','hotteok');
insert into student_point values('bread','hotteok',500);
insert into student_point values('hotteok','hotteok2',500);