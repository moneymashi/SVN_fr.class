package javaexp.a06_object;

class Car01{
	private String kind;
	private int curSpeed;
	// ������ �ڵ� ����..
	public Car01(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getCurSpeed() {
		return curSpeed;
	}
	public void setCurSpeed(int curSpeed) {
		this.curSpeed = curSpeed;
	}
	public void speedUP(){
		System.out.println(kind+" �ӵ��� �ø��ϴ�!! excel");
		curSpeed+=10;
		if(curSpeed>=120){
			System.out.println("���� �ӵ� �Դϴ�!!");
			curSpeed=120;
		}
		System.out.println("���� �ӵ��� "+curSpeed+"(km/h)~~~");
	}
	
	
}
public class A19_set_getMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car01 c = new Car01("BMW");
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.setCurSpeed(200);
		System.out.println("��ϵ� �ӵ���:"+c.getCurSpeed());
		c.speedUP();
				
	}

}
