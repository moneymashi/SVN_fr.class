package javaexp.a06_object;
class Computer{
	String comp;
	int price;
	String memory="8G";
	
	// �����ڸ� ���� �ʱⰪ ����
	// �����ڸ�(dataType ����������1, dataType ����������2)
	Computer(String comp, int price, String memory){
		// field�� �������� ������ �̸��� �����ϱ� ���� 
		// this. : (����  class��).field
		this.comp=comp; // �����ڸ� ���ؼ� �Է¹��� �����͸� field���� ���
		this.price=price;
		this.memory=memory;
		
	}
	// �����ڰ� ����� ���Ƿ� �����Ǹ�, ���� default�����ڴ�  
	// �������⿡, default �����ڵ� Ȱ���Ϸ��� �����Ͽ��� �Ѵ�.
	Computer(){}
}
public class A04_FieldInit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer p1 = new Computer();
		System.out.println("��ü�� field �ʱⰪ");
		System.out.println(p1.comp);
		System.out.println(p1.price);
		System.out.println("�ʱ⿡ �Ҵ�� ���� ���� ��(�������� ����)");
		System.out.println(p1.memory);
		// Computer(String comp, int price, String memory)
		// �����ڸ� ���ؼ� �ʱⰪ �Ҵ�
		Computer p2 = new Computer("�Ｚ����",1500000,"16GB");
		System.out.println("p2:"+p2.comp);
		System.out.println("p2:"+p2.price);
		System.out.println("p2:"+p2.memory);
		
	}

}
