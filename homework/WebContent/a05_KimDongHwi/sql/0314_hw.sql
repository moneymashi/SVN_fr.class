select '1��. ' ||ename|| '�� ���� ������' ||sal*1.1|| '���� �ε�, �ֱٿ� 10% �λ�� �ݾ��̸�, �۳� ������ ' ||sal|| '���� �̾����ϴ�' from emp;
select '2��. ' ||ename|| '�� �Ի����� ' ||hiredate|| '�Դϴ�.' from emp;
select '3��. ��å�� ' ||job|| '�� ' ||ename|| '�� �μ���ȣ�� ' ||deptno|| '�Դϴ�.' from emp;
select '4��. ' ||ename|| '���� ���� ������ ���ʽ��� �ջ� �ݾ��� ' 
		||(nvl(comm,0)+sal)|| '�Դϴ�.' from emp; 
		