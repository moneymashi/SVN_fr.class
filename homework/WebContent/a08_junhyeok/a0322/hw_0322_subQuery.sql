/*����(��������)
1. �Ի��� �б⺰�� ���� ���� ������ �޴� ����� ����ϼ���
2. ������ 3000�̻��� ��� �߿�, ���(���̺�Ȱ�뵵 ����)�� ����� �ش�
 ��޺� �ְ� ������ �޴� ����� �̸�, ���, ������ ����ϼ���
*/
-- ���� 1.
SELECT CEIL(TO_NUMBER(TO_CHAR(HIREDATE,'MM'),'99')/3) "�б�", MAX(SAL) FROM EMP 
GROUP BY CEIL(TO_NUMBER(TO_CHAR(HIREDATE,'MM'),'99')/3);
-- ���� 2.
SELECT *
FROM EMP E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;

SELECT A.ENAME, A.GRADE, A.SAL
FROM (
SELECT *
FROM EMP E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL) A
WHERE SAL>=3000;

����
1. �μ���ȣ�� 30�� ��� �߿�, ���� ���߿� �Ի��� ������� ������ ������ ����ϼ���.
2. ������ 'SALESMAN'�� ����� �޴� �޿����� �ּ� �޿����� ���� �޴� ������� �̸��� �޿��� ����ϵ�, �μ���ȣ 20���� ����� �����Ѵ� (ANY ������ �̿�)
*/
-- Ȯ�ο���1
SELECT EMPNO, SAL, HIREDATE
FROM EMP
WHERE HIREDATE>=ALL(
SELECT HIREDATE
FROM EMP
WHERE SAL<3000);

-- ���� 1.
SELECT ENAME, SAL, HIREDATE, DEPTNO
FROM EMP
WHERE SAL>ALL(
SELECT SAL
FROM EMP
WHERE HIREDATE=(SELECT MAX(HIREDATE)
					FROM EMP))
AND DEPTNO=30;

-- ���� 2.
SELECT ENAME, SAL,DEPTNO
FROM EMP
WHERE SAL>ANY(
SELECT MIN(SAL)
FROM EMP
WHERE JOB='SALESMAN') AND DEPTNO!=20;

/*
����
������ ���� ������ ���̺��� �����ϼ���.
�̸�(name) ��ȣ(no) �Ի���(credate)-���ڿ�		���ر��رٹ�����(2017)
					@@@@�� @@@�� @@@��		@@@
new_emp�� �����ϼ���
					
*/
CREATE TABLE NEW_EMP
AS(
select ename "�̸�", empno "��ȣ", hiredate "�Ի���", CEIL(MONTHS_BETWEEN(SYSDATE,HIREDATE)/12)+1 "���ر��رٹ�����(2017)" FROM EMP);
SELECT * FROM NEW_EMP;