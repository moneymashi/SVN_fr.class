package javaexp.a06_object;

class Television{
	// static�� ��ü���� ��, ���Ǵ� �ʵ尡 �ƴϱ⿡
	// Ŭ������ �ٷ� �ؿ��� �ʱ�ȭ�� ���ִ� ���� �����̴�.
	static String company="�Ｚ";
	static String model="OLED";
	int price;
	static String info;
	// static{}�� �־ ����� �ʱ��ʵ带 �ʱⵥ���ͷ� �Ҵ��� �� 
	// �ִ�.
	static{
		info = company+" - "+model;
//		static �ʵ尡 �ƴ� �ʵ�� static{}���� ����� �� ����. 
//		price=15000000; (�����Ͽ���)
		showAll(); // static{}������ static �޼��带 ��밡��.
//		show(); �Ϲ� �޼���� ����� �Ұ����ϴ�.(�����Ͽ���)
	}
	void show(){}
	// static �޼��嵵  ��ü�������� ����� �� �ִ�.
	static void showAll(){
		System.out.println(" ���� TV �Դϴ�!!!");
//		this.price=2000000; staic�޼��� �ȿ��� ��ü ������ ���簴ü(this)
//		                    �ʵ忡 �����͸� �Ҵ����� �� �Ѵ�.
//		this.show(); static �޼��� �ȿ��� �Ϲݸ޼��带 ������� �� �Ѵ�.
		// static ����̳� �޼��忡�� static �ʵ峪 �޼��带 ����ϱ����ؼ�
		// �� ��ü������ �Ͽ����Ѵ�.
		Television  t = new Television();
		t.price=2500000;
		
	}
}
public class A12_StaticFieldInit {
	int number;
	static int stNumber;
	// ���θ޼���� static �޼��� �̱⿡  �Ϲ� �ʵ带 ��ü���� ���� �����
	// �Ұ����ϴ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static �ʵ�� ��ü ������ ������� �޸𸮿� �ø��⿡.
		// Ŭ������.�ʵ�� ���ȴ�.
		System.out.println(Television.info);
		Television.showAll();
		// API�� �ִ� staticŰ���尡 �ִ� �ʵ峪 �޼���� Ŭ������.�޼���/�ʵ�
		// ����Ѵ�.
		System.out.println(Math.random());
		// ���Ұ�.
//		number=25;
		stNumber=27; // static �ʵ��̱⿡ ����� ����.
		
	}

}
