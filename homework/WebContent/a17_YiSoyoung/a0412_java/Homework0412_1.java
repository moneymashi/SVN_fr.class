package javaexp.a04_statement;

public class Homework0412_1 {
	public static void main(String[] args) {
		/* ��ǰ list �迭�� ����� ���� list�迭�� �����
		 * ���� for �ι�° ������ �̿��Ͽ� ���	
		 * ������ for ù��° ������ �̿��ؼ� ���� ���*/
		String[] products = {"���","��","�Ұ��","����"};
		int[] prices = {5000,2000,22000,4000};
		System.out.println("����������������������������������");
		System.out.println("��\t���Ǹ�\t��");
		System.out.println("����������������������������������");
		for(String product : products){
			System.out.println("��\t"+product+"\t��");
		}
		System.out.println("����������������������������������");
		System.out.println("����������������������������������");
		System.out.println("��\t����\t��");
		System.out.println("����������������������������������");
		for(int price : prices){
			System.out.println("��\t"+price+"\t��");
		}
		System.out.println("����������������������������������");
		System.out.println("������������������������������������������������������������������");
		System.out.println("��\t���Ǹ�\t��\t����\t��");
		System.out.println("������������������������������������������������������������������");
		for(int idx=0 ; idx<products.length ; idx++){
			System.out.println("��\t"+products[idx]+"\t��\t"+prices[idx]+"\t��");
		}
		System.out.println("������������������������������������������������������������������");
	}
}