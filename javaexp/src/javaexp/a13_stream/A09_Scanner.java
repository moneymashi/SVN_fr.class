package javaexp.a13_stream;

import java.util.Scanner;

public class A09_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner Ŭ������ �����ڿ� System.in���ؼ� �Է� ó���Ѵ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���:");
		String name=scan.nextLine();
		System.out.println("�Է��� �̸�:"+name);
		System.out.print("������ �Է��ϼ���:");
		int point = scan.nextInt();
		System.out.println("ȹ���� ����:"+point);
		System.out.print("Ű�� �Է��ϼ���:");
		double height= scan.nextDouble();
		System.out.println("�Է��� Ű:"+height);
		
	}

}
