package javaexp.a13_stream;

import java.io.File;
import java.io.IOException;

public class A10_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File��ü ����
//		1) ���ϻ���:�����ڿ� ��θ�� ���ϸ� �Է�
		String dir="C:/a01_prog/eclipse/workspace_server/javaexp/src/javaexp/a13_stream/test/";
		String fileName="a03_file.txt";
		
		File file01 = new File(dir+fileName);
//		������ �����ϴ��� ���� check : .exists()
		System.out.println("���� ���翩��:"+file01.exists());
		if(!file01.exists()){
			// ���� ���� �޼��� : .createNewFile()
			// ���ο� ���� ����(IO) ����ó��
			try {
				file01.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		2) ���丮����:�����ڿ� ��θ� �Է�
		
	}

}
