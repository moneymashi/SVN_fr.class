package a04_;

public class A09_0412HW {
	public static void main(String[] arg){
		
		/*
		1.���ǹ� �ݺ��� ����.
		2. for������ 10~150���� �����߿� 5�� ����� ����?
		3.while��, Math.random()�� �̿���, �ֻ��� ���� �ΰ��� ������ ���� 5�ƴϸ� ���.
		���� 5�ϰ�� �ߴ�ó��. �������: @@,@@ ��@@
		4.���� for������ ������ 4x+5y =60�� ����ظ� ���϶�. x,y�� 10���� ����.
		�������: x:@@ y:@@ x+y:@@
		 
		*/

	/*	1. 
	 	���ǹ�: if(){} else(){}, 
	 		switch(condition){ 
	 		case(conditionValue): break;
	 		default:
	 		} 
		�ݺ���: for( ; ; ){ }
			while(){} 
			do{}while();
		
		2.
	*/	
		int sum = 0;
		for(int inx =10; inx<=150; inx++){
			if(inx%5 ==0){
				sum+=inx;
			}
		}
		System.out.println("10~160, 5�ǹ�� sum: "+ sum);
	
	//3.while��, Math.random()�� �̿���, �ֻ��� ���� �ΰ��� ������ ���� 5�ƴϸ� ���.
	//	���� 5�ϰ�� �ߴ�ó��. �������: @@,@@ ��@@
		int ran01;
		int ran02;
		do{
			ran01 = (int)(Math.random()*6+1);
			ran02 = (int)(Math.random()*6+1);
			System.out.print("ù��° �ֻ���"+ ran01 + " ");
			System.out.print("�ι�° �ֻ���"+ ran02 + " ");
			System.out.print("�� �ֻ�����"+ (ran01+ran02) );
			System.out.println();
		}while((ran01+ ran02) != 5);
	//4.���� for������ ������ 4x+5y =60�� ����ظ� ���϶�. x,y�� 10���� ����.
	//	�������: x:@@ y:@@ x+y:@@
		
		for(int opr1 = 0; opr1 <= 10; opr1++){
			for(int opr2 = 0; opr2 <= 10; opr2++){
				if(4*opr1 + 5*opr2 ==60){
					System.out.println("x: "+ opr1 + " y: "+ opr2 + " �϶�  "+ (4*opr1 + 5*opr2) );
				}
			}
		}
	
	
	
	
	}
}
