/*
���� 
������������ �ο� ���� üũ�ϼ���.
1000�̸� 		�����(�ְ�ġ, ����ġ, ���ġ)
~2000�̸�
~3000�̸�
~4000�̸�
~5000�̸�
~6000�̸�
*/
select (floor(sal/1000)+1)*1000 "����������" , count(*) "�����", max(sal)"�ְ�ġ",
 min(sal) "����ġ", avg(sal) "���ġ" from emp
group by (floor(sal/1000)+1)*1000
order by (floor(sal/1000)+1)*1000;

select * from emp;
/*
���� 
	�μ���ġ�� ����� ���� �Ʒ� �������� ����ϼ���. 
	�μ���ġ �����
*/
select * from dept;
select * from emp;
select loc, count(*)
from dept a,emp b
where a.deptno=b.deptno
group by loc;

create table student10(sid varchar2(10), sname varchar2(10)); 
insert into student10(sid, sname) values('AAA','����');
insert into student10(sid, sname) values('BBB','������');
insert into student10(sid, sname) values('CCC','�ڹڹ�');
insert into student10(sid, sname) values('DDD','������');
create table studentPoint(sid varchar2(10), subject varchar2(10),
							score number(3));
 
insert into studentPoint values('AAA','����','70');
insert into studentPoint values('BBB','����','80');
insert into studentPoint values('CCC','����','88');
insert into studentPoint values('DDD','����','95');

create table gradeCheck(loPoint number(3), hiPoint number(3),
 grade varchar2(1) check(grade in('A','B','C','D','F')) );

insert into gradeCheck values('91','100','A');
insert into gradeCheck values('81','90','B');
insert into gradeCheck values('71','80','C');
insert into gradeCheck values('61','70','D');
insert into gradeCheck values('0','60','F');

select * from gradeCheck;
select * from student10;
select * from studentPoint;
--grade varchar2(1) check(grade in('A','B','C','D','F')) );
/*
����
student10 ���̵�, �̸�
studentPoint ���̵�, ����, ���� 
gradeCheck �������� lopoint, �ְ����� hipoint, �������(A~F)
1) ���̵� �����ؼ�(EQUAL JOIN)
	�̸�	����	���� ���
2) ������ �����ؼ� (not equal join)
	����		����	 	�������

3) student10 studentPoint gradeCheck ������ �Ͽ�..
�̸� ���� �������
*/
select * from student10 a,studentPoint b
where a.sid=b.sid;
select t.subject, t.score, g.grade from studentPoint t, 
		gradeCheck g
where t.score between g.lopoint and g.hipoint;

select s.sname, t.subject, g.grade from studentPoint t, 
		gradeCheck g, student10 s
where t.score between g.lopoint and g.hipoint
and s.sid=t.sid;
/*
����) outer join, group�� Ȱ���Ͽ� 
	�μ��� �ο��� Ȯ���Ϸ��� �Ѵ�.
	�Ʒ��� �������� ����ϼ���. �ο��� ���� ���� 0���� ǥ��.
	�μ���	�ο�		
*/
select * from dept;
select dname, count(ename)from dept d,emp e
where e.deptno(+)=d.deptno
group by dname;


