package javaexp.a13_stream;

import java.io.IOException;
import java.io.InputStream;

public class A02_StreamByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is=null;
		// �Է¹��� �����͸� byte[]�� ����.
		byte[] barry = new byte[5];
		System.out.println("�����͸� �Է��ϼ���!!:");
		is = System.in;
		try {
// �Է¹��� ������ �Ǽ� return
			int cnt = is.read( barry );
			System.out.println("�Է¹��� ������ ũ��:"+cnt);
			System.out.println("�Է� ���� ������..");
			for(byte indata:barry){
				System.out.println("�Է¹�����:"+(char)indata);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// �ڿ� ����
		}
		
	}

}
