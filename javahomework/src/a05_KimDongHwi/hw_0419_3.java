package a05_KimDongHwi;

class Intro{
	String name;
	String loc;
	int age;
	
	Intro(){}
	Intro(String name){
		this.name=name;
	}
	
	void inputData(String loc, int age){
		this.loc = loc;
		this.age = age;
	}

    void introMyself() {
		System.out.println("�� �̸��� "+name+"�̰�, ���̴� "+age+"�� �̰�, ��� ���� "+loc+"�Դϴ�.");
	}
}

public class hw_0419_3 {

	public static void main(String[] args) {
		Intro n =new Intro("kdh");
		n.inputData("seoul",29);
		n.introMyself();
				
	
	}

}