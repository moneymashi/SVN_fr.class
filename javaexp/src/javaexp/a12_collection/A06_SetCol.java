package javaexp.a12_collection;

import java.util.HashSet;
import java.util.Iterator;

public class A06_SetCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Set�� �ߺ��� ������� �ʰ�, ����Ȯ������ �� �Ѵ�.
//		HashSet�� Set�������̽��� ��ǥ���� ���� Ŭ����
		HashSet<String> set = new HashSet<String>();
		// add ���ؼ� set�ָӴϿ� ����, ���� ����.
		set.add("100��");
		set.add("100��");
		set.add("500��");
		set.add("500��");
		set.add("1000��");
		System.out.println("�� �ָӴϿ� �ִ� ��ü ��:"+set.size());
//		Set�� Iterator�� ���ؼ� ������ �� �ִ�.
//		iterator() �޼��� Ȱ��..
		Iterator<String> iter=set.iterator();
		String elem="";
		while(iter.hasNext()){ // ��ü ����ŭ loop
			elem=iter.next(); //  ���� ��ü�� ������
			System.out.println(elem);
		}

		
		
	
	}

}
