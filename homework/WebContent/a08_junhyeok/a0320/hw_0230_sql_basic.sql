/*
����
emp03 �������̺� ����
1. empno�� ���� ���������� -1, mgr: clerk�� mgr �Է�, sal:��տ���, comm: ��ü comm�� �հ�
2. ���� ename:'�ű浿', job:'SUPERMAN', hiredate:�ֱٿ� �Ի��� +1
*/
create table emp03 as select * from emp;
select * from emp03;
select min(empno)-1 from emp03;
--empno=7368;
insert into emp03(empno, mgr, sal, comm) values(7368, 7902,(select avg(sal) from emp03), (select sum(comm) from emp03));
update emp03
	set ename='�ű浿',
		job='SUPERMAN',
		hiredate=(select min(hiredate) from emp03)+1
		where empno=7368;
select * from emp03;

/*
���� 
login �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡�� id@@@�� ȯ���մϴ�. ���� point�� @@@ �Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼�� 
*/
create table info (id varchar2(15), pw varchar2(20), point number(3));
select * from info; 

/*
����Ű ���迡 �ִ� ���̺� �����ϱ�
�������̺�	STUDENT_MAIN(ID,PASS,NAME)	:���̵�, �н�����, �̸�
�������̺�	STUDENT_POINT(ID, SUBJECT, POINT);	:���̵�, ����, ����
STUDENT_MAIN�� STUDENT_POINT ID�� FOREIGN KEY ���踦 �����ϰ�,
STUDENT_MAIN�� �����Ͱ� �־�߸� STUDENT_POINT�� �Է��� �� �ְԲ� ó��..
*/
CREATE TABLE STUDENT_MAIN(
	ID	VARCHAR2(15) PRIMARY KEY,
	PASS VARCHAR2(10),
	NAME VARCHAR2(10)
);
CREATE TABLE STUDENT_POINT(
	ID VARCHAR2(15) REFERENCES STUDENT_MAIN(ID),
	SUBJECT CHAR(10),
	POINT NUMBER(3)
);