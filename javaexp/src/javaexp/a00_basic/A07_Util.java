package javaexp.a00_basic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class A07_Util {
	public static void main(String args[]){
		String greet="Hello";
		// ���ڿ� �ٲ� ó�� replace
		System.out.println(greet.replace('o', 'i'));
		// substring(�ε���, ����) : �κ����..
		System.out.println(greet.substring(2, 4));
		// length() : ���ڿ��� ���� ���..
		System.out.println(greet.length());
		// Wrapper Ŭ����
		// primitive data�� ��üȭ ���� ��� ó���� �Ҽ� �ְ� ������..
		// int ==> Integer
		// double ==> Double
		// char ==> Character
		Integer int01 = new Integer("25");
		Double dbl01 = new Double("27.5");
		Character c01 = new Character('c');
		System.out.println(int01.toString());
		System.out.println(dbl01.doubleValue());
		System.out.println(c01.toString());
		/* Random Ŭ����
		 * ������ ���� ��Ÿ��..
		 * nextInt(100) : 1���� 100 ������ ������ ���..
		 class�� ����.. ���� 
		 import java.util.Random;
		 import XXX  : Ư���� ��� Ŭ������ �⺻������ �������� ���� ��, Ȱ��. 
		 * */
		Random ran = new Random();
		int num = ran.nextInt(100);
		// �����մϴ� - 0~99
		// uniformly distributed int value between 0 
		// (inclusive) and the specified value (exclusive),
		System.out.println("0~99 ������ ��:"+num);
		float f = ran.nextFloat();
		System.out.println("0.0���� 1.0���� ������ ��:"+f);
		boolean b = ran.nextBoolean();
		System.out.println("true/false ������ ��:"+b);
/*	SimpleDateFormat :  ��¥�� ���ϴ� ��0������ ����� ��, Ȱ��ȴ�..*/
/*	SimpleDateFormat("yyyy��  MM�� dd�� HH:mm:ss a")
 * 	yyyy : �⵵,  MM: ��, dd: ��   HH:�ð�  mm:��  ss:��  a:am/pm ó��.
 * */		
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy��  MM�� dd�� HH:mm:ss a");
		// .format() :�޼��带 Ȱ���ؼ� ���� ��¥�� ���� ������ ó��..
		String date = sdf.format(new Date());
		System.out.println(date);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
