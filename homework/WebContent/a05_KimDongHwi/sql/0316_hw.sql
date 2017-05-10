/*
����1
6������ ���ϱⰣ���� �޿��� 70%�� �����ϱ�� �ߴ�.
����� ���ϱⰣ��������� ����ϰ�, 6�������� �޿��� ���� ����ϼ���.
���޿� - sal/13
���ϱⰣ - ���޿��� 70%
���ϱⰣ ���޿� �Ѿ� - ����6�������� �޿� �Ѿ�
�����ȣ / ����� / �Ի��� / ���ϱⰣ������� / ���ϱⰣ����(sal/13*0.7)
*/
select * from emp;

select empno "�����ȣ" , ename "�����" , 
		to_char(hiredate, 'yyyy-mm-dd') "�Ի���",
		to_char(add_months(hiredate,6), 'yyyy-mm-dd') "���ϸ���ð�",
		trunc((sal/13)*0.7,0) "���� �޿�",
		trunc(((sal/13)*0.7)*6,0) "���ϱⰣ �ѱ޿�"
from emp;


-- ����2
-- �޿� ��� 3�ܰ� �޿����� ����� ����ϼ���
-- 1�ܰ� ��� 20��
-- 2�ܰ� ��� ��������
-- 3�ܰ� ������ 10��
-- ����Ի��� ù����1 ù����2 ù����3

select ename, to_char(hiredate, 'yyyy-mm-dd') "�Ի���",
	to_char(last_day(add_months(hiredate,-1))+20, 'yyyy-mm-dd') "���20��",
	to_char(last_day(hiredate), 'yyyy-mm-dd') "�����������",
	to_char(last_day(hiredate)+10, 'yyyy-mm-dd') "������10��"
from emp;

/* 
����3
	�ٹ��������� ���� ���� ���ʽ� ���� 
	1/3 = 30%, 1/3=20%, 1/3=10%
	��� , �Ի���, ���糯¥(@@/@@/@@ AM @@�� @@�� @@��), �ٹ�������, ���ʽ�
*/
select ename "���", to_char(hiredate) "�Ի���", 
		to_char(sysdate,'yy/mm/dd am hh"��" mi"��" ss"��"') "���糯¥",
		trunc(months_between(sysdate, hiredate)) "�ٹ�������",
		trunc(months_between(sysdate, hiredate))-400  "���"
		
		--���ʽ� ���� �ʿ� max/min
		
		from emp;
		
		
select max(trunc(months_between(sysdate, hiredate))) from emp; --434 �ִ�
select min(trunc(months_between(sysdate, hiredate))) from emp; --410 �ּ�
select avg(trunc(months_between(sysdate, hiredate))) from emp; --425 ���
select count(trunc(months_between(sysdate, hiredate))) from emp; --14�� ������


/*
����4
��ȸ���� '1981��, 01�� 01��'���� '1982��12��12��' ������ ������ �� �μ��� 30�� �����͸� ��ȸ�Ͽ� 
�����(10�ڸ� �� ###��ȣó��)
��å(10�ڸ�-������ �� - ó��)
�Ի���(@@�� @@�� @@�� @���� 24��)
���� (###1,600.0)ǥ��
*/

select  deptno "�����ȣ",
		lpad(ename, 10, '#') "�����",
		rpad(job,10,'-') "��å",
		to_char(hiredate, 'yy"��"mm"��"dd"��"day hh24"��"') "�Ի���",
		lpad(to_char(sal, '999,999.9'),13,'#') "����"
from emp
where deptno ='30'and emp.HIREDATE between '1981/01/01' and '1982/12/12'; 

/*
���� 5
�̸� �����ڹ�ȣ ���ʽ� ==> 
�����Ͱ� ���� ��
������ ��ȣ '�ְ���', ���ʽ��� '0'ǥ��
 */
 
select ename "�̸�", nvl(comm,0) "���ʽ�", 
	nvl(to_char(nvl(mgr,'')),'�ְ���') "�����ڹ�ȣ"
 from emp; 
 
 
select ename "�̸�", nvl(comm,0) "���ʽ�", 
	case when 0 = nvl(mgr,0) then '�ְ���'
		else to_char(mgr,'9999')
			 end "�����ڹ�ȣ"
 from emp; 
 

/* 
 ���� 6
 ������ ���� ���ü�踦 �������� �Ѵ�.
decode�� Ȱ���ؼ�,
    1000 �̸�        F���    ������ 3%
    1000 ~ 2000�̸�    E���    ������ 5%
    2000 ~ 3000�̸�    D���    ������ 7%
    3000 ~ 4000�̸�    C���    ������ 4%
    4000 ~ 5000�̸�    B���    ������ 3%
    5000 ~ 6000�̸�    A���    ������ 2%
�̸� �μ� ���� ������� ������ �Ѿ�(����+������)
*/

select ename "�̸�" , deptno "�μ�" , sal "����",
	
case when trunc(sal, -3)=0 then 'F���'
	 when trunc(sal, -3)=1000 then 'E���'
	 when trunc(sal, -3)=2000 then 'D���'
	 when trunc(sal, -3)=3000 then 'C���'
	 when trunc(sal, -3)=4000 then 'B���'
else 'A���'
	end "���",

case when trunc(sal, -3)=0 then '3%'
	 when trunc(sal, -3)=1000 then '5%'
	 when trunc(sal, -3)=2000 then '7%'
	 when trunc(sal, -3)=3000 then '4%'
	 when trunc(sal, -3)=4000 then '3%'
else '2%'
	end "������(%)",

case when trunc(sal, -3)=0 then sal*0.03
	 when trunc(sal, -3)=1000 then sal*0.05
	 when trunc(sal, -3)=2000 then sal*0.07
	 when trunc(sal, -3)=3000 then sal*0.04
	 when trunc(sal, -3)=4000 then sal*0.03
else sal*0.02
	end "�����ݾ�",	

case when trunc(sal, -3)=0 then sal*1.03
	 when trunc(sal, -3)=1000 then sal*1.05
	 when trunc(sal, -3)=2000 then sal*1.07
	 when trunc(sal, -3)=3000 then sal*1.04
	 when trunc(sal, -3)=4000 then sal*1.03
else sal*1.02
	end "�Ѿ�"	
		from emp;	 

/*
����7
�Ի� �б� ���� ǥ��(1/4, 2/4, 3/4, 4/4) �Ի� �б⸦ ǥ��
�����ȣ, �̸�, �Ի�(��/��), �Ի�б�
 */

select * from emp;
select empno "�����ȣ", ename "�̸�", to_char(hiredate, 'yy"��/"mm"��"') "�Ի���",


 case when to_char(hiredate, 'mm') = 01 then '1�б�'
 	 when to_char(hiredate, 'mm') = 02 then '1�б�'
 	 when to_char(hiredate, 'mm') = 03 then '1�б�'

 	 when to_char(hiredate, 'mm') = 04 then '2�б�'
 	 when to_char(hiredate, 'mm') = 05 then '2�б�'
 	 when to_char(hiredate, 'mm') = 06 then '2�б�'

 	 when to_char(hiredate, 'mm') = 07 then '3�б�'
 	 when to_char(hiredate, 'mm') = 08 then '3�б�'
 	 when to_char(hiredate, 'mm') = 09 then '3�б�'

 else '4�б�'
	end "�б�"
	from emp;
	


