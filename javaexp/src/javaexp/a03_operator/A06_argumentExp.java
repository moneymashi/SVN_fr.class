package javaexp.a03_operator;

public class A06_argumentExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ȯ�ο��� ���ο� ���� A06_argumentExp.java
		 *    Favorite Movie
		 *    args ==>  ��ȭ��1 �󿵿�
		 *    �� ��ȭ��2 �󿵿��� 
		 *    ���� �����ϴ� ��ȭ
		 *    ��ȭ��  ��   �������κ���
		 *    ��ȭ��  @@@  2017-@@@
		 *    ��ȭ��  @@@  2017-@@@
		 * */	
		System.out.println("���� �����ϴ� ��ȭ");
		System.out.println("��ȭ��\t\t��\t�������κ���");
		// �迭 ��ü length/��������  ==> �׷캰������ �Ǽ�
		int year=0;
		for(int idx=0;idx<args.length/2;idx++){
			year=Integer.parseInt(args[ (idx*2)+1 ]);
			System.out.println(args[idx*2]+"\t"+year
								+"\t"+(2017-year)+"�� ��");
		}
		
		
		
		
	}

}
