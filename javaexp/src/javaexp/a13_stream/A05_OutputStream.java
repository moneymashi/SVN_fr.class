package javaexp.a13_stream;

import java.io.*;

public class A05_OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out: �ڹٿ��� �����ϴ� ��� �⺻��ü
//		println() : ȭ�鿡 ���ó���޼���
//
		String fileName="C:/a01_prog/eclipse/workspace_server/javaexp/src/javaexp/a13_stream/test01.txt";
		try {
			OutputStream os = new FileOutputStream(fileName);
			// ���Ͽ� ����� ���ڿ� ����..
			byte[] data = "Good! Man2".getBytes();
			for(byte b:data){
				os.write(b);
			}
					
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
