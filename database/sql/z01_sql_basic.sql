/*
1. DML : Data Maniplulation Language
1) select : ��ȸ�� ���.
2) insert : ������ �Է½� ���.
   insert into ���̺�� values(������1, ������2, ������3);
   
*/
select * from dept;
/*
���̺� �����ϱ�..
create table ���ο����̺��
as select * from ���������̺��;
*/
create table dept01
as select * from dept;
select * from dept01;
/*
������ �Է�1)
ex) insert into dept01 values(50,'�ѹ���','����');
*/
insert into dept01 values(50,'�ѹ���','����');
select * from dept01;
commit; -- Ȯ��ó��, �������ϰų� �ٸ� ����ڵ� ����� �����͸� �� �� �ְ�.
/*
������ �Է�2
insert into ���̺��(�������÷���1, ������ �÷���2) 
           values(ù��°�Է��ҵ�����,�ι�°�Է��� ������);
ex) dept01���̺��� deptno�� 60�� �Է��Ѵ�.
    dept01���̺��� deptno�� loc�� �Է��Ѵ�.
*/
insert into dept01(deptno) values(60);
select * from dept01;
insert into dept01(deptno, loc) values(70,'��õ');
/*
3) update : �ԷµǾ� �ִ� ������ ������, ������ �ʿ��� �κ���
	����ó���Ѵ�.
	update ���̺��
	  set �����ϰ����ϴ��÷���1=�����ҵ�����,
	  	  �����ϰ����ϴ��÷���2=�����ҵ�����
	 where �����ϰ����ϴ� ����(�÷���=���ǵ�����);
*/
select * from dept01;
-- dept01�� deptno�� 60�� �������� �ϴ� �����͸� dname �λ�, loc ��������
-- ����ó��.
update dept01
  set dname='�λ�',
      loc='����'
where deptno=60;
select * from dept01;	  
-- Ȯ�ο���..
-- select * from emp;
-- emp01�̶�� ���� ���̺��� �����
-- 1) empno�� ���� ���� ��ȣ���� +1�ؼ�, ename�� job, sal�� �Է��ϼ���
-- 2) �׿ܿ� �÷� mrg, hirdate(sysdate-���糯¥�μ���), deptno�� 40���� ����ó���ϼ���
select * from emp;
create table emp01
as select * from emp;
select max(empno)+1 from emp01;
-- 7935
insert into emp01(empno, ename, job, sal) 
          values(7935, 'ȫ�浿','SUPERMAN',5000);
commit;		  
SELECT * FROM emp01 where empno=7935;
update emp01
   set mgr=7777,
       hiredate=sysdate,
	   deptno=40
where empno=7935;
--  ����
-- emp03 �������̺� ����
-- 1. �Է�  empno�� ���� ���������� -1, mgr: CLERK �� mgr�Է�, sal:��տ���, 
--    comm:��ücomm�� �հ�
select min(empno)-1, avg(sal), sum(comm)
from EMP03; -- 7368, 2073.21, 2200
select mgr
from EMP03
where job='CLERK'; -- 7902, 7788, 7698, 7782
INSERT INTO EMP03(EMPNO, SAL, COMM, MGR) VALUES( 7368,2073.21,2200,7902);
INSERT INTO EMP03(EMPNO, SAL, COMM, MGR) VALUES( 7368,2073.21,2200,7788);
INSERT INTO EMP03(EMPNO, SAL, COMM, MGR) VALUES( 7368,2073.21,2200,7698);
INSERT INTO EMP03(EMPNO, SAL, COMM, MGR) VALUES( 7368,2073.21,2200,7782);
SELECT * FROM EMP03;
-- 2. ���� ename:'�ű浿', job�� SUPERMAN, hirdate�� �ֱٿ� �Ի���+1
SELECT MAX(HIREDATE)+1
FROM EMP;
	UPDATE EMP03
		SET ENAME='�ű浿',
		JOB='SUPERMAN',
		HIREDATE=(SELECT MAX(HIREDATE)+1 FROM EMP03);
select * from  EMP03;
/*
4. delete : Ư�� ������ �����͸� ����ó���ϴ� ����
	delete [����] from ���̺��
	where ����[�÷��� = ���ǵ�����]
*/
-- DNAME�� 'SALES'�� �����͸� DEPT01���� �����Ͻÿ�..
DELETE FROM dept01
where DNAME='SALES';
-- Ȯ�ο��� deptno�� 50�̻��� �����͸� ��� �����Ͻÿ�..
select * from dept01;
delete from dept01
where deptno>=50;
-- emp01���̺� comm�� null�̰�, deptno�� 20�� �����͸� �����ϼ���.
delete from emp01
where comm is null
and deptno=20;
/*
Transaction(Ʈ�����) : �����ͺ��̽����� ó���� �� ������ �ǹ��ϸ�, 
�������� sql���� �ϳ��� ���� �۾� ������ ó���ϴµ� �̸� �ǹ��ϱ⵵ �Ѵ�.
TCL(Trasaction Control Language) : �̷��� Ʈ������� ��� ���� ��ɾ�..
 commit : �������� dml�� ���� ����,����, �Էµ� ������ Ȯ��ó��..
 rollback : �����͸� commit�ϱ����� ���� ���� �Էµ� ������ ����ó��..
 savepoint : �����͸� Ư���������� ����ó���ϰ��� �Ҷ�, ������ save�ϴ� ���� ���Ѵ�.
*/
select * from dept01;
-- 1) dept01���̺� deptno 30 '�ѹ�' '����'�� �Է��� ��, rollbackó���� �غ���.
-- 2) dept01���̺� deptno 40 '�λ�' '����'�� �Է��ѵ�,
--        commit�ϰ�  �������� ���� commit���� �ʰ� �������� ��� �������� ���� ������
--        Ȯ���Ѵ�.
insert into dept01 values(30,'�ѹ�','����');
rollback;   -- �����Ͱ� �ԷµǱ� ������ ���ư��� ���� Ȯ���� �� �ִ�.
 insert into dept01 values(50,'�λ�1','����1');
-- db������ ���´�.
-- �ܺο��� comit�ϱ� ������ �����Ͱ� ���� ������ �ȴ�.
-- tool�� ���� autocommit�� �߻��ϴ� ��찡 �ִ�..
select * from emp01;






