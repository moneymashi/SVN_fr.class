package javaexp.a07_inheritance;

/*
��Ӱ����� Ŭ���� �����ϱ�..
 * */
class Father{
	// �ʵ�
	String name;
	int age;
	// ������.
	// �޼���
	void setInfo(String name, int age){
		this.name = name;
		this.age = age;
	}
	void showInfo(){
		System.out.print("�̸��� "+name+"�̰�, ");
		System.out.println("���̴� "+age+"�Դϴ�!! ");
	}
}
class Son extends Father{
	String loc;  // �߰� �ʵ� ����
	void setInfo2(String name, int age, String loc ){
		this.name=name;  // ��Ӱ���� �ʵ��� ����
		this.age = age;  // ��Ӱ���� �ʵ��� ����
		this.loc=loc;
	}
	void showInfo2(){
		showInfo();// ���� ������ �ִ� �޼��� ����.(���)
		System.out.println("��� ���� "+loc+"�Դϴ�!!!");
	}
	
}

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		s1.setInfo("�Ƶ�", 25);		
		s1.showInfo();
		Son s2 = new Son();
		s2.setInfo2("��°�Ƶ�", 27, "���� ����");
		s2.showInfo2();
	}

}
