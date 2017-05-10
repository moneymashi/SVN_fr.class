package javahomework.a00_resolve;

interface AttackWay{
	void attack();
}
class RocketAttack implements AttackWay{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("���ϰ����� �ϴ�.");
	}	
}
class Robot{
	private String name;
	private AttackWay way;
	Robot(String name){
		this.name=name;
	}
	public void setWay(AttackWay way) {
		this.way = way;
	}
	public void showAttack(){  
		
		System.out.println(name+"�� ");
		if(way!=null){
			way.attack();
		}else{
			System.out.println("������ ���� ���մϴ�.");
		}
	}
	
}
public class A0426_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot b1 = new Robot("�Ǵ�");
		b1.setWay(new RocketAttack());
		b1.showAttack();
	}

}
