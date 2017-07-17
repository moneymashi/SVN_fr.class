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

select * from a01_not_nullExp;
select * from a02_nullExp;
-- ������ null�� �Է�. ���������� �ֱ⿡ �����߻�
insert into a01_not_nullExp(job) VALUES ('���α׷���1');
-- ����� null�� �Է�
-- ���̺�� (�÷���,x) > ��ü �÷��� ���� �Է��� ó��
-- values(��ü �÷��� �� �����͸� ���)
insert into a02_nullExp values(null,'ȫ�浿','���α׷���2');
insert into a01_not_nullExp values(null,'�ű浿','���α׷���2');
select * from a02_nullExp;
-- ��������� null���� ȣ���ϴ��� ���������� �ϳ��� ������ �Է��� ���� �ʴ´�.

/*
   Data Dictionary�� ���� constraints Ȯ���ϱ� 
   constraint Type
   ���������� ������ ���� ������ �����ϴ� �κ�
   P : Primary Key : ##
      �������ǿ� NOT NULL, UNIQUE�� �����Ѵ�. ���� �������̺��� KEY�� �����ϴ� �÷� ����
   R : Foreign Key : �ش� �÷��� �����Ͱ� ������ �ٸ� ���̺� �����Ͱ� �ݵ�� �־�� ó���Ǵ� ���
      EX) dept�� deptno�� ���, �μ���ȣ�� ���� ����. �μ�����, key deptno�� ��ϵǾ� �־�� 
      emp���̺��� deptno�� �����͸� �Է��Ҽ� �ְԲ� ó���ؾ� ���Ἲ�� ��ų�� �ִ�.
   U : Unique (����Ű ����) : �ش� �÷��� �����Ͱ� �ٸ� �÷��� �����Ϳ� ���ؼ�
      �ݵ�� �ϳ��� ������ �����Ͱ� �ǰ��� �� �����ϴ� �ɼ�
      EX) DEPT���̺� DEPTNO�� �ٸ������Ϳ� ���� ���� DEPTNO�� �ٸ� DNAME(�μ��̸�)�� �Էµǰ�
      �Ǹ� ������ ���Ἲ�� ������ �߻��ϱ⿡ �̸� �Է� ��� ������ ������ �߻����� ���Ἲ�� Ȯ���ϱ� ���ؼ� ó���Ѵ�.
      20 ȸ�谨��
      20 �ѹ�     => ���Ἲ�� ������ �߻���Ŵ
   C : CHECK : Ư���� �÷��� Ư���� �����͸� ������ ó���ϴ� ���������� ���Ѵ�.
      EX) EMP�� �÷����� GENDER(����)�� �������� ��, F(����), M(����)�� ������ �Ͽ� ������ ��ü�� ���� ������ �����Ͽ�
      ���Ἲ Ȯ���� �ϱ� ���� �������� ���ȴ�.
*/

select * from user_constriaints;

/*
   Unique : ����Ű ���� ó��...
   1. �������̺� �����(emp03)
   2. �÷��� ����Ű �����ϱ�(unique)
   3. ������ �Է� ����Ʈ - �����Ͱ� ������ ��, � ������ �߻��ϴ��� Ȯ��
   4. ������ ��ųʸ����� �ش� ������� Ȯ���ϱ�
*/

CREATE TABLE EMP03(
   EMPNO NUMBER UNIQUE, -- EMPNO�� �ߺ��� ���� �ʰ� �������� ����
   ENAME VARCHAR2(30),
   JOB VARCHAR2(30)
);
SELECT * FROM EMP03;
INSERT INTO EMP03 VALUES (1000,'ALLEN','SALESMAN');
INSERT INTO EMP03 VALUES (1001,'JONES','NANAGER');
-- ������ �� 1000�� �÷����� ������ UNIQUE�� �����߱⿡ ������ �߻��Ѵ�.
INSERT INTO EMP03 VALUES (1000,'HIMAN','SUPERMAN');

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS 
WHERE TABLE_NAME='EMP03';

/*
   Ȯ�ο���
   STUDENT ��� �л� ���̺� �÷����� �й�, �̸�, �а��� ������ �Ŀ�,
   ������������ �й��� UNIQUE�� �����ؼ� �����ϼ���.
   ������ �Է����� �ش� ������ ó���Ǵ��� Ȯ��
   DATA DICTIONARY�� ���ؼ� ���������� ��ϵǾ� �ִ��� Ȯ��!
*/
CREATE TABLE STUDENT(
   S_NUM NUMBER UNIQUE ,
   S_NAME VARCHAR2(30) ,
   S_PART VARCHAR2(30) );
   
INSERT INTO STUDENT VALUES (1000,'�̻���','��ǻ��');
INSERT INTO STUDENT VALUES (1001,'������','��ǻ��');
INSERT INTO STUDENT VALUES (1002,'�̻���','��ǻ��');
SELECT * FROM STUDENT;
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINT
WHERE TABLE_NAME='STUDENT';

/*
   ���� ���Ǹ��� ����� �����ϱ�
   1. ���̺� ������ ����
   ����
   CREATE TABLE ���̺��
      �������� ���� �÷� ������TYPE EX) EMPNO NUMBER
      CONSTRIANT �������Ǹ�(���̺��_�÷���_���������������)
      CONSTRAINT EMP_EMPNO_PK PRIMARY KEY,
   2. ���������� ���� �����Ͽ� �����ϴ� ���
   
*/
CREATE TABLE EMP05(
   EMPNO NUMBER CONSTRAINT EMP_EMPNO_PK PRIMARY KEY , 
   ENAME VARCHAR2(20)
);
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME='EMP05';

/*
   PROFESSOR ���̺��� �����ϵ�
      PROID, NAME �Ѵ� CONSTRAINT�� �����ϴµ� NOT NULL, UNIQUE�� �̸��� �����ؼ� �����ϼ���
*/
CREATE TABLE PROFESSOR(
   PROID NUMBER CONSTRAINT PROID_NOTNULL NOT NULL,
   NAME VARCHAR2(30) CONSTRAINT NAME_UNIQUE UNIQUE
);

SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME='PROFESSOR';

/*
   �ϳ��� �÷��� �ƴ϶�, �ΰ��� �÷����� ���������� �����ϴ� ���
   EX) �л� ���̺��� KEY�� �÷��� �űԷ� �����ϴ� ���� �ƴ϶�.
   GRADE(�г�) PART(��) NO(��ȣ) �̸�..
   ����
      CREATE TABLE ���̺��(
         �÷���1 ������TYPE,
         �÷���2 ������TYPE,
         �÷���3 ������TYPE
      );
   �Ѳ����� ������ �÷����� ���������� ó�������� �ش� ���뿡 ���� KEY �÷��� �ű��ۼ��� �ʿ䰡
   ���� ��, Ȱ��ȴ�. �� ���������� �ش� ���뿡 �Ѳ����� ó������ ������ ������ �߻�..
*/

CREATE TABLE HIGHSCHOOL(
	GRADE NUMBER,
	PART NUMBER,
	NO NUMBER,
	CONSTRAINT HIGHSCHOOL_DIST_PK PRIMARY KEY(GRADE, PART, NO)
	-- HIGHSCHOOL ���̺� PRIMARY KEY�� 3���� �÷����� ������, GRADE, PART, NO
	-- GRADE, PART, NO�� ���ÿ� �����ؼ� ������ �����Ͱ� �� ������ ó��..
);
INSERT INTO HIGHSCHOOL VALUES(1,1,2, '��浿');
INSERT INTO HIGHSCHOOL VALUES(1,1,3, '�ű浿');
SELECT * FROM HIGHSCHOOL;
SELECT * 
FROM user_constrints
WHERE table_name='HIGHSCHOOL';
/*Ȯ�� ����
	ADDRESS ��� ���̺�
			��/������	��/����	��	����	������
		�� �����Ͽ� �����͸� Ȯ���ϴ� ���̺���,
		PRIMARY KEY (��/������	��/����	��	����)�� ��Ƽ� ó���ϰ��� �Ѵ�.
		���̺� �����ϰ� �����͸� �Է��ؼ� ���������� ���� PRIMARY KEY�� ����
		�ִ��� Ȯ���ϼ���..

*/
SELECT * FROM ADDRESS;


/*
1. ���̺������, ����
	����
	create table ���̺��
		�������Ǽ������÷� ������ type ex) empno number
		constraint �������Ǹ�(���̺��_�÷���_���������������) ��������
							ex) constraint emp_empno_pk primary key,
2) ���������� ���� �����Ͽ� �����ϴ� ���..
	1) ���̺� ����
	2) ALTER TABLE ���̺��
		ADD	CONSTRAINT �������Ǹ� ������������(�÷���)
		MOOIFY �÷��� COMSTRAINT �������Ǹ� ������������
		DROP �������Ǹ�

*/