
/*
����
������ ���� ���ü�踦 �������� �Ѵ�. 
DECODE�� Ȱ���ؼ�,
	1000 �̸� F���			������ 3%
	1000~2000 �̸� E���	������ 5%
	2000~3000 �̸� D���	������ 7%
	3000~4000 �̸� C���	������ 4%
	4000~5000 �̸� B���	������ 3%
	5000~6000 �̸� A���	������ 2%
	�̸�	�μ�	����	�������	������	�Ѿ�(����+������)
*/
SELECT ENAME, DEPTNO, SAL, DECODE(TRUNC(SAL,-3),1000,'A',5000) FROM EMP;


/*
����) �Ի� �б� ���� ǥ��(1/4,2/4,3/4,4/4) �Ի� �б⸦ ǥ��
�����ȣ, �̸�, �Ի�(��/��), �Ի�б�
*/
SELECT EMPNO �����ȣ, ENAME �̸�, TO_CHAR(HIREDATE,'YY"�� "MM"��"') "�Ի�(��/��)", CASE WHEN TO_NUMBER(TO_CHAR(HIREDATE,'MM'),'99') BETWEEN 1 AND 3 THEN '1/4'
							WHEN TO_NUMBER(TO_CHAR(HIREDATE,'MM'),'99') BETWEEN 4 AND 6 THEN '2/4'
							WHEN TO_NUMBER(TO_CHAR(HIREDATE,'MM'),'99') BETWEEN 7 AND 9 THEN '3/4'
							WHEN TO_NUMBER(TO_CHAR(HIREDATE,'MM'),'99') BETWEEN 10 AND 12 THEN '4/4'
							ELSE '--'
							END �б� FROM EMP ;
