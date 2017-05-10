/*
	����1) 6������ ���ϱⰣ���� �޿��� 70%�� ���޵ȴ�.
	����� ���ϱⰣ��������� ����ϰ�, 6���� �޿��� ������ ����ϼ���. �Ʒ� ��������.
	���޿�- sal/13���� �����ϰ�, 
	���ϱⰣ - ���޿��� 70%
	���ϱⰣ ���޿� �Ѿ�- 6�������޿� �Ѿ��� 10���� ����.
	�����ȣ ����� �Ի��� ���ϱⰣ������� ���ϱⰣ���޿�

*/
select empno �����ȣ, 
		ename �����, 
		hiredate �Ի���, 
		add_months(hiredate, 6) ���ϱⰣ�������, 
		round(sal*( 0.7 * sal/13 *6), -1) ���ϱⰣ���޿� from emp;
/*
	����)
	�޿����... 3�ܰ� �޿����� ����� ���.
	1�ܰ� ���20��.
	2�ܰ� �޿� ��������.
	3�ܰ� ������ 10��. �Ʒ���������..
	��� �Ի��� ù����1 ù����2 ù����3�ܰ�. ���ε���.

*/
select ename, hiredate, sal, (last_day(hiredate-20)) +20 ���20��, 
		 (last_day(hiredate)) �����������,
		 (last_day(hiredate))+ 10 ������10��
	from emp;
SELECT HIREDATE, ADD_MONTHS(LAST_DAY(ROUND(HIREDATE-5, 'MONTH')),-1)+20 "ù����1"
 from emp;
 /*
����:
�ٹ������������� ����ʽ�����.
���� ������ ����~ 1/3= 30%, 1/3= 20%, 1/3 =10% .... ������ �Ʒ���.
���, �Ի���, ���糯¥( @@/@@/@@ AM @@��@@��@@��), �ٹ�������, ���ʽ�
*/
select ename, hiredate, to_char(hiredate, ' YY"/"MM"/"DD AM HH"��"MM"��"SS"��" ') ���ĺ�ȯ,
	trunc(months_between(sysdate, hiredate))   ������,
	trunc((months_between(sysdate, hiredate)-400)/14,1)   �����������,
	CASE when to_number(trunc(months_between(sysdate, hiredate))) <= 423 then  '30%'
	 	when to_number(trunc(months_between(sysdate, hiredate))) <= 431 then  '20%'
	ELSE  '10%' END ���ʽ�
	from emp;
/*
	����. ��ȸ���� '1981��01��01��' ���� '1982��12��12��' ������ ������ �߿���.
		�μ��� 30�� �����͸� ��ȸ�Ͽ�, 
		�����(10�ڸ�-�տ� #��ȣó��.)
		��å(10�ڸ�- �������ڿ� -ó��.)
		�Ի���(@@�� @@�� @@�� @����)
		����(####1,600.0 ǥ��.) �� ��Ÿ�����. 
*/
select lpad(ename, 10 , '#') �����, rpad(job, 10, '-') ��å , 
	to_char(hiredate, ' YY"��" MM"��" DD"��" DAY"����" ') �Ի��� ,  
	lpad(to_char(sal,'9,999.9'),12,'#')
	from emp 
	where deptno  =30 and 
 	hiredate between to_date('1981��01��01��', 'YYYY"��"MM"��"DD"��"' ) and to_date('1982��12��12��', 'YYYY"��"MM"��"DD"��"');
/*
���� :
�̸� �����ڹ�ȣ ���ʽ� =>>> �����Ͱ� ������ �����ڹ�ȣ��� '�ְ���', ���ʽ���  '0' ǥ��.*/
select mgr, comm, nvl((comm), '0'), nvl(to_char(mgr), to_char('�ְ���')) from emp;

/*
	���������� ���� ���ü�踦 �������� �ҋ�..
	DECODE�� Ȱ���ؼ� 1000�̸� F���.  ������ 3%
			 2000�̸� E���.  ������ 5%
			 3000�̸� D���.  ������ 7%
			 4000�̸� C���.  ������ 4%
			 5000�̸� B���.  ������ 3%
			 6000�̸� A���.  ������ 2%
	����:
	�̸� �μ� ���� ������� ������ �Ѿ�(����+������)
*/
select ename, deptno, sal, 
	DECODE(floor(sal/1000), '0', 'F','1', 'E','2', 'D',
			'3', 'C','4', 'B','5', 'A') �������,
	DECODE(floor(sal/1000), '0', '3%', '1', '5%', '2', '7%', 
			'3', '4%', '4', '3%', '5', '2%') �����޵��,
	sal*(1+ DECODE(floor(sal/1000), '0', '3', '1', '5', '2', '7', 
			'3', '4', '4', '3', '5', '2')/100) ���ջ��
from emp;
/*
	����: �Ի�б� ���� ǥ�� (1/4,2/4,3/4,4/4) �Ի�б�ǥ��.
	�����ȣ �̸� �Ի�(��/��) �Ի�б�.

*/
select ename, hiredate, 
	CASE when to_number(to_char(hiredate,'MM')) <= 03  then '1�б�'
		when to_date(hiredate, 4,2) <= 06  then '2�б�'
 		when to_date(hiredate, 4,2) <= 09  then '3�б�'
 		ELSE '4�б�' END from emp;
/*
	������� to_number(to_char(hiredate, 'MM')) <= 03 �̷��� ó���ϴ°� ����!!				�ƴϰ�, to_number(to_char(hiredate, 'mm')) 

�� date ���⿡�� �ְ� �ڵ��̴�!!!		
	*/
