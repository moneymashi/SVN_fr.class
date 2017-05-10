/*
���� 
emp03�������̺� ����.
1. empno�� ���� ���������� -1. mgr: cleark�� mgr(4�ڸ���������)�Է�, sal: ��տ���, comm: ��ü �հ�.
2. ���� ename: '�ű浿', job = superman, hiredate�� �ֱ��Ի���+1.

*/

	create table emp03 as select * from emp;
	SELECT * from emp03;
	select min(empno) from emp03; --7369
	select avg(sal) from emp03; -- 2073.21
	select sum(comm) from emp03; -- 2200
	
	insert into emp03(ename, empno, mgr, sal, comm ) values ('�ű浿', '7368', '3824', '2073.21', '2200' );
	update emp03 set ename = '�ű浿', job = 'superman', hiredate= to_date('1983/01/12') +1;
	select * from emp03;



/*
	����: login ���ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, 
		����ȭ�鿡�� id@@@�� ȯ���մϴ�. ���� point�� @@@�Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
		�̿��ʿ��� ���̺�� ���̺����� ������.
*/
	create table membershipSecurity( 
		memberNumber number(7,0) primary key, 
		memberId varchar2(10),
		memberPswd varchar2(10)
		);
		
	create table membershipVIP(
		memberNumber number(7,0) references membershipSecurity(memberNumber),
		memberPoint number(7, 0),
		memberVIPLevel varchar(7) primary key
	);

/*
����: 
	����Ű ���迡 �ִ� ���̺� �����ϱ�
�������̺� student_main(id, pass, name) : ���̵� , �н�����, �̸�
�������̺� student_point(id, subject, point); ���̵�, ����, ����.
 student_main�� student_point id�� foreignkey ���踦 �����ϰ� 
 student_maiun�� �����Ͱ� �־�߸� student_point�Է��Ҽ� �ְԲ� ó��. 

*/
create table student_main(
	id number(7,2) primary key,
	pass varchar2(5),
	name varchar2(10) 
);
create table student_point(
	id number(7,2) references student_main(id),
	subject varchar2(10),
	point number(3,2) primary key
 );


