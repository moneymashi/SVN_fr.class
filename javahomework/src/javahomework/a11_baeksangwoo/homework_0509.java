package javahomework.a11_baeksangwoo;

import java.util.ArrayList;

public class homework_0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sellList = new ArrayList<String>();
		ArrayList<String> buyList = new ArrayList<String>();
		String fruitList[] = {"apple", "banana", "strawberry", "orange", "watermelon"};	
		
		for(int i=0; i<fruitList.length; i++){
			sellList.add(i,fruitList[i]);
		}
		System.out.println("1�ܰ� sellLists");
		for(String sl : sellList) System.out.print(sl+" ");
		System.out.println();
		
		buyList.add(fruitList[0]);
		buyList.add(fruitList[2]);
		sellList.remove("apple");
		sellList.remove("strawberry");
		
		System.out.println("2�ܰ� buyList ");
		for(String bl : buyList) System.out.print(bl+" ");
		System.out.println();
		System.out.println("2�ܰ� sellList ");
		for(String sl : sellList) System.out.print(sl+" ");
		System.out.println();
		
		sellList.set(0, "apple");
		System.out.println("3�ܰ� sellList ");
		for(String sl : sellList) System.out.print(sl+" ");
		System.out.println();
		
		buyList.remove("apple");
		buyList.remove("strawberry");
		System.out.println("4�ܰ� buyList ");
		for(String bl : buyList) System.out.print(bl+" ");
		System.out.println("���� �� ����");
		
		int whichFruit = (int)(Math.random()*3);
		buyList.add(sellList.get(whichFruit));
		System.out.println("����ǰ���� ���� ���ϸ� : "+sellList.get(whichFruit));
		
		
	}
}
/* ��� �ٳ��� ���� ������ ���� ���� 
 * �庸�� ����� ����� ���� ����
 * 
 * remove, add
 * �ٳ����� -> ����� ���� 
 * �庸�� ����� ����� ���� �� ����
 * �庸�� ����� ������ �ִ� ������ ���ٸ� ���ϰ��Կ��� ���� ���� �� �ϳ��� �庸�� ������� ����ǰ 
 * 
 * 
 * 
 */
