/*
�������� ��� DML query!!
1. ������ ���̺� ������ �Է��ϱ�..
	insert ������ ������ �Ἥ �����͸� �Է��ϴ� ��찡 ���� �����͸� �Է�
	�� �� ���ŷ��� ��찡 �ִ�. 
	�� ���� suberquery�� ���ؼ� ���� ������ ������ ���̺� �Է��� ��,
	insert all ������ Ȱ���ϸ� �ս��� ó���� �� �ִ�. 
	1) ����
	insert all
	into ���̺�1�� values(�÷�1, �÷�2, �÷�3)
	into ���̺�2�� values(�÷�1, �÷�2, �÷�4)
	select �÷�1, �÷�2, �÷�3, �÷�4
	from ���̺��
	where ����
ex) emp���̺��� �����������̺� ����
		emp_hir(empno, ename, hiredate)
		emp_mgr(empno, ename, mgr)
		���� emp���̺��� �μ���ȣ�� 20�� �����͸� 
		�ش� ���̺� ������ �Է�ó��..
*/
--���� ���� ���̺� �����ϱ�.
create table emp_hir
 AS 
 select empno, ename, hiredate from EMP
 where 1=0;
 select * from emp_hir; 

create table emp_mgr
 AS 
 select empno, ename, mgr from EMP
 where 1=0;
 select * from emp_hir; 
insert all
 into emp_hir values(empno, ename, hiredate)
 into emp_mgr values(empno, ename, mgr)
 select empno, ename, hiredate, mgr
 from emp
 where deptno=10;
 /*
 ���������� �̿��� ������ �����ϱ�.
 update ���̺��
 set (������ Į��1, ������Į��2) = (select Į��1, Į��2 from ���̺�)
 where ����...
 ex) 20�� �μ��� �������� 40�� �μ��� ���������� �����ϱ� ���ؼ� ���������� Ȱ���غ���..
 
 */
create table dept01
as 
select * from dept;
select * from dept01;
-- �Է��� ������ loading(subquery)
select dname, loc
from dept
where deptno=40;
--main query
update dept01 
set (dname, loc) = (select dname, 
loc from dept01 where deptno=40)
where deptno=20;
select * from dept01;
select * from EMP11;
/*Ȯ�ο���
emp���̺��� ���纻 emp11 ����
		job(��å)�� president�� �ִ� sal�� deptno�� 
		job�� clerk�� �ִ� �����ͷ� update�ϼ���.
*/
create table emp11 as SELECT * from emp;
update emp11 
set(sal,deptno)=(select sal,deptno from emp where job='PRESIDENT')
where job='CLERK';
select * from emp;
/*
MERGE ó��
DATA MINGRATION(������ �̰�ó��)�Ҷ� ���� Ȱ��ȴ�.
���̺�A, ���̺�B�� �����͸� �̰�ó����, �μ��� �޶� �ԷµǾ� �ִ� �����͵� �ְ�, �űԷ� �Է��ؾߵ� �����͵� ������,
�ԷµǾ� �ִ� �����ʹ� Ư�� �÷��� ����ó���ؾ� �� ��� ���� Ȱ��ȴ�. 
���� ex) ���̺� a�� ������ ���̺�b���� ���� �����ʹ� insertó��
		���̺� a�� �ְ�, ���̺�b�� ������ Ư���� �÷��� �����ϴ� ���� updateó��
		�ΰ��� ������ �ѹ��� ó���ϴ� ���� merge��� �Ѵ�. 
	MERGE INTO ���������̺�(EX) ���̺�B
		USING ���������������̺� ex) ���̺�a 
		on ����ó��-�Ϲ������� �� ���̺��� key���� �������� ó���Ѵ�. 
									ex) ���̺�a.�÷�01=���̺�b.�÷�01
		when matched then --�ΰ��� ���̺� key�Ǵ� �����Ͱ� �������� ���� ��.
			������Ʈ ����ó��					ex) ���̺�a�� �÷�01�� ���̺�b�� �÷�01�� 
			update set					�ش絥���Ͱ� ������ ���. 
							���������̺�.�������÷�=���������������̺�.�÷�
							ex)���̺�B.�������÷� = ���̺�A.�÷�
			when not matched then -- ���� ���̺� �����Ͱ� ���� ���
							ex) ���̺�a���� ������, ���̺�b���� ���� ���
						�Է°���ó��..
						insert[���̺�x] values(���������������̺�.�÷�....)
							ex)insert values(���̺�B.�÷���....);
*/						
/*
EMP01,EMP02 �����͸� �ε��ؼ� EMP01�� ������ ����ó��
1. EMP01 �������̺����
2. EMP02 �������̺���� EMP��JOB="MANAGER"��...
   EMP02 JOB ==> 'TEST'�� UPDATE(##empno�� ����, job�� �ٸ� ������)
   EMP02 �Է� 7935 'ȫ�浿', 'SUPERMAN' 7839 sysdate 4000 100 40
		(##empno�� emp01���� ���� ������)
*/
select * from emp order by empno desc;
create table EMP01 
as 
select * from emp; --emp01�������̺� ����
select * from emp01; --�����̺� ����ó��..
create table emp02 
as 	
	select * from emp
	where job='MANAGER';
select * from emp02;
select * from emp01;
update emp02
set job='test';--emp02�� job�� 'test'�� ����
--emp02�Է� 7935 'ȫ�浿', 'superman' 7839 sysdate 4000 100 40
insert into emp02 values(7935, 'ȫ�浿', 'SUPERMAN', 7839, SYSDATE, 4000, 100,40);

merge into emp01 --���� �����ʹ� emp01�� ó�� 
	using emp02   --emp02�����͸� �����. 
	on (emp01.empno=emp02.empno) --�ش� key���� empno�� �ִ��� ���ο� ���� update/insert�� ����
when matched then --empno���� ���� ��..
	update set 
	  emp01.job = emp02.job --emp02.job ������ ��, 'TEST'�����͸� EMP01.JOB�� UPDATE
when not matched then --������ empno���� emp01�� ���� ���, 
	insert values(emp02.empno,emp02.ename, emp02.job,emp02.mgr,
	emp02.hiredate, emp02.sal, emp02.comm, emp02.deptno);

/*
Ȯ�ο���
EMP�� �������̺� EMP03
EMP���� �μ���ȣ(DEPTNO)�� 30�� �����͸� EMP04�� �������̺� �����
	EMP04�� HIREDATE�� ���ó�(SYSDATE)�� UPDATEó��.
EMP04�� 7370 '������' 'SUPERMAN' 7839 SYSDATE 6000 400 40 ������ �Է�
�� ���̺� ����ó��..
*/
create table emp03 AS select * from emp;
create table emp04 as select * from emp where deptno=30;
select * from emp03;
select * from emp04;
update emp04 
	set hiredate = sysdate;
insert into emp04 values(7370, '������', 'SUPERMAN', 7839, SYSDATE, 6000, 400, 40);
rollback;
merge into emp03
	using emp04
	on (emp03.empno=emp04.empno)
	when matched then
		update set
		emp03.hiredate=emp04.hiredate
	when not matched then
		insert values(emp04.empno,emp04.ename, emp04.job,emp04.mgr,
		emp04.hiredate, emp04.sal, emp04.comm, emp04.deptno);




















