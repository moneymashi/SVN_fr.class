/*
����1)
6������ ���ϱⰣ���� �޿��� 70%�� �����ϱ�� �ߴ�.
����� ���ϱⰣ��������� ����ϰ�, 6�������� �޿��� ������ ����ϼ���..
���޿� - sal/13
���ϱⰣ - ���޿��� 70%
���ϱⰣ���޿��Ѿ� - ���ϱⰣ6������ �޿� �Ѿ��� 10���� �����ؼ� ���
�����ȣ	�����	�Ի���	���ϱⰣ�������	���ϱⰣ���޿�(10��������)
*/
select empno, ename, hiredate, add_months(hiredate, 6), trunc(((sal/13) * 0.7) * 6, -1) from emp;

-- (����) �޿� ���.. 3�ܰ� �޿����� ����� ����ϼ���.
-- 1�ܰ� ��� 20��
-- 2�ܰ� ��� ��������
-- 3�ܰ� ������ 10��
-- ��� �Ի��� ù����1 ù����2 ù����3
select ename, hiredate,
		last_day(add_months(hiredate, -1))+20,
		last_day(hiredate) grade02,
		last_day(hiredate)+10
		from emp;
		
/*
����
	�ٹ��������� ���� ���� ���ʽ� ����
	���� ������ ����~���� �ֱٿ� �Ի��� ������
	1/3 = 30%, 1/3 = 20%, 1/3 = 10% (��������)
	���, �Ի���, ���糯¥(@@/@@/@@ AM @@�� @@�� @@��), �ٹ�������,
*/
select ename, hiredate, to_char(sysdate, 'YY/MM/DD AM HH24:MI:SS') , trunc((sysdate - hiredate)/30), 
	case when (trunc((sysdate - hiredate)/30) - 416) / 8 <= 1 then sal*0.1  
		when (trunc((sysdate - hiredate)/30) - 416) / 8 <= 2 then sal*0.2
		when (trunc((sysdate - hiredate)/30) - 416) / 8 > 2 then sal*0.3
		else 0
	end result
from emp;

/*
����
��ȸ���� '1981�� 01�� 01��'���� '1982�� 12�� 12��' ������ ������ ��,
	�μ��� 30�� �����͸� ��ȸ�Ͽ�,
list����
	�����(10�ڸ�-�տ� #��ȣó��)
	��å(10�ڸ�-�������ڿ� '-'ó��)
	�Ի���(@@�� @@�� @@�� @���� 24�� @@�� @@��)
	����( ####1,600.0 ǥ��)�� ��Ÿ������.. 
*/
select lpad(ename, 10 , '#'), rpad(ename, 10, '-'), to_char(hiredate, 'YYYY"�� "MM"�� "DD"�� "DAY" "HH24"�� "MI"�� "SS"��"'), lpad(to_char(sal, '9,999.9'), 11, '#') from emp;

-- ���� �̸� �����ڹ�ȣ ���ʽ� ==> �����Ͱ� ���� ���� �����ڹ�ȣ��� '�ְ���', ���ʽ��� '0'ǥ��
select ename, nvl(to_char(mgr), '�ְ���'), nvl(comm, 0) from emp; 