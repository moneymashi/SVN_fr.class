
/* ����
emp03 �������̺� ����
1. �Է�  empno�� ���� ���������� -1, mgr:cleark�� mgr�Է�, sal:��տ���, 
   comm:��ücomm�� �հ�
2. ���� ename:'�ű浿', job�� SUPERMAN, hirdate�� �ֱٿ� �Ի���+1
*/

create table emp03 as select * from emp;
select min(empno)-1, avg(sal), sum(comm) from emp03;
select * from emp03 where ename ='CLARK'; 
select max(hiredate)+1 from emp03;
insert into emp03 (empno,sal,comm,mgr) values (7368,2073.21,2200,7839);

update emp03 set ename ='�ű浿',job='SUPERMAN',hiredate ='1983/01/13'
where  empno =7368;

commit;

/*
���� login�� �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡��
	id@@@ �� ȯ���մϴ�. ���� point�� @@@ �Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
	�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��..
*/

create table login_t (id varchar2(20) not null,password vharchar(8)not null,
point number(7));

/* ����
����Ű ���迡 �ִ� ���̺� �����ϱ� 
�������̺�  student_main(id, pass, name) :���̵�, �н�����, �̸�
�������̺�  student_point(id, subject, point); ���̵�, ����, ����
  student_main �� student_point  id��  foreign key ���踦 �����ϰ�,
  student_main�� �����Ͱ� �־�߸� student_point�� �Է��� �� �ְԲ� ó��
*/
select * from emp;
select * from dept;
drop table DEPT_REF;
CREATE TABLE student_main
(
   ID   	VARCHAR2 (8) primary key,
   PASS     VARCHAR2 (10) not null,
   NAME     VARCHAR2 (13) not null
);

CREATE TABLE student_point
(
   ID   		VARCHAR2 (8) primary key REFERENCES student_main(ID),
   SUBJECT      VARCHAR2 (10) not null,
   STUENTPOINT  NUMBER (8)
);

insert into student_point values('STU_01','SC',12);
-- �����Է½� parent key not found ������ ��
insert into student_main values('STU_01','7777','�ű浿');
--main ���̺� ���� �Է½� point���̺� �Է��� ���� 
select * from student_point;
select * from student_main;
commit;

