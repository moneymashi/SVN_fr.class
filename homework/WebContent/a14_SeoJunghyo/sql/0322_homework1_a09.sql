-- ����1. (homework 1)

	
-- 1). �Ի��� �б⺰�� ���� ���� ������ �޴� ����� ����ϼ���.
	select max(sal) from emp group by floor(to_char(hiredate,'MM')/4+0.25)+1;
	select ename �̸�, floor(to_char(hiredate,'MM')/4+0.25)+1||'�б�' �б�, hiredate �Ի��� from emp;
	
	select ename �̸�, floor(to_char(hiredate,'MM')/4+0.25)+1||'�б�' �б�, hiredate �Ի���, sal ���� from emp
	where (sal) in ( select max(sal) from emp group by floor(to_char(hiredate,'MM')/4+0.25)+1 )
	order by floor(to_char(hiredate,'MM')/4+0.25)+1;

-- 2). ������ 3000�̻��� ��� �߿� ���(���̺� Ȱ�뵵 ����)�� ����� �ش� ��޺� �ְ� ������ �޴� ����� �̸�, ��� ������ ����ϼ���.
	select * from emp, salgrade;
	select e.ename �̸�, s.grade ���, e.sal ���� from emp e, salgrade s
		where 
		(e.sal, s.grade) in( select max(e.sal), s.grade from emp e, salgrade s where (e.sal between s.losal and s.hisal) group by s.grade)
		and e.sal>=3000 ;



-- ����2.(homework2)
-- 1). �μ���ȣ�� 30�� ����߿� ���� ���߿� �Ի��� ������� ������ ������ ����ϼ���
		select sal from emp where deptno=30 and hiredate=(select max(hiredate) from emp where deptno=30);
		select max(sal), max(hiredate) from emp where deptno=30 group by hiredate;
-- �μ���ȣ�� 30�� ����߿��� ���� ���߿� �Ի��� ������� ������ ������ ���
		select * from emp where sal > all(select sal from emp where deptno=30 and hiredate=(select max(hiredate) from emp where deptno=30));
-- ���� ���߿� �Ի��� ������� ������ ���� ����� �� �μ���ȣ�� 30�� ������� ���	
		select * from emp where deptno=30 and sal > all(select sal from emp where hiredate=(select max(hiredate) from emp));


-- 2). ��å�� SALESMAN�� ����� �޴� �޿����� �ּ� �޿����� ���� �޴� ������� �̸��� �޿��� ����ϵ� �μ���ȣ 20���� ����� �����Ѵ� (ANY ������ �̿�)
	select ename, sal from emp where deptno!=20 and sal	> any(select min(sal) from emp where job='SALESMAN');


/* ����3. (homework 3)
 ������ ���� ������ ���̺� NEW_EMP�� �����ϼ���.
 �̸�(name), ��ȣ(no), �Ի���(credate)-���ڿ�(@@@@�� @@@�� @@@��) ���ر��رٹ�����(workyears)
*/
	create table new_emp
		as select ename name, empno no, to_char(hiredate, 'YYYY"��" MM"��" DD"��"') credate, to_number(to_char(sysdate, 'YYYY'))-to_number(to_char(hiredate,'YYYY')) workyears from emp; 
	select * from new_emp;	 
	