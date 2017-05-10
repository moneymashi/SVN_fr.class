/*
����
���� �������� �ο����� üũ
1000�̸�		�����(�ְ�ġ,����ġ,���ġ)
~2000�̸�
~3000�̸�
~4000�̸�
~5000�̸�
~6000�̸�

*/
select * from emp;
select trunc(sal,-3)+1000 �̸�, count(*), max(sal), avg(sal)
from emp
group by trunc(sal,-3)
order by trunc(sal,-3) desc;

/*
����
�μ���ġ�� ����� ���� �Ʒ� �������� ���
�μ���ġ �����
*/
select * from dept;

select loc, count(*)
from emp a, dept b
where a.DEPTNO = b.DEPTNO
group by loc;


/*
����
student10		���̵�, �̸�
studentPoint	���̵�, ����, ����
gradeCheck		��������lopoint, �ְ���hipoint, �������(A~F)
1) ���̵� �����ؼ�(equal join)
	�̸� ���� ���� ���
2) ������ �����ؼ�(not equal join)
	���� ���� �������
3) student10 studentPoint gradeCheck �����Ͽ�
	�̸� ���� �������
*/

create table gradeCheck(
	grade char(2),
	lopoint number(3,0),
	hipoint number(3,0)	
	);
	
insert into gradeCheck values('A',90,100);
insert into gradeCheck values('B',80,89);
insert into gradeCheck values('C',70,79);
insert into gradeCheck values('D',60,69);
insert into gradeCheck values('F',0,59);


select * from gradeCheck;
select s.name, p.subject01, p.point
from student10 s, studentPoint p
where s.id=p.id;

select p.subject01, p.point, g.grade
from studentPoint p, gradeCheck g
where p.point between g.lopoint and g.hipoint;

select s.name, p.subject01, g.grade
from student10 s, studentPoint p, gradeCheck g
where s.id=p.id and p.point between g.lopoint and g.hipoint;







/*
����
outer join, group�� Ȱ���Ͽ� �μ��� �ο��� Ȯ���Ϸ��� �Ѵ�
�Ʒ��������� ����Ͻÿ� �ο��� ���� ���� 0���� ǥ��
�μ��� �ο�
*/

select * from emp;
select * from dept;
select d.dname, count(e.deptno)
from emp e, dept d
where e.deptno(+)=d.deptno
group by d.dname;














