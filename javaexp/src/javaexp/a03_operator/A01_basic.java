package javaexp.a03_operator;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
��������� ó��..
 * */
		int num01=25;
		int num02=75;
		System.out.println(num01 + " + " + num02 + " = " +(num01+num02));
		System.out.println(num01 + " - " + num02 + " = " +(num01-num02));
		System.out.println(num01 + " * " + num02 + " = " +(num01*num02));
		// ����/���� ==> ���������� 
		// ����/�Ǽ� ==> �����ϴ� ������ �� �� �ϳ��� �Ǽ����̾�� �Ǽ� ó���� ��.
		//              (�Ǽ���)�� �����͸� cast�Ͽ� ����ȯ���� ó���� �����ϴ�
		System.out.println(num01 + " / " + num02 + " = " +(num01/num02));
		System.out.println("�Ǽ�ó��"+num01 + " / " + num02 + " = "
							+(num01/(double)num02));
		System.out.println("�Ǽ�ó��"+num01 + " / " + num02 + " = " 
							+((double)num01/num02));
		System.out.println(num01 + " % " + num02 + " = " +(num01%num02));
		
		
	}

}
