package javaexp.a10_api;

import java.util.regex.Pattern;

public class A08_regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ȭ��ȣ ���Խ� pattern ����
		//  (01|010)-\d{3,4}-\d{4}
		//  �ڹٿ��� \ó���ҷ���.. \ ==> Ư������ó��
		String regExp ="(01|010|070)-\\d{3,4}-\\d{4}";
		String data1 = "010-123-4578";
		String data2 = "070-123-4578";
		String data3 = "010-1234-45783";
		boolean ch01 = Pattern.matches(regExp, data1);
		boolean ch02 = Pattern.matches(regExp, data2);
		boolean ch03 = Pattern.matches(regExp, data3);
		System.out.println("data1�� ����ǥ���� ��������:"+ch01);
		System.out.println("data2�� ����ǥ���� ��������:"+ch02);
		System.out.println("data3�� ����ǥ���� ��������:"+ch03);
	}

}
