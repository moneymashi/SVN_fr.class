package javahomework.a20_YiSoyoung.a0426;
/* Ȯ�ο���
 * 1�ܰ� - Audio Ŭ���� ���� main()���� ȣ��
 * 2�ܰ�(����)
 		- AttackWay �������̽� - �߻�޼ҵ� attack()
 		- RocketAttackŬ���� ; AttackWay�� ����(��Ӱ��� �����ؼ� ���� å�� ǥ���մϴ�)�� ���� Ŭ���� 
				�޼ҵ� : attack() ���� �����ϴ�
		- Robot Ŭ���� ; 
				�ʵ� : attackWay
				�޼��� : showAttack(){attack();}
 * */
interface AttackWay{
	public void attack();
}
class RocketAttack implements AttackWay{
	@Override
	public void attack() {
		System.out.println("���� �����ϴ�");	
	}
}
class Robot{
	private RocketAttack rocketAttack;
	public Robot(){	
		rocketAttack = new RocketAttack();	
	}
	public void showAttack(){
		System.out.print("�κ��� ");
		rocketAttack.attack();
	}
	public void setRocketAttack(RocketAttack rocketAttack) {
		this.rocketAttack = rocketAttack;
	}
}
public class A14_interfaceExp_Homework {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.showAttack();
	}
}
