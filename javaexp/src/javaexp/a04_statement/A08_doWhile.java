package javaexp.a04_statement;

import java.io.IOException;

public class A08_doWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
	do{
		ù��° �Ǵ� �ݺ��� ���� ó��
	}while(�ݺ�����);
 * */
		char choieMenu='Q';
		String choMenu="";
		System.out.println("�޴��� �����ϼ���!(��ȣ�Է�)");
		System.out.println("1) ¥���");
		System.out.println("2) «��");
		System.out.println("3) ������");
		System.out.println("�����ϽǷ��� Q�� �Է�!!");		
		do{

			choieMenu=(char)System.in.read();
			if(choieMenu=='1') choMenu+="¥��� ����!!\n";
			if(choieMenu=='2') choMenu+="«�� ����!!\n";
			if(choieMenu=='3') choMenu+="������ ����!!\n";;
			
		}while(choieMenu!='Q');
			System.out.println("�ֹ��� ����");
			System.out.println(choMenu);
			System.out.println("�ֹ� �Ϸ�!!!");
		}

}
