package javaexp.a13_stream;

import java.io.*;

public class A07_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fold="C:/a01_prog/eclipse/workspace_server/javaexp/src/javaexp/a13_stream/";
		String fname=fold+"test03.txt";
		// Writer�� ���ؼ� File�� ���� ó��..--> FileWriter
		Writer writer=null;
		try {
			// new FileWriter(fname) ���� IO �߻����� ����ó�� �ʼ�
			writer = new FileWriter(fname);
			char[] data = "�̸���".toCharArray();
			for(char ch:data){
				writer.write(ch);
			}
			writer.write("\n���̸�~~~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				// Writer : ���ڿ� ��� ��Ʈ���� ���ο� ����
				// ���۰� �־ �����Ͱ� ��µǱ� ���� ���ۿ� �׿�
				// �ٰ� ������� ����Ѵ�.
				// �ڿ�������, ���ۿ� �ܷ��ϰ� �ִ� �����͸� ���
				// ��� ��Ű�� �ڿ����� �ϴ� ���� �Ϲ����̴�.
				writer.flush();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
