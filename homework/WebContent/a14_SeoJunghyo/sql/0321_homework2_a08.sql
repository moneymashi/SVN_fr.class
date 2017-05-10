/* ���� (homework )
 �μ���ġ�� ����� ���� �Ʒ� �������� ����㼼��.
 �μ���ġ		�����		
*/
select * from emp e, dept d where e.deptno(+)=d.deptno;           -- dept ���̺� deptno 40���� ���� ����.
select d.loc, count(e.ename) from emp e, dept d where e.deptno(+)=d.deptno group by d.loc;   
select d.loc, count(e.ename) from emp e, dept d where e.deptno=d.deptno group by d.loc;




/*
 ����(homework)
 student10 ���̵�, �̸�
 studentPoint ���̵�, ����, ����
 gradeCheck ��������lopoint, �ְ�����hipoint, �������(A~F)
 1) ���̵� �����ؼ�(equal join)
 	�̸� ���� ���� ���
 2) ������ �����ؼ�(not equal join)
 	���� ���� �������
 3) student10 studentPoint gradeCheck ������ �Ͽ�
 	�̸� ���� �������	 	
*/	

-- student_info ���̺� ���� �� ������ �Է�
	
	create table student_info(
		ID VARCHAR2(20),
		NAME VARCHAR2(20)
		);
	
	insert into student_info values('a','����');	
	insert into student_info values('b','�ʾ�');	
	insert into student_info values('c','����');	
	insert into student_info values('d','����');	
	insert into student_info values('e','����');	
	insert into student_info values('f','�ϴ�');	
	insert into student_info values('g','����');	
	insert into student_info values('h','���');	
	select * from student_info;
	
	
-- student_point ���̺� ���� �� �Է�	
	
	create table student_point(
		ID VARCHAR2(20),
		SUBJECT VARCHAR2(20),
		POINT NUMBER
		);
	
	insert into student_point values('a','����',100);	
	insert into student_point values('a','����',70);	
	insert into student_point values('a','����',40);	
	insert into student_point values('b','����',40);	
	insert into student_point values('b','����',60);	
	insert into student_point values('b','����',70);	
	insert into student_point values('c','����',100);	
	insert into student_point values('c','����',70);	
	insert into student_point values('c','����',40);	
	insert into student_point values('d','����',50);	
	insert into student_point values('d','����',60);	
	insert into student_point values('d','����',20);
	insert into student_point values('e','����',30);	
	insert into student_point values('e','����',10);	
	insert into student_point values('e','����',60);
	insert into student_point values('f','����',60);	
	insert into student_point values('f','����',20);	
	insert into student_point values('f','����',30);
	insert into student_point values('g','����',60);	
	insert into student_point values('g','����',30);	
	insert into student_point values('g','����',60);
	insert into student_point values('h','����',90);	
	insert into student_point values('h','����',99);	
	insert into student_point values('h','����',80);
	select * from student_point;					


-- grade_check ���̺� ���� �� ������ �Է�
	create table grade_check(
		lopoint number,
		hipoint number,
		grade VARCHAR2(20)
		);
	
	insert into GRADE_CHECK values(90, 100, 'A���');	
	insert into GRADE_CHECK values(80, 89, 'B���');	
	insert into GRADE_CHECK values(70, 79, 'C���');	
	insert into GRADE_CHECK values(60, 69, 'D���');	
	insert into GRADE_CHECK values(0, 59, 'F���');	
	select * from grade_check;

-- 1) ���̵� �����ؼ�(equal join) �̸� ���� ���� ���
	select * from student_info, student_point, grade_check;
	
	select i.name �̸�, p.subject, p.point from student_info i, student_point p where i.id=p.id;

-- 2) ������ �����ؼ�(not equal join) ���� ���� �������
	select i.name �̸�, p.subject ����, p.point ����, g.grade ������� from student_info i, student_point p, grade_check g
		where i.id=p.id and (p.point between g.lopoint and g.hipoint) order by i.id, �������; 
	
	select i.name �̸�, avg(p.point) ������� from student_info i, student_point p where i.id=p.id group by i.name;
	
	select p.id ���̵�, p.subject ����, p.point ����, g.grade �������, g.lopoint �ּ�����, g.hipoint �ִ�����
		from student_point p, grade_check g where p.point between g.lopoint and g.hipoint;
		
	