
/**1�� ����**/
create table emp03 as select * from emp; --emp03 �������̺� ����

select min(empno)-1, avg(sal), sum(comm) from emp03; 
-- empno�� ���� ������ -1 = 7368, sal�� ��տ��� = 2073.21, comm�հ�=2200

select mgr from emp03 where ename='CLARK';
-- clark�� mgr = 7839

select max(hiredate)+1 from emp03; -- �ֱ� �Ի��� + 1 = 1983/01/13

insert into emp03(empno, mgr, sal, comm) values(7368,7839,2073.21,2200);
update emp03 set ename='�ű浿', job='SUPERMAN', hiredate='1983/01/13'
where empno=7368;
commit;

select * from emp03;

/**2�� ����**/
create table loginData(id varchar2(10) not null, password varchar2(20) not null,
userpoint number(10));

commit;

select * from loginData;


/**3�� ����**/

create table student_main(
id varchar2(15) primary key,
pass varchar2(20) not null,
name varchar2(20) not null
);

select * from student_main;
select * from student_point;

create table student_point(
id varchar2(15) REFERENCES student_main(id),
subject varchar2(10),
point number(5)

);
insert into student_point values ('sdf','asd',1000);
insert into student_main values ('sdf','asd','ȫ�浿');


/***1������*** 
emp03 �������̺� ����
1. �Է� empno�� ���� ���������� -1, mgr:clark�� mgr�Է�, sal:��տ���, comm:��ü comm�� �հ�
2. ���� ename:'�ű浿', job�� SUPERMAN, hiredate�� �ֱٿ� �Ի���+1

***2������*** 
���� login�ϴ� ȭ���� ����� id�� password�� üũ�ϰ�, ���� ȭ�鿡��
id @@@ �� ȯ���մϴ�. ���� point�� @@@�Դϴ�. ��� ������ ��Ÿ���ٰ� �Ѵ�.
�̿� �ʿ�� �ϴ� ���̺�� ���̺� ������ ���弼��

*/
