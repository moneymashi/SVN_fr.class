/* ����(homework)
 outer join, group�� Ȱ���Ͽ� �μ��� �ο��� Ȯ���Ϸ��� �Ѵ�. �Ʒ��� �������� ����ϼ���. �ο��� ���� ���� 0���� ǥ��
 �μ��� �ο��� 
*/

select d.dname �μ���, count(e.ename) �ο��� from emp e, dept d where e.deptno(+)=d.deptno group by d.dname;