/*
������ ����
����Ŭ���� ������ ������ ���̺��� ȿ�������� �����ϱ� ����
query�� ���Ѵ�. (self join�� ȿ���� ó��)

������ ���� : ������ ���迡 ���̺� ������ ������ ���� ���Ѵ�.
ex)         �Ҿƹ���(id, parentId, role : 1, 0, '�Ҿƹ���') 
   �ƹ���(2,1,'�ƹ���')      ����(3,1,'����')    
 �Ƶ�(4,2,'�Ƶ�')          ���̵���(5,3,'����')
����(6,4,'����')
������ sql ����
select ....�÷�
from ���̺��
where ����
start with ����(�񱳿����� ex)�÷�=������  : 
                              ����sql�� �������� ó��-�ֻ��� ������ ����ó��.
                  ex) ���������� �ֻ��� ������ parentId=0
				    �츮������ ���� ������ ó���ϰ��� �� ��,
					 parentId=2(�ƹ��� �������ķ� ��Ÿ��)
connect by [nocycle]  ���� and ����
    �������踦 ��������ִ� ���ǿ� ���� ����. nocycle :�ݺ����ο� ���� ó��.
	ex) connect by id = parentId  
	  ���� id���� Ȯ���ؼ� ������ �ִ� id���� �ִ��� ���������Ϳ� Ȯ���ؼ�
	  ���������� ��Ÿ���� �ϴ� ���� ���Ѵ�. prior:���� - ������ ���迡 ����
	                                       ó���ϰ� �� 					 
	ex) emp ���̺��� �������� ���������� ���� ó���ϰ��� �Ѵ�.
order siblings by �÷� [asc/desc]
 �ش� �������� �÷��� ���� ���� ������ ���� ������ �����Ѵ�.
 �ֱٿ� ��ϵ� ������ ���� list�ϴ���? ���� ��ϵ� ������ ���� list�ϴ���?
 level�� ����, �θ� ���� �����͵鿡 ���� list �켱 ������ ����.  	

## column �ɼ�  :level -�ش� ������ �����ܰ��� ǥ��
	ex) �ֻ��� �����ʹ� 1, �������� 2...	
	
*/
select * from emp;
-- mgr(������ ��ȣ)�ε�, empno�� ���εǾ� ����..
select level, empno, lpad(' ', 4*(level)) || job job, mgr
from emp
start with mgr is null --�ֻ������ ������ mgr�� null�� ��
connect by prior empno = mgr; -- �ֻ��÷��� ���� �÷��� ����ó��.
 
/*  
���������� mgr�� null�� �� ���� �����Ͽ�, ���������� empno�� mgr�� �ִ���
���θ� Ȯ���Ͽ�, �ش��ϴ� mgr�� �����Ͱ� empno�� ���� �� ����
�ϴ� �ϳ��� node��ü�� �������Ѵ�.
�������Ƿ� ������ ó��... lpad('���ʿ� �Է��� ����', �ݺ��� Ƚ��)
 �������� �������� ǥ�õ� �� �ְԲ� ó��..
 ' ' :������ 4ĭ��  lpad(' ', 4*(level)) || job
*/
-- ex) Ȯ�ο��� family�� ���������� ����ϼ���.
-- ������� :  level  role(������������ó��), �̸�

select level, lpad(' ',4*(level-1)) || role01 role, name 
from family
start with parentnumid=0
connect by prior numid=parentnumid
order siblings by numid asc; -- role01==> numid 
select * from family;
insert into family values(5,1,'ū�ƹ���','ȫ����');
insert into family values(6,0,'�����Ҿƹ���','ȫ���');
/*
board ������ �Խ��� ���̺� ���� list�ϱ�..
	����id(�۹�ȣ), Ÿ��Ʋ, ����, �������, ��������, �ۼ���, ��ȸ��
	no,    parentno, title,        content,       credte,uptdte, writer,    readcnt
	number,number, varchar2(50), varchar2(1000), date, date, varchar2(50), number
*/
create table board(
	no number primary key,
	parentno number,
	title varchar2(50),
	content varchar2(1000),
	credte date,
	uptdte date,
	writer varchar2(50)
);
select * from board;
-- 1, 0, '�۵�Ͻ���','�ù�',sysdate,sysdate,'�۰�01'
insert into board values(1, 0, '�۵�Ͻ���','�ù�',sysdate,sysdate,'�۰�01');
insert into board values(2, 0, '2��°�׿�!�̷�!','�ù�',sysdate,sysdate,'�۰�02');
-- ù��° �ۿ� ���� ��۷� ó��..
insert into board values(3, 1, '1��°�� ���ƽ��ϴ�.','�ù�',sysdate,sysdate,'ȫ����');
insert into board values(4, 3, '���� ����� �����׿�','�ù�',sysdate,sysdate,'�۰�01');
insert into board values(5, 1, '���� �� ��Ź�մϴ�!','�ù�',sysdate,sysdate,'�۰�03');
-- �۹�ȣ, Ÿ��Ʋ, �����(YYYY/MM/DD), �����
select rownum , no, lpad(' ',4*(level-1)) || title title, 
       to_char(credte,'YYYY/MM/DD') credte, writer
from board
start with parentno=0  -- �ֻ��� ���� ���� ó��
connect by prior no = parentno -- ���� ���� ���� ����
order siblings by no desc; -- �ֱٿ� ��ϵ� ���� �ֻ����� ó��
select * from board;
insert into board values(7, 1, 'ù��°�� ����~~',
		'�ù�',sysdate,sysdate,'���̸�');
select rownum, a.*
from emp a
order by empno desc;		
-- rownum : ������ list���� ������ numbering�� �ٴ� Ű����..
	   









