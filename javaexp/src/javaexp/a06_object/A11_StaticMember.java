package javaexp.a06_object;

// Person�� ���� package�ȿ� ����Ǿ� �ֱ⿡.
class Person77{
	int money;
	// static����� static type �ʵ��; ����
	static int comm_money;
	String name;
	Person77(String name){
		this.name=name;
	}
	void currentMoney(){
		System.out.println(name+"���� �ڻ�:"+money);
		System.out.println("���� �ڻ�:"+comm_money);
	}
	
}

public class A11_StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person77 p1 = new Person77("ȫ�浿");
		Person77 p2 = new Person77("�ű浿");
		Person77 p3 = new Person77("��浿");
		p1.money+=1000;
		p1.money+=1000;
		// comm_money�� static�̱⿡ ����������
		// ���̴� ���� �ǹ̰� ���⿡
		// Ŭ����.static����� Ȱ���� �ȴ�.
		Person77.comm_money+=1000; 
		p1.comm_money+=1000;		
		p2.money+=1000;
		p2.money+=1000;
		p2.comm_money+=1000;
		p2.comm_money+=1000;		
		p3.money+=1000;
		p3.money+=1000;
		p3.comm_money+=1000;
		p3.comm_money+=1000;
		// static ������ ��ü ����������� ����������
		// Ȱ��Ǵ� ���� ����̴�.
		p1.currentMoney();
		p2.currentMoney();
		p3.currentMoney();
		
	}

}
