package javahomework.a20_YiSoyoung.a0421;

/* 1�ܰ� : 
 * 	-���ִ� �������� ���� (Ŭ���� ����)
 *      orderFood(��������ó��)
 *  - ��³���
 *  	�ֹ��Ͻ������� : @@
 *  	�ֹ��Ͻ������� : @@ ����ó��
 *  2�ܰ�
 *   - �����̸��� �����ڷ� �Է¹ް� ó��
 *   - orderFood�� ���ؼ� �ֹ��� ������ ������ ���� ���εǾ� �ִ� ������ ����ؼ� ��꼭
 *   	���� ���ó��
 * */
class Restaurant2{
	private String name;
	private int price;
	public Restaurant2(String name) {
		this.name = name;
		price = 0;
	}
	public void orderFood(String ...foods){
		// �츮 �Ĵ��� «��, ¥��, �����丸 �޴��� �־�
		//«���� 5000�� ¥���� 4000�� �������� 5500������
		System.out.println(" * "+name+" �Ĵ� �ֹ��� * ");
		System.out.println("********************************");
		for(String food : foods){
			if(food.equals("«��")){
				System.out.println("�ֹ��Ͻ� ������ " + food + "\t5000��");
				price += 5000;
			}else if(food.equals("¥��")){
				System.out.println("�ֹ��Ͻ� ������ " + food + "\t4000��");
				price += 4000;
			}else if(food.equals("������")){
				System.out.println("�ֹ��Ͻ� ������ " + food + "\t5500��");
				price += 5500;
			}
		}
		System.out.println("********************************");
		System.out.println("�� ���� : "+price);
	}
}
public class Homework0421_1_2Step {
	public static void main(String[] args) {
		Restaurant2 restaurant2 = new Restaurant2("ȫ�����");
		restaurant2.orderFood("¥��","������");
	}
}