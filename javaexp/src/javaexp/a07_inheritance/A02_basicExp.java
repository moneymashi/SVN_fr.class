package javaexp.a07_inheritance;
class Vehecle{
	String kind;
	int maxVel;
	// ������ ������ �Է�..
	Vehecle(String kind, int maxVel){
		this.kind=kind;
		this.maxVel=maxVel;
	}
	Vehecle(){
		this("Ż��(�⺻��)", 100);
	}
	// �޼���.
	void setData(String kind, int maxVel){
		this.kind=kind;
		this.maxVel=maxVel;
	}
	void showInfo(){
		System.out.println(kind+
				"�̸�, �ְ� �ӵ��� "+maxVel+"(km/h)�Դϴ�");		
	}
}
class Car extends Vehecle{
	int personCnt;
	// super : ��Ӱ����� ����Ŭ������ ���(������, �ʵ�, �޼���)�� ��Ī
	// 1) ������ : super( )
	// 2) �ʵ�, �޼��� : super.XXXX
	Car(String kind, int maxVel, int personCnt){
		// ����Ŭ������ �����ڸ� ȣ��..
		super(kind, maxVel);
		this.personCnt=personCnt;
	}
	void driverCar(){
		showInfo();
		System.out.println("Ÿ�� ����� "+personCnt+"�� �Դϴ�.");
	}
}

public class A02_basicExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("�ƿ��", 270, 2);
		c.driverCar();
	}

}
