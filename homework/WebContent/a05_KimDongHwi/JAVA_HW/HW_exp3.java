package a04_statedment;

public class HW_exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*---------------------------------------------*/
		// 3) while, math.random() �̿��Ͽ� �ֻ��� 2�� ������ ���� 5�� �ƴϸ� ���/5�� �ߴ�
		// ��� @@@,@@@ �� @@@
		
	
		while(true){
			int dice01 = (int)(Math.random()*6);
			int dice02 = (int)(Math.random()*6);
			int diceSum = dice01 + dice02;
			
			if(diceSum!=5){
				System.out.println(dice01+" + "+dice02+" = "+diceSum);
				System.out.println(" ���� 5�� �ƴϹǷ� ��� ���� ");
			}else{
				System.out.println(dice01+" + "+dice02+" = "+diceSum);				
				System.out.println(" ���� 5�̹Ƿ� ���� ");
				break;
			}
		}
	}

}
