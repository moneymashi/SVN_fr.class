/*
����1) // �Ϸ�
6������ ���ϱⰣ���� �޿��� 70%�� �����ϱ�� �ߴ�
����� ���� �Ⱓ��������� ����ϰ�, 6�������� �޿��� ������ ���
���޿� - sal/13
���ϱⰣ - ���޿��� 70%
���ϱⰣ���޿��Ѿ� - ���ϱⰣ6������ �޿� �Ѿ��� 10���� ����
�����ȣ		�����		���ϱⰣ�������		���ϱⰣ���޿�	���ϱⰣ���޿��Ѿ�(10��������)
*/
select * from emp;
select empno, ename,
	add_months(hiredate, 6) ���ϱⰣ�������,
	(sal*7/130) ���ϱⰣ���޿�,
	trunc((sal*42/130), -1) ���ϱⰣ���޿��Ѿ�
from emp; 

select hiredate, hiredate from emp;


-- �޿���� 3�ܰ� �޿����� ����� ���
-- ����2) 1�ܰ� ��� 20�� // �Ϸ�
-- 2�ܰ� ��� ��������
-- 3�ܰ� ������ 10��
-- ��� �Ի��� ù����1 ù����2 ù����3
select ename, hiredate,
	last_day(hiredate-20)+20 grade01,
	last_day(hiredate) grade02,
	last_day(hiredate)+10  from emp;
select hiredate, last_day(add_months(hiredate-20,1))+20 from emp; -- ���� ����
select add_months(last_day(add_months(hiredate, 1)-20), -1)+20 grade01 from emp;
select add_months(sysdate-20,1) from dual;

select 
	hiredate, last_day(hiredate-20)+20 grade01
from emp;



/*
����3)
	�ٹ��������� ���� ���� ���ʽ� ����
	���� ������ ����~���� �ֱٿ� �Ի��� ������
	1/3 = 30%, 1/3 = 20% 1/3 = 10% (��������)
	���, �Ի���, ���糯¥(@@/@@/@@ AM @@�� @@�� @@��), �ٹ�������, ���ʽ�%, ���ʽ��ݾ�
*/
select ename, hiredate �Ի���, to_char(sysdate, 'YY/MM/DD AM HH"��"MM"��"SS"��"') ���糯¥,
	months_between(sysdate,hiredate) �ٹ�������, sal from emp;





/*
����4 // �Ϸ�
��ȸ���� '1981��01��01��' ���� '1982��12��12��' ������ ������ ��, �μ��� 30�� �����͸� ��ȸ�Ͽ�,
list���� �����(10�ڸ�-�տ� #��ȣó��)
��å(10�ڸ�-������ �ڿ� '-'ó��)
�Ի���(@@�� @@�� @@�� @���� 24�� @@�� @@��)
����( ####1,600.0 ǥ��) �� ��Ÿ���ÿ�
*/
select * from emp;
select lpad(ename,10,'#') �����,
		rpad(job,10,'-') ��å,
		to_char(hiredate,'YY"��"MM"��"DD"��"DAY HH24"��"MM"��"SS"��"') �Ի���,
		lpad(ltrim(to_char(sal,'99999,000.0')),11,'#') "����"
		from emp where hiredate between '1981/01/01' and '1982/12/12' and deptno=30;



-- ����5) // �Ϸ�
-- �̸� �����ڹ�ȣ ���ʽ� ==> �����Ͱ� ���� ���� �����ڹ�ȣ��� '�ְ���'ǥ�� ���ʽ��� '0'ǥ��
select * from emp;
select ename, nvl(to_char(mgr),'�ְ���') "�����ڹ�ȣ", nvl(comm,0) "���ʽ�" from emp;





/*
����6) // �Ϸ�
������ ���� ���ü�踦 �������� �Ѵ�
decode�� Ȱ���ؼ�,
	   1000 �̸� F ���		������ 3%
1000 ~ 2000 �̸� E ���		������ 5%
2000 ~ 3000 �̸� D ���		������ 7%
3000 ~ 4000 �̸� C ���		������ 4%
4000 ~ 5000 �̸� B ���		������ 3%
5000 ~  		A ���		������ 2%

�̸�		�μ�		����		�������		������	�Ѿ�(����+������)
*/
select ename,
	decode(deptno,	10, 'ȸ��',
						20, '����',
						30, '����',
						40, '�',
						'����') "�μ�",
sal,
	decode(trunc(sal,-3), 0, 'F',
						1000, 'E',
						2000, 'D',
						3000, 'C',
						4000, 'B',
				'A') "�������",
	decode(trunc(sal,-3), 0, '3',
						1000, '5',
						2000, '7',
						3000, '4',
						4000, '3',
				'2')*sal/100 "������",
	decode(trunc(sal,-3), 0, '3',
						1000, '5',
						2000, '7',
						3000, '4',
						4000, '3',
				'2')*sal/100+sal "�Ѿ�"
from emp;



/*
����7) // �Ϸ�
�Ի� �б���� ǥ��(1/4,2/4,3/4,4/4) �Ի� �б⸦ ǥ��
�����ȣ, �̸�, �Ի�(��/��), �Ի�б�
*/

select empno, ename, to_char(hiredate,'YY"��"MM"��"') �Ի�,
	case when to_char(hiredate,'MM')<4 then '1/4'
			when to_char(hiredate,'MM')<7 then '2/4'
			when to_char(hiredate,'MM')<10 then '3/4'
	else '4/4'
	end �Ի�б�	
from emp;



select * from nls_database_parameters
where parameter like '%DATE%';






