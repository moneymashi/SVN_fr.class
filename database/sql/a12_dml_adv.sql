/*
�������� ��� DML query!!
1. ���� ���̺� ������ �Է��ϱ�..
	insert ������ ������ �Ἥ �����͸� �Է��ϴ� ��찡 ���� �����͸� �Է�
	�� �� ���ŷ��� ��찡 �ִ�.
	�ѹ��� suberquery�� ���ؼ� ���� ������ ������ ���̺� �Է��� ��,
	insert all ������ Ȱ���ϸ� �ս��� ó���� �� �ִ�.
	1) ����
	INSERT ALL
	INTO ���̺�1�� VALUES(�÷�1, �÷�2, �÷�3)
	INTO ���̺�2�� VALUES(�÷�1, �÷�2, �÷�4)
	SELECT �÷�1, �÷�2, �÷�3, �÷�4
	FROM ���̺��
	WHERE ����
	EX) EMP���̺��� �����������̺� ���� 
	    	EMP_HIR(EMPNO, ENAME, HIREDATE)
			EMP_MGR(EMPNO, ENAME, MGR)
		���� EMP���̺��� �μ���ȣ��20�� �����͸� �ش� ���̺�
		������ �Է�ó��..
		
*/
-- �����������̺� �����ϱ�..
	CREATE TABLE EMP_HIR
	AS
	SELECT EMPNO, ENAME, HIREDATE
	FROM EMP WHERE 1=0;
	SELECT * FROM EMP_HIR;
	CREATE TABLE EMP_MGR
	AS
	SELECT EMPNO, ENAME, MGR
	FROM EMP WHERE 1=0;
INSERT ALL
	INTO EMP_HIR VALUES(EMPNO,ENAME, HIREDATE)
	INTO EMP_MGR VALUES(EMPNO, ENAME, MGR)
	SELECT EMPNO, ENAME, HIREDATE, MGR
	FROM EMP
	WHERE DEPTNO=10;
/*
���� ������ �̿��� ������ �����ϱ�..
UPDATE ���̺��
SET (�������÷�1, �������÷�2) = (SELECT �÷�1,�÷�2 FROM ���̺�)
WHERE ����..
EX) 20�� �μ��� �������� 40�� �μ��� ���������� �����ϱ� ���ؼ� ��������
	�� Ȱ���غ���..
*/		
CREATE TABLE DEPT01
AS
SELECT * FROM DEPT;
-- �Է��� ������ LOADING(SUBQUERY)
SELECT DNAME, LOC
FROM DEPT
WHERE DEPTNO=40; 
-- MAIN QUERY
UPDATE DEPT01
SET (DNAME, LOC) =( SELECT DNAME, LOC
					FROM DEPT
					WHERE DEPTNO=40)
WHERE DEPTNO=20;
SELECT * FROM DEPT01;
SELECT * FROM EMP;
CREATE TABLE EMP11
AS
SELECT *
FROM EMP;

UPDATE EMP11
SET (SAL,DEPTNO)=(
	SELECT SAL,DEPTNO
	FROM EMP11
	WHERE JOB='PRESIDENT')
WHERE JOB='CLERK';
SELECT * FROM EMP11
WHERE JOB='CLERK';
/*
MERGE ó��..
 DATA MINGRATION(������ �̰�ó��) �Ҷ�, ���� Ȱ��ȴ�.
 ���̺�  A, ���̺� B �� �����͸� �̰�ó����, �μ��� �޶� �ԷµǾ� �ִ� �����͵� �ְ�,
 �űԷ� �Է��ؾߵ� �����͵� ������, �ԷµǾ� �ִ� �����ʹ� Ư�� �÷��� ����ó���ؾ�
 �� ��� ���� Ȱ��ȴ�.
���� ex) ���̺�A�� ������  ���̺�B���� ���� �����ʹ� insertó��
            ���̺�A�� �ְ�, ���̺�B�� ������ Ư���� �÷��� �����ϴ� ���� updateó��
		�ΰ��� ������ �ѹ��� ó���ϴ� ���� MERGE
	MERGE INTO ���������̺�  EX) ���̺�B
		USING ���������������̺�  ex) ���̺�A
		ON ����ó��-�Ϲ������� �� ���̺��� KEY��(�����÷�)�� �������� ó���Ѵ�.
		                       ex) ���̺�A.�÷�01=���̺�B.�÷�01
		WHEN MATCHED THEN -- �ΰ��� ���̺� KEY�����Ͱ� �������� ���� ��.
		    �������� ����ó��         ex) ���̺�A�� �÷�01�� ���̺�B�� �÷�01��
			update set 		�ش� �����Ͱ� ������ ���..
			���������̺�.�������÷�=���������������̺�.�÷�	
			              ex) ���̺�B.�����÷� = ���̺�A.�÷�														
		WHEN NOT MATCHED THEN -- ���� ���̺� ������ ���� ���
								EX) ���̺�A���� ������, ���̺� B���� ���� ���
			�Է°���ó��..					
		    insert [���̺�X] values(���������������̺�.�÷�...)
								EX) INSERT VALUES(���̺�B.�÷���....);
*/
/*
EMP01, EMP02 �����͸� �ε��ؼ�..EMP01�� ������ ����ó��..
1. EMP01 �������̺� �����.
2. EMP02 �������̺� �����  EMP�� JOB='MANAGER'��... 
   EMP02 JOB ==> 'test'�� UPDATE (##empno�� ����, job�� �ٸ� ������)
   EMP02 �Է� 7935 'ȫ�浿', 'SUPERMAN' 7839 SYSDATE 4000 100 40 
   	(## empno�� EMP01�� ���� ������)
*/
select * from emp order by empno desc;
DROP TABLE EMP01;
CREATE TABLE EMP01
AS
	SELECT * FROM EMP; -- EMP01 �������̺� ����
SELECT * FROM EMP01; -- �� ���̺� ���� ó��..
DROP TABLE EMP02;
CREATE TABLE EMP02
AS
	SELECT * FROM EMP
	WHERE JOB='MANAGER';
SELECT * FROM EMP02;
UPDATE EMP02
SET JOB='TEST'; -- EMP02�� JOB�� 'TEST'�� ����
-- EMP02 �Է� 7935 'ȫ�浿', 'SUPERMAN' 7839 SYSDATE 4000 100 40 
INSERT INTO EMP02 VALUES(7935,'ȫ�浿','SUPERMAN',7839,SYSDATE, 4000,100,40);
SELECT * FROM EMP01;
SELECT * FROM EMP02;
MERGE INTO EMP01  -- ���� �����ʹ� EMP01�� ó��
	 USING EMP02   -- EMP02�����͸� �����..
	 ON (EMP01.EMPNO = EMP02.EMPNO) -- �ش� KEY���� EMPNO�� �ִ��� ���ο� ���� UPDATE/INSERT                   
WHEN MATCHED THEN -- EMPNO���� ���� ��..
	UPDATE SET
	  EMP01.JOB = EMP02.JOB  -- EMP02.JOB ������ ��, 'test'�����͸� EMP01.JOB�� UPDATE
WHEN NOT MATCHED THEN --������ EMPNO���� EMP01�� ���� ���,
	INSERT VALUES(EMP02.EMPNO, EMP02.ENAME, EMP02.JOB, EMP02.MGR, EMP02.HIREDATE,
	              EMP02.SAL, EMP02.COMM,EMP02.DEPTNO); 
SELECT * FROM EMP01 ORDER BY EMPNO;				  	  
/*
Ȯ�ο���. 
EMP�� �������̺� EMP03
EMP���� �μ���ȣ(DEPTNO)�� 30�� �����͸� EMP04�� �������̺� �����
	EMP04�� HIREDATE�� ���ó�(SYSDATE)�� UPDATE ó��..
EMP04�� 7370 '������' 'SUPERMAN' 7839 SYSDATE 6000 400 40 ������ �Է�
�� ���̺� ����ó��..
*/
DROP TABLE EMP03;
CREATE TABLE EMP03
AS
	SELECT * FROM EMP;
DROP TABLE EMP04;
CREATE TABLE EMP04
AS 
	SELECT * FROM EMP
	WHERE DEPTNO=30;
UPDATE EMP04
SET HIREDATE=SYSDATE;
INSERT INTO EMP04 VALUES(7370,'������','SUPERMAN',7839,SYSDATE,6000,400,40);
MERGE INTO EMP03
 USING EMP04
 ON	(EMP03.EMPNO=EMP04.EMPNO)
WHEN MATCHED THEN
	UPDATE SET
		EMP03.HIREDATE=EMP04.HIREDATE
WHEN NOT MATCHED THEN
	INSERT VALUES(EMP04.EMPNO, EMP04.ENAME, EMP04.JOB, EMP04.MGR, EMP04.HIREDATE,
				  EMP04.SAL, EMP04.COMM, EMP04.DEPTNO);
SELECT * FROM EMP03;
SELECT * FROM EMP;				  
	
		
	 


	
	


