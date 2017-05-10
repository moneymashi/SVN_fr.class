/* ���� 
	 �μ���ġ�� ����� ���� �Ʒ� �������� ����ϼ��� 
	 �μ���ġ ��� ��...
	 
*/
 select loc ,count(ename) from emp, dept  
  group by loc ;
  
  /* ���� 
student10 ���̵� , �̸� 
create table student10( id varchar2(10) premary key, ename char(6))

studentPoint ���̵� ,����, ���� 
create table studentPoint( id varchar2(10) premary key,subject varchar(10),point number(10))

gradeCheck ��������lopoing, �ְ�����hipoint, �������(A~F)

create table gradeCheck ( lopoing number(10), hipoint (10), grade char (3))

1) ���̵� �����ؼ� (equal join)
	�̸� ���� ���� ���
	select ename, subject , point from student10 ,studentPoint
	where student10.id = studentPoint.id;
	
2) ������ �����ؼ�(not equal join)
	���� ���� �������
select 	a.subject, a.point, b.grade from studentPoint a ,gradeCheck b 
where a.point between b.lopoing and b.hipoint

3) student10 studentPoint gradeCheck ������ �Ͽ� 
�̸�, ���� , �������

select 	a.ename, b.subject, c.grade from student10 a,studentPoint b ,gradeCheck c
where b.point between c.lopoing and c.hipoint
 and a.id  = b.id 

*/



--student10 ���̵� , �̸� 
create table student10( id varchar2(20) primary key not null , ename varchar2(20) not null);

insert into student10 ( id,ename) values ('aaa','ȫ��');
insert into student10 ( id,ename)values ('bbb','�ű�');
insert into student10  ( id,ename)values ('ccc','���');
insert into student10  ( id,ename)values ('ddd','ȫ�浿');
insert into student10  ( id,ename)values ('eee','��浿');
alter table student10 modify ( ename varchar2(20));
select * from student10;
--studentPoint ���̵� ,����, ���� 
create table studentPoint( id varchar2(10) primary key not null REFERENCES student10(id),
subject varchar(10),point number(10));

insert into studentPoint (id, subject,point) values('aaa','����','90');
insert into studentPoint (id, subject,point) values('bbb','����','90');
insert into studentPoint (id, subject,point) values('ccc','����','90');
insert into studentPoint (id, subject,point) values('ddd','����','90');
insert into studentPoint (id, subject,point) values('eee','����','90');
select * from studentPoint;

update  studentPoint  set point ='0' where id ='eee';
--gradeCheck ��������lopoing, �ְ�����hipoint, �������(A~F)
--0,5,6,7,8,9
create table gradeCheck ( lopoing number(10), hipoint number(10),
 grade varchar2(3) check(grade in('A','B','C','D','E','F')));
 select *from gradeCheck;
 alter table gradeCheck modify ( grade varchar2(20));
insert into gradeCheck (lopoing, hipoint,grade) values(90,100,'A');
insert into gradeCheck (lopoing, hipoint,grade) values(80,89,'B');
insert into gradeCheck (lopoing, hipoint,grade) values(70,79,'C');
insert into gradeCheck (lopoing, hipoint,grade) values(60,69,'D');
insert into gradeCheck (lopoing, hipoint,grade) values(50,59,'E');
insert into gradeCheck (lopoing, hipoint,grade) values(0,49,'F');

--1) ���̵� �����ؼ� (equal join)
--	�̸� ���� ���� ���
	select ename, subject , point from student10 ,studentPoint
	where student10.id = studentPoint.id;
	
--2) ������ �����ؼ�(not equal join)
--	���� ���� �������
select 	a.subject, a.point, b.grade from studentPoint a ,gradeCheck b 
where a.point between b.lopoing and b.hipoint;

--3) student10 studentPoint gradeCheck ������ �Ͽ� 
--�̸�, ���� , �������

select 	a.ename, b.subject, c.grade from student10 a,studentPoint b ,gradeCheck c
where b.point between c.lopoing and c.hipoint
 and a.id  = b.id ;
 
 
 
 /*
����) outer join, group  �� Ȱ���Ͽ�  
	�μ���  �ο��� Ȯ���ҷ��� �Ѵ�.
	�Ʒ��� �������� ����ϼ��� �ο��� ���� ���� 0���� ǥ��
	�μ��� �ο�
*/
select b.deptno, b.dname , count(a.ename) from emp a , dept b
where a.deptno(+) = b.deptno group by b.dname,b.deptno;
