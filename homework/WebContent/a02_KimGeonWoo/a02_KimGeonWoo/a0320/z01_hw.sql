/*
 * ����
 * emp03 �������̺� ����
 * 1. �Է� empno�� ���� ���������� -1, mgr:cleark�� mgr�Է�, sal: ��տ���,
 * 		comm : ��ü comm�� �հ�
 * 2. ���� ename : '�ű浿', job�� SUPERMAN, hiredate�� �ֱٿ� �Ի��� + 1
 * */
 
create table emp05 as select * from emp;
select empno , mgr, sal, job from emp05;
select avg(sal) from emp;
insert into emp05(empno, mgr, sal) values('7368' , '7902', 2073);
update emp05 set ename='�ű浿', hiredate = sysdate + 1, job = 'SUPERMAN' where deptno = '7368';


  /*
 
 ���� 
 login �ϴ� ȭ��ɤ� ����� id�� password�� ġũ�ϰ�, ���� ȭ�鿡�� id@@@�� ȯ���ճ���.
 ���� point�� @@@ �Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
 �̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��....
 
 */

create table data_Login(
 	idx number NOT NULL PRIMARY KEY,
 	ID varchar(50) NOT NULL,
 	PASS varchar(100) NOT NULL,
 	POINT number NOT NULL
);

/* ����
 * 
 * ����Ű ���迡 �ִ� ���̺� �����ϱ�
 * 
 * ���� ���̺� student_main(id, pass, name) : ���̵�, �н�����, �̸�
 * �������̺� student_point(id, subject, point) : ���̵�, ����, ����
 * 	student_main�� student_point id�� foreign key ���踦 �����ϰ�,
 * 	student_main�� �����Ͱ� �־�߸� student_point�� �Է��� �� �ִ�.
 *  
 * */
create table student_main(
	ID varchar2(50) NOT NULL PRIMARY KEY,
	PASS varchar2(100) NOT NULL,
	NAME varchar2(100) NOT NULL
);

insert into student_main(ID, PASS, NAME) values('yive', '852', '�ǿ�');

create table student_Point(
	ID varchar2(50) references student_main(ID),
	PASS varchar2(100),
	Point number NOT NULL
);


