package javaexp.a06_object;

class QuickBoard{
	private String rider;
	private int curVelocity;
	public QuickBoard(String rider) {
		this.rider = rider;
		System.out.println(rider+"�� �����带 Ÿ��");
	}
	public void speedUp(){
		System.out.println("�ӵ��� �ø��ϴ�.");
		curVelocity++;
		if(curVelocity>20){
			System.out.println("���� �ӵ� 20(km/h)�Դϴ�.");
			curVelocity=20;
		}
		System.out.println("���� �ӵ� "+curVelocity+"(km/h)");
	}
	public void speedDown(){
		System.out.println("�ӵ��� �����ϴ�.");
		curVelocity--;
		if(curVelocity<0){
			System.out.println("���� ���� �ֽ��ϴ�.");
			curVelocity=0;
		}
		System.out.println("���� �ӵ� "+curVelocity+"(km/h)");
	}	
}
public class A20_set_getExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickBoard b01 = new QuickBoard("��ö��");
		for(int cnt=0;cnt<=22;cnt++)
		b01.speedUp();
		for(int cnt=0;cnt<=22;cnt++)
		b01.speedDown();
	
	}

}
