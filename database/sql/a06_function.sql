/*
DECODE () :���� ó���� ���� �Լ�
	DECODE(������, ������1, ����1������,
	                  ������2, ����2������,
				  �׿ܿ�������)
ex)gender�̶�� �÷��� 0�̸� ����, 1�̸� ����, �׿� �߼�				  
*/
select decode(0,0,'����',1,'����','�߼�') gender01,
		decode(1,0,'����',1,'����','�߼�') gender02,
		decode(2,0,'����',1,'����','�߼�') gender03,
		decode(3,0,'����',1,'����','�߼�') gender04
from dual;		
-- �μ���ȣ�� 10 ȸ��, 20 ����, 30 ����, 40 �, �׿ܴ� '����'
select ename, 
		decode(deptno,  10, 'ȸ��',
						20, '����',
						30, '����',
						40, '�',
						'����') selDept
 from emp;
 /*
��å�� �ѱ۷� Ǯ���ؼ� ���ó��
 CLERK :����, SALESMAN : ������, MANAGER :������.....
 �����ȣ, ��å(�ѱ�), �޿�
 */
select ename, 
DECODE(JOB, 'CLERK','����',
			'SALESMAN','������',
			'MANAGER','������',
			'ANALYST','�м���',
			'PRESIDENT','��ǥ',
			'��Ÿ') "��å(�ѱ�)"
 from emp;
/* ���� 
������ ���� ���ü�踦 �������� �Ѵ�.
decode�� Ȱ���ؼ�,
	 1000 �̸� F���         ������ 3%
	 1000 ~ 2000�̸� E���   ������ 5%
	 2000 ~ 3000 �̸� D���  ������ 7%
	 3000 ~ 4000 �̸� C���  ������ 4%
	 4000 ~ 5000 �̸� B���  ������ 3%
	 5000 ~ 6000 �̸� A���  ������ 2%
�̸�  �μ�  ����  �������  ������  �Ѿ�(����+������)
*/
SELECT ename, deptno, sal, 
	decode(trunc(sal/1000),0,'F���',
	                       1,'E���',
						   2,'D���',
						   3,'C���',
						   4,'B���',
						   5,'A���',
						   '��Ÿ���') "�������",
	decode(trunc(sal/1000),0,round(sal*0.03)||'(3%)',
	                       1,round(sal*0.05)||'(5%)',
						   2,round(sal*0.07)||'(7%)',
						   3,round(sal*0.04)||'(4%)',
						   4,round(sal*0.03)||'(3%)',
						   5,round(sal*0.02)||'(2%)',
						   '��Ÿ���') "������"	,
	decode(trunc(sal/1000),0,sal+round(sal*0.03),
	                       1,sal+round(sal*0.05),
						   2,sal+round(sal*0.07),
						   3,sal+round(sal*0.04),
						   4,sal+round(sal*0.03),
						   5,sal+round(sal*0.02),
						   '��Ÿ���') "�Ѿ�(����+������)"							   					    
from emp;
/*
case �Լ� :���ǿ� ���� ���� �ٸ� ó���� ����
CASE WHEN ����1(�񱳿�����) THEN ó���ҵ�����
     WHEN ����2(�񱳿�����) THEN ó���ҵ�����
	 WHEN ����3(�񱳿�����) THEN ó���ҵ�����
     ELSE �����ǿ� �ش����� ���� �� ó���� ������..
END
EX) ������ ���� ������� ��� ó��.. 	 
*/
SELECT CASE WHEN 80>=90 THEN 'A'
			WHEN 80>=80 THEN 'B'
			WHEN 80>=70 THEN 'C'
			WHEN 80>=60 THEN 'D'
		ELSE 'F'
	  END GRADE
FROM DUAL;	
SELECT * FROM EMP;
-- 	�μ���ȣ�� �������� �űԺμ� ���ġó�� �Ѵ�.
SELECT empno, ename,
	case when deptno=10 then '�μ��̵�'
		 when deptno=20 then '�ο�����'
		 when deptno=30 then '��������'
	     else '���μ�����'
	end  result
FROM EMP;	
/*
����) �Ի� �б� ���� ǥ��(1/4,2/4,3/4,4/4) �Ի� �б⸦ ǥ��
 �����ȣ, �̸�, �Ի�(��/��), �Ի�б�

*/		
SELECT empno, ename, to_char(hiredate,'YY/MM') "�Ի�", 
	trunc(to_number(to_char(hiredate,'MM'))/4)+1||'/4' "�Ի�б�"
  FROM EMP;
select * from emp;