/*
����
	������������ �ο��� üũ
	����		����� (�ְ�ġ, ����ġ, ���ġ)
	1000�̸�: 	@@
	~2000�̸�:	@@
	~3000�̸�:	@@
	~4000�̸�:	@@
	~5000�̸�:	@@
	~6000�̸�:	@@
*/

	select trunc(sal,-3)+1000 ||'�̸�', count(*)|| '��', max(sal), min(sal), avg(sal) from emp
	group by (trunc(sal,-3))+1000
	order by (trunc(sal,-3))+1000 asc;

/*
	����.
		�μ���ġ�� ����� ���� �Ʒ��������� ���
		�μ���ġ �����...
*/

select loc, count(*) from emp, dept
where emp.deptno = dept.deptno
group by dept.loc;



	insert into student10 values( 101020, 'abcd'); 
	insert into student10 values( 101021, 'bcd'); 
	insert into student10 values( 101022, 'adb' ); 
	insert into student10 values( 101023, 'qwe' );

	insert into studentpoint values( 101020, 'math', 60); 
	insert into studentpoint values( 101021, 'cs', 90); 
	insert into studentpoint values( 101022, 'cs', 80); 
	insert into studentpoint values( 101023, 'psy', 70); 
	
	insert into gradeCheck values( 40, 60, 'C'); 
	insert into gradeCheck values( 60, 80, 'B'); 
	insert into gradeCheck values( 80, 100, 'A'); 
	
	/*
		1) ���̵� �����ؼ� (equal join)�ϰ�
			���: �̸� ���� ����
		2) ������ �����ؼ� (not equal join)
			���: ���� ���� �������
		3) student10 studentPoint gradeCheck������ �ؼ� (3 equal join)
			���: �̸� ���� �������
	student10 s, studentpoint sp, gradeCheck gc
	*/

	select s.sname �̸�, sp.spsub ����, sp.spGrade ���� from student10 s, studentpoint sp
	where s.sid = sp.spId;
	
	select sp.spsub ����, sp.spGrade ����, gc.subGrade  from gradeCheck gc, studentpoint sp
	where sp.spGrade between gc.lopoint and gc.hipoint;
	
	select s.sname �̸�, sp.spsub ����, gc.subGrade ���� from student10 s, studentpoint sp, gradeCheck gc
	where s.sid = sp.spId 
	and sp.spGrade between gc.lopoint and gc.hipoint;


/*
		����:
			outer join, group�� Ȱ���ؼ� ��
			�μ��� �ο��� Ȯ���Ϸ����Ѵ�.
			�Ʒ��� �������� ���. �ο��̾��°��� 0�� ǥ��. nvl
			�μ��� �ο� 
*/
	select * from dept;
	
		select d.dname, count(*) from emp e , dept d 
		where e.deptno(+) = d.deptno
		group by d.dname;    
		/*
			������ �� �����ʿ� (+) �� �ٿ���� 0���� �����. 
		
		*/