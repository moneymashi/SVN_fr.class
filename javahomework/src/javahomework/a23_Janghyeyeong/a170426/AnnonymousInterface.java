package javahomework.a23_Janghyeyeong.a170426;
/*
���Ǳ� (�������̽�)
�߻�޼���
display();	@@@@�� �Ǹ��ϴ� ���Ǳ�
menu(); 	1. @@ : @@@@����.
����޼���
insertCoin(�Է°�) @@@ ���� �ԷµǾ����ϴ�.
choiceMenu(��ȣ�� ���ڿ�)
outProduct() @@@�� ���ɴϴ�. �ܾ��� @@@�Դϴ�.
*/
interface VendingMachine{
	String NAMES[] = {"�Ƹ޸�ī��","ļ��Ḷ���ƶ�","ī���","��������"};
	int PRICE[] ={2000,3000,4000,5000};
	
	public void display();
	public void menu();
	default void outProduct(int insertCoin, int choiceMenu){
		System.out.println(insertCoin+"���� �ԷµǾ����ϴ�.");
		if(insertCoin>=PRICE[choiceMenu-1]){
			System.out.println("\""+NAMES[choiceMenu-1]+"\"�� ���ɴϴ�.");
			System.out.println("�ܾ��� "+(insertCoin-PRICE[choiceMenu-1])+"�� �Դϴ�.");
		}else
			System.out.println("�ܾ��� �����մϴ�.");
		
	};
}

public class AnnonymousInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VendingMachine coffee = new VendingMachine(){
	
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("###Ŀ�Ǹ� �Ǹ��ϴ� ���Ǳ�###");
			}

			@Override
			public void menu(){
				for(int i=0; i<NAMES.length; i++){
					System.out.println((i+1)+". "+NAMES[i]+" : "+PRICE[i]);
					if(i==NAMES.length-1){
						System.out.println("\n�޴��� ���ڸ� �����ּ���.");
					}
				}
			}
		};
		
		coffee.display();
		coffee.menu();
		coffee.outProduct(5000, 4);
		coffee.outProduct(3000, 4);
	}

}
