/*
 ����
 1) �θ�
 Ŭ���� Vehicle
 �ʵ� : ����, �ְ�ӵ�
 �޼��� : showInfo()
 @@@�ε� �ְ� �ӵ��� @@@��
 2) �ڽ�
 Ŭ���� Car
 �޼��� driverCar()
 @@@@�ε� �ְ�ӵ��� @@@��
 Ÿ�� ����� @@@@���̴�.
*/
package javahomework.a13_SeoJunghyo;
class Vehicle{
	String kind;
	int maxSpeed;
	Vehicle(String kind, int maxSpeed){
		this.kind=kind;
		this.maxSpeed=maxSpeed;
	}

	void showInfo(){
		System.out.println("����: "+kind);
		System.out.println("�ְ�ü�: "+maxSpeed+"km/h");
	}
}
class Car extends Vehicle{
	int personCnt;
	Car(String kind, int maxSpeed, int personCnt){
		super(kind, maxSpeed);
		this.personCnt=personCnt;
	}
	void showInfo2(){
		showInfo();
		System.out.println("ž���ο�: "+personCnt+"��");
	}

}
public class a03_homework_car_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("�ƿ��", 270);
		v1.showInfo();
		Car c1 = new Car("BMW", 260, 15);
		c1.showInfo2();

	}

}
