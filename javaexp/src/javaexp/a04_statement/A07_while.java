package javaexp.a04_statement;

import java.io.IOException;

public class A07_while {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char inputChar;
		// �������� ���� ���뿡�� Ư�� ���ڸ� �Է����� ��,
		// ���� ó��..
		while(true){
			inputChar=(char)System.in.read();
			System.out.println("�Էµ� ����:"+inputChar);
			if(inputChar=='Q'){
				System.out.println("�ߴ��մϴ�!!");
				break;
			}
		}
	}

}
