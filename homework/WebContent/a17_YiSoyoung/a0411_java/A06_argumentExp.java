package javaexp.a03_operator;

public class A06_argumentExp {
	/* Ȯ�ο��� : ���ο� ���� A06_argumentExp.java
	 * Favorite Movie
	 * args => ��ȭ��1 �󿵳⵵ ��ȭ��2 �󿵿���
	 * ���� �����ϴ� ��ȭ
	 * ��ȭ�� �� �������κ���
	 * ��ȭ�� XXX 2017-@@@
	 */
	public static void main(String[] args) {
		System.out.println("�� ���� �����ϴ� ��ȭ ��");
		System.out.println("��ȭ��\t��\t�������κ���");
		System.out.println("����������������������������");
		int no=0;
		for(int i=0 ; i<args.length ; i+=2){
			System.out.println("��ȭ��\t"+args[i]+"\t"+args[i+1]);
			no ++;
		}
		System.out.println("����������������������������");
		System.out.println("�̻� �Է��Ͻ� ��ȭ ���� : "+no);
	}
}
