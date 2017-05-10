/*a08_join.sql*/
select count(*)
from emp, dept; -- (emp���̺�)  X  (dept���̺�)
-- ũ�ν� ����
select count(*)
from emp;
/


select count(*) from dept;
select * from emp;
select * from dept;
/*
equal join : �ΰ��̻� ���̺��� �����̺� �ҼӵǾ� �ִ� �÷��� �����Ͱ� ���� ���� ���� ��,
�����Ͽ� ó���� �� �ִ� join�� ���Ѵ�.
����  
	select ǥ�����÷�
	from ���̺�1, ���̺�2
	where ���̺�1.�����÷� = ���̺�2.�����÷�
	�����÷� : ���� �����Ͱ� �ִ� �÷�..
*/
select * 
from emp, dept
where emp.deptno = dept.deptno; 
-- ����� �̸��� ��å, �ҼӺμ����� ����ϼ���..
select ename, job, dname
from emp, dept
where emp.DEPTNO = dept.DEPTNO;
select * from emp;
-- ex) dept�� �����Ͽ� �����, �μ���ġ(loc)�� ���
select * from dept;
select ename, loc
from emp, dept
where emp.DEPTNO = dept.DEPTNO;
-- Ȯ�ο���) ���ʽ��� �ִ� ����� �̸��� �μ����� ����ϼ���!!
select * from emp;
select ename, dname
from emp a, dept b
where a.DEPTNO = b.DEPTNO
and a.comm is not null;
/*����
	�μ���ġ�� ����� ���� �Ʒ� �������� ����ϼ���..
	�μ���ġ   ��� ��..
*/
select loc, count(*)
from emp e, dept d
where e.deptno = d.deptno
group by loc;

select * from emp;
/*
non-equi join
���̺� ���̿� �÷��� ���� ���������� ��ġ���� ���� �� ����ϴ� �������� '='�� ������ �����ڸ� ����Ѵ�.
*/
select * from salgrade;
-- �޿� ����� 5���� ������ �� ����� ǥ���Ͻÿ�..
--  where sal between [losal] and [hisal]
-- �̸��� ���� ��������� ����ϼ���..
--  ���̺� alias ����ϱ� :���̺��� �÷��� ���� �̸��� ������ �ǹ̰� ������
-- 	   ���� �̸��� ������ �����ϱ����� ���̺��[����]alias�� Ȱ���Ѵ�.
--    ���̺�alias.�÷���
--    ����, ������ �÷��� ���� ����, �������� ���� ����ϴ� ��쵵 �ִ�.
select e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal BETWEEN s.LOSAL and s.HISAL;
/* ����
student10  ���̵�, �̸� 
studentPoint ���̵�, ����, ����
gradeCheck ��������lopoint, �ְ�����hipoint, �������(A~F)
1) ���̵� �����ؼ�(equal join)
	�̸� ���� ����  ���
2) 	������ �����ؼ�(not equal join)
    ����  ���� �������
3) 	student10 studentPoint gradeCheck ������ �Ͽ�..
   �̸�  ����  �������
*/
CREATE TABLE student_main
(
   ID VARCHAR2(20) PRIMARY KEY,
   PASS VARCHAR2(20),
   NAME  VARCHAR2 (50)
);

CREATE TABLE STUDENT_POINT(
	ID VARCHAR2(20) REFERENCES STUDENT_MAIN(ID),
	subject VARCHAR2(50),
	POINT NUMBER
);
drop table gradecheck;
create table gradecheck(
   ptGRADE   varchar2(10),
   lopt   NUMBER,
   hipt   NUMBER	
);
insert into gradecheck values('A����',90,100);
insert into gradecheck values('B����',80,89);
insert into gradecheck values('C����',70,79);
insert into gradecheck values('D����',60,69);
insert into gradecheck values('F����',0,59);

SELECT * FROM STUDENT_MAIN;
SELECT * FROM STUDENT_POINT;
INSERT INTO STUDENT_MAIN VALUES('C001001','7777','ȫ�浿');
INSERT INTO STUDENT_MAIN VALUES('C001002','7777','�ű浿');
INSERT INTO STUDENT_MAIN VALUES('C001003','7777','���浿');
/*
outer join
�ΰ��� ���� ���迡 �ִ� ���̺� �ּ�, ���� �Ǵ� ���ʴ� 
������ �������� �ʾƵ� ������ ����� ����ؾ� �ϴ� ��쿡 Ȱ��Ǵ� �����̴�.
where �����Ͱ� ���� ���̺�.�÷���(+) = �����Ͱ� �ִ� ���̺�.�÷���
*/
select * from dept;
select distinct deptno from emp;
-- �μ���ȣ���� ��Ī�Ǵ� ����̸��� ����ϵ�, 
--    �̸��� ������ ���ٴ� ǥ�ð� �ʿ�
-- 
--�μ���ȣ, �μ���,  �̸�
select d.deptno, d.dname, nvl(e.ename,'�ο�����') ename
from emp e, dept d
where e.deptno(+) = d.deptno
order by e.deptno;
/*
����) outer join, group�� Ȱ���Ͽ� 
	  �μ���  �ο��� Ȯ���ҷ��� �Ѵ�.
	  �Ʒ��� �������� ����ϼ���  �ο��� ���� ���� 0���� ǥ��
	  �μ���  �ο�
*/
/*
self join : �� �״�� �ڱ� �ڽŰ� ������ �δ� ���� ���Ѵ�.
from���� ���� �̸��� ���̺��� �����Ͽ�, �ٸ� ���̺��� ��ó�� �ν��ؼ�
�����Ͽ� �� ������� ����ϴ� ���� ���Ѵ�.
select *
from ���̺�� alias01, �������̺�� alias02
where alias01.�����÷� = alias2.�����÷�
ex) ������̺�(emp)����  �����  �����ڸ��� ����ϼ���..
*/
select work.ename, work.mgr,manager.ename 
from emp work, emp manager
where work.mgr = manager.empno;
/*
������ join���� ���� ���̺� �����(self join)
1. ������ �����Ѵ�..
	id�� ����id�� �Է��ϴ� key�� �����.
	numid, parentnumid, role01, name
	���̵�, �������̵�, ����, �̸�
2. ���̺��� �����Ѵ�.
	create table family(
		numid number,
		parentnumid number,
		role01 varchar2(100),
		name varcahr2(500)
	);	
3. �����͸� �Է��Ѵ�.(���� �������� ������ ������ ���� ������ �Է�ó��)
	insert into family values(1,0,'�Ҿƹ���','ȫ�浿');
	insert into family values(2,1,'�ƹ���','ȫ����');
	insert into family values(3,2,'�Ƶ�','ȫ��ȣ');
	insert into family values(4,1,'����','ȫ��ȣ');
	
	
4. �Էµ� ������ ������ ���������� �Ǿ� �ִ��� Ȯ���Ѵ�.
	- ��ȸ ó��..
*/
	create table family(
		numid number,
		parentnumid number,
		role01 varchar2(100),
		name varchar2(500)
	);	
	insert into family values(1,0,'�Ҿƹ���','ȫ�浿');
	insert into family values(2,1,'�ƹ���','ȫ����');
	insert into family values(3,2,'�Ƶ�','ȫ��ȣ');
	insert into family values(4,1,'����','ȫ��ȣ');
	select * from family;
/* �̸�  role �����̸�
*/	
select cur.name, cur.role01, par.name pname
from family cur, family par
where cur.parentnumid=par.numid;