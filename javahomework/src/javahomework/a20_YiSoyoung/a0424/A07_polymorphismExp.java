package javahomework.a20_YiSoyoung.a0424;
/* Vehicle1 Ŭ����
 * 	�Ӽ� : kind, maxSpeed, curSpeed
 * 	�޼ҵ� : speedUp, drive(Ż���� ��� ����)
 * Bus extends Vehicle
 * 	�޼ҵ� : speedUp(�ӵ�����������), drive(����� ���� �¿�� �����Ѵ�)
 * Ship extends Vehicle
 * 	�޼ҵ� : speedUp(�ӵ�����������), drive(����� ���� �¿�� �����Ѵ�) */
class Vehicle1 {
	private String kind;
	private int maxSpeed;
	private int curSpeed;
	public Vehicle1(String kind, int maxSpeed){
		this.kind = kind;
		this.maxSpeed = maxSpeed;
	}
	public void speedUp(){
		if(curSpeed<maxSpeed) curSpeed++;
	}
	public void drive(){System.out.println(kind+"�� �����Ѵ�");}
	public int getCurSpeed() {return curSpeed;}
	public void setCurSpeed(int curSpeed) {this.curSpeed = curSpeed;}
	public int getMaxSpeed() {return maxSpeed;}
	public String getKind() {return kind;}
}
class Bus extends Vehicle1{
	public Bus(String kind, int maxSpeed){super(kind,maxSpeed);}
	public void speedUp(){
		if(getCurSpeed()<=(getMaxSpeed()+10)) 
			setCurSpeed(getCurSpeed()+10);
		else
			setCurSpeed(getMaxSpeed());
	}
	public void drive(){System.out.println(getKind()+"�� ����� ���� �ư� �����Ѵ�");}
}
class Ship extends Vehicle1{
	public Ship(String kind, int maxSpeed){super(kind,maxSpeed);}
	public void speedUp(){
		if(getCurSpeed()<=(getMaxSpeed()+50)) 
			setCurSpeed(getCurSpeed()+50);
		else
			setCurSpeed(getMaxSpeed());
	}
	public void drive(){System.out.println(getKind()+"�� ������ �����Ѵ�");}
}
public class A07_polymorphismExp {
	public static void main(String[] args) {
		Vehicle1 bus = new Bus("���",200);
		Vehicle1 ship = new Ship("������",800);
		bus.speedUp();
		bus.drive();
		ship.speedUp();
		ship.drive();
	}
}