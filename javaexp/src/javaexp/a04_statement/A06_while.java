package javaexp.a04_statement;

import java.io.IOException;

public class A06_while {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		// System.in : java���� �����ϴ� ǥ�� �Է� Stream
		// �Է°��õ� ������ �ݵ�� ���� ó���� �� �־�� �Ѵ�. 
		// throws IOException  		
		// 0 : 48~~~, A : 65 ~~, a:97, <- 37, 38, 39, 40
		int keyCode;
		while(true){
			keyCode=System.in.read();
			System.out.println(keyCode);
			if(keyCode==81){
				System.out.println("�ߴ�!!");
				// break : �ݺ������� ���μ����� �ߴ�ó��..
				break;
			}
		}
		
		
	}

}
