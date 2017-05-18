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
		File dir01 = new File(dir);
//		list() : ���丮�� ��쿡 ���Ե� ������ �̸���
//		���ڿ� �迭�� ������.
		String []list = dir01.list();
		System.out.println("���� ����Ʈ!!");
		for(String fname:list){
			// ���Ե� ������ �̸�
			System.out.println(fname);
		}
		String dir2="C:/a01_prog/eclipse/workspace_server/javaexp/src/javaexp/a13_stream/";
		File dir02 = new File(dir2);
//		listFiles() : ���丮 �� ���� ��ü..
		File[] files = dir02.listFiles();
		System.out.println("�̸�\tũ��\tŸ��");
		for(File file:files){
			// getName() : ���� �̸�
			System.out.print(file.getName()+"\t");
			// length() : ������ ũ��
			System.out.print(file.length()+"\t");
			// ������ ����(dir/file)
			// isDirectory() : ���丮 ����
			if(file.isDirectory()){
				System.out.print("���丮\n");
			}else{
				System.out.print("����\n");
			}
		}
		
		
		
	}

}
