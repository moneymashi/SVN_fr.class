package javahomework.a23_Janghyeyeong.a170419.Step1;

class Intro{
	String name;
	String loc;
	int age;
	
	Intro(String name){
		this.name=name;
	}
	
	void inputData(String loc, int age){
		this.loc=loc;
		this.age=age;
		return;
	}
	
	void introMyself(){
		System.out.println(" �� �̸��� "+name+"�̰�, ���̴� "
				+age+"�̸�, ��� ���� "+loc+"�Դϴ�.");
	}
	
}

public class introduceExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intro i1 = new Intro("ȫ�浿");
		
		i1.inputData("����", 24);
		i1.introMyself();
		

	}

}
