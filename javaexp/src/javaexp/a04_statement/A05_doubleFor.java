package javaexp.a04_statement;

public class A05_doubleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	�������� ���� 2�� for�� ó��
 * */		
		// �ܺδ� �ܼ��� ���õ� ���� ó��..
		for(int grade=2;grade<=9;grade++){
			// ���δ� cnt 1~9 ���� ó��
			System.out.println("###"+grade+"�� ###");
			for(int cnt=1;cnt<=9;cnt++){
				System.out.println(grade + " * "+ cnt + " = "+ (grade*cnt));
			}
		}
/* ���κ� ���μ����� ó���ȴ�.. 
 */	
		// �ܺδ� cnt 1~9 ���� ó�� 
		for(int cnt=0;cnt<=9;cnt++){
			// ���δ� �ܼ��� ���õ� ���� ó��..
			for(int grade=2;grade<=9;grade++){
				// �ʱ� @@ �� title ó��
				if(cnt==0){
					System.out.print("   "+grade+"��\t\t");
				}else{
					System.out.print(grade + " * "+ cnt + " = "+ (grade*cnt)+"\t");
				}
			}
			// �ٹٲ� ó��..
			System.out.println();
		}		
	}

}
