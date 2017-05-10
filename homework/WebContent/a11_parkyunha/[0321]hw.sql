/*
����1
������������ �ο����� üũ�ϼ���.
1000�̸�	�����(�ְ�ġ, ����ġ, ���ġ)
~2000�̸�
~3000�̸�
~4000�̸�
~5000�̸�
~6000�̸�

*/
select * from emp;

select 
	trunc(sal, -3)+1000||' �̸�' ��������, 
	count(*) �����, 
	max(sal) �ְ�ġ, 
	min(sal) ����ġ, 
	avg(sal) ���ġ
from emp
group by
	trunc(sal, -3)
order by 
	trunc(sal, -3);

/*
����2
�μ���ġ�� ����� ���� �Ʒ� �������� ����ϼ���.
�μ���ġ	�����
[ ORACLE ] ORA-00979: GROUP BY ǥ������ �ƴմϴ�
select �� �˻��ϴ� column �� �����Լ� ����� ��� group by �÷����� ǥ�õǾ�� �Ѵ�.
*/
select 
	d.loc �μ���ġ, 
	count(e.ename) ����� 
from 
	emp e,
	dept d
where 
	e.deptno = d.deptno
group by 
	d.loc;

/*
����3
student id, name
studentPoint id, subject, score
gradeCheck minpoint, maxpoint, grade(A~F)
1) ���̵� �����ؼ�(equal join)
	�̸� ���� ���� ���
2) ������ �����ؼ�(not equal join)
	���� ���� �������
3) STUDENT10, STUDENTPOINT, gradeCheck ������ �Ͽ�
	�̸� ���� ������� 
*/
create table STUDENT10 (
	id		varchar2(10) primary key,
	name	varchar2(20)
);

create table STUDENTPOINT (
	id		varchar2(10) references studen10(id),
	subject	varchar2(20),
	score	number(3)
);

create table GRADECHECK (
	minpoint	number(3),
	maxpoint	number(3),
	grade		varchar2(1)
);
-- 1)
select 
	s.name, 
	p.subject, 
	p.score
from 
	student10 s, 
	studentpoint p
where 
	s.id = p.id;
-- 2)
select 
	p.subject, 
	p.SCORE, 
	c.GRADE
from 
	studentpoint p, 
	gradecheck c
where 
	p.score between c.MINPOINT and c.MAXPOINT
order by 
	p.score desc;
-- 3)
select 
	s.NAME, 
	p.SUBJECT, 
	c.GRADE
from 
	student10 s, 
	studentpoint p, 
	gradecheck c
where 
	s.id = p.id
	and p.score between c.MINPOINT and c.maxpoint;

-- Dummy Data
insert into student10 values (1,'park');
insert into student10 values (2,'yun');
insert into student10 values (3,'ha');
insert into student10 values (4,'zzang');

insert into gradecheck values (0, 50, 'F');
insert into gradecheck values (51, 60, 'E');
insert into gradecheck values (61, 70, 'D');
insert into gradecheck values (71, 80, 'C');
insert into gradecheck values (81, 90, 'B');
insert into gradecheck values (91, 100, 'A');

insert into studentpoint values (1, 'math', 100);
insert into studentpoint values (1, 'korean', 90);
insert into studentpoint values (2, 'math', 80);
insert into studentpoint values (2, 'korean', 70);
insert into studentpoint values (3, 'math', 60);
insert into studentpoint values (3, 'korean', 50);
insert into studentpoint values (4, 'math', 40);
insert into studentpoint values (4, 'korean', 30);

/*
����4
outer join, group�� Ȱ���Ͽ� �μ��� �ο��� Ȯ���Ϸ��� �Ѵ�.
�̷��� �������� ����ϼ���. �ο��� ���� ���� 0���� ǥ��
�μ���	�ο�		
*/
select * from emp;
select * from dept;
select
	d.DNAME �μ���,
	count(e.deptno) �ο�
from 
	emp e, 
	dept d
where 
	e.DEPTNO(+) = d.DEPTNO
group by 
	d.DNAME;







