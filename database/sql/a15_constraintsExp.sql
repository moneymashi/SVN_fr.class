CREATE TABLE ADDRESS
(
   STATE        VARCHAR2 (50),
   CITY         VARCHAR2 (50),
   AREA         VARCHAR2 (50),
   ADNUMBER     NUMBER,
   HOST         VARCHAR2 (50),
   RISDNUMBER   NUMBER
)
NOCACHE
LOGGING;

/*
���� ���� �߰��ϱ�
ALTER TABLE ���̺��
ADD CONSTRAINT ���̺��_�÷���_�������Ǵ��� ������������(�÷���);
EX) �������� NOT NULL(x), UNIQUE(o)
*/
/* �������� �߰�, ����, ���� ����.
1. address ���̺� host�÷��� UNIQUE ���������� �߰�..
2. ������ ��Ǿ���� Ȯ��.
3. host�÷��� ���������� ����.
4. address ���̺� host�÷��� NOT NULL ������������ ����.
5. ������ ��Ǿ���� Ȯ��
*/
-- 1. �߰�
ALTER TABLE address
add constraint address_host_uq unique(host);
-- 2. Ȯ��
SELECT * FROM user_constraints
where table_name='ADDRESS';
-- 3. ����..
/*
ALTER TABLE ���̺��
DROP CONSTRAINT ��ϵ��������Ǹ�
*/
ALTER TABLE address
drop constraint address_host_uq;
--address ���̺��� �������� address_host_uq ����
-- 4. ����(modify)
-- ������ ������ ���� add�� modify�� ���� ��찡 �ִ�..
-- not null�� ��쿡�� add�� ���������� ����� �� ����.
-- �� ��쿡�� modify�� Ȱ���Ͽ��� �Ѵ�.
/* ����
	ALTER TABLE ���̺��
	MODIFY �÷��� CONSTRAINT �������Ǹ� ������������(EX-NOT NULL)
*/
	ALTER TABLE address
	MODIFY host constraint address_host_nn NOT NULL;
-- host��� �÷��� ���������� address_host_nn�� �ϰ�, �̴� not null
-- ������������ ���� ó���Ѵ�.
	
	SELECT * FROM user_constraints
	where table_name='address';
/*
	1. EMP���̺��� ���� ���̺� EMP07�� �����,
	2. ENAME�÷��� UNIQUE ���������� ������ ��,
	3. �� ���������� �����ϰ�,
	4. ENAME�÷��� ���������� NOT NULL�� �����ϼ���..

*/


/*
������� Ȱ�� �� ��Ȱ��ȭ ó��..
��������� �Ͻ������� ��Ȱ��ȭ ������ �����͸� test�ϰų�,
Ư���� �Ⱓ�� ��������� ���� �ʴ� ������ �Է��ϴ� �ϰ� ó���ϴ�
���� ���Ѵ�.
����
alter table ���̺��
enable/disable CONSTRAINT ������Ǹ�;
EX) ���̺� EMP07�� emp07_ename_nn�� ��Ȱ��ȭ ó���Ѵ�.
ALTER TABLE EMP07
DISABLE CONSTRAINT emp07_enmae_nn;
SELECT * FROM USER_CONSTRAINTS
WHERE TABLE_NAME='EMP07'; -- status�÷� �κ� Ȯ��..
ALTER TABLE EMP07
ENABLE CONSTRAINT emp07_ename_nn; --�ش� ������� Ȱ��ȭ ó��..
*/