/*
sequence
����Ŭ���� �ߺ��� ���� ���� �ʱ� ���� �⺻ Ű(primary key)�� 
���̺� �ϳ��� �÷��� �����Ѵ�.
�� �÷��� �ߺ����� �ʴ� ���� �ֱ� ���ؼ� ����Ŭ������ sequence
��� ��ü�� �����ϰ� �ִ�. 
�������� ���̺� ���� ������ ���ڸ� �ڵ����� �����Ͽ� �ڵ�����
��ȣ�� �Է��� �� �ְ� �ϱ⿡ ������� ����Ű ������ ���� �δ���
�ٿ� �ش�.
ex) �л� ���̺� ��ȣ�� �Է��Ѵ�.
	no �̸� ....
	no �÷��� 1, 2, 3, 4, 5..  ���� �ڵ����� �Է��� �ؾ��� ��.
	��� ���̺� ��ȣ�� �Է��Ѵ�.
	empno ename
	1000 ���� ���� 1001, 1002, 1003, 1004 .... 	
	�й��Է�..
	studId  name..
	C020001   ���ۿ� C020002, C020003.....
	[�ܰ��ڵ�][SEQUENCE] : �ռ���ȣ..
EX) �Է½�, �ڵ����� NUMBERING ó��..	
	INSERT INTO ���̺�  VALUES( SEQUENCE��.NEXTVAL, ....)
	INSERT INTO ���̺�  VALUES( 'C0'||SEQUENCE��.NEXTVAL, ....)
					--> ���ڿ� ���յ� sequence ó��..

����]	
CREATE SEQUENCE ��������
   	START WITH N  --> �����ϴ� ��ȣ�� ����..EX) 1, 1001, 20001
	INCREMENT BY N  --> ���� ����..EX) 1, 2(2 STEP������ ����)
	                                 -1(1 STEP������ ����)
	MAXVALUE N  --> �������� ��, �ְ� ���� EX) 999999
							1 ~ 999999 ���� �����͸�  NUMBERING
							ó���Ѵ�.									  	
������ �Է��̳� Ȱ���.
	��������.NEXTVAL : �������� ������Ű�� ���簪�� ���..
	��������.CRURRVAL : �������� ���簪�� ���.

EX) ## ���۰��� 1�̰� 1�� �����ϰ�, �ִ밪�� 99999�� ������ 
	EXP01_SEQ�� ����� ����..

*/
CREATE SEQUENCE EXP01_SEQ
		START WITH 1
		INCREMENT BY 1
		MAXVALUE 99999;
SELECT EXP01_SEQ.NEXTVAL FROM DUAL; -- ���� ��ȣ�� 1�� ���� �� NUMBERRING
-- ���� ������ ������ NUMBER ....
SELECT EXP01_SEQ.CURRVAL FROM DUAL; -- ���� ��ȣ ȣ��.
-- EX) �л����̺�(STUDENT_SEQ_EXP)�� 
--     no �̸� 
create table student_seq_exp(
	no number primary key,
	name varchar2(50)
);
-- ���̺� seqence�� Ȱ���Ͽ� �����͸� �Է��Ѵ�.
CREATE SEQUENCE student_SEQ
		START WITH 1
		INCREMENT BY 1
		MAXVALUE 99999;
insert into student_seq_exp values(	student_SEQ.nextval, '�̸��Է�');
select * from student_seq_exp;
/* Ȯ�ο���
	1) emp_seq_exp ���̺� ������(empno ename)
	emp_seq10 ������ ����,
		1000 ���� ���� 1001, 1002, 1003, 1004 .... 	
	�Է�ó��..
	2) college ���̺� ����(studid, name)
	college_seq ������ ����.
		20001, 20002
	�й��Է�..
	studId  name..
	C020001   ���ۿ� C020002, C020003.....
	[�ܰ��ڵ�][SEQUENCE] : �ռ���ȣ..
*/

create sequence emp_seq10
	start with 1000
	increment by 1
	maxvalue 9999;
create table emp_seq_exp(
	empno number primary key,
	ename varchar2(50)
);	  

