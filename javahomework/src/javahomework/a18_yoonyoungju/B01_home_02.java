package javahomework.a18_yoonyoungju;

public class B01_home_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  3.while ���� �̿��Ͽ� Math.random()�� �̿��Ͽ� , 
		  �ֻ��� ���� �ΰ��� ������ �ϰ� , 
		  �ֻ��� ���� 5�� �ƴϸ� ��� , 
		  ���� 5�̸� �ߴ� ó���ǰ� �ϼ��� ,
			��� ���� : @@@, @@@  �� @@@ 
		*/

		int sum  =0;
		int gameIdx01 =0;
		int gameIdx02 =0;
		do{
			gameIdx01 = (int)(Math.random()*5);
			gameIdx02 = (int)(Math.random()*5);
			System.out.println("ù��° �ֻ��� : "+gameIdx01);
			System.out.println("�ι�° �ֻ��� : "+gameIdx02);
			sum = gameIdx01+gameIdx02;
			System.out.println("��:"+sum);
		}while(sum != 5);
			System.out.println("�ֻ��� ���� 5 �ߴ� ! ");
	}

}
