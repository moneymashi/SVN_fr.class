package javaexp.a04_statement;

public class A01_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ǹ��� ���� ó��..
		// 0, 1, 2
		// ���� ���� ��  ��� �Ǵ� ����..
		// (int) casting!!
		// Math.random()*3 �Ǽ�..
		int gameIdx = (int)(Math.random()*3);  // ������ 0~2������..
		// �ش� ����
		if( gameIdx==0 ){
			System.out.println("����");
		// ���� ������ �����ϰ� 1 �϶�..	
		}else if(gameIdx==1){
			System.out.println("����");
		}else{
			System.out.println("��");
		}
	}

}
