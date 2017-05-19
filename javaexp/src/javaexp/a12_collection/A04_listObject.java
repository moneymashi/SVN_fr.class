package javaexp.a12_collection;

import java.util.ArrayList;

class Emp{   // VO
	private int empno;
	private String ename;
	private int sal;
	private int deptno;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int empno, String ename, int sal, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.deptno = deptno;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}

public class A04_listObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Emp�� ���� ��ü�� ���� �� �ִ� ArrayList ����..
		// ArrayList<Emp>  ctrl+shift+O : import �ڵ� ó��
		ArrayList<Emp> elist = new ArrayList<Emp>();
		/* ���� ��ü ������ list�� ������ ���
		 * DB ó����, ���� ���� Ȱ��Ǵ� ���
		 * 1. ��ü ������ �޼��带 ���ؼ� ������ ���
		 * */
		Emp p = new Emp();
		p.setEmpno(7001);
		p.setEname("���̸�");
		p.setSal(2000);
		p.setDeptno(10);
		elist.add(p);
//		2. �����ڸ� ���ؼ� ������ ���ÿ� ������ ���.
		Emp p2 = new Emp(7002, "ȫ�浿", 3000, 20);
		elist.add(p2);
//		3. �������� ���� ��ü �ٷ� ������ �Բ� �Ҵ�.
		elist.add(new Emp(7003, "���۸�", 4000, 30));
/* �Ҵ�� ��ü �������� 
 * 		elist.get(index) ==> �Ҵ�� ��ġ�� �ִ� ��ü (Emp)
 * */
//		�ι�° �ִ� Emp��ü�� ename���� �����´�.
		System.out.println(elist.get(1).getEname());
//		ù��° �ִ� Emp ��ü�� sal�� �����÷���?
		System.out.println(elist.get(0).getSal());
/*��ü �����͸� list �ϴ� ���
 * 1) for(������ü:list���迭)
 * 2) for(int idx=0;idx<ũ��;idx++)
 * ũ�� : elist.size(), elist.get(0)
 * */
		for(Emp emp:elist){
			System.out.print(emp.getEmpno()+"\t");
			System.out.print(emp.getEname()+"\t");
			System.out.print(emp.getSal()+"\t");
			System.out.print(emp.getDeptno()+"\n");
		}
		for(int idx=0;idx<elist.size();idx++){
			System.out.print(elist.get(idx).getEmpno()+"\t");
			System.out.print(elist.get(idx).getEname()+"\t");
			System.out.print(elist.get(idx).getSal()+"\t");
			System.out.print(elist.get(idx).getDeptno()+"\n");
		}
		
	}

}
