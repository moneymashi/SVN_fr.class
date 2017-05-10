select * from emp;
/*
�׷��Լ�: �����͸� �׷캰�� ���ġ�� ó���� �� Ȱ��ȴ�.
sum() : ���ջ�.
avg() : ���
count() : ����
max() :�ִ밪
min() :�ּҰ�

*/
select sum(sal) tot, avg(sal) avg01, count(sal) cnt,
       max(sal) max01, min(sal) min01
from emp;	
/*
�׷캰�� �������� ���ġ ó���ϱ�..
select ó���ұ׷��÷�, �׷��Լ�
from ���̺��
where ����..  (�׷��� ó���ϱ� �� ����)
group by ó���ұ׷�Ŀ��
having �׷쿡 ���� ����ó��(�׷��� �� �Ŀ� ����)
�μ���ȣ���� ���ջ� �������� ����ϼ���..
*/
select deptno, sum(sal),avg(sal) avg01, count(sal) cnt,
       max(sal) max01, min(sal) min01
from emp
group by deptno;

-- ��ü ������ �Ǽ��� Ȯ���ϼ���.
-- COUNT(�÷�,��ü(*))
-- Ư���÷��� �����Ͱ� �ִ� �Ǽ��� ��� ó��
SELECT COUNT(*) CNT, COUNT(COMM) BONUS_CNT-- 
FROM EMP; 
SELECT COUNT(COMM) FROM EMP;
-- �ߺ��Ǵ� �����Ϳ� ���� ���� Ȯ�� ó��..
SELECT DISTINCT JOB FROM EMP;
SELECT COUNT(JOB) FROM EMP;
-- �ߺ��� �����͸� ������ �Ǽ� ó�� COUNT(DISTINCT �÷���)
SELECT COUNT(DISTINCT JOB) FROM EMP;
SELECT * FROM EMP;
-- �׷��Լ��� ���ǹ� ó��..
-- ������ 3000�̻��� ����߿� ��å��(JOB)�� �ο����� ���ϼ���.
SELECT JOB, COUNT(JOB)
FROM EMP
WHERE SAL>=3000
GROUP BY JOB;
SELECT * FROM EMP;
-- Ȯ�ο��� 
-- �Ի����� 1~3�� �λ���� �μ����� �ο����� üũ�ϼ���..
SELECT DEPTNO, COUNT(DEPTNO), TO_CHAR(HIREDATE,'MM')
FROM EMP;
SELECT DEPTNO, COUNT(DEPTNO) CNT
FROM EMP
WHERE TO_NUMBER(TO_CHAR(HIREDATE,'MM')) BETWEEN 1 AND 3
GROUP BY DEPTNO;
-- �Ի��� �б⺰�� �����͸� �Ǽ��� ó���ϴ� ����.
SELECT FLOOR(TO_NUMBER(TO_CHAR(HIREDATE,'MM'))/4)+1, COUNT(*) 
FROM EMP
GROUP BY FLOOR(TO_NUMBER(TO_CHAR(HIREDATE,'MM'))/4)+1;
--  TO_CHAR(HIREDATE,'MM') : HIREDATE��¥�� �����͸� ������ ���ڷ� ���.
SELECT HIREDATE, TO_CHAR(HIREDATE,'MM') FROM EMP;
-- TO_NUMBER() : ������ ���ؼ� ���ڸ� ���������� ��ȯó��..
SELECT HIREDATE, TO_NUMBER(TO_CHAR(HIREDATE,'MM')) FROM EMP;
-- /4���ϸ� 1~3, 4~6....
SELECT HIREDATE, TO_NUMBER(TO_CHAR(HIREDATE,'MM'))/4 FROM EMP;
-- FLOOR() �Ҽ������� ���� ����ó��..
SELECT HIREDATE, FLOOR(TO_NUMBER(TO_CHAR(HIREDATE,'MM'))/4) 
FROM EMP;
-- Ư�� �Լ��� ó���� �����͸� �׷캰�� ���ġ�� ������ ��, Ȱ��ȴ�.
SELECT FLOOR(TO_NUMBER(TO_CHAR(HIREDATE,'MM'))/4)+1 PART, 
       COUNT(*)
FROM EMP
GROUP BY FLOOR(TO_NUMBER(TO_CHAR(HIREDATE,'MM'))/4);	
/*
����  
������������ �ο����� üũ�ϼ���..
 ����               �����(�ְ�ġ,����ġ,���ġ)
1000�̸�       @@      
~2000�̸�     @@@
~3000�̸�     @@
~4000�̸�    
~5000�̸�
~6000�̸�
*/
SELECT * FROM EMP;
/*
HAVING ����
group by�ȿ� �־��� �׷��� �����Ϳ� ���� ������ ó���ϰ��� �� ��, Ȱ��ȴ�.

ex) �μ����� ��տ����� ó���ϰ�,
	�� �׷캰 ��տ������� 2000 �̻� �� �����͸� �ε��ϼ���..
*/
select deptno, avg(sal)
from emp
where sal>=2000 -- ����� �׷캰�� �������� ����ó��..
group by deptno
having avg(sal)>=2000; -- �׷쳻���� ����ó��..
/*
ex) �μ��� �ִ밪�� �ּҰ��� ���ϵ� �ִ� �޿��� 2900�̻��� �μ��� ��� ó��..
*/
select deptno, max(sal), min(sal)
from emp
group by deptno
having max(sal)>=2900;



   












   