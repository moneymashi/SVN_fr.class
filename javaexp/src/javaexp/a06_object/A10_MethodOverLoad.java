package javaexp.a06_object;

class ShoppingMall{
	String name;
	String prodName01; //
	String prodName02;
	String prodName03;
	int price01;
	ShoppingMall(String name){
		System.out.println("�¶��� ���θ� "+name+"�� ���� ���� ȯ���մϴ�!!");
	}
	// �Ű� ���� ������ �ٸ� �͵� ���𰡴�.
	void buyProduct(String prodName01){
		this.prodName01 = prodName01;
	}
	void buyProduct(String prodName01, String prodName02){
		this.prodName01 = prodName01;
		this.prodName02 = prodName02;
	}	
	// �Ű������� type�� �ٸ��� ������ �̸��� �޼��� ���𰡴�.
	void buyProduct(int price01){
		this.price01=price01;
	}
	// �Ű������� type�� ���ڰ� �����ϴ���, �ٸ� type�� �Ű�������
	// ������ �ٸ��� ���𰡴�.
	void buyProduct(String prodName01, int price01){
		this.prodName01=prodName01;
		this.price01 = price01;
	}
	void buyProduct( int price01, String prodName01){
		this.prodName01=prodName01;
		this.price01 = price01;
	}	
}
public class A10_MethodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
