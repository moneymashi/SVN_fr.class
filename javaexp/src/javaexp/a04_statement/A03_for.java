package javaexp.a04_statement;

public class A03_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for�� Ȱ���� ����..
		// 15 ~ 50 ���..
		for(int cnt=15;cnt<=50;cnt++){
			System.out.println("��ȣ:"+cnt);
		}
		// 5�� ������ tab  �� �ٹٲ� ó��..	
		for(int cnt=15;cnt<=50;cnt++){
			// print() �ٹٲ� ����.. \t : ��, \n : �ٹٲ�ó��..
			System.out.print(cnt);
			if(cnt%5==0){
				// println() : �ٹٲ�
				System.out.println();
			}else{
				System.out.print("\t");
			}
		}	
		// for���� ���� ������ ���� ó��..
		// 1~100���� �����͸� �ջ��ϼ���!!
		// �ջ��� ���� ����
		int sum=0;  // ����ó���� ����+=�߰��� ������;
		for(int cnt=1;cnt<=100;cnt++){
			System.out.print(cnt);
			if(cnt!=100){
				System.out.print(" + ");
			}
			sum+=cnt; // ������ ����ó��..
		}
		System.out.println(" = "+ sum);
		String[] foods={"���","¥���","�����"};
		// �迭��[index��ȣ]  idx=0;���ͽ���
		// �迭��.length : �迭�� ũ�� =  index��������ȣ +1
		// number(1~ ) = index +1
		for(int idx=0;idx<foods.length;idx++){
			System.out.println((idx+1)+")"+ foods[idx]);
		}
		//  for(��������/��ü : �迭��ü ){
		//      �ش� �迭��ü�� ���� ������  ���� ������ ��ü �Ҵ�
		for(String food : foods){
			System.out.println("�迭 for2 ������:"+food);
		}
/*	Ȯ
 
 */		
		
		
	}

}
