package javaexp.a13_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A11_SubStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		������Ʈ�� Ȱ���ϱ�..
//		1. �⺻ ��Ʈ�� Ŭ���� ���� �� ��ü ����.
		InputStream is = System.in;
//		2. ���� ��Ʈ��1 Ȱ��.. �����ڿ� �Ҵ�
		InputStreamReader reader = new InputStreamReader(is);
//		3. ���� ��Ʈ��2 Ȱ�� .. ������ �Ҵ�
		BufferedReader br = new BufferedReader(reader);
		System.out.print("�Է�:");
		try {
			String lineString = br.readLine();
			System.out.println("���:"+lineString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
