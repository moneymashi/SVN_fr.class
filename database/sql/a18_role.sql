/*
role�̶�?
����ڿ��� ���� ȿ�������� ������ �ο��� �� �ֵ��� ���� ���� ����
�� ���� ���� ���� ���Ѵ�. ����ڸ� �����ϸ� �ٷ� ����� �� �ִ�
���� �ƴ϶�, ���� ������ �ο��ؾ� �ϴµ� role�� ���ؼ� �� ����
�پ��� ������ �ѹ��� �ο� �� �� �ִ�..

���� ����
1. connect ��
�ַ� ����ڰ� �����ͺ��̽��� ������ �� �ֵ��� �ϴ� �⺻���� 
�����ͺ��̽��� �����̶�� �� �� �ִ�.
ex) ALTER SESSION, CREATE CLUSTER, CREATE DATABASE LINK,
CREATE SEQUENCE, CREATE SESSION, CREATE SYNONYM, 
CREATE TABLE, CREATE VIEW
2. resource ��
����ڰ� ��ü(���̺�, ��, �ε� ��)�� ������ �� �ֵ��� ������ ����
���� ���Ѵ�.
create cluster, create procedure, create equence, 
create table, create trigger
3. dba ��
����ڰ� �����ͺ��̽� ��ü�� �����ϰ� ����ڵ��� �ۼ��ϰ� ��������
�� �� �ִ� ������ ������ ���� ���Ѵ�.

���� Ȱ�� ����
1. ���� ����(�����ͺ��̽� ������)
	����) create role ���� �̸�..
	ex) create role roleexp01;
2. �ѿ� ���� �ο�
	����) grant ����1, ����2, ����3 to ���� �̸�
	ex) grant create session, create table, create view 
	    to  roleexp01;
3. ##����ڿ� ���� �ο�.
	����) grant ���̸�  to �����
	ex) grant roleexp01 to scott01;
	




 








*/