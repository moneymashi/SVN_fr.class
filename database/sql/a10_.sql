
select * FROM emp 

-- �÷� ���� �� ����
/*
	insert into ���̺��(�÷�1, �÷�2, �÷�3)
					select �÷�1, �÷�1+�÷�2, �Լ�(�÷�3)
					from ���̺��
					where ����..
insert into emp_structor(empno)
		select empno from emp;

INSERT INTO emp_structor(empno, sal, ename)
		select empno, sal+nvl(comm,0), rpad(ename,7,'^^') from emp;
	 
*/

/* Ȯ�ο���.
dept_sub �̶�� ���̺��� dept���̺��� �̿��Ͽ� �����, �߰��÷�,
	kdname(�ѱ��̸�), membercnt(��ϵ��ο�)
1) ������ �ִ� �������̺� ����.
2) dept���̺��� �̿��ؼ� ���������Ϳ� �߰��� �����͸� �Է��ϼ���.
 - ó�� : �ѱ��̸�-����, membercnt = 0;


*/