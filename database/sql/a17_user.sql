/*
## ����� �������� ���� ���..
command â���� �����ϴ� ���..
sqlplus system/1111  �Ǵ� sqlplus scott/tiger
sqlplus ���ο��� 
sql>conn ������/��й�ȣ

## �������� client ���� �̿��ؼ� ���� �ֿ� �ٽ� ����..

IP/port��ȣ/ sid/ ����/��й�ȣ

*/
/*
## ����� �����ϱ�..(system������ worksheet���� ó��)
create user ����ڸ�
identified by �н�����;
ex) scott01�̶� ������ ��й�ȣ�� tiger�� �����Ͽ�
	���� �ϰڽ��ϴ�.
*/
create user c##scott01 identified by tiger;
/*
���� �ο�
1. session : ���� ���õ� ���� �ο�..
����
grant ��������
to ����ڰ���
 ������ ������ ������ �ش� ������ �����ؼ� ����� �� �ִ�
 ���� �ƴ϶�, ���� ������ �����ؾ��� ������ �ȴ�..
 ex) scott01 ������ ���ӱ��Ѹ� ������ �� �ڿ� ������ �غ���.
 system ������ �������� ������ ��..
 grant create session
 to scott01;   -- ������ session������ scott01���� �ش�.

*/
grant create session
to c##scott01;
/*
���̺� �����̽�
�����ͺ��̽� ������, ���� ������Ʈ(���̺�, �ε���, ���)��
���� ������ ���Ͽ� ����Ǵ� ������ �����̰�, 
����ڿ� �����ؼ� ���̺� �����̽� �� ������ ���� ������ ������ 
�� �ִ�..
1. ���� ����..
	## create tablespace ���̺����̽���
		datafile '������������ �ִ� ��ġ' size ũ�⼳��(ex 10M
		default storage( -- ������ ũ�⿡ ���� �ʱ� �� 
									block���� �� ���� ũ��.
		   initial ũ��   : �ʱ��� ũ�⼳��.
		   next  ũ�� : ������ ũ�⼳��
		   maxextends : �ִ� ������ ũ�� : ������ extends�� �ִ� ��..
		   pctincrease : extents�� ������, defult���� 50..
		)
	ex) ���̺� �����̽� �̸� ts01�� �ϰ�..
		C:\a01_prog\database\ ���� ����.
		���ϸ� : DF001.DBF01
		ũ��� 50M
		initial : 1024k
		next : 512k
		�ִ� ���� ũ�� maxextents : 128
		pctincrease  :0 
*/
create tablespace ts01
		datafile 'C:\a01_prog\database\DF001.DBF01' size 50M
		default storage(
			initial 1024k
			next 512k
			maxextents 128
			pctincrease 0
		);
/*
Ư���� ���̺� ������, ������ ���̺����̽��� ����..
create table ���̺��̸�(

) tablespace ���������̺����̽���;

default ���̺� �����̽� ����..
alter database default tablespace ���������̺����̽���;

*/		







