/* ��  ��  ��  ��  ��  ��  ��
Ȯ�ο���(11:00����) : STUDENT ��� �л� ���̺� �÷����� �й�, �̸�, �а��� ������ �Ŀ�,
		������������ �й��� UNIQUE�� �����ؼ� �����ϼ���.
		������ �Է����� �ش� ������ ó���Ǵ��� Ȯ��
		������ ��ǳʸ��� ���ؼ� ���������� ��ϵǾ� �ִ��� Ȯ��
��  ��  ��  ��  ��  ��  ��  */
CREATE TABLE STUDENT (
	HAKBUN VARCHAR2(10) UNIQUE,
	NAME VARCHAR2(30) NOT NULL,
	MAJOR VARCHAR2(30)
);
INSERT INTO STUDENT VALUES ('20121212','ȫȫȫ','�İ�');
INSERT INTO STUDENT VALUES ('20121212','ȫȫȫ','�İ�');
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
	FROM USER_CONSTRAINTS WHERE TABLE_NAME='STUDENT';