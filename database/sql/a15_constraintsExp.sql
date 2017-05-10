/*
���� ���� �߰��ϱ�
ALTER TABLE ���̺��
ADD CONSTRAINT ���̺��_�÷���_�������Ǵ��� ������������(�÷���);
EX) �������� NOT NULL(x), UNIQUE(O)
*/
/* �������� �߰�, ����, ���� ����.
1. address ���̺�  host�÷���  UNIQUE ���������� �߰�..
2. ������ ��Ǿ���� Ȯ��.
3. host�÷��� ���������� ����..
4. address ���̺� host�÷��� NOT NULL ������������ ����.
5. ������ ��Ǿ���� Ȯ��
*/
-- 1. �߰�
ALTER TABLE address
add constraint address_host_uq unique(host);
-- 2. Ȯ��
select * from user_constraints
where table_name='ADDRESS';
-- 3. ����..
/*
ALTER TABLE ���̺��
DROP CONSTRAINT ��ϵ��������Ǹ�
*/
ALTER TABLE address
drop constraint address_host_uq; 
-- address ���̺��� �������� address_host_uq ����
-- 4. ����(modify)
-- ������ ������ ���� add�� modify�� ���� ��찡 �ִ�..
-- not null�� ��쿡�� add�� ���������� ����� �� ����.
-- �� ��쿡�� modify�� Ȱ���Ͽ��� �Ѵ�.
/* ����
	 ALTER TABLE ���̺��
	 MODIFY �÷��� CONSTRAINT �������Ǹ�  ������������(EX-NOT NULL)
*/
	ALTER TABLE address
	MODIFY host constraint address_host_nn NOT NULL;
-- 	host��� �÷��� ���������� address_host_nn�� �ϰ�, �̴� not null
--  ������������ ���� ó���Ѵ�.
	select * from user_constraints
	where table_name='ADDRESS';
/*  Ȯ�ο���
	1. EMP���̺��� ���� ���̺� EMP07�� �����,
	2. ENAME�÷��� UNIQUE ���������� ������ ��,
	3. �� ���������� �����ϰ�,
	4. ENAME�÷��� ���������� NOT NULL�� �����ϼ���..
*/	
CREATE TABLE emp07
as select * from emp;

alter table EMP07
add constraint emp07_ename_uq unique(ename);
SELECT * FROM USER_CONSTRAINTS
WHERE TABLE_NAME='EMP07';
ALTER TABLE EMP07
DROP CONSTRAINT emp07_ename_uq;



ALTER TABLE EMP07
MODIFY ename CONSTRAINT emp07_ename_nn not null;

SELECT * FROM USER_CONSTRAINTS
WHERE TABLE_NAME='EMP07';

/*
�������� Ȱ�� �� ��Ȱ��ȭ ó��..
: ���������� �ӽ������� ��Ȱ��ȭ ������ �����͸� test�ϰų�,
Ư���� �Ⱓ�� ���������� ���� �ʴ� ������ �Է��ϴ� �ϰ� ó���ϴ�
���� ���Ѵ�.
����
alter table ���̺��
enable/disable CONSTRAINT �������Ǹ�; 

ALTER TABLE EMP07
MODIFY ename CONSTRAINT emp07_ename_nn not null;
*/
ALTER TABLE EMP07
ENABLE CONSTRAINT emp07_ename_nn;





select * from address;


