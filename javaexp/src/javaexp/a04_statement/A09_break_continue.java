package javaexp.a04_statement;

public class A09_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break �ش� ��({}) ���μ��� ��ü�� �ߴܽ�Ű�� ��.
		System.out.println("## ����Դ� ������###");
		for(int cnt=1;cnt<=10;cnt++){
			System.out.println("�����̰� ����� "+cnt+"�� �Ծ���.");
			if(cnt==5){
				System.out.println("5�� �Դ� ����!! ���� �׸�!!");
				break;
			}
		}
		System.out.println("break ���� �Ϸ�!!!");
		// continue �ش� ��({})�� Ư�� ���μ����� pass ó��..
		System.out.println("### ���Դ� ������ ###");
		for(int cnt=1; cnt<=10;cnt++){
			 if(cnt==6){
				 System.out.println("6��° ���� �������� ���ѱ�!!!");
				 continue;
			 }
			 System.out.println("������ "+ cnt+"��° ���� �Դ�!!!");
		}
		System.out.println("continue�� ������ ���� �Ϸ�!!");
		
		
	}

}
