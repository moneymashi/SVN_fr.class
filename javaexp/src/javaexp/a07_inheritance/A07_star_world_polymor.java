package javaexp.a07_inheritance;

/*
Zerggling : �����
     
Larba(�ʱ�) : ����Ŭ����
	attack() ����
��ӹ��� ���� ��ü..
   Dron  attack() ������ �ٸ� ���ݹ��
   Zerggling  attack() ������ �ٸ� ���ݹ��
   Hydrisk   attack() ������ �ٸ� ���ݹ��
����..
Larba l01 = new Dron();  l01.attack();
Larba l02 = new Zerg();  l02.attack();
Larba l03 = new Hydrisk();   l03.attack();  
 * */
class Larba{
	String unitKind;
	Larba(){
		unitKind="���";
	}
	public Larba(String unitKind) {
		this.unitKind = unitKind;
	}	
	public void attack(){
		System.out.println(unitKind+"�� ������ �ϴ�!!");
	}
}
class Dron extends Larba{
	Dron(){
		super("���");
	}
	// attack()�� ������
	public void attack(){
		System.out.println(unitKind+"�� ���ݷ� 5�� �����մϴ�.");
	}
}
class Zerggling extends Larba{
	Zerggling(){
		super("���׸�");
	}
	// attack()�� ������
	public void attack(){
		System.out.println(unitKind
				+"�� ���ݷ� 5�� ���� ���� �����մϴ�.");
	}
}
class Hydrarisk extends Larba{
	Hydrarisk(){
		super("�����");
	}
	// attack()�� ������
	public void attack(){
		System.out.println(unitKind
				+"�� ���ݷ� 10�� �̻��� �����մϴ�.");
	}
}
public class A07_star_world_polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Larba l01 = new Larba();
		l01.attack();
		// �������� �Ͼ �θ�Ÿ�Կ� ��� �ڽ� ��ü�� ���԰���
		Larba l02 = new Dron();
		Larba l03 = new Zerggling();
		Larba l04 = new Hydrarisk();
		l02.attack();
		l03.attack();
		l04.attack();
	}

}
