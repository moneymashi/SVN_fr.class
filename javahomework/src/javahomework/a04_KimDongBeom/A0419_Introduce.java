package javahomework.a04_KimDongBeom;

class SelfIntro {
	String name;
	String loca;
	int age;
	
	SelfIntro(String name){
		this.name = name;
	}
	void inputData(String loca, int age){
		this.loca = loca;
		this.age = age;
	}
	
	void introMyself(){
		System.out.println("�� �̸��� "+name+"�̰�, ���̴� "+age+"�̸�, ��� ���� "+loca+"�Դϴ�.");
	}
}

public class A0419_Introduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelfIntro a1 = new SelfIntro("ABC");
		a1.inputData("Seoul", 26);
		a1.introMyself();
	}

}
