package javaexp.a13_stream;

import java.io.IOException;
import java.io.InputStream;

public class A01_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ű���� �Է� */
//		�Է��� �ֻ��� Stream : InputStream
		InputStream is=null;
//		Ű���� �Է� : System.in.read() �� ó��..
//		System.in ==> InputStream�� ������ü
		is =System.in;
		
//		read()��� �޼��带 ���� ���� ���ڸ� �Է� ���� �� �ִ�.
//		�⺻������ int���� char���� ��ȯ casting�ϸ� ���ڸ� ���� �� �ִ�.
//		io(input/output)�� �߻��ϸ� ����ó��(Exception)�� ���ش�.
		System.out.print("���ڸ� �Է��ϼ���:");
		try {
			int n = is.read();
			// ���� ������ ����Ѵ�.
			System.out.println(n+",���ڷ� ��ȯ:"+(char)n);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
