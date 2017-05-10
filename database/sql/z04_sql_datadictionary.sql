/*
������ ����(������ dictionary)
�����ڿ��� �����ͺ��̽��� ���õ� ������ �����ϴ� ���� ���Ѵ�.

DBA_XXX : �����ڸ� ���ٰ����� ��ü(���̺� ��)�� ���� ��ȸ.
ALL_XXX : �ڽ� ���� ���� �Ǵ� ������ �ο� ���� ��ü(���̺�)�� ������ȸ
USER_XXX : �ڽ��� ������ ������ ��ü � ���� ���� ��ȸ.
*/
select * from user_tables
where table_name like '%EMP%'; -- ����� ���̺� ���� ����..
/*
�������� Ȯ���ϱ�..
user_constraints���� �� ���̺��� ���Ἲ �������ǿ� ���õ� ������ ������
��ųʸ��� ���ؼ� Ȯ���� �� �մ�.
## contraint_type
P : primary_key
R : foreign_key
U : unique
C : check, not null

** ������ ������ ���ؼ� ������ ���̺��� ���, ���̺��� ����, ���������� 
Ȯ���� �� �ִ�..
*/
select * from user_constraints
where table_name like '%DEPT%';