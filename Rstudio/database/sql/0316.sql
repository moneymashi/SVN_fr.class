/*
LPAD/RPAD �Լ�
Ư�� ���ڿ��� �ش��ϴ� ���ڿ��� ä��� ó���� �ϴ� ���� ���Ѵ�.
LPAD : ���ʿ� ���ڷ� ä�켼��
	LPAD(������, ����ũ���, '�ݺ��� ���ڿ�')

*/
-- # himan �̶�� ���ڿ� ���ʿ� '#'�� 20ũ�⸸ŭ ä���� ���..
-- ��üũ�⸦ �����, �ش� ũ�Ⱑ ���� ������ ���ڷ� ä��../
-- �ǹ� migration varchar : ����������, char: ����������
-- ������������ �����͸� �������������� ��ȯ�Ͽ� �̵���ų�� Ȱ��
select lpad('himan', 7, '#') from dual;
/*
RPAD : �����ʿ� �ش� ũ�Ⱑ �� ������ Ư�����ڷ� ä��..
ex) good job���� ���ڰ� 20���� �� ������ @�� �����ʿ� ä��.
*/
SELECT rpad('good job', 20, '@') FROM  dual;
SELECT * FROM emp;
-- Ȯ�ο��� enmae�� job�� ũ��� ����� ���ڿ���ŭ �����ʰ� ���ʿ� �ش� ���ڿ��� �Ʒ� ��������
-- ��������..
-- 1. ENAME�� JOB���� ������ ũ�⸦ Ȯ���Ѵ�.
-- 2. ������ �߿� ���� ū �������� ũ�⸦ Ȯ���ؼ�,
-- 3. ENAME���� �����ʿ��� @, JOB���� ���ʿ� ^�� �߰��ؼ� ��Ÿ���� �Ѵ�.
-- 4. ������ ���� ������ ���
--    �����ȣ �̸�(@) ��å(^) �Ի���

SELECT MAX(LENGTH(ENAME)), MAX(LENGTH(JOB)) FROM EMP;
SELECT RPAD(ENAME,6,'@') ENAME, LPAD(JOB,9,'^') JOB, HIREDATE FROM EMP;
SELECT * FROM EMP;
/*
LTRIM(), RTRIM()
������ ���ڸ� �����ϴ� �Լ�.
LTRIM : ���ʿ� ���鹮�ڸ� �����ϴ� ó��
RTRIM : �����ʿ� ���鹮�ڸ� �����ϴ� ó��
ex [����]This is your best day!! ���ʿ� ���鹮�ڸ� ���� ó��..!!
*/
SELECT ltrim('	this is your best day!!!') showData,
	length('	this is your best day!!!') beforeLen,
	length(ltrim('	this is your best day!!!')) afterLen
FROM dual;
-- �����ʿ� ���鹮�ڿ��� �����ϴ� ó��
SELECT rtrim('What we dwell on is who we become!	') showData,
	   length('What we dwell on is who we become!	') beforeLen,
	   length(rtrim('What we dwell on is who we become!	')) afterLen
FROM dual;
SELECT * FROM emp;
/*
TRIM
	������, ���ʿ� �ִ� ������ ����ؼ� Ư�� ���ڿ��� ���� ó���ϴ� �Լ�.
	TRIM('�����ҹ��ڿ�' FROM ������)
	ex) 'aaaaaaGood morning!!aaaaaaaa'���� �����ʰ� ���ʿ� a���ڿ��� ����ó��
*/
SELECT trim('a' FROM 'aaaaaaGood morning!!aaaaaaaa') showdata from dual;
SELECT * FROM emp;
-- Ȯ�ο��� job�� 'MAM'�̳� 'ER' 'ST'�� ������ ������ �������� ������ ���� ����ϼ���.
-- �̸� ��å

select * from emp;
select ename �̸�, job ��å,trim('n' from trim('r' from trim('t' from job))) ��å from emp ;

/*
��¥ �Լ�..
sysdate : ����Ŭ ����� ���� ��¥�� �ð��� ����ϴ� ��ü..
*/
SELECT sysdate FROM dual;
SELECT sysdate+1 FROM dual;
SELECT sysdate-1 FROM dual;
SELECT sysdate today, sysdate-1 yesterday, sysdate+1 tomorrow from dual;
SELECT ename, hiredate, sysdate, sysdate - hiredate FROM emp;
/*
months_between : �ΰ��� ��¥ ������ ������ ���췯 ���� ���ϴ� ����..
	months_between(�񱳳�¥������1, �񱳳�¥������2)
ex) �� �������� �ٹ��� ���� ���� ���ϼ���..
*/
SELECT ename, hiredate, trunc(months_between(sysdate, hiredate)) woringMonth FROM emp;
SELECT * FROM emp;
/*
add_months : �̷������� ��Ÿ���� �Լ��� ���� ���� ���ؼ� �ش糯¥�� ��Ÿ���� �Ѵ�.
	add_months(���ص�����, ���İ�����)
ex) �Ի� ��¥���� 6������ �߰��� ��¥�� ����ϼ���.
*/
SELECT ename, hiredate, add_months(hiredate,6) after6Months FROM emp;
SELECT * FROM emp;
/*
����1)
6������ ���ϱⰣ���� �޿��� 70%�� �����ϱ�� �ߴ�.
����� ���ϱⰣ��������� ����ϰ�, 6�������� �޿��� ������ ����ϼ���..
���޿� - sal/13
���ϱⰣ - ���޿��� 70%
���ϱⰣ���޿��Ѿ� - ���ϱⰣ6������ �޿� �Ѿ��� 10���� �����ؼ� ���
�����ȣ ����� �Ի��� ���ϱⰣ������� ���ϱⰣ���޿�(10��������)
*/
/*
next_day : �ְ������� ���� ����� ��¥�� ������ ��, Ȱ��..
	next_day(��¥������, '����') : �ش� ���Ͽ� ���� ����� ��¥ ���..
*/
SELECT sysdate, next_day(sysdate, '������') FROM dual;
/*
Ȯ�ο���) ������� �Ի���, ù��° ������� ����ϼ���..
*/
SELECT ename, hiredate, next_day(hiredate, '�����') firstHoliday FROM emp;

SELECT * FROM emp;
/*
last_day �Լ�
	�ش� ���� ������ ��¥�� ��ȯó��.
*/
SELECT last_day(sysdate) thisLastDate, last_day(sysdate)+1 nestFirsDate FROM dual; -- ������ ù��
