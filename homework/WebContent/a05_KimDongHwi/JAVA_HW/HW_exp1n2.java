package a04_statedment;

public class HW_exp1n2 {
	public static void main(String[] args) {
		// 1) ���ǹ� if/ if,else
		//	�ݺ��� for / while / do while
		// 2) 10~150 ������ ���� �� 5��� ������ ���ϴ� �ڵ� �ۼ�
		int sum = 0;
		for(int i=10; i<=150;i++){
			if(i%5==0){
				System.out.print(i+" + ");
			}
			sum+=i;
		}
		System.out.println(" = "+sum);

	}
}

	
	


