/*
��������
1. emp�߿� �޿��� 2000�̸��� �Ǵ� ��� ���� �߿� ����� �޿��� ����϶�
2. ������ ���ʽ��� �ѻ� �޾��� 1500�̸��� ����� �̸�, ����, ���ʽ�, �ջ���� ����ϼ���.
3. mgr�� null�� ����� job�� �̸� ������ ����ϼ���.
4. job�� clerk�� ��� �� deptno�� 30�� ����� �̸�, ��å, �μ���ȣ�� ����ϼ���.
5. ������ 2000���� 3000 ���̿� �ִ� ����� �μ���ȣ, �̸�, ������ ����ϼ���.
###ȥ�� �ذ��ϰ�, �ذ����� ���ϴ� ������̳�, ����������� ������ �޾� �ذ��ϰ�
�ٽ� ���ο� ������ �޾Ƽ� ȥ�� ������ �ذ��� �Ŀ� ����
*/


select empno "���", sal "�޿�" from emp where sal<2000;
select ename "�̸�", sal "����", comm "���ʽ�", sal+nvl(comm,0) "�ջ��" 
from emp 
where sal+nvl(comm,0)<1500;
select job, ename "�̸�", sal "����" from emp where mgr is null;
select ename "�̸�", job "��å", deptno "�μ���ȣ" from emp where job='CLERK';
select deptno "�μ���ȣ", ename "�̸�", sal "����" from emp where 2000>=sal and sal<=3000;