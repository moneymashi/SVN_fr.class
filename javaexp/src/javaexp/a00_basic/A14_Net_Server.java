package javaexp.a00_basic;

import java.io.*;
import java.net.*;

public class A14_Net_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Server���α׷�..demon
 * 
 * 
 *    client�� �����ϸ� Ư�� ���� ����.
 *    
 * Client���α׷�  
 * 	  Server�� �����ؼ� ������ ���� ����..
 * */
		// ����� ���ؼ� ServerSocket ����..
		ServerSocket s =null;
		//  ��ü ServerSocket(port��ȣ)
		try {
			s = new ServerSocket(5433);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// �ܺο��� Ư���� ������ ������ ��, accept()
		// ������ �������� demon���� loading.. ==> client..
		while(true){
			
			try {
				Socket s1 = s.accept();
				// client�� ������, �� client���� ���ڿ��� �Ѱ��ִ� ó��.
				// OutputStream() : ���ó���ϴ� Stream
				OutputStream s1out=s1.getOutputStream();
				// ObjectOutputStream : ���ڿ��� �Ѱ��ִ� ó���� ���� ��ü..
				ObjectOutputStream dos = new ObjectOutputStream(s1out);
				// writeObject�� ���ؼ� ������ Ŭ���̾�Ʈ���� ���ڿ��� �Ѱ���..
				dos.writeObject("� ������!! ��ſ� SERVER�Դϴ�!!");
				dos.close();
				s1.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Ư���� network���� ���ڳ� Ư�� ������ ��������
			// �� ��, Socket ��ü�� Ȱ��..
			
			
		}
		
		
		
	}

}
