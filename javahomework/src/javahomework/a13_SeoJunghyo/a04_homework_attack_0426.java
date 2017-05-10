/*
 ���� - A14_0426
 �������̽� AttackWay
 �߻�޼��� attack();
 RocketAttack : AttackWay�� ��ӹ��� ���� Ŭ����
 attack() : ���ϰ����ϴ�
 RobotŬ����
 �ʵ�: AttackWay
 �޼��� : showAttack(){ 
 -attack()
 �޼��� setAttackWay(AttackWay attway)
*/
package javahomework.a13_SeoJunghyo;

interface SkillWay{
	void master();
	void cast();
}
class Blizzard implements SkillWay{

	@Override
	public void master() {
		// TODO Auto-generated method stub
		System.out.println("���ڵ� ��ų ���.");
	}

	@Override
	public void cast() {
		// TODO Auto-generated method stub
		System.out.println("���ڵ� ����!");
	}
	
}
class Meteo implements SkillWay{

	@Override
	public void master() {
		// TODO Auto-generated method stub
		System.out.println("���׿� ��ų ���.");
	}

	@Override
	public void cast() {
		// TODO Auto-generated method stub
		System.out.println("���׿� ����!");
	}
	
}
class Sorceress{
	SkillWay s;
	void setSkillWay(SkillWay skill){
		this.s=skill;
	}
	void castSkill(){
		System.out.print("�Ҽ����� ");
		if(s!=null){
			s.master();
			s.cast();
		}else{
			System.out.println("��ų�� ���� ����� ����");
		}
	}
}

public class a04_homework_attack_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blizzard b1 = new Blizzard();
		Sorceress s1 = new Sorceress();
		s1.setSkillWay(b1);
		s1.castSkill();
		Sorceress s2 = new Sorceress();
		s2.castSkill();
		s2.setSkillWay(new Meteo());
		s2.castSkill();

	}

}
