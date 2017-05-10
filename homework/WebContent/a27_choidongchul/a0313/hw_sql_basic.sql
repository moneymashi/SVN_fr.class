/*
	����1.
	emp03 �������̺� ����
	1. �Է� empno�� ���� ���������� -1, mgr : clerk�� mgr�Է�, sal : ��տ���, comm : ��ü comm �հ�
	2. ���� enmae : '�ű浿', job�� SUPERMAN, 	hiredate�� �ֱ��Ի���(sysdate)+1
*/	
	create table emp03 as select * from emp;
	select min(empno)-1 from emp03; -- 7638
	select mgr from emp03 where job='CLERK'; -- 7902
	select avg(sal) from emp03; -- 2073.21
	select sum(comm) from emp03; -- 2200
	insert into  emp03(empno,mgr,sal,comm) values(7638,7902,2073.21,2200);
	update EMP03
		set ename='�ű浿',
		job='SUPERMAN',
		HIREDATE=SYSDATE+1
	WHERE EMPNO=7638;

/*
	����
	login�� �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡�� id : @@@�� ȯ���մϴ�. ���� point�� @@@�Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
	�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��.
*/	
	create table login(
		id varchar2(10) unique,
		pw varchar2(10)
	);
	alter table login add(point number(10));

/*
	����3.
	����Ű ���迡 �ִ� ���̺� �����ϱ�	
	�������̺� student_main(id,pass,name) : ���̵�, �н�����, �̸�
	�������̺� student_point(id,subject) : ���̵�, ����, ����
	student_main�� student_point id�� foreign key ���踦 �����ϰ�,
	studuent_main�� �����Ͱ� �־�߸� student_point �� �Է��� �� �ְԲ� ó��
*/
  create table student_main(
  	id varchar2(10) primary key,
	pass varchar2(10) not null,
	name varchar2(10) unique
  );
  create table student_point(
   id varchar2(10) references student_main(id),
   subject varchar2(10) check(subject in('math','science','english'))
  );
