package javaexp.a06_object;

class Mart{
	String prodName;
	int price;
	int cnt;
	int tot;
	Mart(){}
	Mart(String name){
		System.out.println("~~"+name+"��Ʈ�� ���� ���� ȯ���մϴ�!! ");
		System.out.println("### ���Ź�ǰ ��Ȳ ###");
		System.out.println("���Ǹ�\t����\t����\t��");		
	}
	int cart(String prodName, int price, int cnt){
		this.prodName=prodName;
		this.price=price;
		this.cnt=cnt;
		tot=price*cnt;
		return tot;
	}
	void calcu(){
		System.out.print(prodName);
		System.out.print("\t"+ price);
		System.out.print("\t"+cnt);
		System.out.println("\t"+tot);
	}
	
}
public class A09_MethodExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mart m = new Mart();
//		System.out.println("### ���Ź�ǰ ��Ȳ ###");
//		System.out.println("���Ǹ�\t����\t����\t��");
		Mart m = new Mart("�ູ");		
		int sum=m.cart("���", 3000, 2);
		m.calcu();
		sum+=m.cart("�ٳ���", 4000, 3);
		m.calcu();
		sum+=m.cart("����", 12000, 2);
		m.calcu();
		System.out.println("�Ѱ� :"+sum+"��");
	}

}
