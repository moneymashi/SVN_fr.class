select * from a01_not_nullExp;
select * from a02_nullExp;
-- ������ null �� �Է�. ���������� �ֱ⿡ �����߻�..
insert into a01_not_nullExp(job) values('���α׷���1');
-- ����� null �� �Է�..
-- ���̺��(�÷����X) ==> ��ü �÷��� ���� �Է��� ó���ϰڴ�
-- values(��ü�÷��� �� �����͸� ���)
insert into a02_nullExp values(null, 'ȫ�浿','���α׷���3');
select * from a02_nullExp;
insert into a01_not_nullExp values(null, '�ű浿','���α׷���3');
-- ��������� null���� ȣ���ϴ��� ���������� �ϳ��� ������ �Է���
-- ���� �ʴ´�.
/*
������ ��Ǿ(data dictionary)�� ���� constraints Ȯ���ϱ�..
user_constraints : ��ü ���̺� ���� �������� ���� Ȯ���ϱ�..
constraint_type
 ���������� ������ ���� ������ �����ϴ� �κ�.
 P : PRIMARY KEY : ## - �������ǿ� NOT NULL, UNIQUE�� �����Ѵ�.
 						���� �������̺��� KEY�� �����ϴ� �÷�����.
 R : FOREIGN KEY(�ܷ�Ű) : �ش� �÷��� �����ʹ� ������ �ٸ� ���̺�
 						�����Ͱ� �ݵ�� �־�� ó���Ǵ� ���
						EX) dept�� deptno�� ���, �μ���ȣ�� ���� ����
						�μ����� key deptno�� ��ϵǾ� �־����..
						emp���̺��� deptno�� ������ �Է��� �� �ְԲ� 
						ó���ؾ� ���Ἲ�� ��ų �� �ִ�.
 U : UNIQUE (����Ű����) : �ش� �÷��� �����Ͱ� �ٸ� �÷��� �����Ϳ� ��
 						�ؼ� �ݵ�� �ϳ��� ������ �����Ͱ� �ǰ� �� ��
						�����ϴ�  �ɼ�.												
 						EX) DEPT���̺� DEPTNO�� �ٸ� �����Ϳ� ���ؼ�
						���� DEPTNO�� �ٸ� DNAME(�μ��̸�)�� �Էµǰ�
						�Ǹ� ������ ���Ἲ�� ������ �߻��ϱ⿡ �̸� �Է�
						��� ������ ������ �߻����� ���Ἲ�� Ȯ���ϱ� ��
						�ؼ� ó���Ѵ�.
						20 ȸ�谨��  
						20 �ѹ�      ==> ���Ἲ�� ������ �߻���Ŵ.
 C : CHECK              Ư���� �÷��� Ư���� �����͸� ������ ó���ϴ�
 						���� ������ ���Ѵ�. 
						EX) EMP�� �÷����� GENDER(����)�� �������� ��,
						F(����), M(����)�� ������ �Ͽ�, ������ ��ü
						�� ���� ������ �����Ͽ� ���Ἲ Ȯ���� �ϱ� ����
						�������� ���ȴ�.					
*/
select * from user_constraints;
/*
UNIQUE : ����Ű ���� ó��..
1. �������̺����( EMP03)
2. �÷��� ����Ű �����ϱ�(UNIQUE)
3. ������ �Է� TEST - �����͸� ������ ��, � ������ �߻��ϴ��� Ȯ��.
4. ������ ��ǳʸ����� �ش� ������� Ȯ���ϱ�..
*/
SELECT * FROM EMP03;
DROP TABLE EMP03;
CREATE TABLE EMP03(
	EMPNO NUMBER UNIQUE, -- EMPNO�� �ߺ��� ���� �ʰ� ������������ ����
	ENAME VARCHAR2(30),
	JOB VARCHAR2(30)
);
SELECT * FROM EMP03;
INSERT INTO EMP03 VALUES(1000,'ALLEN','SALESMAN');
INSERT INTO EMP03 VALUES(1001,'JONES','MANAGER');
-- ������ �� 1000�� �÷����� ������ UNIQUE�� �����߱⿡ ������ �߻��Ѵ�.
INSERT INTO EMP03 VALUES(1000,'HIMAN', 'SUPERMAN');
-- DATA DICTIONARY�� ���ؼ� ��������� Ȯ���� �� �ִ�.
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
WHERE TABLE_NAME='EMP03';
/*
Ȯ�ο��� - ���̺� ������ DROP�ϰ�, ���� ����ó��.
STUDENT��� �л����̺� �÷�����  �й�, �̸�, �а��� ������ �Ŀ�,
������������ �й��� UNIQUE�� �����ؼ� �����ϼ���.
������ �Է����� �ش� ������ ó���Ǵ��� Ȯ��
������ ��ǳʸ��� ���ؼ� ���������� ��ϵǾ� �ִ��� Ȯ��..
*/
DROP TABLE STUDENT; 
CREATE TABLE STUDENT(
	STNUMBER VARCHAR2(10) UNIQUE,
	NAME VARCHAR2(50),
	MAJOR VARCHAR2(100)
);
INSERT INTO STUDENT VALUES('C070801','ȫ����','��ǻ�Ͱ���');
INSERT INTO STUDENT VALUES('C070802','������','�濵����');
INSERT INTO STUDENT VALUES('C070801','������','��Ƽ�̵��');
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
WHERE TABLE_NAME='STUDENT';
/*
���� ���Ǹ��� ����� �����ϱ�..
1. ���̺� ������, ����
	����
	create table ���̺��
		�������Ǽ������÷� ������type ex) empno number
		constraint �������Ǹ�(���̺��_�÷���_���������������) ��������
							ex) constraint emp_empno_pk primary key,

*/
create table emp05(
	empno number constraint emp_empno_pk primary key,
	ename varchar2(20)
);
select * 
from user_constraints
where table_name='EMP05';

/*
Ȯ�ο���..
   PROFESSOR ���̺��� �����ϵ�
	PROID, NAME ==> �Ѵ� CONSTRAINT�� �����ϴµ�,
			NOT NULL, UNIQUE�� �̸��� �����ؼ� �����ϼ���.
	MAJOR
   user_constraints���� ������ ���������̸� �˻��ؼ� Ȯ��.
*/

create table PROFESSOR(
	PROID VARCHAR2(10) CONSTRAINT PROFESSOR_PROID_NN NOT NULL,
	NAME VARCHAR2(30) CONSTRAINT PROFESSOR_NAME_UQ UNIQUE,
	MAJOR VARCHAR2(20) 
);
select * 
from user_constraints
where table_name='PROFESSOR';
/*
�ϳ��� �÷��� �ƴ϶�, �ΰ��� �̻��� �÷����� ���������� �����ϴ� ���..
EX) �л����̺��� KEY�� �÷��� �űԷ� �����ϴ� ���� �ƴ϶�.
	GRADE(�г�) PART(��) NO(��ȣ)  �̸�..
����
	CREATE TABLE ���̺��(
		�÷���1 ������TYPE,
		�÷���2 ������TYPE,
		�÷���3  ������TYPE,
		CONSTRAINT �������Ǹ�(���̺�_�÷�����_�������) ��������(�÷�1, �÷�2..)
	);	
	�Ѳ����� ������ �÷����� ���������� ó�������� �ش� ���뿡 ���� KEY �÷��� �ű��ۼ��� �ʿ䰡 
	���� ��, Ȱ��ȴ�. �� �� �������� �ش� ���뿡 �Ѳ����� ó������ ������ ������ �߻�..
EX) �л����̺��� KEY�� �÷��� �űԷ� �����ϴ� ���� �ƴ϶�.
	GRADE(�г�) PART(��) NO(��ȣ)  �̸�..
*/
DROP TABLE HIGHSCHOOL;
CREATE TABLE HIGHSCHOOL(
	GRADE NUMBER,
	PART NUMBER,
	NO NUMBER,
	NAME VARCHAR2(30),
	CONSTRAINT HIGHSCHOOL_DIST_PK PRIMARY KEY(GRADE, PART, NO)
	-- HIGHSCHOOL���̺� PRIMARY KEY�� 3���� �÷����� ��µ�, GRADE, PART, NO
	-- GRADE, PART, NO�� ���ÿ� ���տ��� ������ �����Ͱ� �� ������ ó��..
);
INSERT INTO HIGHSCHOOL VALUES(1,1,2,'��浿');
INSERT INTO HIGHSCHOOL VALUES(1,1,3,'�ű浿');
SELECT * FROM HIGHSCHOOL;
select * 
from user_constraints
where table_name='HIGHSCHOOL';

CREATE TABLE ADDRESS(
	STATE VARCHAR2(50),
	CITY VARCHAR2(50),
	AREA VARCHAR2(50),
	ADNUMBER NUMBER,
	HOST VARCHAR2(50),
	RISDNUMBER NUMBER,
	CONSTRAINT ADDRESS_COM_PK 
		PRIMARY KEY(STATE, CITY,AREA,ADNUMBER)
);
INSERT INTO ADDRESS VALUES('����Ư����','������','��ġ��',253,'��浿',4);
SELECT * FROM ADDRESS;
/*2. ���������� ���� �����Ͽ� �����ϴ� ���..
	1) ���̺� ����
	2) ALTER TABLE ���̺��
	      ADD CONSTRAINT �������Ǹ� ������������(�÷���)
		  MODIFY �÷��� CONSTRAINT �������Ǹ� ������������
		  DROP �������Ǹ�*/
		  








