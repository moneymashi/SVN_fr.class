/* ����1. (homework 1)
 EMP03 �������̺� ����
 1. �Է� EMPNO�� ���� ���������� -1, MGR : CLERK�� MGR�Է�, SAL : ��տ���, COMM : ��ü COMM�� �հ�
 2. ���� ENAME : '�ű浿', JOB�� SUPERMAN, HIREDATE�� �ֱٿ� �Ի���+1
*/ 

	create table emp03 as select * from emp;
	select * from emp03;
	select min(empno), avg(sal), sum(comm),max(hiredate)+1 from emp;
	insert into emp03(empno, mgr, sal, comm) values(7368,7902,2073.21,2200);
	select * from emp03;
	update emp03 set ename='�ű浿', job='SUPERMAN', hiredate=to_date('1983/01/12')+1, comm=2200 where empno=7368;
	select * from emp03;

/*
 ����2. (homework 2)
 login�� �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ����ȭ�鿡�� 'id@@@�� ȯ���մϴ�. ���� point�� @@@�Դϴ�.' ��� ������ ��Ÿ���ٰ� �Ѵ�.
 �̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��.
*/	
	create table login( id VARCHAR2(20), password VARCHAR2(20), point number(10) );
	select * from login;
	alter table login modify(id VARCHAR2(20) PRIMARY KEY );
	alter table login modify(password not null);
	select * from login;
	select * from login; 	
	