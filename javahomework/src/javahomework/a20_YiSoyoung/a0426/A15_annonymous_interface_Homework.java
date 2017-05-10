package javahomework.a20_YiSoyoung.a0426;
/* ���Ǳ� �������̽�(VendingMachine)
 	- �߻�޼��� : display() @@@�� �Ǹ��ϴ� ���Ǳ�
 				 menu(); @@ : @@��
 	- ����޼��� : insertCoin(�Է°�) @@���� �ԷµǾ����ϴ�
 				 choiceMenu(��ȣ�� ���ڿ�)
 				 outProduct() @@�� ���ɴϴ�. �ܾ��� @@�Դϴ�
 * */
interface VendingMachine{
	public static final String MENU = "Ŀ��";
	public static final int PRICE = 1500;
	public void display();
	public void menu();
	default void insertCoin(int money){
		System.out.println(money+"���� �ԷµǾ����ϴ�");
	}
	default void chioceMenu(int no){	}
	default void outProduct(){
		System.out.print(MENU+"�� ���ɴϴ�");
	}
}
public class A15_annonymous_interface_Homework {
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine() {
			int inMoney;
			@Override
			public void menu() {
				System.out.println("1 : "+MENU +" : "+PRICE);
			}
			@Override
			public void display() {
				System.out.println(MENU+"�� �Ǹ��ϴ� ���Ǳ�");
			}
			@Override
			public void insertCoin(int money) {
				inMoney = money;
				VendingMachine.super.insertCoin(money);
			}
			@Override
			public void outProduct() {
				VendingMachine.super.outProduct();
				if(inMoney>PRICE)
					System.out.println((inMoney-PRICE)+"�� �ܾ��Դϴ�");
				else if(inMoney==PRICE)
					System.out.println("�ܾ��� �����ϴ�");
				else
					System.out.println("�ܾ��� �����մϴ�. �� ��������");
			}
		};
		vendingMachine.menu();
		vendingMachine.insertCoin(2000);
		vendingMachine.outProduct();
	}
}
