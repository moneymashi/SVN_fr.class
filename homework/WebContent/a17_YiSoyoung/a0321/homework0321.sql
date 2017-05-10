/***
	���� : ������������ �ο����� üũ�ϼ���.
	~1000�̸�
	~2000�̸�
	~3000�̸�
	~4000�̸�
	~5000�̸�
	~5000�̸�
***/
SELECT ((FLOOR(SAL/1000))+1)*1000||'�̸�' ��������, COUNT(*)||'��' �ο� 
	FROM EMP 
	GROUP BY FLOOR(SAL/1000) 
	ORDER BY FLOOR(SAL/1000);


-- Ȯ�ο���) ���ʽ��� �ִ� ����� �̸��� �μ����� ����ϼ���
SELECT ENAME, DNAME FROM EMP E, DEPT D 
	WHERE E.DEPTNO=D.DEPTNO AND COMM IS NOT NULL;

/***
	���� : �μ���ġ�� ����� ���� �Ʒ� �������� ���
		(����) �μ���ġ, �����
***/
SELECT LOC, COUNT(*) FROM EMP E, DEPT D
	WHERE E.DEPTNO=D.DEPTNO
	GROUP BY LOC;


/***
	���� : student10 ���̵�, �̸�
		 studentPoint ���̵�, ����, ����
		 GradeCheck ��������lopoint, �ְ�����hipoint, �������(A~F)
	   1) ���̵� �����ؼ� "�̸� ���� ����" ���
	   2) ������ �����ؼ� "���� ���� ����"���
	   3) "�̸� ���� �������" ���
***/
CREATE TABLE STUDENT10 (
	ID VARCHAR2(20) PRIMARY KEY,
	NAME VARCHAR2(30)
);
INSERT INTO STUDENT10 VALUES ('a01','ȫ�浿');
INSERT INTO STUDENT10 VALUES ('a02','���浿');
select * from student10;
CREATE TABLE STUDENTPOINT (
	ID VARCHAR2(20) REFERENCES STUDENT10(ID),
	SUBJECT VARCHAR2(30),
	POINT NUMBER(3)
);
INSERT INTO STUDENTPOINT VALUES ('a01','����', 85);
INSERT INTO STUDENTPOINT VALUES ('a01','����', 100);
INSERT INTO STUDENTPOINT VALUES ('a02','����', 75);
INSERT INTO STUDENTPOINT VALUES ('a02','����', 89);
SELECT * FROM STUDENTPOINT;
CREATE TABLE GRADECHECK (
	LOPOINT NUMBER(3),
	HIPOINT NUMBER(3),
	HAKJUM VARCHAR2(2)
);
INSERT INTO GRADECHECK VALUES (0,59,'F');
INSERT INTO GRADECHECK VALUES (60,69,'D');
INSERT INTO GRADECHECK VALUES (70,79,'C');
INSERT INTO GRADECHECK VALUES (80,89,'B');
INSERT INTO GRADECHECK VALUES (90,100,'A');
SELECT * FROM GRADECHECK;
COMMIT;
-- 1) ���̵� �����ؼ� "�̸� ���� ����" ���
SELECT NAME, SUBJECT, POINT FROM STUDENT10 S, STUDENTPOINT P
	WHERE S.ID=P.ID;
-- 2) ������ �����ؼ� "���� ���� ����"���
SELECT SUBJECT, POINT, HAKJUM FROM STUDENTPOINT P,  GRADECHECK G 
	WHERE POINT BETWEEN LOPOINT AND HIPOINT;
-- 3) "�̸� ���� �������" ���
SELECT NAME, SUBJECT, HAKJUM FROM STUDENT10 S, STUDENTPOINT P,  GRADECHECK G 
	WHERE S.ID=P.ID AND POINT BETWEEN LOPOINT AND HIPOINT;


/***
	����)OUTER JOIN, GROUP�� Ȱ���Ͽ� �μ��� �ο��� Ȯ���ҷ��� �Ѵ�. �Ʒ��� �������� ����ϵ� 
	     �ο��� ���� ���� 0���� ǥ��
		 �μ���  �ο�
***/
SELECT DNAME, COUNT(ENAME) FROM EMP E, DEPT D 
	WHERE E.DEPTNO(+)=D.DEPTNO
	GROUP BY DNAME;



-- Ȯ�ο��� ) ���ʽ��� �ִ� ����� �̸��� �μ����� ����ϼ���!!
SELECT ENAME, DNAME FROM EMP E, DEPT D
	WHERE E.DEPTNO=D.DEPTNO AND COMM IS NOT NULL;