create table member(
	memid VARCHAR2(50) PRIMARY KEY,
	pass varchar2(30),
	name varchar2(50),
	point number,
	auth varchar2(20)
);
insert into member values('himan','7777','���̸�',10,'admin');
insert into member values('superman','8888','���۸�',20,'user');
insert into member values('legend','9999','ȫ�浿',50,'guest');