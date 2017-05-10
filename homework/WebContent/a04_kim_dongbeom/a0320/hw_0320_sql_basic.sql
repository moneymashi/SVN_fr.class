/*
	���� 1. emp03 ���� table ����
	1. �Է� empno�� ���� ���������� -1, mgr : cleark�� mgr�Է�, sal : ��� sal, comm = ��ü comm�� �հ�
	2. ���� ename : '�ű浿', job : 'SUPERMAN', hiredate : �ֱ� �Ի��� +1
	
	���� 2.
	log in ȭ���� ����� id, pw üũ. ����ȭ�鿡�� id @@@�� ȯ���մϴ�. ���� point�� @@@ �Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
	�̶� �ʿ�ȣ �ϴ� table�� table ������ ������
	
	���� 3.
	����key ���迡 �ִ� table �����ϱ�
	main table	student_main(id, pw, name)
	sub table	student_point(id, subject, point)
		student_main�� student_point id�� foreign key ���踦 �����ϰ�, student_main�� data�� �־�߸�
		student_point�� �Է��� �� �ְԲ� ó��
*/

-- ���� 1.
create table emp03 as select * from emp;
select sum(nvl(comm,0)) from emp03;
select avg(sal) from emp03;
select min(empno)-1 from emp03;
insert into emp03(empno,mgr,sal,comm) values(7368,7777,2073.21,2200);
select * from emp03;
select max(hiredate) from emp;
update emp03 set ename='�ű浿',
				 job=upper('superman'),
				 hiredate=to_date('1983/01/12','YYYY/MM/DD')+1
				 where empno=7368;

-- ���� 2.
create table idPwPointCk
(
	id varchar2(15) primary key,
	pw varchar(10) not null,
	point number(5)
);

-- ���� 3.
create table stdnt_main
(
	stdntId varchar(20) primary key,
	stdntPw varchar(20) not null,
	sname varchar(20) not null
);
create table stdnt_point
(
	stdntId varchar(20) references stdnt_main(stdntId),
	subject varchar(20),
	point number(3,2)
);