/*
���� // �Ϸ�
1. �Ի��� �б⺰�� ���� ���� ������ �޴� ��� ���
2. ������ 3000�̻��� ��� �߿�, ���(���̺�Ȱ�뵵 ����)�� �����
	�ش� ��޺� �ְ� ������ �޴� ����� �̸�, ���, ������ ���
*/
select sal, ename,floor(to_number(to_char(hiredate,'MM'))/4)+1 �б�
from emp
where (floor(to_number(to_char(hiredate,'MM'))/4)+1,sal) in (select floor(to_number(to_char(hiredate,'MM'))/4)+1,max(sal)
			from emp
			group by floor(to_number(to_char(hiredate,'MM'))/4)+1 );

create table grade02(grade char(4),
					losal number(5,0),
					hisal number(5,0)
);

insert into grade02 values('A',5000,5999);
insert into grade02 values('B',4000,4999);
insert into grade02 values('C',3000,3999);


select * from grade02;

select a.ename, b.grade, a.sal
from (select * from emp where sal>=3000) a, grade02 b
where a.sal between b.losal and b.hisal;



/*
���� // �Ϸ�
1. �μ���ȣ�� 30�� �����, ���� ���߿� �Ի��� ������� ������ ���� ��� ���
2. ������ 'SALESMAN'�� ������� �޴� �޿��� �ּ� �޿����� ���� �޴� ������� �̸��� �޿��� ����ϵ�
�μ���ȣ�� 20���� ����� �����Ѵ�(any�������̿�)
*/

select *
from emp
where deptno=30 and sal > (select sal from emp where hiredate=(select max(hiredate) from emp));


select *
from emp
where deptno=30 and sal>=(select sal from emp where hiredate>=all(select hiredate from emp));

select ename, sal
from (select * from emp where deptno!=20)
where sal >= any(select sal from emp where job='SALESMAN');





/*
���� // �Ϸ�
������ ���� ������ ���̺��� �����ϼ���
�̸�(name) ��ȣ(no) �Ի���(create)-���ڿ� ���ر��رٹ�����
                      @@@@��@@��@@��        @@@@
new_emp�� ����
*/

select * from new_emp;
drop table new_emp;
select 2017-(to_number(to_char(hiredate,'YYYY'),'999999')) from emp;
select to_char(hiredate,'YYYY"��"MM"��"DD"��"') from emp;


create table new_emp
as select ename name, empno no, '                        ' create01,'   ' year01
from emp
where 1=3;

insert into new_emp
			select ename, empno, to_char(hiredate,'YYYY"��"MM"��"DD"��"') create01, 2017-to_number(to_char(hiredate,'YYYY'),'99999') year01
			from emp;






