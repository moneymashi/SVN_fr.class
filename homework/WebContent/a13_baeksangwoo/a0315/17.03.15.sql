--����1 : ����� �μ��������� 1���� 2������ ����� ü����ȸ�� �ϱ�� �ߴ�.
--�μ���ȣ�� 10, 30 --> 1��
--�μ���ȣ�� 20, 40 --> 2������ ������ ������ ���� ����ϼ���.
--�μ���ȣ  �����ȣ  �̸�   ��

select deptno, empno, ename, case when deptno in (10,30) then 'team1' when deptno in (20,40) then 'team2' end as team from emp;

--����2 : �Լ��� �̿��Ͽ� ���� ������ ����ϼ���.
--@@@��	�Ի���	@@�� @@�� @@�� �̸�, ���� ������ @@@ ���� �ް� �ֽ��ϴ�.

select ename||'�� �Ի���'||substr(hiredate,1,2)||'��'||substr(hiredate,4,2)||'��'||
substr(hiredate,4,2)||'�� �̸� ���� ������ '||sal||'������ �ް� �ֽ��ϴ�.' from emp;

--����3 : substr�� Ȱ���Ͽ� JOB�� MAN���� ������ �����͸� ����ϼ���

select * from emp where substr(job,length(job)-2,3) = 'MAN';

--����4 : �Ի����� 12���� �����͸� �̸��� �Ի����� ����ϼ��� instr()Ȱ��
select ename, hiredate from emp where instr(hiredate,'12') = 4;
