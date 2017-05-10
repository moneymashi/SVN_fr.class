/*
		����1) 6������ ���ϱⰣ���� �޿��� 70%�� �����ϱ�� �ߴ�
		����� ���ϱⰣ��������� ����ϰ�, 6���� ���� �޿��� ������ ����ϼ���
		���޿� - sal/13
		���ϱⰣ - ���޿��� 70%
		���ϱⰣ���޿��Ѿ� - ���ϱⰣ6������ �޿� �Ѿ��� 10���� �����ؼ� ���
		
		�����ȣ ����� �Ի��� ���ϱⰣ������� ���ϱⰣ���޿��Ѿ�(10��������)
	*/
		select empno "�����ȣ", ename "�����", hiredate "�Ի���", add_months(hiredate,6) "���ϱⰣ�������", trunc(sal*1/13*0.7*6,-2) "���ϱⰣ���޿�" from emp;
		
		/*
		����2.
		�޿���� ... 3�ܰ� �޿����� ����� ����ϼ���
			1�ܰ� : ��� 20��
			2�ܰ� : ��� ������ ��
			3�ܰ� : ������ 10��
			��� �Ի��� ù����1 ù����2 ù����3
	*/
		select ename "���", hiredate "�Ի���", to_date(substr(hiredate,1,6)||'20') "ù����1", last_day(hiredate) "ù����2", last_day(add_months(hiredate,1)) "ù����3" from emp;
		
	/*
		����3.
			�ٹ��������� ���� ���� ���ʽ� ����
			���� ������ ���� ~ ���� �ֱٿ� �Ի��� ������
			1/3=30%, 1/3=20%, 1/3=10%
			���, �Ի���, ���糯¥(@@/@@/@@ AM @@�� @@�� @@��), �ٹ�������, ���ʽ� 
	*/
	
	select count(ename) from emp; -- 14 ��  ---> 5/5/4
	select * from emp order by hiredate; -- 1980-12-17 ~ 1981-04-02 / 1981-05-01 ~ 1981-11-17 / 1981-12-03 ~ 1983-01-12
	
	select ename "���", 
		to_char(hiredate,'YY/MM/DD AM HH"�� "MI"�� "SS"��"') "�Ի���", 
		to_char(sysdate,'YY/MM/DD AM HH"�� "MI"�� "SS"��"') "���糯¥", 
		floor(months_between(sysdate,hiredate)) "�ٹ�������",
		case 
			when hiredate<'1981/04/02' then sal*0.3
			when hiredate<'1981/11/17' then sal*0.2
			when hiredate<'1983/01/12' then sal*0.1
		else 0
		end "���ʽ�"
	from emp;
		
		/*
		����.
		��ȸ���� 1981�� 01�� 01�� ���� 1982�� 12�� 12�� ������ ������ ��, �μ��� 30�� �����͸� ��ȸ�Ͽ�, 
		
		�����(10�ڸ�-�տ�#��ȣó��)
		��å(10�ڸ�-������ �ڿ� '-'ó��)
		�Ի���(@@�� @@�� @@�� @���� 24�� @@�� @@��)
		����(####1,600.0)	�� ��Ÿ������.
		
	*/
		select lpad(ename,10,'#'), rpad(job,10,'-'), to_char(hiredate,'YY"��" MM"��" DD"��" DY"����" HH24"��" MI"��" SS"��"'),
		lpad(to_char(sal,9999.9),11,'#')
		from emp 
		where hiredate between to_date('19810101','YYYY-MM-DD') and to_date('19821212','YYYY-MM-DD') and deptno=30;
		
	/*
	����.
		�̸� �����ڹ�ȣ ���ʽ� ==> �����Ͱ� ���� ���� �����ڹ�ȣ ��� '�ְ���', ���ʽ��� '0' ǥ��
	*/
		select ename "�̸�",
		decode(nvl(mgr,0),0,'�ְ���',mgr) "�����ڹ�ȣ" ,		
		nvl(comm,0) "���ʽ�" 
		from emp;
		
	/*
	����. ������ ���� ���ü�踦 �������� �Ѵ�.
			decode�� Ȱ���ؼ�
						 1000 �̸� 	F��� 		������ 3%
				1000 - 2000 �̸� 	E���		������ 5%
				2000 - 3000 �̸� 	D���		������ 7%
				3000 - 4000 �̸� 	C���		������ 4%
				4000 - 5000 �̸� 	B���		������ 3%
				5000 - 6000 �̸� 	A���		������ 2%
			
			�̸� �μ� ���� ������� ������ �Ѿ�(����+������) 
	*/
	decode(substr(sal),)
	
	select 
		ename "�̸�", deptno "�μ�", sal "����",
		decode(substr(sal,1,1),1,'E���',2,'D���',3,'C���',4,'B���',5,'A���','F���') "�������",
		decode(substr(sal,1,1),1,sal*0.05,2,sal*0.07,3,sal*0.04,4,sal*0.03,5,sal*0.02,sal*0.03) "������",
		decode(substr(sal,1,1),1,sal+sal*0.05,2,sal+sal*0.07,3,sal+sal*0.04,4,sal+sal*0.03,5,sal+sal*0.02,sal+sal*0.03) "������"
	from emp;
	
				/*
		����.
			�Ի�б����ǥ��(1/4,2/4,3/4,4/4) �Ի�б⸦ ǥ��
			�����ȣ, �̸�, �Ի�(��/��), �Ի�б�
		*/
		
		select 
			empno "�����ȣ", ename "�̸�", to_char(hiredate,'YY"��" MM"��"') "�Ի�(��/��)",  
			case
				when to_number(substr(hiredate,4,2),99) between 1 and 3 then '1��б�'
				when to_number(substr(hiredate,4,2),99) between 4 and 6 then '2��б�'
				when to_number(substr(hiredate,4,2),99) between 7 and 9 then '3��б�'
				when to_number(substr(hiredate,4,2),99) between 10 and 12 then '4��б�'
			end "�Ի�б�"
		from emp; 
