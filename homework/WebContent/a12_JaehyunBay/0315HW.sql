--- a03-


/* 
	sal �� �����̶� �ҋ�, �̴� �޿���(1/13)�� ó���Ͻÿ�, �� �̴��� ���ʽ��� �ִ� ���Դϴ�.
  	 ��³���: ��� ���� �̴ޱ޿�, ���ʽ�, �ѱ޿���(�޿�+ ���ʽ��� 10������ �ݿø�ó��)
 */
 
	select empno, sal, round(sal/13 , 2), comm, (round(sal/13 , 2) + round( nvl(comm, 0) , -1)) �հ� from emp;


/*
 	����: sal�� �������� ..
	1000�̸�: 10% ���ʽ�
	~2000�̸� - 20% ���ʽ�.
	~3000�̸� - 30% ���ʽ�
	~5000�̸� - 40% ���ʽ�
 	5000�̻� - 50% ���ʽ�.
	�����ϱ���޴�. �Լ��� Ȱ���ؼ�, �Ʒ������� ó���Ͻÿ�.
	��� �̸� ���� ���ʽ�(%) ���ʽ�.
 */
 	select * from emp;
	select empno, ename, sal, (nvl(sal,0)/1000) "����ó��", 
		((floor(nvl(sal,0)/1000)+1)*10) "���ʽ�%", 
		(sal/13) "����" ,  
		(sal/13)* (1+((floor(nvl(sal,0)/1000)+1)*10)/100) "���ʽ��ջ�" from emp;		
	
/*
	����: 
	����� �μ��������� 1���� 2������ ����� ü����ȸ�� �ϱ���ߴ�.
	�μ���ȣ�� 10, 30 => 1��
	�μ���ȣ�� 20, 40 => 2��
	���� ������ ���������� ����ϼ���.
	�μ���ȣ �����ȣ �̸� ����.
*/
	select deptno, empno, ename, round(mod((-deptno/10),2) , 0)+2 ||'��' ����ȣ  from emp;
	

/*
 	����;
		�Լ��� �̿��ؼ� ������ ������ ����Ͻÿ�.
		@@@�� �Ի��� @@�� @@�� @@���̸�, ���翬���� @@@�Դϴ�.
		col�� empinfo
*/

	select '' ||ename|| '�� �Ի����� ' 
		|| substr(hiredate,1,2) || '�� ' 
		|| substr(hiredate,4,2) || '�� ' 
		|| substr(hiredate,7,2) || '���̸�, ���翬���� $'
		|| sal || '�Դϴ�.' empinfo from emp;


/*	
	����:
		substr�� Ȱ���� job�� MAN���� ������ ������ ���!		
 */
	select job, ename from emp where substr(job, -3,3) ='MAN';
 
 /*


/*
 	����: �Ի����� 12���� �����͸� �̸��� �Ի����� ����ϼ���. instr()�� Ȱ��!!!
 */

	 select hiredate, instr(hiredate, '12',3) from emp
		where substr(hiredate , instr(hiredate, '12',3) ,2) = '12'
 	 	and NOT substr(hiredate, 7,2)= '12' ;    -- ������ ���� ������ ���.
 
 	select hiredate from emp where instr(hiredate, '12' ,1, 1) = '4'  --��ť�� ��!!!
 
