package z00_exp;


class Product{
	String pname;
	int price;
	int ea;
	int totP;
	Product(){}
	Product(String pname){
		System.out.println("~~"+pname+"��Ʈ�� ���� ���� ȯ���մϴ�!! ");
		System.out.println("### ���Ź�ǰ ��Ȳ ###");
		System.out.println("���Ǹ�\t����\t����\t��");	
	}
	
	
	int cart(String pname, int ea, int price){
		this.pname=pname;
		this.price = price;
		this.ea=ea;
		this.totP=0;
		totP=price*ea;
		return totP;
	}
	
	void calc(){
		System.out.print(pname);
		System.out.print("\t"+price);
		System.out.print("\t"+ea);
		System.out.println("\t"+totP);
	}
}

public class hw_0419_1 {

	public static void main(String[] args) {
		 Product p = new Product("���� ");
		 int sum = p.cart("������", 2,100);
		 p.calc();
		 sum += p.cart("��  ��", 1, 333);
		 p.calc();
		 sum += p.cart("�̾���", 1, 3);
		 p.calc();
	}

}
