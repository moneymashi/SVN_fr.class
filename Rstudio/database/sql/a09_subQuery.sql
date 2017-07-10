/*
subquery?
�ϳ��� selcet������ �� �ȿ� ���Ե� �� �ϳ��� select ������ ���Ѵ�.
���������� �����ϰ� �ִ� �������� ��������(main query),
���Ե� �� �ϳ��������� ���� ����(subquery)��� �Ѵ�.
ex) ������̺��� ������ �ְ�� ���� ����� �̸��� ������ list �ϼ���..

SELECT ENAME, SAL --> MAIN QUERY
FROM EMP
WHERE SLA = (SELECT MAX(SAL) FROM ENP) --> SUBQUERY
�ۼ��� ������
1. ���������� �� ������(=,>,<...)�� �����ʿ� ����ؾ� �ϰ� ��ȣ��
�ѷ��� �ִ� ���� �Ϲ����̴�.
2. ���������� ���� ������ ����Ǳ� ������ ����ȴ�.

���������� ����
1. ������ ������ ó���Ǵ� ���.
	SELECT *
	FROM ���̺�
	WHERE �÷��� = (SELECT �÷� FROM ���̺� WHERE ����);
	## ���ϰ� ����: =,>,< (�񱳿����� Ȱ��)
	���߰� ���� : IN, EXIST, ANY, ALL

2. ���̺�� ��ü�� SUBQUERY ó���ϴ� ���..
	SELECT * �÷���1+�÷���2, ....
	FROM (SELECT �÷���1, �÷���2, �Լ�(�÷���3)
			FROM ���̺��
			WHER ���� )
	WHERE ����;
	
3. SELECT (SELECT �÷�1 FROM ���̺�� WHERE ����=��������1),
	�÷�2, �÷�3
	FROM ���̺�
	WHERE ����...
	
	
*/
-- 1. ���ǰ����� SUBQUERY�� ���Ǵ� ���.
--	EX) ��տ������� ���� ������� �̸��� ������ ����ϼ���.
SELECT ENAME, SAL
FROM EMP
WHERE SAL>(SELECT AVG(SAL) FROM EMP);
-- EX) 
SELECT * FROM EMP;

SELECT MAX(COMM)
FROM EMP;
-- EX) ���ʽ��� �ִ� ������� ��, ��� ���ʽ����� ���� ����ϼ���..
SELECT AVG(COMM)
FROM EMP
WHERE COMM IS NOT NULL;
