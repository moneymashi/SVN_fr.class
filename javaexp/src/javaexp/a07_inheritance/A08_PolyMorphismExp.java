package javaexp.a07_inheritance;

class Vehicle{
	String kind;
	int maxSpeed;
	int curSpeed;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String kind, int maxSpeed) {
		this.kind = kind;
		this.maxSpeed = maxSpeed;
	}

	void speedUp(){
		curSpeed++;
		if(curSpeed>maxSpeed){
			curSpeed=maxSpeed;
		}
		System.out.println("�ӵ��� �����Ǿ� ���� �ӵ�:"+curSpeed);
	}
	public void driver(){
		System.out.println(kind+"�� ������ �մϴ�!");
	}
}
class Bus extends Vehicle{
	Bus(){
		super("����",100);
	}
	// ������
	void speedUp(){
		curSpeed+=10;
		if(curSpeed>maxSpeed){
			curSpeed=maxSpeed;
		}
		System.out.println("�ӵ��� �����Ǿ� ���� �ӵ�:"+curSpeed);
	}	
	// ������
	public void driver(){
		System.out.println(kind+"�� ���� �°����� �¿�� ������ �մϴ�!");
	}		
}
class Ship extends Vehicle{
	Ship(){
		super("��",60);
	}
	void speedUp(){
		curSpeed+=3;
		if(curSpeed>maxSpeed){
			curSpeed=maxSpeed;
		}
		System.out.println("�ӵ��� �����Ǿ� ���� �ӵ�:"+curSpeed);
	}	
	public void driver(){
		System.out.println(kind+"�� ���� �°����� �¿�� �� ���� �����մϴ�!!");
	}		
}
public class A08_PolyMorphismExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Bus();
		v1.speedUp();
		v1.speedUp();
		v1.speedUp();
		v1.driver();
		Vehicle v2 = new Ship();
		v2.speedUp();
		v2.speedUp();
		v2.speedUp();
		v2.driver();
		// ���� type [] ���� = {���� ��ü1(),���� ��ü2(), ���� ��ü3() }
		Vehicle []veArray={new Bus(),new Bus(), new Ship(), new Ship()};
		for(Vehicle v:veArray){
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.driver();
		}
	}

}
