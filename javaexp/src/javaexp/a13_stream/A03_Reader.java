package javaexp.a13_stream;

import java.io.*;

public class A03_Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**/
		InputStreamReader reader=null;
		System.out.println("���ڿ��Է�:");
		InputStream in = System.in;
		reader = new InputStreamReader(in);
		
		try {
			int n = reader.read();
			System.out.println("�Էµ� ���ڿ�:"+(char)n);
			// �Է��� ���ڿ� �迭.
			char[] chArr=new char[10];
			int cnt = reader.read( chArr );
			System.out.println("�Է��� ���ڿ��� ũ��:"+cnt);
			System.out.print("�Է��� ����:");
			for(char c:chArr){
				System.out.print(c);
			}
			System.out.println();
			System.out.println("�Է�����!!");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
