/*
���� 
emp03 �������̺� ����
1. �Է� empno�� ���� ���������� -1, mgr: clerk�� mgr�Է�, sal: ��տ���,
	comm: ��ü comm�� �հ�
2. ���� ename: '�ű浿',job�� superman, hiredate�� �ֱٿ� �Ի���+1 
*/		
/*
4. delete: Ȯ�� ������ �����͸� ����ó���ϴ� ����
	delete [����] from ���̺��
	where ����[�÷��� = ���� ������]
*/
select * from emp03;
create table emp03 
as select * from emp;
select min(empno)-1 from emp03;
select max(hiredate)+1 from emp03;
insert into emp03 (empno,mgr, sal, comm) values(7368,7902,(select avg(sal) from emp03),(select sum(comm) from emp03));
update emp03 set ename='�ű浿',
				 job='SUPERMAN',
				 hiredate='1983/1/14'
				 where empno=7368;
delete from dept01
where dname='sales';
select * from dept01;
delete from dept01
where deptno=50;

/*
���� login �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡�� 
id@@@�� ȯ���մϴ�. ���� point�� @@@�Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�. 
�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��. 
*/
create table forlogin(id char(10), password varchar2(20), pointC number(10));
select * from forlogin;
select * from emp;
/*
����
����Ű ���迡 �ִ� ���̺� �����ϱ�

�������̺� student_main(id, pass, name) : ���̵�, �н�����, �̸�
�������̺� sutdent_point(id, subject, point);  ���̵�, ����, ����
	student_main�� student_point id�� foreign key ���踦 �����ϰ�,
	student_main�� �����Ͱ� �־�߸� student_point�� �Է��� �� �ְԲ� ó��. 
*/
create table student_main(id char(10) primary key, pass varchar2(20), name char (10));
commit;
insert into student_main(id,pass,name) values('ddd','wsssd','����');
create table student_point(	id char(10) references student_main(id),
								subject char(10),
								getPoint number(5)
							);
select * from student_main;
select * from student_point;


