package javaexp.a13_stream;

import java.io.Console;
// javaexp.a13_stream.A08_Console
public class A08_Console {
/*
���� ���
bin:path����, classpth ����
c:\temp ���� ���� �� A08_Console.java copy
A08_Console.java�� ��Ű�� ����(package javaexp.a13_stream;)����
cmdâ �ε�
cd .. :���� ��� �̵�
cd temp : �ش� ��� �̵�
c:\temp�� �̵�
javac A08_Console.java
java A08_Console

 * 
 * */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.console()�� ���� �ְܼ�ü ����
		Console console = System.console();
//		���̵� �Է�..
		System.out.print("���̵�! �Է�:");
//		enterŰ �Է� ���� ���δ��� ���ڿ� �Է� : .readLine()
		String id = console.readLine();
//		�н����� �Է�
		System.out.print("�н����� �Է�:");
//		���δ��� �н������� ���ڿ� �Է� : .readPassword()
//		return���� char[]
		char[] passChar = console.readPassword();
//		char[] ==> String  new String(char[])
		String password = new String(passChar);
		System.out.println("�Է��� id�� password");
		System.out.println("ID:"+id);
		System.out.println("PASSWORD:"+password);
		
		
	}

}
