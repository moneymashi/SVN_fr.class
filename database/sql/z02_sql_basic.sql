/* z02_sql_basic.sql
DDL :data definition language
���̺� ���� ����, ���� �� �����ϴ� ���� ���Ѵ�.
ũ��..
1. ���̺� ������ �űԷ� �����ϴ� create table
2. ���̺� ������ �����ϴ� alter table
3. ���̺� ������ ���� drop table
4. ��Ÿ  -  truncate, rename ���̺��
*/
/*
1. create table(���̺����)
	create table ���̺��(�÷��� datatype ��Ÿ��������,
	                       ...      );
	1) datatype
		char(size) : ������ ���ڿ�, ���ڿ��� ũ�Ⱑ ������ ������
				ū�����Ͱ� ���� �� ������, ���������ʹ� ������ ũ��� ����ȴ�.
		varchar2(size) : ������ ���ڿ�, �������� �ִ� ũ�⸦ �����ϸ�,
				�� ������ ������ ũ�Ⱑ ���������� ����� �� �ִ�.
		number(��ü�ڸ���, �Ҽ��������ڸ���) : ���ڸ� �����ϴ� data type,
				number(����), number( ����, 0) : ������ data type ����.
				�Ҽ��������ڸ����� �����ָ� �Ǽ��� �����͸� ������ �� �ִ�.
		date : ��¥�� �����ϴ� ������ type (��¥+�ú���)
		long : 4000byte�̻��� ���ڿ��� ���� �Ҷ� Ȱ��Ǵ� ������Ÿ��.�ְ�ġ 2gb
		lob : 2g���� ���̳ʸ�(��� �������尡��) ������ ����
			

	1) ���̺� �����ϱ�.
		create table ���̺��(�÷��� ������type)
		ex) emp10��� ���̺� �÷��� empno ������, ename ����������, sal �Ǽ�������
			������� �Ѵ�.			
*/
	create table emp10( empno number(4), ename varchar2(20), sal number(7,2) );
/*
���� login�� �ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡��
	id@@@ �� ȯ���մϴ�. ���� point�� @@@ �Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
	�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��..
*/
CREATE TABLE LOGIN(
	ID VARCHAR2(10),
	PASSWORD VARCHAR2(15),
	POINT NUMBER
);
/*���̺� ���� �����ϱ�.
1. ���̺��� ���ο� �÷��� �߰� �� �� - add column
2. ���̺� �÷��� ������ �� - modify column
3. ���̺� �÷��� ������ �� - drop column

## �⺻ ����..
alter table ���̺��̸� add(�÷��� ������type)
ex) emp01�� job�̶�� �̸����� ����������9�� ���� �÷��� �߰��Ѵ�..
*/
select * from emp10;
alter table emp10 add(job varchar2(9));
-- Ȯ�� emp10 ��¥�������� createDate, �Ǽ���������7,3 �߰��ҷ��� �Ѵ�. 
alter table emp10 add(createDate date, sal2 number(7,3));
/*
���̺� �÷� ����
alter table ���̺��
modify(�������÷��� �����ҵ�����type);

ex) emp10���̺��� sal2 �� ���������� �����ϰ��� �Ѵ�.

*/
alter table emp10
modify(sal2 varchar2(10));
/*
���̺��� data type������ �Ѱ�
1. ������ �ִ� ���
	1) �ٸ� data type���� ������ �Ұ���..
	2) ���� data type�̶� ���� ���� ���� ������ type������ �Ұ���.
2. ������ ���� ���
	type�� ũ�⺯���� �����Ӵ�.. 
*/
/*
���̺��� �÷� ����..
alter table ���̺��
drop column  �÷���;

ex) emp10���� sal2 �÷��� ���� ó���Ѵ�..
*/
alter table emp10
drop column sal2;
select * from emp10;
/*
���̺�� ����
alter table �������̺�� rename to ���ο����̺��.
ex) emp10���̺���� empexp10���� ���̺���� �����Ѵ�.
*/
select * from empexp10;
alter table emp10 rename to empexp10;
/*
�÷��� ����
alter table ���̺�� rename column �����÷��� to ���ο��÷���

ex) empexp10���� createdate�÷��� hiredate�� ����ó��..
*/
alter table empexp10 rename column createdate to hiredate;
select * from empexp10;
/* Ȯ�ο���
	dept01 ���̺���  dept10Exp��� ���̺������ �����ϰ�,
	�÷��� loc�� location���� �����Ͻÿ�. ũ��� 13--> 25��.
	
*/
alter table dept01 rename to dept10Exp;
select * from dept10Exp;
alter table dept10Exp rename column loc to location; 
alter table dept10Exp modify location varchar(25);

/*
ddl�� �������� ��� ���� ���� ó��..
truncate table ���̺��..
 ex) dept10Exp�� �ִ� ��� �����͸� ddl�� ���� ó��..
*/
truncate table dept10Exp;
select * from dept10Exp;
/*
���̺� ���� ����

*/
