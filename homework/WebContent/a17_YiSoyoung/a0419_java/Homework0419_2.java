package javaexp.a06_object;
/* Ȯ�ο���
 * Mart Ŭ���� - ���Ǹ�, �ܰ�, ����, cart()
 * */
class Mart{
	private String name;
	private int unitPrice;
	private int ps;
	public Mart(){}
	public int cart(String name, int unitPrice, int ps){
		this.name = name;
		this.unitPrice = unitPrice;
		this.ps = ps;
		calcu();
		return unitPrice*ps;
	}
	private void calcu(){
		System.out.println("���Ǹ� : "+name + "\t�ܰ� : "+unitPrice+"\t���� : "+ps);
	}
}
public class Homework0419_2 {
	public static void main(String[] args) {
		int money = 0;
		Mart homeplus = new Mart();
		money += homeplus.cart("�����", 1000, 2);
		money += homeplus.cart("��������", 5000, 2);
		System.out.println("������������������������������������������");
		System.out.println(" ��Ʈ�� �� ���� �� "+money+"���Դϴ�");
	}
}
