/*
����
emp3 �������̺� ����
1. �Է� empno�� ���� ���������� -1, mgr:cleark�� mgr�Է�, sal:��տ���,
	comm:��ü comm�� �հ�
2. ���� ename: '�ű浿', job�� SUPERMAN, hiredate�� �ֱٿ� �Ի���+1
*/

create table emp3
as select * from emp;
select * from emp3;
select min(empno)-1 from emp3; --7,368
select avg(sal) from emp3; --2,073.21
select sum(comm) from emp3; --2,200

insert into emp3(empno, mgr, sal, comm) values(7368,7788,2073.21,2200);
select * from emp3;
select max(hiredate)+1 from emp3;

update emp3
	set ename='�ű浿',
		job='SUPERMAN',
		hiredate = to_date('1983/01/13', 'yyyy/mm/dd')
where empno=7368;
select * from emp3;



/*
���� login�� �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡��
	id@@@ �� ȯ���մϴ�. ���� point�� @@@ �Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
	�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��.
*/
create table login(
	id 		 varchar2(20),
	password varchar2(20),
	point  	 number(20)
	);
select * from login;


/*
����
����Ű ���迡 �ִ�  ���̺� �����ϱ�

�������̺� student_main(id, pass, name) : ���̵� ,�н�����, �̸�
�������̺� student_main(id, subject, point) : ���̵� ,����, ����
	student_main ��  student_point id�� foreign key ���踦 �����ϰ�,
	sudent_main�� �����Ͱ� �־�߸� student_pointf�� �Է��� �� �ְԲ� ó��
*/

drop table student_main;
create table student_main 
(
	id VARCHAR2(10) primary key  ,
	pass NUMBER(10),
	name VARCHAR2(10)
);

CREATE TABLE student_point
(
   id       VARCHAR2(10) references student_main(id),
   subject  VARCHAR2(10),
   point    NUMBER(10) 
);
insert into student_main values('first',1111,'MAN');
select * from student_main;