package javahomework.a20_YiSoyoung.a0509;

import java.util.ArrayList;

/* Foods Ŭ���� : ���ĸ�, ����
 * 	ArrayList�� 3�� �ְ� ���(add()�̿�)
 * 	������
 * No ���ĸ�  ����
 * 1  XXX    XX
 * 2  XXX    XX
 * 3  XXX    XX
 */
class Foods{
	private static int cnt = 0;
	private int no;
	private String name;
	private int price;
	public Foods(){}
	public Foods(String name, int price){
		no = ++cnt;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		String temp = no+"\t "+name+"\t"+price;
		return temp;
	}
}
public class A02_Exp2 {
	public static void main(String[] args) {
		ArrayList<Foods> foods = new ArrayList<Foods>();
		foods.add(new Foods("�Ұ�ⵤ��",7000));
		foods.add(new Foods("ġ�����",7500));
		foods.add(new Foods("�����Ұ��",8000));
		System.out.println("NO\t���ĸ�\t\t����");
		System.out.println("��������������������������������");
		for(Foods food : foods)
			System.out.println(food);
	}
}
