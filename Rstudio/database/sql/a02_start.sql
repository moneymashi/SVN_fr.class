-- �÷��� �̸�(����) ���̱�!!
select *FROM emp;
-- empno�� ��Ī���� companyNo�� ����� �ߴ�. ����ϼ���..
-- �÷��� as ��Ÿ�� ��Ī�÷��� alias
select empno as comanyNo from emp;
-- ��Ī�� ���α׷� �������� �߿��� �ǹ̸� ������..
-- ��ټ� ���α׷��� ��Ī���� �����ϰ� ����ϴ� ��찡 ����.
-- ex) rs.getString("��Ī/�÷���")
-- as ��ſ� ����('')���� ó���Ѵ�.
select '�����'||empno|| ' �Դϴ�!' show FROM emp;
-- ���� application������ rs.getString("show")�� ó���ȴ�.
select * FROM emp;
-- ������ ������ ����� �÷����� ��Ÿ������..
-- �÷���		depandname	upgradeRatio	enterCompany
-- ��µ�����	(�μ���ȣ)�̸�	������10%			�Ի�����
SELECT '('||deptno||') '|| ename depandname, sal*0.1 upgradeRation, hiredate enterCompany FROM emp;
-- ���鰪�� ��Ī���� ó���ϱ�.. " " ���� ��Ī���� �����ش�.
SELECT ename "name intro" from emp;
-- �ѱ��� ��Ī���� ó���� ����, " " ���̿� ó��
select deptno "�μ���ȣ" from emp;

select * from emp;
-- �ߺ��� ó�� : �����ͺ��̽������� ������ ���� �Է��ϴ� ���� ���̺� ������ �Է��ϴ� ���� �����Ѵ�.
-- �÷��� �ִ� ��� �����Ͱ� �����ؼ��� �ȵȴٴ� ���̴�.
-- �׷���, �Ѱ� �÷����� ��ȸ�� ���� ������ �����Ͱ� ��Ÿ�� �� �ִ�.
select deptno from emp;
-- �϶�, �ϳ� �Ǵ� �ټ��� �÷��� �����Ͱ� ������ ���� filtering ���ִ� ó���� �ִµ� �̸� distinct��� �Ѵ�.
-- Ȱ������ select distinct �÷�1, �÷�2 from ���̺�
select distinct deptno from emp;

select * from emp;
-- -mgr�� ���ϰ����� ���
-- job�� ngr �÷��� ���ϰ� ���� ����ϼ���
select DISTINCT job, mgr from emp;
select mgr from emp;
select job, mgr from emp;

--������ 3000�̻��� �����͸� listó��
-- where �÷��� > ���ǵ�����
select * from emp where sal>=3000;

select * from emp where mgr != 7698;

-- ���� ���� �ΰ��� ������ ���� ������ list�ϱ�
-- ���� multi ���ǿ� ���� ó��
select * from emp;
--������ 3000�̻��� ����� �̸��� ������ list
select ename, sal from emp where sal >=3000;

-- ������ 2000 ����
select ename "�̸�", job "��å",sal "����" from emp where sal<=2000 and job='SALESMAN'; 
----------------------------------------------------------------------------------
-- empno : �����ȣ, ename : ����̸�, job : ��å, mgr : �������� ���,         --
-- hiredate : �Ի���, sal : ����, comm : ���ʽ�, deptno : �μ���ȣ            --
----------------------------------------------------------------------------------
select * from emp2;

-- 1.emp�߿� �޿��� 2000�̸��� �Ǵ� ��� �����߿� ����� �޿� ���
select empno, sal from emp where sal<2000;
-- 2.������ ���ʽ��� �ջ�ݾ��� 1500�̸��� ����� �̸�, ����, ���ʽ�, �ջ�� ���
SELECT * FROM emp;
select ename, sal, nvl(comm,0),sal+nvl(comm,0) from emp where nvl(comm,0)+sal<1500;
-- 3.mgr�� null�� ����� �̸� ���� ���
select ename, sal from emp where mgr is null;
-- 4.job�� clerk�� ����� deptno�� 30�� ����� �̸�, ��å, �μ���ȣ�� ���
select ename, job, deptno from emp where  job ='CLERK' and deptno=30;
-- 5.������ 2000���� 3000 ���̿� �ִ� ����� �μ���ȣ, �̸� , �������
select deptno, ename, sal from emp where sal>=2000 and sal<=3000;

DROP TABLE EMP;
CREATE TABLE EMP

       (EMPNO NUMBER(4) NOT NULL,

        ENAME VARCHAR2(10),

        JOB VARCHAR2(9),

        MGR NUMBER(4),

        HIREDATE DATE,

        SAL NUMBER(7, 2),

        COMM NUMBER(7, 2),

        DEPTNO NUMBER(2));




INSERT INTO EMP VALUES

        (7369, 'SMITH',  'CLERK',     7902,

        TO_DATE('17-12-1980', 'DD-MM-YYYY'),  800, NULL, 20);

INSERT INTO EMP VALUES

        (7499, 'ALLEN',  'SALESMAN',  7698,

        TO_DATE('20-02-1981', 'DD-MM-YYYY'), 1600,  300, 30);

INSERT INTO EMP VALUES

        (7521, 'WARD',   'SALESMAN',  7698,

        TO_DATE('22-02-1981', 'DD-MM-YYYY'), 1250,  500, 30);

INSERT INTO EMP VALUES

        (7566, 'JONES',  'MANAGER',   7839,

        TO_DATE('02-04-1981', 'DD-MM-YYYY'),  2975, NULL, 20);

INSERT INTO EMP VALUES

        (7654, 'MARTIN', 'SALESMAN',  7698,

        TO_DATE('28-09-1981', 'DD-MM-YYYY'), 1250, 1400, 30);

INSERT INTO EMP VALUES

        (7698, 'BLAKE',  'MANAGER',   7839,

        TO_DATE('01-05-1981', 'DD-MM-YYYY'),  2850, NULL, 30);

INSERT INTO EMP VALUES

        (7782, 'CLARK',  'MANAGER',   7839,

        TO_DATE('09-06-1981', 'DD-MM-YYYY'),  2450, NULL, 10);

INSERT INTO EMP VALUES

        (7788, 'SCOTT',  'ANALYST',   7566,

        TO_DATE('09-12-1982', 'DD-MM-YYYY'), 3000, NULL, 20);

INSERT INTO EMP VALUES

        (7839, 'KING',   'PRESIDENT', NULL,

        TO_DATE('17-11-1981', 'DD-MM-YYYY'), 5000, NULL, 10);

INSERT INTO EMP VALUES

        (7844, 'TURNER', 'SALESMAN',  7698,

        TO_DATE('08-09-1981', 'DD-MM-YYYY'),  1500, NULL, 30);

INSERT INTO EMP VALUES

        (7876, 'ADAMS',  'CLERK',     7788,

        TO_DATE('12-01-1983', 'DD-MM-YYYY'), 1100, NULL, 20);

INSERT INTO EMP VALUES

        (7900, 'JAMES',  'CLERK',     7698,

        TO_DATE('03-12-1981', 'DD-MM-YYYY'),   950, NULL, 30);

INSERT INTO EMP VALUES

        (7902, 'FORD',   'ANALYST',   7566,

        TO_DATE('03-12-1981', 'DD-MM-YYYY'),  3000, NULL, 20);

INSERT INTO EMP VALUES

        (7934, 'MILLER', 'CLERK',     7782,

        TO_DATE('23-01-1982', 'DD-MM-YYYY'), 1300, NULL, 10);

        

CREATE TABLE DEPT

       (DEPTNO NUMBER(2),

        DNAME VARCHAR2(14),

        LOC VARCHAR2(13) );




INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');

INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');

INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');

INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');




CREATE TABLE SALGRADE

        (GRADE NUMBER,

         LOSAL NUMBER,

         HISAL NUMBER);




INSERT INTO SALGRADE VALUES (1,  700, 1200);

INSERT INTO SALGRADE VALUES (2, 1201, 1400);

INSERT INTO SALGRADE VALUES (3, 1401, 2000);

INSERT INTO SALGRADE VALUES (4, 2001, 3000);

INSERT INTO SALGRADE VALUES (5, 3001, 9999);    

