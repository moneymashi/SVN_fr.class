package javahomework.a18_yoonyoungju;
public class B01_home_03 {

	public static void main(String[] args) {
	
		
		/*
		 4. ���� for ���� �̿��Ͽ� ������ 4x + 5y = 60 �� 
			��� �ظ� ���ϼ���  x,y�� 10���� ���� 
			 �������  : x : @@, y : @@ 
		 */

		for(int x = 1; x <= 10 ; x++){
			
			for( int y = 1; y<=10; y++){
				if((4*x) + (5*y) == 60){
				System.out.println("x :"+ x +",y :"+ y );
				}
			}
		}
	}
}
