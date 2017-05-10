/*
3/20
����01
emp03 ���̺� ���� ����
1. empno�� ���� ���������� -1, mgr:cleark �Է�, sal:��տ���, comm: ��ü�� comm �հ�
2. ���� ename: '�ű浿',job�� superman, hiredate�� �ֱ��� +1
*/
select min(empno)-1 from emp; -- 7369 
select avg(sal) from emp; -- 2,073.21
select sum(comm) from emp; -- 2,200 // mgr : 7902

create table emp003
	as select * from emp;

select * from emp003;

--1�� empno�� ���� ���������� -1, mgr:cleark �Է�, sal:��տ���, comm: ��ü�� comm �հ�
insert into emp003(empno, mgr, sal, comm) 
		values(7368,7902,2073,2200);
		
--2�� ���� ename: '�ű浿',job�� superman, hiredate�� �ֱ��� +1

update emp003
	set ename='�ű浿',	
		job='SUPERMAN',
		hiredate=sysdate+1
	where empno=7368;

select * from emp003;	



/*
����02
 login �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ����ȭ�鿡��  
'id@@@�� ȯ���մϴ�. ���� point�� @@@�Դϴ�' ��� ������ ��Ÿ���ٰ� �Ѵ�.
�̿� �ʿ���ϴ� ���̺�� ���̺� ������ ���弼��
*/
create table idNpw(id varchar2(20), pw varchar2(20), point number(6));
select * from idNpw;
insert into idnpw(id, pw, point) values('kdh',1111,10000);
insert into idnpw(id, pw, point) values('kwm',1111,20000);
insert into idnpw(id, pw, point) values('kmk',1111,30000);
insert into idnpw(id, pw, point) values('jgh',1111,40000);

/*
����03
����Ű ���迡 �ִ� ���̺� �����ϱ�
�������̺� STUDENT_MAIN(ID, PASS, NAME) : ���̵�, �н�����, �̸�
�������̺� STUDENT_POINT(ID, SUBJECT); ���̵�, ����, ����
    STUDENT_MAIN�� STUDENT_POINT ID�� FOREIGN KEY ���踦 �����ϰ�,
    STUDENT_MAIN�� �����Ͱ� �־�߸� STUDENT_POINT�� �Է��� �� �ְԲ� ó��
*/
create table student_main(
							id varchar2(20) PRIMARY KEY, 
							pass varchar2(20), 
							name varchar2(10)
						);


create table student_point(
							id varchar2(20) REFERENCES STUDENT_MAIN(ID),
							subject varchar2(20),
							point number(6)
							);

INSERT INTO STUDENT_MAIN (ID, PASS, NAME) VALUES('KDH',1111,'�赿��');
INSERT INTO STUDENT_MAIN (ID, PASS, NAME) VALUES('KWM',1111,'������');
INSERT INTO STUDENT_MAIN (ID, PASS, NAME) VALUES('KMK',1111,'��ΰ�');
INSERT INTO STUDENT_MAIN (ID, PASS, NAME) VALUES('JGH',1111,'������');

INSERT INTO STUDENT_POINT (ID, SUBJECT, POINT) VALUES('JGH','����',100);
INSERT INTO STUDENT_POINT (ID, SUBJECT, POINT) VALUES('KDH','����',50);
/* ���̵� �����Ƿ� �Է��� �ȵ�*/
INSERT INTO STUDENT_POINT (ID, SUBJECT, POINT) VALUES('KKK','����',100); 


SELECT * FROM STUDENT_MAIN;
SELECT * FROM STUDENT_POINT;


drop table student_point;
drop table student_main;

select * from student_main;
select * from student_point;



