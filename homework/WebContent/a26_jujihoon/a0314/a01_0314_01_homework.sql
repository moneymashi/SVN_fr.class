select ename||'�� ���� ������ '||sal * 1.05||'�����ε�, �ֱٿ� 5% �λ�� �ݾ��̸�, �۳� ������ '||sal||'�����̾����ϴ�.' from emp;
select ename||'�� �Ի����� '||hiredate||' �Դϴ�.' from emp;
select '��å�� '||job ||'�� '||ename ||'��(��) �μ���ȣ�� '||deptno||'�Դϴ�.' from emp;
select ename||'���� ���� ������ ���ʽ��� �ջ���� '||(nvl(comm,0) + sal)||'�Դϴ�.' from emp; 