package javahomework.a20_YiSoyoung.a0509;

import java.util.ArrayList;

/* Food Ŭ���� : ���ĸ�, ����
 * 	ArrayList�� 3�� �ְ� ���(add()�� get()�̿�)
 * 	������
 * No ���ĸ�  ����
 * 1  XXX    XX
 * 2  XXX    XX
 * 3  XXX    XX
 */
class Food{
	private String name;
	private int price;
	public Food(){}
	public Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		String temp = "\t "+name+"\t"+price;
		return temp;
	}
}
public class A02_Exp {
	public static void main(String[] args) {
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(new Food("�Ұ�ⵤ��",7000));
		foods.add(new Food("ġ�����",7500));
		foods.add(new Food("�����Ұ��",8000));
		System.out.println("NO\t���ĸ�\t\t����");
		System.out.println("��������������������������������");
		for(int idx=0 ; idx<foods.size() ; idx++)
			System.out.println(""+(idx+1)+foods.get(idx));
	}
}
