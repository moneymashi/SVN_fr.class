package javaexp.a13_stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class A04_ReaderExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������ ������?");
		// �Է¹��� ����
		char inArry[]=new char[20];
		InputStreamReader isr = new InputStreamReader(System.in);	
		try {
		
			isr.read(inArry);
			System.out.print("������ ������ ");
			for(char c:inArry){
				System.out.print(c);
			}
			System.out.println();
			System.out.println("String���� ó��..");
			String chLunch = new String(inArry);
			System.out.println("������ ����:"+chLunch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
