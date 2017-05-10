/* ����
emp03 �������̺� ����
1. �Է� empno�� ���� ���������� -1, mgr:clark�� mgr�Է�, sal: ��տ���, comm: ��ücomm�� �հ�
2. ���� ename: '�ű浿', job�� SUPERMAN, hiredate�� �ֱٿ� �Ի��� +1
*/	 

select mgr from emp
where ename='CLARK';
--7839
select min(empno)-1, avg(sal), sum(nvl(comm,0)) from emp;
--7368, 7839, 2073.21, 2200 

CREATE TABLE emp03
(
   Min_1 NUMBER(10),
   MGR1  NUMBER(10),
   AVG1  NUMBER(10),
   SUM1  NUMBER(10)
);
drop table emp03;
select * from emp03;	
insert into emp03 values(7368, 7839, 2073.21, 2200);

/* ����
login �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡�� id@@@�� ȯ���մϴ�.
���� point�� @@@�Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��.
*/

create table login(
	id varchar2(20) primary key,
	pass varchar2(20),
	point number(20)
);

select * from login;
insert into login values('himan','22222',100);
insert into login values('bye','2232',200);
insert into login values('hihi','23332',103);

/* ����
����Ű ���迡 �ִ� ���̺� �����ϱ� 
�������̺� student_main(id, pass, name) : ���̵�, �н�����, �̸�
�������̺� student_point(id, subject); ���̵�, ����, ����

student_main�� student_point id�� foreign key ���踦 �����ϰ�,
student_main�� �����Ͱ� �־�߸� student_point�� �Է��� �� �ְԲ� ó��
*/
drop table student_main3;
drop table student_point3;

CREATE TABLE student_main3
(
   ID    VARCHAR2 (15) primary key,
   pass  VARCHAR2 (15),
   name  VARCHAR2 (15) 
);

CREATE TABLE student_point3
(
   ID    VARCHAR2 (15) primary key,
   subject  VARCHAR2 (15) REFERENCES student_main(ID)
);

select * from student_main3;
select * from student_point3;

insert into student_main3 values('himan', '1234', 'ȫ�浿');
insert into student_main3 values('himan1', '1234', '�ű浿');
insert into student_point3 values('himan1', '����');

