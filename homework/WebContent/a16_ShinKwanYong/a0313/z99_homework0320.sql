/*
emp03 �������̺� ���� // �Ϸ�
1. �Է� empno�� ���� ���������� -1, mgr:clark�� mgr�Է�, sal:��տ���, comm:��ü comm�� �հ�
2. ���� ename:'�ű浿', job�� SUPERMAN, hiredate�� �ֱ� �Ի���+1
*/
create TABLE emp03
as select * from emp;
select * from emp03;
-- ����ã��
select min(empno)-1 from emp03; -- 7368
select mgr from emp03 where ename='CLARK'; -- 7839
select round(avg(sal)) from emp03; -- 2073
select sum(comm)from emp03; -- 2200
select max(hiredate)+1 from emp03; -- 01/13/1983
-- �Է�
insert into emp03(empno,mgr,sal,comm)
values(7368,7839,2073,2200);
commit;
-- ������Ʈ
update emp03
	set ename='�ű浿',
		job='SUPERMAN',
		hiredate=to_date('1983/01/13','YYYY/MM/DD')
where empno=7368;
-- Ȯ��
select * from emp03 where empno=7368;

/*
���� // �Ϸ�
login�ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡��
id@@@�� ȯ���մϴ� ���� point�� @@@�Դϴ� ��� ������ ��Ÿ���ٰ� �Ѵ�
�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��
*/

create table login( id varchar2(12), password varchar2(20), point number(4) );
select * from login;

/*���� // �Ϸ�
����Ű ���迡 �ִ� ���̺� �����ϱ�

�������̺� student_main(id, pass, name) : ���̵�, �н�����, �̸�
�������̺� student_point(id, subject, point) : ���̵�, ����, ����
	student_main�� student_point�� id�� foreign key ���踦 �����ϰ�,
	student_main�� �����Ͱ� �־�߸� student_point�� �Է��� �� �ְ� ó��
*/
create table student_main(
	id char(12) primary key,
	pass char(20),
	name char(20)
);

create table student_point(
	id char(12) REFERENCES student_main(id),
	subject01 char(10),
	point number(2,0) 
);

select * from student_point;

















