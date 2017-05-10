/*
����
���� �������� �ο����� üũ�ϼ���
����			�����(�ְ�ġ, ����ġ, ���ġ)
1000 �̸�		@@
~2000 �̸�	@@@
~3000 �̸�	@@
~4000 �̸�
~5000 �̸�
~6000 �̸�
*/
SELECT TRUNC(SAL,-3)||' �̸�', COUNT(*) FROM EMP 
GROUP BY TRUNC(SAL,-3);

/*
����
	�μ� ��ġ�� ����� ���� �Ʒ� �������� ����ϼ���
	�μ���ġ	��� ��..
		
*/
SELECT LOC "�μ���ġ", COUNT(*) "�����"
FROM EMP, DEPT
WHERE EMP.DEPTNO=DEPT.DEPTNO
GROUP BY LOC;


/*
����
student10 		���̵�, �̸�
studentPoint	���̵�, ����, ����
gradeCheck		��������lopoint,	�ְ�����hipoint, �������(A~F)
1) ���̵� �����ؼ�(equal join)
	�̸�	����	���� ���
2) ������ �����ؼ�(not equal join)
	���� ���� �������
3) 	student10 studentPoint gradeCheck ������ �Ͽ�..
	�̸� ���� �������
*/
create table gradeCheck(
			lopoint number(3),
			hipoint number(3),
			grade	char(1)
			);
select * from gradeCheck;
insert into gradeCheck values(0,10,'F');
insert into gradeCheck values(11,30,'E');
insert into gradeCheck values(31,50,'D');
insert into gradeCheck values(51,70,'C');
insert into gradeCheck values(71,90,'B');
insert into gradeCheck values(91,100,'A');


/*
����) outer join, group�� Ȱ���Ͽ�
	�μ��� �ο��� Ȯ���Ϸ��� �Ѵ�.
	�Ʒ��� �������� ����ϼ��� �ο��� ���� ���� 0���� ǥ��.
	�μ���	�ο�
*/
select d.deptno, count(e.deptno)
from emp e, dept d
where e.deptno(+)=d.deptno
group by d.deptno;