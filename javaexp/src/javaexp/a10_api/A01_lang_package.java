package javaexp.a10_api;

import java.io.IOException;

class Person{}
public class A01_lang_package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹ� ��� Ŭ������ �ֻ��� Ŭ����
		Object o01 = new Object();
		// java.lang.Object@15db9742 : Ŭ������@�ּҰ�
		System.out.println("Object�� toString():"+o01.toString());
		Person p = new Person();
//		javaexp.a10_api.Person@6d06d69c
		System.out.println("Person�� toString():"+p.toString());
		
//		System.in : �Է� ���� ��ü.
//		read()�� ���� �Է� ó��
		try {
			System.out.println("���� �����Է�:"+(char)System.in.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out : ��� ���� ��ü.
//		println()�� ���ؼ� ��� ó��
		System.err.println("���� �α� ó�� err.println()");
		
		
	}

}
