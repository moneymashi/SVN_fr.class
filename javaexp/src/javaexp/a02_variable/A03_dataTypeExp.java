package javaexp.a02_variable;

public class A03_dataTypeExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ϸ� ������ list");
		short tranPay=3000;
		short foodPay=5000;
		short spFoodPay=2000;
		int tot=tranPay+foodPay+spFoodPay;
		float avg=tot/3.0F;
		boolean isTarget = tot<=10000;
		System.out.println("�����:"+tranPay+"��");
		System.out.println("�ĺ�:"+foodPay+"��");
		System.out.println("�ٰ���:"+spFoodPay+"��");
		System.out.println("ǰ�� ��� ���:"+avg+"��");
		System.out.println("�Ѻ��:"+tot+"��");
		System.out.println("��ǥ��� �ʰ�����:"+isTarget+"(10000���Ͻ�)");
	}

}
