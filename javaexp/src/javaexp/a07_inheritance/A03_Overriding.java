package javaexp.a07_inheritance;

class Member{
	String name;
	int sal;
	public Member(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public void showInfo(){
		System.out.print("�̸��� "+name+"�̸�, ");
		System.out.println("�޿��� "+sal+"����  �Դϴ�! ");
	}
}
class Deputy extends Member{
	String depart;
	public Deputy(String name, int sal, String depart){
		super(name, sal);
		this.depart = depart;
	}
	// �޼��� ������(overriding)
	public void showInfo(){
		// ������ �޼��� ������ Ȱ��..
		super.showInfo();
		// ������ �޼��忡�� �߰� ������ ó��..
		System.out.println("�μ��� "+depart+" �Դϴ�!!");
	}
}

public class A03_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem = new Member("������", 3000);
		Deputy dep01 = new Deputy("�ſ���",4000,"IT�����");
		mem.showInfo();
		dep01.showInfo();
	}

}
