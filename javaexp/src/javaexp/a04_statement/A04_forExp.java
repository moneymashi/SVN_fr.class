package javaexp.a04_statement;

public class A04_forExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []products={"���","��","�Ұ��","����"};
		int []prices={5000,2000,22000,4000};
		System.out.println("###���Ǹ�###");
		for(String product:products){
			System.out.println(product);
		}
		System.out.println("###����###");
		for(int price:prices){
			System.out.println(price);
		}
		System.out.println("###���Ǹ�/����###");
		for(int idx=0;idx<products.length;idx++){
			System.out.println(products[idx]+"\t"+prices[idx]);
		}
	}

}
