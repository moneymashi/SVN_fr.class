/* z03_sql_constraint.sql
������ ���Ἲ ���� ����?
�������� �ŷڼ��� Ȯ���ϱ� ���Ͽ�, ���̺� ������, �÷� �Ӽ�������
�����ϴ� ���� ���Ѵ�.
#�������� 5����..
1) not null : null ������� �ʴ´�.
2) unique : ���ϰ��� �Է��� ������� �ʴ´�.
3) primary key : not null�� unqique�� ó���ؾ� �ϴ� ��..
4) foreign key : �����Ǵ� ���̺��� �÷����� �����ؾ� �Է��� ����
5) check : ���� ������ �����Ͱ��� ������ ������ ����..

1. not null
	��� ���̺� ����� ������ ������ ��, �ݵ�� �����ȣ�� ����̸��� ����Ǿ�� �Էµǵ���
	ó���ϰ��� �Ҷ�..
	create table ���̺��(�÷��� �÷�type not null, ..., ...);

*/
create table emp02(
	empno number(4) not null,
	ename VARCHAR2(10) not null,
	job varchar2(9),
	deptno number(4)
);
-- �������ǿ� �մ��ؾ��� �����Ͱ� �Է��� �����ϰ� ó�� ��..
insert into emp02 values(1000,'ȫ�浿','�븮',30);
select * from emp02;
/*
unique �������� : ������ �Է¿� �־, ������ ������ �Է��� ������� �ʴ� ���� ���Ѵ�.
emp03 ���̺�  empno�� unique������������ ������ ����� �Է����� ���ϰ� ó���ϼ���..
*/
create table emp03(
	empno number(4) unique,
	ename varchar(25),
	mgr number(4)
);
insert into emp03 values(1000,'himan',null);
insert into emp03 values(1001,'himan2',7788);
insert into emp03 values(1002,null,null);
insert into emp03 values(1003,'himan3',8888);
select * from emp03;
/*
primary key : not null(�ݵ�� ������ �Է��ؾ�), unique(�ݵ�� ������ ������)
	�� ������ �Ѵ� ó���� ��, ���δ�. �ַ� �������̺��� key���� ������ �� Ȱ��ȴ�.
	ex) memeber���̺� memberid����  primary key�� �����ϼ���..
*/
create table memeber(
	memberid varchar(20) primary key,
	pass varchar(20),
	name varchar(50),
	loc varchar(100)
);
insert into memeber values('1111','7777','ȫ�浿','���ﰭ��');
insert into memeber values('1112','7777','ȫ�浿','���ﰭ��');
insert into memeber values(null,'7777','ȫ�浿','���ﰭ��');
/*
foreign key : �����Ǵ� ���̺��� �ݵ�� ���� �Է��ؾ� �ϴ� ��츦 ���Ѵ�.

*/
select * from emp;
select * from dept;
drop table DEPT_REF;
CREATE TABLE DEPT_REF
(
   DEPTNO   NUMBER (2) primary key,
   DNAME    VARCHAR2 (14),
   LOC      VARCHAR2 (13)
);
CREATE TABLE EMP_REF
(
   EMPNO      NUMBER (4) primary key,
   ENAME      VARCHAR2 (10),
   JOB        VARCHAR2 (9),
   MGR        NUMBER (4),
   HIREDATE   DATE,
   SAL        NUMBER (7, 2),
   COMM       NUMBER (7, 2),
   DEPTNO     NUMBER (2) REFERENCES DEPT_REF(DEPTNO)
);
--  �÷� �÷�TYPE references ���������̺��(�������÷���)
insert into DEPT_REF values(20, '�ѹ�','���');
select * from DEPT_REF;
insert into EMP_REF(EMPNO, ENAME, DEPTNO) values(1000,'ȫ�浿',10);
select * from EMP_REF;
insert into EMP_REF(EMPNO, ENAME, DEPTNO) values(1002,'���浿',20);
/* ����
����Ű ���迡 �ִ� ���̺� �����ϱ� 
�������̺�  student_main(id, pass, name) :���̵�, �н�����, �̸�
�������̺�  student_point(id, subject, point); ���̵�, ����, ����
  student_main �� student_point  id��  foreign key ���踦 �����ϰ�,
  student_main�� �����Ͱ� �־�߸� student_point�� �Է��� �� �ְԲ� ó��
*/


CREATE TABLE student_main
(
   ID VARCHAR2(20) PRIMARY KEY,
   PASS VARCHAR2(20),
   NAME  VARCHAR2 (50)
);
SELECT * FROM STUDENT_MAIN;
SELECT * FROM STUDENT_POINT;
INSERT INTO STUDENT_MAIN VALUES('C001001','7777','ȫ�浿');
INSERT INTO STUDENT_MAIN VALUES('C001002','7777','�ű浿');
INSERT INTO STUDENT_MAIN VALUES('C001003','7777','���浿');
 

CREATE TABLE STUDENT_POINT(
	ID VARCHAR2(20) REFERENCES STUDENT_MAIN(ID),
	subject VARCHAR2(50),
	POINT NUMBER
);
-- �����߻�
INSERT INTO STUDENT_POINT VALUES('C001004','����',70);
INSERT INTO STUDENT_POINT VALUES('C001004','����',80);
INSERT INTO STUDENT_POINT VALUES('C001004','����',90);
SELECT * FROM STUDENT_MAIN A, STUDENT_POINT B
WHERE A.ID = B.ID;


/*
check ���� ����
�Էµȴ� ���� üũ�Ͽ� ������ �� �̿��� ���� ������ ���ϰ� ������ �����ϴ� ���� ���Ѵ�.
ex) ������̺� gender��� �÷��� �ΰ�, ���⿡ 'M', 'F' �ΰ��� �� �ܿ��� �Է� ���� 
���ϰ� ó������.
*/
create table emp04(
 empno number(4),
 ename varchar2(10),
 gender varchar2(1) check(gender in('M','F'))
);
insert into emp04 values(9998,'�ű浿','D');
select * from emp04;
