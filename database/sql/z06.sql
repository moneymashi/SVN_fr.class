/*
   �ε�����?
   �����Ϳ� ������ �����ϴ� ���� ���������μ� �����ͺ��̽��� ������� ������ �ִ� ��ü
   
   1)����
   - �˻��ӵ��� ��������
   - �ý��ۿ� �ɸ��� ���ϸ� �ٿ��� �ý��� ��ü ������ ����Ų��.
   2)��������
   - ����(������, ��������), ���̺� ����, ������ �Է�, ����
   - ��� ������ ���Ͻ� ����
   3) ��� ����
   - ���̺��� ���� ���� ���� �� (������ �Ǽ�)
   - where ������ index�� �ش� �÷��� ���� ���� �� (��ȸ��)
   
   ps) ���̺� �Է�, ����, ������ ���� �Ͼ�� ��������ʴ� ���� �Ϲ���
   -�˻� ����� ��ü �������� 2~4%������ ��
   ex) 1,000������ �����Ͱ� �ִ� �λ������� ��� �˻��� 20~40���� �ȿ� �����͸� �ε��ؼ� ����� ��
*/
/*
   �ε��� ���� ���� �����
   1. �������̺� �����
   create table EMP_IDX_EMP
   AS
   SELECT * FROM EMP;
   2.�ε��� ó���� �÷� ����
   EMP_IDX_EMP���� EMPNO�� INDEX����
   3.�ε��� ����(�ش� ���̺� �ε��� ����)
   CREATR INDEX �ε��� �̸�
   ON ������ ���̺��(������� Į��)
   CREATE INDEX INDEX_EMPNP_EMP_IDX_EXP
   ON EMP_IDX_EXP(EMPNO);
*/
CREATE TABLE EMP_IDX_EXP
AS
SELECT * FROM EMP;
-- EMP_IDX_EXP���̺� EMPNO�� INDEX�� �����Ѵ�.
CREATE INDEX INDEX_EMPNO_EMP_IDX_EXP
ON EMP_IDX_EXP(EMPNO);
SELECT * FROM EMP;
--�ε��� ����
--DROP INDEX �ε��� �̸�
DROP INDEX INDEX_EMPNO_EMP_IDX_EXP;
/*
   Ȯ�ο���
   DEPT ���̺� ���纻 DEPT_IDX_EXP �����
   �ε��� �̸��� IDX_DEPTNO_DEPT�� �ؼ� ����, Ȯ�� �� ����ó��
*/
CREATE TABLE DEPT_IDX_EXP AS SELECT * FROM DEPT;
CREATE INDEX INDEX_DEPTNO_DEPT ON DEPT_IDX_EXP(DEPTNO);
SELECT * FROM DEPT_IDX_EXP;
DROP INDEX INDEX_DEPTNO_DEPT;
-- ��ü ������ �Ǽ��� Ȯ���ϼ���
-- count (�÷�,��ü(*))
SELECT COUNT(*) CNT, COUNT(COMM) BONUS_CNT FROM EMP;
SELECT COUNT(DISTINCT JOB) FROM EMP;
-- �׷� �Լ��� ���ǹ� ó��
-- ������ 3000 �̻��� ����߿� ��å���� �ο����� ���ϼ���
SELECT JOB, COUNT(JOB) FROM EMP WHERE SAL>=3000 GROUP BY JOB;
-- Ȯ�ο���
-- �Ի����� 1������ 3���� ����� �μ����� �ο����� üũ�ϼ�
SELECT COUNT(*) "�Ի��� 1~3��" FROM EMP WHERE HIREDATE;
SELECT ENAME, HIREDATE FROM EMP WHERE HIREDATE;
SELECT DEPTNO,COUNT(DEPTNO) CNT FROM EMP WHERE TO_NUMBER(TO_CHAR(HIREDATE,'MM')) BETWEEN 1 AND 3 GROUP BY DEPTNO;
SELECT HIREDATE, FLOOR(TO_NUMBER(TO_CHAR(HIREDATE,'MM'))/4) FROM EMP;
-- Ư�� �Լ��� ó���� �����͸� �׷캰�� ���ġ�� ���� �� �� , Ȱ���
SELECT FLOOR(TO_NUMBER(TO_CHAR(HIREDATE,'MM'))/4)+1 PART, COUNT(*) FROM EMP GROUP BY FLOOR(TO_NUMBER(TO_CHAR(HIREDATE,'MM'))/4);
/*
   ���� �������� �ο����� üũ�ϼ���
   ����      �����(�ְ�ġ,����ġ,���ġ)
   1000�̸�   ##
   ~2000�̸�   ##
   ~3000�̸�   ##
   ~4000�̸�   ##
   ~5000�̸�   ##
   ~6000�̸�   ##
*/
/*
   �׷캰�� �������� ���ġ ó���ϱ�
   SELECT ó���� �׷� �÷�, �׷��Լ�
   FROM ���̺��
   WHERE ���� (�׷��� ó���ϱ� ���� ����)
   GROUP BY ó���� ���� �÷�
   HAVING �׷쿡 ���� ���� ó��(�׷��� �� �Ŀ� ����)
   �μ���ȣ���� ���ջ� �������� ����ϼ���
*/
/*
   HAVING ����
   GROUP BY �ȿ� �־��� �׷��� �����Ϳ� ���� ������ ó���ϰ��� �� �� Ȱ��ȴ�
   EX)�μ����� ��տ����� ó���ϰ�, �ױ׷캰 ��տ������� 2000 �̻��� �����͸� �ε�
*/
SELECT DEPTNO, AVG(SAL) FROM EMP WHERE SAL>=2000 GROUP BY DEPTNO;
SELECT DEPTNO, AVG(SAL) FROM EMP GROUP BY DEPTNO HAVING AVG(SAL)>=2000;
--���ʽ��� �ִ� ����� �̸��� �μ����� ���
SELECT * FROM SALGRADE;
--�޿� ����� 5���� ������ �� ����� ǥ���Ͻÿ�
--WHERE SAL BETWEEN [LOSAL] AND [HISAL]
--�̸��� ���� �������
--���̺� ALIAS ����ϱ� : ���̺��� �÷��� ���� �̸��� ������ �ǹ̰� ������
--���� �̸��� ������ �����ϱ� ���� ���̺��[����]ALIAS�� Ȱ��
--���̺�ALIAS.�÷���
--����, ������ �÷��� ���� ���� �������� ���� ����ϴ� ��쵵 �ִ�.
SELECT E.ENAME, E.SAL, S.GRADE FROM EMP E, SALGRADE S WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;
/*
   student10 ���̵�, �̸�
   studentPoint ���̵�, ����, ����
   gradeCheck �������� loPoint, �ְ����� hiPoint, ���� ���(A~F)
   1) ���̵� �����ؼ�(equal join)
      �̸� ���� ���� ���
   2) ������ �����ؼ�(not equal join)
      ���� ���� �������
   3) student10 studentPoint gradeCheck �����Ͽ�
      �̸� ���� �������
*/
/*
   outer join
   �ΰ��� ���� ���迡 �ִ� ���̺� �־� ���� �Ǵ� ���ʴ�
   ������ �������� �ʾƵ� ������ ����� ����ؾ� �ϴ� ��쿡 Ȱ��Ǵ� ����   
   where �����Ͱ� ���� ���̺�.�÷���(+) = �����Ͱ� �ִ� ���̺�.�÷���
*/
select * from dept;
select distinct deptno from emp;
-- �μ���ȣ���� ��Ī�Ǵ� ��� �̸��� ����ϵ�, �̸��� ������ ���ٴ� ǥ�ð� �ʿ�
select e.name, d.deptno, d.dname, nvl(e.ename,'�ο�����') ename from emp e, dept d where e.deptno(+) = d. deptno order by e.deptno;
/*
   ����) outer join, group�� Ȱ���Ͽ� �μ��� �ο��� Ȯ���Ϸ��� �Ѵ�.
   �Ʒ��� �������� ����ϼ��� �ο��� ���� ���� 0���� ǥ��
   �μ��� �ο�
*/
/*
   selfjoin : ���״�� �ڱ� �ڽŰ� ������ �δ°��� ���Ѵ�.
   form���� ���� �̸��� ���̺��� �����Ͽ� �ٸ����̺��� ��ó�� �ν��ؼ�
   
*/
/*
select * from emp;
SELECT *
FROM ���̺�� ALIAS01, ���� ���̺�� ALIAS02
WHERE ALIAS01.�����÷� = ALIAS2.�����÷�
*/
SELECT WORK.ENAME, WORK.MGR, MANAGER.ENAME
FROM EMP WORK, EMP MANAGER
WHERE WORK.MGR = MANAGER.EMPNO;
/*
   ������ JOIN���� ���� ���̺� �����(SELF JOIN)
   1. ������ �����Ѵ�
      ID�� ���� ID�� �Է��ϴ�, KEY�� �����.
      numid, parentnumid, role01, name
      ���̵�, �������̵�, ����  , �̸�
   2. ���̺��� �����Ѵ�
      create table family(
         numid number,
         parentnumid number,
         role01 varchar2(100),
         name varchar2(500)
      );
   3. �����͸� �Է��Ѵ�. (���� �������� ������ ������ ���� ������ �Է�ó��)
      insert into family values(1,0,'�Ҿƹ���','ȫ�浿');
      insert into family values(2,1,'�ƹ���','ȫ����');
      insert into family values(3,2,'�ƹ���','ȫ��ȣ');
      insert into family values(4,1,'����','ȫ��ȣ');
   4. �Էµ� ������ ������ ���������� �Ǿ��ִ��� Ȯ���Ѵ�.
      -��ȸ ó��...
*/


create table family(
         numid number,
         parentnumid number,
         role01 varchar2(100),
         name varchar2(500)
      );
      insert into family values(1,0,'�Ҿƹ���','ȫ�浿');
      insert into family values(2,1,'�ƹ���','ȫ����');
      insert into family values(3,2,'�ƹ���','ȫ��ȣ');
      insert into family values(4,1,'����','ȫ��ȣ');
	  select * FROM family;
/* �̸� role �����̸�
*/
SELECT cur.name, cur.role01, par.name pname
from family cur, family par
where cur.parentrumid=par.nuid;
