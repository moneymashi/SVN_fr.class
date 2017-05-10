/*
LPAD/RPAD �Լ�.
Ư�� ���ڿ��� �ش��Ѵ� ���ڿ��� ä��� ó���� �ϴ� ���� ���Ѵ�.
LPAD : ���ʿ� ���ڷ� ä�켼��  
	LPAD(������, ����ũ���,'�ݺ��� ���ڿ�')

*/
-- # himan�̶�� ���ڿ� ���ʿ� '#'�� 20ũ�⸸ŭ ä���� ���..
--  ��üũ�⸦ �����, �ش� ũ�Ⱑ ���� ������ ���ڷ� ä��..\
-- �ǹ� migration varchar :����������, char:����������
-- ������������ �����͸� �������������� ��ȯ�Ͽ� �̵���ų�� Ȱ��
select lpad('himan', 7, '#') from dual;
/*
RPAD : �����ʿ� �ش� ũ�Ⱑ �� ������ Ư�����ڷ� ä��..
ex) good job���� ���ڰ� 20���� �� ������ @�� �����ʿ� ä��.
*/
select rpad('good job', 20, '@') from dual;
select * from emp;
-- Ȯ�ο��� ename�� job�� ũ��� ������ ���ڿ���ŭ �����ʰ� ���ʿ� �ش� ���ڿ��� �Ʒ� ��������
-- ��������..
-- 1. ENAME�� JOB���� ������ ũ�⸦ Ȯ���Ѵ�.
-- 2. ������ �߿� ���� ū �������� ũ�⸦ Ȯ���ؼ�.
-- 3. ENAME���� �����ʿ� @, JOB���� ���ʿ� ^�� �߰��ؼ� ��Ÿ���� �Ѵ�.
-- 4. ������ ���� ������ ���
--    �����ȣ  �̸�(@) ��å(^)  �Ի���
SELECT MAX(LENGTH(ENAME)), MAX(LENGTH(JOB)) FROM EMP;
SELECT RPAD(ENAME,6,'@') ENAME, LPAD(JOB,9,'^') JOB, HIREDATE FROM EMP; 
SELECT * FROM EMP;
/*
LTRIM(), RTRIM() 
������ ���ڸ� �����ϴ� �Լ�.
LTRIM : ���ʿ� ���鹮�ڸ� �����ϴ� ó��
RTRIM : �����ʿ� ���鹮�ڸ� �����ϴ� ó��
ex) [����]This is your best day!!  ���ʿ� ���鹮�ڸ� ���� ó��..!!
*/
select ltrim('    this is your best day!!!') showData, 
 	length('    this is your best day!!!') beforeLen,
	length(ltrim('    this is your best day!!!')) afterLen
 from dual;
--  �����ʿ� ���鹮�ڿ��� �����ϴ� ó��
select rtrim('what we dwell on is who we become!   ') showdata,
       length('what we dwell on is who we become!   ') beforeLen,
	   length(rtrim('what we dwell on is who we become!   ')) afterLen
from dual;	
select * from emp;
/*
TRIM
	������, ���ʿ� �ִ� ������ ����ؼ� Ư�� ���ڿ��� ���� ó���ϴ� �Լ�.
	TRIM('�����ҹ��ڿ�' FROM ������)
	ex) 'aaaaaaaGood morning!!aaaaaaaa'���� �����ʰ� ���ʿ� a���ڿ��� ����ó��
*/ 
select trim('a' from 'aaaaaaaGood morning!!aaaaaaaa' ) showdata from dual;
select * from emp;
-- Ȯ�ο��� job�� 'N'�̳� 'R' 'T'�� ������ ������ �������� ������ ���� ����ϼ���.
-- �̸�  ��å
SELECT ename, job, 
      trim('T' from trim('R' from trim('N' FROM job))) chjob
from emp;
select * from emp;
/*
��¥ �Լ�..
sysdate : ����Ŭ ����� ���� ��¥�� �ð��� ����ϴ� ��ü..
*/
select sysdate from dual;
select sysdate+1 from dual;
select sysdate-1 from dual;
select sysdate today, sysdate-1 yesterday, sysdate+1 tomorrow from dual;
select ename, hiredate, sysdate, floor(sysdate - hiredate) from emp;
/*
months_between : �ΰ��� ��¥ ������ ������ ���� ���� ���ϴ� ����..
	months_between(�񱳳�¥������1, �񱳳�¥������2)
ex) �� �������� �ٹ��� ���� ���� ���ϼ���..
*/
select ename, hiredate, trunc(months_between(sysdate, hiredate)) workingMonth
from emp;
select * from emp;
/*
add_months : �̷������� ��Ÿ���� �Լ��� ���� ���� ���ؼ� �ش糯¥�� ��Ÿ���� �Ѵ�.
	add_months(���ص�����, ���İ����� )
 ex) �Ի� ��¥���� 6������ �߰��� ��¥�� ����ϼ���.	
*/
select ename, hiredate, add_months(hiredate,6) after6Months from emp;
select * from emp;
/*
����1)
6������ ���ϱⰣ���� �޿��� 70%�� �����ϱ�� �ߴ�.
����� ���ϱⰣ��������� ����ϰ�, 6�������� �޿��� ������ ����ϼ���..
���޿� - sal/13 
���ϱⰣ - ���޿��� 70%
���ϱⰣ���޿��Ѿ� - ���ϱⰣ6������ �޿� �Ѿ��� 10���� �����ؼ� ���
�����ȣ  ����� �Ի���  ���ϱⰣ�������  ���ϱⰣ���޿��Ѿ�(10��������)
*/
/*
next_day : �ְ������� ���� ����� ��¥�� ������ ��, Ȱ��..
   next_day(��¥������, '����') : �ش� ���Ͽ� ���� ����� ��¥ ���..
*/
select sysdate, next_day(sysdate, '������') from dual;
/*
Ȯ�ο���) ������� �Ի���, ù��° ������� ����ϼ���..
*/
select ename, hiredate, next_day(hiredate,'�����') firstHoliday from emp;

select * from emp;
/*
last_day �Լ�
	�ش� ���� ������ ��¥�� ��ȯó��.
*/
select last_day(sysdate) thisLastDate, 
	last_day(sysdate)+1 nextFirstDate from dual; -- ������ ù��
-- 	
select * from emp;
-- �޿� ���.. 3�ܰ� �޿����� ����� ����ϼ���.
-- 1�ܰ� ��� 20��
-- 2�ܰ� ��� ��������
-- 3�ܰ� ������ 10��
-- ��� �Ի��� ù����1 ù����2 ù����3
select ename, hiredate, 
	last_day(hiredate) grade02
	 from emp;
/*
����ȯ �Լ�
����Ŭ���� �����Ͱ� ����ȯ�� �ؼ�, �ʿ��� �����̳� type���� ��Ÿ���� �Ѵ�.
�� ��, Ȱ���ϴ� ���� ����ȯ �Լ��̴�.
to_char() : ��¥�� �������� ���������� ��ȯ
to_date() : �������� ��¥������ ��ȯ
to_number() : �������� ���������� ��ȯ

to_char()
1) ��¥���� ���������� ��ȯ�ϱ�.
	to_char(��¥������, 'ǥ���� ��������' )
	��¥ǥ���ϴ� ���� ������ ����
	YYYY : �⵵ ǥ��, YY :�⵵ 2�ڸ�ǥ��
	MM : �� ǥ��, MON:�� �������� ǥ�� ex)JAN
	DAY : ���� ǥ��, DY:���� ���ǥ��.
	DD : ��¥ ǥ��
	
ex) �Ի����� �⵵-��-��  �� ǥ���Ͻÿ�..
*/
select ename, to_char(hiredate, 'YYYY-MM-DD') hiredate1,
to_char(hiredate, 'YY/MM/DD') hiredate2,
to_char(hiredate, 'YYYY"��" MM"��" DD"��"') hiredate2
from emp;
select * from emp;
-- Ȯ�ο��� 
-- �Ʒ��������� ����ϼ���.
-- [����̸�]��  @@�� @@�� @@�Ͽ� �޿��� @@@ ���� �ޱ�� �ϰ� �Ի��߽��ϴ�.
select ename||'�� '||to_char(hiredate,'YY"��" MM"��" DD"��" DAY')
        ||'�� �޿��� '|| sal ||'���� �ޱ�� �ϰ� �Ի��߽��ϴ�.' show
from emp;
select * from emp;
/*
2) �ð�������� to_char(��¥������, '��¥�������  �ð��������')
	AM �Ǵ� PM  : �������� ǥ��
	AM. �Ǵ� PM. : ����. ����. ǥ��
	HH �Ǵ� HH12 : 12�ð� ǥ��(1~12)
	HH24 : 24�ð� ǥ��(0~23)
	MI :minutes ��ǥ��
	SS : seconds ��ǥ��
ex)	����ð��� ��¥�� �ð� ���Ŀ� ���� ǥ��
	YYYY/MM/DD  HH24:MI:SS
*/
	select to_char(sysdate,'YYYY/MM/DD HH24:MI:SS') today from dual;
/*
����
	�ٹ��������� ���� ���� ���ʽ� ����
	���� ������ ����~���� �ֱٿ� �Ի��� ������
	1/3 = 30%, 1/3 = 20%, 1/3 = 10% (��������)
	���, �Ի���, ���糯¥(@@/@@/@@ AM @@�� @@�� @@ ��), �ٹ�������, ���ʽ�
25/3 ==>8.33  410~434 

*/	
select 25/3 from emp;
select ename, hiredate, 
	to_char(sysdate,'YY/MM/DD AM HH24"��" MM"��" SS"��"') today,
 floor(months_between(sysdate,hiredate )) workMonth,
  floor(months_between(sysdate,hiredate ))-410 bonusKey,
  (floor((floor(months_between(sysdate,hiredate ))-410)/8.33)+1)*10||'%' bonusKey2,
  round(sal*((floor((floor(months_between(sysdate,hiredate ))-410)/8.33)+1)/100)) bonus
 from emp;
select * from emp;
/*
�������� ������ ó��..
to_char(������, '����')
�������
0 : �ڸ����� ���� ���� ���, ������ �ڸ����� ���� �������� �ڸ��� ���� ū���
    �� 0���� ä������.
9 : �ڸ��� ��� ���� �ش� ������ ��Ÿ��. ä������ �ʴ´�.
L : ������ ���ݴ��� ǥ��
. : �Ҽ��� ǥ��
, : õ���� ǥ��
*/
select to_char(1000,'000000') from dual; -- �ش� �ڸ��� ���� Ŭ�� 0���� ä����.
select to_char(1000,'999999') from dual; -- ä������ ó������ ����.
select to_char(1000,'999') from dual; -- �ڸ����� ������ ##�� ǥ�õ�.
select to_char(24333, 'L999999') from dual; -- ������ ǥ��
select to_char(23433, 'L999,999') from dual; --õ����(,) ǥ��.
select to_char(24333.2422, '999,999.999') from dual; --�Ҽ���(.) ǥ��
select * from emp;
-- Ȯ��) �̸��� �޿��� ǥ���ϵ�
--      �޿��� �Ҽ������ϴ� ǥ�õ��� �ʰ�, �ڸ����� 7�ڸ��� ǥ���ϵ� ��Ÿ���� �ʴ� 
--      �ڸ��� '0'���� ǥ���Ͻð�

select ename, to_char(sal,'0000000') sal from emp;
/*
to_date(): ���� ==> ��¥.
 �Է��� ��¥���� ���ڸ� �Է��� ��, ��¥ �����͸� ��ȸ ó��..
 �˻��� �ҷ��� ���ڸ� ��¥�� ��ȯ�Ͽ� ó��..
 ���ڴ� ��¥���·� ��� �ν��ϴ°�?
 1980/12/12 --> to_date()���� � �������� �Է��� ������ ����.!!!
 to_date(�Էµ�����, '������ ����')
 ex) to_date('19811020', 'YYYYMMDD')
*/
-- select * from emp
-- where hiredate='12/17/1980'; (x)
 select * from emp;
--ex)  �Ի����� 1980/12/17 �� �����͸� �˻�
select * from emp
where hiredate=to_date('1980/12/17','YYYY/MM/DD');-- 
-- ���ڿ� ==> �Է����� ���� ==> to_date() ó��..
/*
Ȯ�ο���) �Է°��� '1981-02-20'�̸�, �� �����ͷ� �˻��Ǵ� �Ի��Ͽ� �ش��ϴ�
		�����  �Ի���(1981��02��20��) �� ����Ϸ��� �Ѵ�. 
*/
select ename, to_char(hiredate,'YYYY"��"MM"��"DD"��"') "�Ի���" 
from emp
where hiredate=to_date('1981-02-20','YYYY-MM-DD');

select * from emp;
/*
����
��ȸ���� '1981��01��01��' ���� '1982��12��12��' ������ ������ ��,
	�μ��� 30�� �����͸� ��ȸ�Ͽ�,
list���� 
	�����(10�ڸ�-�տ� #��ȣó��)
	��å(10�ڸ�-�������ڿ� '-'ó��)
	�Ի���(@@�� @@�� @@�� @���� 24�� @@�� @@�� )
	����( ####1,600.0 ǥ��)  �� ��Ÿ������..
*/
select lpad(ename,10,'#') "�����",
	   rpad(job,10,'-') "��å",
	   to_char(hiredate,'YY"��" MM"��" DD"��" DAY HH24"��" MI"��" SS"��"') "�Ի���",
	   lpad(ltrim(to_char(sal,'9,999.9')),12,'#') "����", deptno
from emp
where hiredate between 
		to_date('1981��01��01��','YYYY"��"MM"��"DD"��"') AND
		to_date('1982��12��12��','YYYY"��"MM"��"DD"��"')
	AND DEPTNO = 30;

/*
������ ���ڿ��� �ԷµǾ��� ��, ó���� to_number() �Լ�
�ԷµǴ� ���ڿ��� ������ ����, to_number�� ������ �Է� ó��..
to_number(�Է��� ������, '��������')
*/
-- select '20,000' - '30,000' from dual;
select to_number('20,000','99,999') -to_number('30,000','99,999') calcu 
from dual;
select * from emp;
-- Ȯ��)������ �˻��ҷ��� �Ѵ�.   '3,000'�̶�� �Է°��� ���� 3000������ ������ 
-- ���� ����� �̸��� ������ W(��) 3,000�� ����ϼ���
select ename, to_char(sal,'L99,999') money
from emp
where sal < to_number('3,000','9,999');

select * from emp;
/*
������ ���ʽ��� �ջ��� �ݾ���  �̸��� �Ѿ����� ǥ���ҷ��� �Ѵ�.
nvl : �ش� �����Ͱ� null�϶�, ǥ���� default �����͸� �����Ͽ�,
     ���� ���� ������ ���������� �����͸� ó���ϱ� ���� ���̴�.
	 ���� nvl(������,0)    ������ ���� 0
	 ���� nvl(������,' ')  ������ ���� ' '�������� ó��..
*/
select ename, sal, comm,  sal+nvl(comm,0) tot
from emp;
select * from emp;
-- ����
--  �̸�  �����ڹ�ȣ    ���ʽ�   
-- ==> �����Ͱ� ���� ����  �����ڹ�ȣ��� '�ְ���',
--  ���ʽ��� '0'ǥ��
select ename, nvl(to_char(mgr),'�ְ���') mgr,
 nvl(comm,'0') comm from emp;














