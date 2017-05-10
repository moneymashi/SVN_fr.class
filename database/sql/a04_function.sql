select * from emp;
/*
�����Լ� : ���ڸ� ó���ϴ� �Լ�. ���밪, �����Լ�(sin, cos, tan...)
		 �ø�(ceil),�ݿø�(round),����(trunc, floor), ������(mod)�� ó����.

1. abs :���밪-��ȣ�� ���� ����, ����� ó���ϴ� �Լ��� ���Ѵ�.		 
*/
select 25, -25, abs(25), abs(-25) from dual;
/*
2. floor() : �Ҽ��� �Ʒ��� ������ �Լ�.
*/
select 25.75, floor(25.75) from dual;
/*
3. round() : �ݿø� ó�� �Լ�
	round(������, �ݿø��� �ڸ���)
		�ݿø��� �ڸ��� : ��� - �Ҽ��� ������ �ڸ��� ó��
					   ���� - �ʴ���(1), �����(2) ������ �ش� ���� ��ŭ �ݿø�ó��.
					   
*/
select 25.278888, round(25.278888,2) from dual;
select 625.2999, round(625.2999,-2) from dual; -- ���ڸ��� �ݿø�ó�� ��.
select * from emp;
-- ����)
-- sal�� �����̶�� �� ��, �̴� �޿���(1/13)�� ó���Ͻÿ�, �� �̴��� ���ʽ��� �ִ� ���Դϴ�.
-- ��³��� : ���, ����, �̴ޱ޿�, ���ʽ�, �ѱ޿���(�޿���, 
--   �ѱ޿�����  10������ �ݿø� ó���Ѵ�.)
select empno, sal, round(sal/13,-1) monthpay, nvl(comm,0) bonus,
       round((sal/13)+nvl(comm,0),-1) totMonthpay
from emp;	   
/*
4. trunc�Լ� : Ư�� �ڸ��� ���Ϸ� ����ó��..
	trunc(������, �ڸ���ó��)
*/
select trunc(24.2433, 2), trunc(24.243, -1) from dual;
select * from emp;
select trunc(29.9949,1) from dual;
/*
���� sal�� �������� 
1000�̸�        - 10% ���ʽ�
1000~2000�̸� - 20% ���ʽ�
2000~3000�̸� - 30% ���ʽ�
3000~4000�̸� - 40% ���ʽ�
4000~5000�̸� - 50% ���ʽ�
5000~�̻�      - 60% ���ʽ���
�����ϱ�� �ߴ�.. �Լ��� Ȱ���ؼ�. �Ʒ� ������ ó���Ͻÿ�.
��� �̸� ���� ���ʽ�(%)  ���ʽ�
*/
select deptno, ename, sal, (floor(sal/1000)+1)*10||'%' per,
sal*(floor(sal/1000)+1)*0.1 bonus
from emp;
/*
5. mod�Լ� : ������ �Լ�ó��..
���� : mod(������, ������) :�ش絥���͸� ���� ���� ���� ��, ������ ���뿡 ���� ó��.
*/
select mod(27,2), mod(27,3), mod(27,4) from dual;
select * from emp;
-- �����ȣ�� Ȧ���� ����� �˻��ϼ���..
select * from EMP 
where mod(empno,2)=1;
select * from emp;
/*
����
����� �μ��������� 1���� 2������ ����� ü����ȸ�� �ϱ�� �ߴ�.
�μ���ȣ�� 10, 30 ==> 1��
�μ���ȣ�� 20, 40 ==> 2��
���� ������ ������ ���� ����ϼ���.
�μ���ȣ  �����ȣ �̸�     ����
*/
select deptno, empno, ename, mod((deptno/10)+1,2)+1||'��' teamName
from emp;
/*
���� ó�� �Լ�.
1. upper ��� �����͸� �빮�ڷ� ��ȯó��
	upper(������)
	�Ϲ������� ������Ͱ� �ҹ��ڳ� �빮�ڰ� ���� �ԷµǾ� �ִ� ���,
	�ش� �����͸� �Է¹���(��ҹ��� ���о���)�� �ش� �����͸� �˻��� ��� ���� ���δ�.
*/
select upper('hi! Good days!!') from dual;
select * from emp;
-- ��å�� ��ҹ��� ���� ���� ��ȸ�ҷ��� �Ѵ�. �Ʒ� salesman �̶�� �ԷµǾ �˻��Ϸ���..
select * from emp
where job = upper('salesman');
/*
2. �ҹ��ڸ� ��ȯ�ϴ� lower�Լ�..
	lower(������)
*/
select lower('Good night!!! This is the Best day!!') from dual;
select empno, lower(ename), lower(job) from emp;
/*
3. initcap�Լ� : ù���ڸ� �빮��, �������� �ҹ��� ó��..
	initcap(������)
*/
select initcap(ename), initcap(job) from emp;
/* Smith is a Clerk!!  ���� ���..*/
select initcap(ename) ||' is a '||initcap(job)||'!!!' introJob from emp;
select * from emp;
/*
4. ���ڱ��̸� ó���ϴ� length
���� length(������) : �ѱ۰� ����������� ���ڿ��� ������ ��Ÿ���� ��.
*/
select length('himan'), length('����Ŭ') from dual;

select * from emp;
-- ��å�� 5�� ������ �����͸� ����ϼ���..
select * from emp where length(job) <=5;
/*
5. lengthb(): byte�� ũ�⸦ ��� - ����(1�ڴ� 1byte), �ѱ�(1�ڴ� 2bytes)
*/
select lengthb('himan'), lengthb('ȫ�浿') from dual;
/*
6. substr(), substrb(): Ư�� ���ڿ��� �Ϻθ� �����ϴ� �Լ�.
	substr(������, 1����count�Ͽ� ������ ��ġ����, ������ ���ڿ��� ����)
*/
select substr('Welcome to Oracle world!!', 4,5) from dual;
select * from emp;
/* ex) job�� �������� 5���� ���ڿ��� �����Ͽ�, �̸��� ��å�� ���*/
select ename, substr(job,1,5) from emp;
/* Ȯ�ο��� 
	�Ʒ��� ������ �����͸� ȭ�鿡 list�ϼ���..
	���   �̸�   ��å(�̸��� ���ڿ��� ��ŭ��ǥ��)
	7499 ALLEN SALES
*/
SELECT empno, ename, substr(job, 1, length(ename)) from emp;
-- hiredate ���, ������ type�� ��¥����������, �ڵ� ����ȯ��  �Ǿ�
--   ���ڿ� ó�� �Լ��� ���ڿ��� �����Ͽ� ó���� �� �ִ�.
select * from emp;
select substr(hiredate,1,length(hiredate))  from emp;
-- 1980�� �����͸� ��Ÿ������..
select * from emp
where substr(hiredate,1,2) = '80';
select * from emp;
-- 1982�⵵ 12��01�� ~ 1982�� 12��31�� �Ի����� �����  �̸��� �Ի��Ϸ� ����ϼ���.
select ename, hiredate  from emp
where substr(hiredate,1,5)='82/12';
-- ����) �Լ��� �̿��Ͽ� ���� ������ ����ϼ���..
-- @@@��  �Ի���  @@�� @@�� @@�� �̸�, ���� ������ @@@ ���� �ް� �ֽ��ϴ�. 
-- column��  empinfo
select ename||'�� �Ի��� 19'|| substr(hiredate,1,2)||'�� '|| 
	substr(hiredate,4,2)||'�� '|| substr(hiredate,7,2)||'�� �̸�, '||
	'���� ������ '||sal ||'���� �ް� �ֽ��ϴ�' empinfo
from emp;
-- ����)substr�� Ȱ�� �Ͽ� JOB�� MAN���� ������ �����͸� ����ϼ���!!
select *
from emp
where substr(job, length(job)-2, length(job) )='MAN';
select *
from emp
where substr(job, -3 ) ='MAN';

/*
7. Ư�� ������ ��ġ�� ���� instr
	instr(������, '�˻��� ����') :ó������ �����ؼ� 1��° �˻��� �����Ͱ� ��Ÿ�� ��ġ
*/
select instr('hi!! good man', 'man') from dual;
/*
	instr(������,'�˻��� ����', ������ġ, �˻��� Ƚ��) 
	instr('oh! hi!! my girl!! hi!! feel so good!', 'o',3,2);
*/
select instr('oh! hi!! my girl!! hi!! feel so good!', 'o',3,2) from dual;
select * from emp;
/* �Ի����� 12���� �����͸� �̸��� �Ի����� ����ϼ��� instr()�� Ȱ�� */

select ename, hiredate
from emp
where instr(substr(hiredate,4,2),'12')>0;















 






