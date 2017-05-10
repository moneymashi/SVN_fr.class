/*
3/21 
����01
���� �������� �ο����� üũ�ϼ���
����			�����(�ְ�ġ, ����ġ, ���ġ)
1000�̸�		@@
~2000�̸�	@@
~3000�̸�	@@
~4000�̸�	@@@
~5000�̸�
~6000�̸�
*/

SELECT DISTINCT(TRUNC(SAL,-3)) ���� , 
		COUNT(TRUNC(SAL,-3)) �����,  
		MAX(SAL), MIN(SAL), AVG(SAL) 
FROM EMP 
GROUP BY TRUNC(SAL,-3); 

/*
����02
student ���̵�, �̸�
studentPoint ���̵�, ����,����
gradeCheck ���� ���� lopoint, �ְ����� hipoint, �������(A~F)
1) ���̵� ���� (equal join)
	�̸�/����/���� ���
2) ������ �����ؼ� (not equal join) 
	����/����/������� ���
3) student10 studentPoint gradeCheck 
     	������ �Ͽ� �̸�/����/������� 
*/
select * from student_main;
select * from student_point;

ALTER TABLE student_point ADD(GRADE VARCHAR(2));


insert into student_point values('KDH','��Ʈ����','90','A');
insert into student_point values('KWM','��������','90','A');
insert into student_point values('KMK','����','100','A');
insert into student_point values('JGH','����','70','B');

TRUNCATE TABLE student_point;



--1��
select NAME �̸�, SUBJECT ����, POINT ����
from student_main,student_point
where student_main.id= student_point.id;

--2�� 
SELECT M.NAME �̸�, P.SUBJECT ����, P.POINT ����, P.GRADE ���
FROM student_point P, student_MAIN M
WHERE P.ID = M.ID; 

--3�� student_MAIN student_Point gradeCheck    	������ �Ͽ� �̸�/����/������� 
CREATE TABLE GRADECHECK(ID VARCHAR(5),TOTGRADE VARCHAR2(2));
insert into GRADECHECK values('KDH','D');
insert into GRADECHECK values('KWM','C');
insert into GRADECHECK values('KMK','B');
insert into GRADECHECK values('JGH','A');
SELECT * FROM GRADECHECK;

SELECT  M.NAME �̸�, P.SUBJECT ����, G.TOTGRADE ����
FROM STUDENT_MAIN M, STUDENT_POINT P, GRADECHECK G 
WHERE M.ID = P.ID AND G.ID=P.ID;


/*
����03
outer join�� Ȱ���Ͽ� group�� Ȱ���Ͽ�
�μ��� �ο��� Ȯ���Ϸ��� �Ѵ�.
�Ʒ��� �������� ����ϼ��� �ο��� ���� ���� 0���� ǥ��
�μ��� �ο�  
*/

SELECT * FROM DEPT;
SELECT * FROM EMP;

SELECT D.DNAME �μ���, COUNT(E.DEPTNO) �ο�
FROM EMP E, DEPT D
WHERE E.DEPTNO(+) = D.DEPTNO
GROUP BY DNAME;


