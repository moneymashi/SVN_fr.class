package javaexp.a06_object;
/*
 *  Late HW. Apr21_vehicle.
 * 
 * 
���� 0421.
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

class Vehicle{
	public String kind;
	public int maxVel;
	Vehicle(){}  // �ʼ�..
	Vehicle(String kind, int maxVel){
		this.kind = kind;
		this.maxVel = maxVel;
	}
	public void showInfo(){
		System.out.println(kind+"�ε� �ְ�ӵ��� "+ maxVel+ "mph �Դϴ�.");
	}
}
class Car02 extends Vehicle{
	int riders;
	public Car02(String kind, int maxVel, int riders){
		super(kind, maxVel);
		this.riders = riders;
	}
	public void driverCar(){
		super.showInfo();
		System.out.println("Ÿ�� ����� " + riders + "�� �Դϴ�.");
	}
	
}


public class HW_Apr21_Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v01 = new Vehicle("����", 180);
		v01.showInfo();
		Car02 c02 = new Car02("�ٸ�����", 190, 6);
		c02.driverCar();
	}

}
