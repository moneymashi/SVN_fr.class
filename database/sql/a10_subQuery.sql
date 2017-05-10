/*
���� ������ �̿��� ������ �߰�.
insert ������ select�� ȥ���ؼ�, �����͸� �Է� ó���� ����.
���� : INSERT INTO ���̺��
       SELECT * FROM �Է������̺�; �ش� SQL�� ���� ������ ������
	   �� �ѹ��� �Է��� �� �ִ�..
	   ������ ��) �Է��� ���̺��� �÷��� SELECT [�����÷���]��
	   �÷� ������ TYPE�� �����Ͽ��� �Ѵ�.
	   
*/
select * from emp_structor;
-- EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
INSERT INTO emp_structor
SELECT * FROM EMP
WHERE SAL>=3000;
SELECT * FROM emp_structor;
-- �÷� ���� �� ����
/*
	insert into ���̺��(�÷�1, �÷�2, �÷�3)
				select �÷�1, �÷�1+�÷�2, �Լ�(�÷�3)
				from ���̺��
				where ����..
*/

INSERT INTO emp_structor(empno, sal, ename)
	select empno, sal+comm, rpad(ename,7,'^^') from emp;
select * from emp_structor;
select * from emp;
select * from dept;

create table dept_sub
as select deptno, dname, loc, '     ' kname, 0 membercnt .
   from dept
   where 1=0;
select * from dept_sub;  
	select deptno, dname, loc, 
	      decode(deptno, 10,'ȸ��',20,'����',30,'����', 40, '�','����') kname, 
	    0 membercnt 
	   from dept;
	insert into dept_sub
	select deptno, dname, loc, 
	      decode(deptno, 10,'ȸ��',20,'����',30,'����', 
		  			40, '�','����') kname, 
	      (select count(*) from emp where deptno=a.deptno ) membercnt 
	   from dept a;
select count(*) from emp where deptno=30;	
select a.*,
      decode(deptno, 10,'ȸ��',
                     20,'����',
		     30,'����', 
	  	     40,'�',
		     '����') kname 
from dept a;
	select deptno, dname, loc, 
	      decode(deptno, 10,'ȸ��',20,'����',30,'����', 
		  			40, '�','����') kname, 
	      (select count(*) from emp 
		  where deptno=a.deptno ) membercnt 
	   from dept a;	
select count(*) 
         from emp 
	 where deptno=20;	    
/*
���� ��������:
	�����ϴ� main sql������ subquery�� �ش� ������ �����
	ó���ϴ� ���� ���Ѵ�..
update ���̺��
  set �÷��� = ������(�����ͺκ��� subquery�� ó�� 
                    select �÷���
                    from ���̺� where ����
					)
 where ����
 ex) empno�� 7369�� ����� ���ʽ�(comm), 
        ��ü ���ʽ��� ����� �Ҵ� �ҷ��� �Ѵ�. 
*/
-- 1. subquery
select avg(comm)
 from emp;
-- 2. mainquery
update emp
   set comm=( select avg(comm)
 			 from emp  )
 where empno=7369;
 select * from emp;
--  Ȯ�ο���.
-- 1. emp_sub77 �̶�� emp�� �������̺��� ����.
-- 2. emp_sub77���� comm�� null���� �����Ϳ� sal�� ���������� �����ϼ���.
create table emp_sub77
as select * from emp;
update emp_sub77
  set comm=(select min(sal) from emp_sub77)
  where comm is null;  
select * from emp_sub77;  
 




	 
 



