/*
NOT NULL ��������
�ش� �÷��� ���� �ݵ�� �ԷµǾ����, ó���ǰԲ� ����.
 EX) a01_not_nullExp ���̺� 
 	empno, ename�� not null������ ���̺�
	a02_nullExp ���̺�
	 empno, ename�� not null�� �������� �ʴ� ���̺�
*/
create table a01_not_nullExp(
	empno number not null, --���������� not null ����
	ename varchar2(20)not null,--���������� not null ����
	job varchar2(20)
);

create table a02_nullExp(
	empno number, --���������� not null ����
	ename varchar2(20), --���������� not null ����
	job varchar2(20)
);

select * from a02_nullExp;
select * from a01_not_nullExp;
rollback;
--1) �����͸� �Է½�, ������null�� �Է�
insert into a01_not_nullExp(job) values('���α׷���1'); --�������ǿ����߻�
insert into a01_not_nullExp(empno,ename,job) values(7000,'ȫ�浿','���α׷���1'); 
insert into a02_nullExp(job) values('���α׷���1');
--�ݵ�� empno, ename�� �Է��Ͽ��� �Ѵ�. 
--2) ������ �Է½�, ����� null�� �Է� 











