package javaexp.a00_basic;
import java.io.*;
import java.net.*;
public class A15_Net_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Socket (Ŭ���̾�Ʈ ��� ��ü)
		// new Socket("�����ϰ����ϴ� server ip�ּ�", �ش�port);
		// localhost : �ڽ��� ��ǻ�� ȣ�� ip
		try {
			Socket s1 = new Socket("localhost",5433);
			// �Է��ϴ� Stream InputStream
			// ���� ��� OutputStream --> Ŭ���̾�Ʈ InputStream ����..
			// ��� �⺻ ��ü�� �޾ƿ� InputStream
			InputStream is=s1.getInputStream();
			// client console ȭ�鿡 ����Ϸ��� 
			// readObject() ==> ObjectInputStream
			ObjectInputStream dis = new ObjectInputStream(is);
			System.out.println(dis.readObject());
			// �ڿ��� ����..
			dis.close();
			s1.close();
			// ���� SocketServer�� ������ ��,
			// client Socket���� �޾ƿ�
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
