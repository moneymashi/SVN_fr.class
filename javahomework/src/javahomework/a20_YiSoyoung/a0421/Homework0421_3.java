package javahomework.a20_YiSoyoung.a0421;
class Vehicle{
	private String kind;
	private int maxSpeed;
	public Vehicle(String kind, int maxSpeed) {
		this.kind = kind;
		this.maxSpeed = maxSpeed;
	}
	public void showInfo(){
		System.out.println("������ "+kind+", �ְ�ӵ��� "+maxSpeed);
	}
	public String getKind() {return kind;}
	public void setKind(String kind) {this.kind = kind;}
	public int getMaxSpeed() {return maxSpeed;}
	public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}
}
class Car extends Vehicle{
	private int number; //Ÿ�� �����
	public Car(String kind, int maxSpeed, int number){
		super(kind, maxSpeed);
		this.number = number;
	}
	public void driverCar(){
		System.out.print(getKind()+"�ε�, �ְ�ӵ��� "+getMaxSpeed()+"�̴�. ");
		System.out.println("Ÿ�� ����� "+number+"���Դϴ�");
	}
}
public class Homework0421_3 {
	public static void main(String[] args) {
		Car phrsche = new Car("������",250,5);
		phrsche.driverCar();
	}
}
