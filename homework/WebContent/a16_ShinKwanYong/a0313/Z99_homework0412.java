package javaexp.a04_statement;

public class Z99_homework0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ȯ�ο���
 1. ���ǹ��� �ݺ����� ������ ��ȣ �ӿ� �־����.
    1) ���ǹ�: ( if ), ( switch )
    2) �ݺ���: (   ), (    ), (   )
 
 2. for���� �̿��Ͽ� 10~150���� ���� �߿� 5�� �����
 	������ ���ϴ� �ڵ带 �ۼ��ϼ���.
 
 3. while��, Math.random()�� �̿��Ͽ� �ֻ��� ���� �ΰ��� ������ �ϰ�
 	�ֻ��� ���� 5�� �ƴϸ� ���, ���� 5�� �ߴ� ó���ǰ� �ϼ���.
    1) ������� : @@@, @@@ �� @@@
 
 4. ���� for���� �̿��Ͽ� ������ 4x+5y=60�� ��� �ظ� ���ϼ���. x,y�� 10���� ����
    1) ������� : x:@@, y:@@
*/
		
		// ���ǹ� : if switch
		// �ݺ��� : for while do_while
		int sum=0;
		for(int cnt=10;cnt<=150;cnt++){
			if(cnt%5==0){
				sum+=cnt;
				System.out.println(sum);
			}
		}
		System.out.println("���� : "+sum);
		System.out.println("-----2������ ��-----");
		
		int sumNum=0;
		while(true){
			int num01=(int)(Math.random()*6);
			int num02=(int)(Math.random()*6);
			sumNum = num01+num02;
			System.out.print(num01+"\t");
			System.out.println(num02+"\t");
			if(sumNum==5){
				break;
			}
			
		}
		
		System.out.println("�� : "+sumNum);
		System.out.println("-----3�� ���� ��------");
		int xySum = 0;
		for(int x=1;x<=10;x++){
			for(int y=1;y<=10;y++){
				sum = (x*4)+(y*5);
				if(sum==60){
					System.out.println("x : "+x+" , y : "+y);
				}
			}
		}
		System.out.println("-----4�� ���� ��------");
		
		
		
		
		
		
		
		
		
		
		
	}

}
