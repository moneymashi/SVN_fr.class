/*
	����1.
	������������ �ο����� üũ�ϼ���
	
	����			�����(�ְ�ġ,����ġ,���ġ)
	1000�̸�		@@
	2000�̸�		@@		
	3000�̸�		@@
	4000�̸�		@@
	5000�̸�		@@
	6000�̸�		@@
*/
	select ((floor(sal/1000)+1)*1000)||'�̸�' "����", count(*) "�����", max(sal) "(�ְ�ġ", min(sal) "����ġ", avg(sal) "���ġ)" from emp group by ((floor(sal/1000)+1)*1000);
	
/*
	����2. �μ���ġ�� ����� ���� �Ʒ� �������� ����ϼ���
	�μ���ġ �����
*/
	select d.loc "�μ���ġ", count(*) "�����" from emp e, dept d where e.deptno=d.DEPTNO group by d.loc;

	/*
	����3.
	(table)
	student10 ���̵�, �̸�
	studentPoint ���̵�, ����, ����
	gradeCheck ��������lopoint, �ְ����� hipoint, �������(A~F)
	(output)
	1) ���̵� �����ؼ� (equal join)
		�̸� ���� ���� ���
	2) ������ �����ؼ�(not equal join)
		���� ���� �������
	3) student10 studentPoint gradeCheck ������ �Ͽ�
		�̸� ���� �������
	*/
	create table student10(
		id VARCHAR2(10),
		name VARCHAR2(10)
	);
	create table studentPoint(
		id VARCHAR2(10),
		subject VARCHAR2(10),
		score number(10)
	);
	create table gradeCheck(
		lopoint number(10),
		hipoint number(10),
		grade varchar2(10)
	);
	insert into student10 values('a','choi');
	insert into student10 values('b','kim');
	insert into student10 values('c','hang');
	insert into studentpoint values('a','math',90);
	insert into studentpoint values('b','english',70);
	insert into studentpoint values('c','science',60);
	insert into gradecheck values(90,100,'A');
	insert into gradecheck values(80,89,'B');
	insert into gradecheck values(70,79,'C');
	insert into gradecheck values(60,69,'D');
	insert into gradecheck values(0,59,'F');
	/*
	1) ���̵� �����ؼ� (equal join)
		�̸� ���� ���� ���
	2) ������ �����ؼ�(not equal join)
		���� ���� �������
	3) student10 studentPoint gradeCheck ������ �Ͽ�
		�̸� ���� ���� �������
	*/
	select a.NAME, b.SUBJECT, b.score from student10 a, studentpoint b where a.id=b.id;
	select b.SUBJECT, b.SCORE, c.GRADE from studentpoint b, gradecheck c where b.SCORE between c.LOPOINT and c.HIPOINT;
	select a.NAME, b.SCORE, b.SUBJECT, c.GRADE
	from student10 a, studentpoint b, gradecheck c where a.id=b.id and b.SCORE between c.LOPOINT and c.HIPOINT;

/*
		����4.
		outer join, group�� Ȱ���Ͽ�
		�μ��� �ο��� Ȯ���ҷ��� �Ѵ�
		�Ʒ��� �������� ����ϼ��� �ο��� ���� ���� 0���� ǥ��
		�μ��� �ο�
*/
	select d.dname "�μ���", count(e.ENAME) "�ο�" from emp e, dept d where d.DEPTNO=e.DEPTNO(+) group by d.dname;
