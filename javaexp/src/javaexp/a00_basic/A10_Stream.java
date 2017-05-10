package javaexp.a00_basic;

import java.io.IOException;
import java.io.InputStream;

public class A10_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Stream : �����Ͱ� �귯���� ���� �߻�ȭ�Ͽ� ���� ��ü��
�ڹٿ����� Stream�� Ȱ���Ͽ� �����͸� �Է�, ���,  ������
ó���ϰ� �ִ�.
�⺻������ local���� �����͸� ��/����ϴ� ��, ������ �����Ͽ�
�Է�/����ϴ� ��, ��Ʈ��ũ������ �����͸� ��/����ϴ� �͵� ��ΰ�
�� Stream�� Ȱ���Ͽ� ó���ϴ�.
��, �̷��� ������ ������� �Ͼ�⿡ �߻��ϴ� ���� ���ܻ�Ȳ(��Ʈ��ũ,
������ ����, ���ȹ���)� ����Ͽ�,  Stream�� �ݵ�� Exception 
ó���� �� �־�� �Ѵ�.
*/
		System.out.println("�����͸� �Է��ϼ���!!");
		// InputStream :�Է��ϴ� Stream�̶�� ����, �Է��� ��, Ȱ��Ǵ�
		// �ֻ� Ŭ�����̴�.
		// System.in : JVM���� �����ϴ� �⺻ �Է�ó�� ��ü..
		InputStream is = System.in;
		try {
			
			int n = is.read();
			System.out.println("�Է°�:"+(char)n);
			// ��Ʈ���� �ڿ��� ��� �ֱ⿡, �ش� ������ ó���� �Ŀ���
			// close() �޼��带 ���� ��������� �ڿ��� ������ �ش�..
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
