/*** ����
	EMP03 �������̺� ����
	1. �Է� : EMPNO�� ���� ���� ������ -1, MGR:CLARK�� MGR�Է�, SAL ��տ���, COMM:��ü COMM�� �հ�
	2. ���� : ENAME : '�ű浿', JOB�� 'SUPERMAN', HIREDATE�� �ֱٿ� �Ի���+1
***/
CREATE TABLE EMP03 AS SELECT * FROM EMP; 
INSERT INTO EMP03 (EMPNO, MGR, SAL, COMM) 
	VALUES((SELECT MIN(EMPNO)-1 FROM EMP), 
	(SELECT MGR FROM EMP WHERE ENAME='CLARK'), 
	(SELECT AVG(SAL) FROM EMP), 
	(SELECT AVG(NVL(COMM,0)) FROM EMP03));
UPDATE EMP03 
	SET ENAME='�ű浿', 
		JOB = 'SUPERMAN', 
		HIREDATE=(SELECT MAX(HIREDATE)+1 FROM EMP) 
	WHERE EMPNO=7368;
SELECT * FROM EMP03 WHERE EMPNO=7368;

/* ���� :
	login�ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡��
	"id @@@�� ȯ���մϴ�. ���� point�� @@@ �Դϴ�"��� ������ ��Ÿ���ٰ� �Ѵ�.
	�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��
*/
CREATE TABLE MEMBER (
	ID VARCHAR2(20) PRIMARY KEY,
	PASSWORD VARCHAR2(20) NOT NULL, 
	NAME VARCHAR2(20) NOT NULL, 
	POINT NUMBER DEFAULT 0);
SELECT * FROM MEMBER;

/***
3��45�� ���� : ����Ű ���迡 �ִ� ���̺� �����ϱ�
	�������̺� STUDENT_MAIN(ID,PASS,NAME); ���̵�, �н�����, �̸�
	�������̺� STUDENT_POINT(ID, SUBJECT, POINT); ���̵�, ����, ����
***/
CREATE TABLE STUDENT_MAIN(
	ID VARCHAR2(20) PRIMARY KEY,
	PASS VARCHAR2(20) NOT NULL,
	NAME VARCHAR2(20) NOT NULL
);
CREATE TABLE STUDENT_POINT(
	ID VARCHAR2(20) REFERENCES STUDENT_MAIN(ID),
	SUBJECT VARCHAR2(20),
	POINT NUMBER(3)
);