package javaexp.a04_statement;

public class B01_home_01 {
	
	/*
		1. ���ǹ��� �ݺ����� ������ ��ȣ �ӿ� �־� ������	
		���ǹ� :(if),(switch)
		�ݺ���:(for),(while),(dowhile)
		 	
	 */
	
	
	public static void main(String[] args) {
		//2. for ���� �̿��Ͽ� 10~150���� ���� �߿� 5�� ����� ������ ���ϴ� �ڵ帣 �ۼ��ϼ���		
			int sum=0;// ����ó���� ����+= �߰��� ������;
			for(int cnt=9; cnt <= 150;cnt++){
				if (cnt%5 ==0){
				System.out.print(cnt);
				if( cnt != 150 ){
					System.out.print("+");
				}
				sum+=cnt;
				}
			}
			System.out.println("="+sum);
			
			
	}

}
