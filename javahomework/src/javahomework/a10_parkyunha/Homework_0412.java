package javahomework.a10_parkyunha;

public class Homework_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. for���� �̿��Ͽ� 10~150���� ���� �߿� 5�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
		// 3. while��, Math.random()�� �̿��Ͽ�, �ֻ��� ���� �� ���� ������ �ϰ�, �ֻ��� ���� 5�� 
		//		�ƴϸ� ���, ���� 5�̸� �ߴ� ó���ǰ� �ϼ���
		// 4. ���� for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ϼ���. (x, y�� 10���� ����)
		
		one();
		two();
		three();
		four();
	}
	
	public static void one() {
		System.out.println("1) ���ǹ��� �ݺ���");
		System.out.println("conditional statements : if, switch");
		System.out.println("loop statements : for, while, do-while\n");
	}
	
	public static void two() {
		int sum = 0;
		
		for(int i = 10; i <= 150; i++) {
			sum += (i % 5 == 0) ? i : 0; 
		}
		
		System.out.println("2) 10~150 ������ ������ 5�� ����� ��\nSum is "+sum + "\n");
	}
	
	public static void three() {
		int dice01, dice02;

		do {
			dice01 = (int)(Math.random()*6) + 1;
			dice02 = (int)(Math.random()*6) + 1;
		} while((dice01 + dice02) != 5);
		
		System.out.println("3) �ֻ����� ���� 5\n"
				+dice01+" + "+dice02+" = "+(dice01+dice02) + "\n");
	}
	
	public static void four() {
		String pairs = "";
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <=10; y++) {
				if(4*x+5*y == 60)
					pairs += "("+x+", "+y+")\n";
			}
		}
		
		System.out.println("4) 10������ ���� ���� x, y�� ���� 4x + 5y = 60�� �����ϴ� ������\n"+pairs + "\n");
	}

}
