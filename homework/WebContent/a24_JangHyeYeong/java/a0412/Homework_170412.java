package javaexp.a04_statement;

public class Homework_170412 {

	public static void main(String[] args) {
	// 1. ���ǹ��� �ݺ����� ������ ��ȣ �ӿ� �־����.
	//		1_1. ���ǹ� : if, switch
	//		1_2. �ݺ��� : for,while,do while
		
	/***********************/
	// 2. for���� �̿��Ͽ� 10~150���� ���� �߿� 5�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
		System.out.println("####2������####");
		int sum=0;
		for(int num=10; num<=150; num++)
			if(num%5==0) sum+=num; //5�� ����� ���� sum�� ����
		System.out.println(sum); //��� ���
	/***********************/	
		System.out.println("-------------------");
		System.out.println("### 3������ ###");
	// 3. while��, Math.random()�� �̿��Ͽ�, �ֻ��� ���� �� ���� ������ �ϰ�, 
	// �ֻ��� ���� 5�� �ƴϸ� ���, ���� 5�̸� �ߴ�ó�� �ǰ� �ϼ���.
		while(true){
			int dice1=(int)(Math.random()*6+1);
			int dice2=(int)(Math.random()*6+1);
			System.out.println("�ֻ���1:"+dice1+" �ֻ���2:"+dice2);
			
			if(dice1+dice2==5){
				System.out.println("!!!! ���� 5�̹Ƿ� �ߴ��մϴ�. !!!!");
				System.out.println(dice1+", "+dice2+"�̹Ƿ� �� "+(dice1+dice2));
				break;
			}
				
		}
		System.out.println("---------------------");
	// 4. ���� for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ϼ��� x, y�� 10���� ���� ����
		System.out.println("### 4������ ###");
		System.out.println("4x + 5y = 60�� ��� �ظ� ���մϴ�.");
		int quest=0;
		for(int x=0; x<=10; x++){
			for(int y=0; y<=10; y++){
				quest=4*x+5*y;
				if(quest==60)
					System.out.println("x: "+x+" y: "+y);
			}
		}
	}

}
