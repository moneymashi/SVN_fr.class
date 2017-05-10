
/*****1������*****/
select trunc(sal,-3)+1000||'���� �̸�' "����", count(*) "�����", max(sal) "�ְ�ġ", min(sal) "����ġ", avg(sal) "���ġ"
from emp group by trunc(sal,-3)+1000 ;

/*****2������*****/
select loc "�μ���ġ", count(*) "�����" from emp e,dept d where e.deptno=d.deptno
group by loc; 

select * from dept;

/*****3������*****/

/**���̺� ����**/
create table student10(
	id varchar2(20) primary key,
	name varchar2(15) not null
);
create table studentPoint(
	id varchar2(20) references student10(id),
	subject varchar2(10),
	point number(4) primary key
);
create table gradeCheck(
	point number(4) references studentPoint(point),
	lopoint number(4), hipoint number(4), grade char(1) check (grade in('A','B','C','D','F'))
);

/*������ �Է�*/
insert into student10 values ('test','ȫ�浿');
insert into studentPoint values ('test','����','50');
insert into gradeCheck values ('50','0','100','D');

/*���̺� Ȯ��*/
select * from student10 ;
select * from studentPoint ;
select * from gradeCheck ;

/*1) ���̵� �����ؼ�(equal join) 
�̸� ���� ���� ���*/
select name "�̸�", subject "����", p.point "����" from student10 s, studentPoint p
where s.id=p.id;

/*2) ������ �����ؼ�(not equal join)
	���� ���� �������***/
select subject "����", p.point "����", grade "�������" from studentPoint p, gradeCheck g
where p.point = g.point;

/*3) student10 studentPoint gradeCheck ������ �Ͽ�
	�̸� ���� �������***/
select name "�̸�", subject "����", grade "�������" from student10 s, studentPoint p, gradeCheck g
where s.id=p.id and p.point=g.point;

/***4������***/
select dname "�μ���", count(ename) "�ο�" from emp e, dept d
where e.deptno(+)=d.deptno group by dname ;

select * from emp;
select * from dept;
/*
***1�� ����
������������ �ο����� üũ�ϼ���
1000�̸�		�����(�ְ�ġ, ����ġ, ���ġ)
~2000�̸�
~3000�̸�
~4000�̸�
~5000�̸�
~6000�̸�

***2������
�μ���ġ�� ����� ���� �Ʒ� �������� ����ϼ���
	�μ���ġ 	�����.

***3������
student10 ���̵�, �̸�
studentPoint ���̵�, ����, ����
gradeCheck �������� lopoint, �ְ����� hipoint, �������(A~F)
1) ���̵� �����ؼ�(equal join) �̸� ���� ���� ���
2) ������ �����ؼ�(not equal join)
	���� ���� �������
3) student10 studentPoint gradeCheck ������ �Ͽ�
	�̸� ���� �������
	
***4������	
outer join, group�� Ȱ���Ͽ�
	�μ��� �ο��� Ȯ���Ϸ����Ѵ�.
	�Ʒ��� �������� ����ϼ���. �ο��� ���� ���� 0���� ǥ��
	�μ��� �ο�
*/