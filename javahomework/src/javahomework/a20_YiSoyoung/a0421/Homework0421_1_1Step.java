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
class Restaurant{
	public void orderFood(String ...foods){
		for(String food : foods)
			System.out.println("�ֹ��Ͻ� ������ " + food);
	}
}
public class Homework0421_1_1Step {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		restaurant.orderFood("«��","¥���");
	}
}