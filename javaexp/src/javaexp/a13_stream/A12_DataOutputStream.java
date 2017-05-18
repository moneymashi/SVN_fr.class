package javaexp.a13_stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A12_DataOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dtfile="C:/a01_prog/eclipse/workspace_server"
				+ "/javaexp/src/javaexp/a13_stream/dataFile.dat";
		// ���ڿ��� ���� ȣ��
		// �����͸� �ش� type�� ����� ȣ��
		// FileOutputStream : ���ϸ� ���� ��Ʈ�� Ŭ����
		// DataOutputStream : �����͸� ���� ���� ��Ʈ�� Ŭ����
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		// ������ ���� �ҷ�����..
		
		try {
			
			fos = new FileOutputStream(dtfile);
			dos = new DataOutputStream(fos);
			// �����͸� �ش� ���Ͽ� ����..
			// ȫ�浿, 95.5(�Ǽ�), 1(����)
			dos.writeUTF("ȫ�浿"); // ���ڿ�����..
			dos.writeDouble(95.5); // �Ǽ�����
			dos.writeInt(1); // ��������
			dos.writeUTF("�ű浿"); // ���ڿ�����..
			dos.writeDouble(80.5); // �Ǽ�����
			dos.writeInt(2); // ��������			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("��Ÿ ���ܹ߻�");
		}finally{
			try { // �ڿ� ����..
				dos.flush();//Buff�޸� Ȱ���
				dos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
