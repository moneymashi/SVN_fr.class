package javaexp.a02_variable;

public class A04_typeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* type ��ȯ*/
//		1. �ڵ� type  ��ȯ : ����������type ==> ū������type
//		   ū������type ������ = ���� ������; promote
		int weight = 67;
		double weightDbl = weight;
		System.out.println("�����Դ�(�Ǽ��κ�ȯ) ?"+weightDbl);
//		2. ���� type ��ȯ : ū������type  => ���� ������ type
//			������ ���ǰ�����, casting ó��..(����������)
//			���������� type ���� = (����dataType)ū������;
//		  1) short + short ������ �ϴ� ���� ������type�� int�� ��ȯ
		short num01 = 27;
		short num02 = 25;
		short sum = (short)(num01+num02);
//		  2) �Ǽ����� ������ ������ type���� �Ҵ��� ��, ���������� casting
		double height= 175.4;
		int heightInt = (int)height;
//		3. ������ type ==> ����
//		  1) ���������ڸ� ==> ������ ��ȯ�� ��, Integer.parseInt("����������");
		int inputInt = Integer.parseInt("26"); 
		// ��ȯ���� ������ ���� ��� "2610"
		System.out.println("�Էµ� ���������Ϳ��� ����+10:"+(inputInt+10));
//		  2) �Ǽ������ڸ� ==> �Ǽ��� ��Ȱ�� ��, Double.parseDouble("�Ǽ�������");
		double inputDbl = Double.parseDouble("3.14");
		System.out.println("�Էµ� �Ǽ������Ϳ��� +12.5:"+(inputDbl+12.5));
//  ������� ���� �ñ������� �ʱ⿡ �����͸� �Ҵ��ϴ���, ������ type�� ������
//		�ٸ� �����͸� �Ҵ� �� �� �ִ� ���� ���Ѵ�.
//	�ݴ�Ǵ� ������ ����� 	�ʱ⿡ �����͸� �Ҵ��ϸ� ������� �ʴ� ���� ���Ѵ�.
//		final ������type �����(�빮��) = �ʱⰪ�Ҵ�.
		final int CODE_VAL = 25;
//		CODE_VAL=27; // �ٸ� �������Ҵ� ��, �����߻�
//	���ͷ�(literal)�̶� ? �ҽ��ڵ峻���� ���� �ԷµǴ� ���� ���Ѵ�.
//		������type ����(���)�� = ������(���ͷ�);
//		�������� ������ ���� �������ͷ�, �Ǽ����ͷ�, ���ڸ��ͷ�, �� ���ͷ�
        int age =27; // 27�� �������ͷ��̶�� ��.
        String name="���̸�"; // "���̸�" ���ڿ����ͷ�
//      ����� ���� �������� Ȱ�������, ����� �Ҵ�Ǹ� ������� �ʴ� ���̱⿡
//      �����Ͽ� ���ͷ� ������ Ȱ��ȴ�.
		
		
		
	}

}
