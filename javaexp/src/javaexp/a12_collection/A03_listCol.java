package javaexp.a12_collection;

import java.util.ArrayList;

public class A03_listCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> favors=new ArrayList<String>();
		favors.add("�ڵ���"); // add:�߰�
		System.out.println("add");for(String favor:favors) System.out.println(favor);
		favors.add(0,"������"); // Ư�� ��ġ�� �߰�.
		System.out.println("add(idx,)");for(String favor:favors) System.out.println(favor);
		System.out.println("get(1)"); System.out.println(favors.get(1));
		// ���� remove(index)
		System.out.println("remove(0)"); favors.remove(0);
		System.out.println("������");for(String favor:favors) System.out.println(favor);
		// ���� �÷����� ��� �ִ��� ���� ���� : isEmpty()
		System.out.println("isEmpty()"); System.out.println(favors.isEmpty());
		// ���� ��ü ���� ó�� ��, Ȯ��
		favors.remove(0);System.out.println(favors.isEmpty());
		favors.add("�ð�"); for(String favor:favors) System.out.println(favor);
		// set(index, ������ ��ü)
		System.out.println("����");favors.set(0, "��ǻ��");
		for(String favor:favors) System.out.println(favor);
		
		

		
		
		
	}

}
