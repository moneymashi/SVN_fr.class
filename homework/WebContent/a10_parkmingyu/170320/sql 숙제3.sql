/* ���� :
emp13 �������̺� ����
1. �Է� empno�� ���� ���������� -1, mgr:clerk�� mgr�Է�, sal:��տ���, comm:��ü comm�� �հ�
2. ���� ename:'�ű浿', job:SUPERMAN, hiredate:�����ֱ��Ի���+1
*/
create table emp13
as select * from emp;
select * from emp13;
select min(empno)-1 from emp13; --7368
select trunc(avg(sal)) from emp13;
select sum(comm) from emp13;
insert into emp13(empno,mgr,sal,comm)
			values(7368,7902,2073,2200);
commit;
select max(hiredate)+1 from emp13;
update emp13
	set ename='�ű浿', job='SUPERMAN', hiredate='1983/01/13'
	where empno=7368;
select * from emp13;


/* ���� :
	login �ϴ� ȭ���� ����� id/PW üũ�ϰ�, ���� ȭ�鿡�� id@@@�� ȯ���մϴ�. ���� point�� @@@ �Դϴ�. ��� ���� ��Ÿ���ٰ� �Ѵ�.
	�̿� �ʿ�� �ϴ� ���̺�� ���̺��� ���弼��.
*/
create table login01(id varchar2(20),pw varchar2(20));
select * from login01;
insert into login01 values('acorn','acorn0102');
	

/* ���� : 
����Ű ���迡 �ִ� ���̺� �����ϱ�

�������̺� student_main(id,pass,name)	:���̵�, �н�����, �̸�
�������̺� student_point(id,subject,point);	���̵�, ����, ����
	student_main�� student_point id�� foreign key ���踦 �����ϰ�,
	student_main�� �����Ͱ� �־�߸� student-point�� �Է��� �� �ְ� ó��
*/
create table student_main(
	id varchar2(20) primary key,
	pass varchar2(20),
	name varchar2(20)
);
create table student_point(
	id varchar2(20) references student_main(id),
	subject varchar2(20),
	point number(3)
);
insert into student_main values('acorn','acorn0102','Daniel');
insert into student_main values('abc','abc123','Scott');
select * from student_main;
insert into student_point values('abc','Javascript',95);
insert into student_point values('acorn','CSS/HTML',77);
select * from student_point;


