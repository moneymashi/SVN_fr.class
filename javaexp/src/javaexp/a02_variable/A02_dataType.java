package javaexp.a02_variable;

public class A02_dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	������ data type
//		byte(1byte) -128 ~ 127
		byte age= 25; // byte�����ͷ� 25�� �Ҵ�.
//		age = 129; byte������ ������ �Ѿ�� �Ҵ� �Ұ�.
//		short, [int], long, char
		char codeVal=66; //char 2byte�� ������ �Ҵ�..0~65535
		System.out.println("���̴� "+age);
		System.out.println("�ڵ尪"+codeVal);
		codeVal='��'; // char�� ''�� �� �ڸ� �Ҵ�
		System.out.println((int)codeVal);
// �Ǽ��� date type
//		float(4byte)  : ��ȣȭ��Ʈ(1bit) + ����(8bits) + ����(23bits) =32bits 
//		[double(8byte)] : ��ȣ(1bit) + ����(11bits) + ����(52bits) = 64bits
		float degree = 25.2F;// float ���� = ������F;
		double height= 175.2; // �Ǽ����� default���̱⿡ �Ҵ� ����
		System.out.println("�µ��� "+degree+"��");
		System.out.println("Ű�� "+height+"cm");
//	���� date type
//		boolean 1byte(8bits) ǥ��.. true/false
		boolean isGo = true;
		if( isGo ){
			System.out.println(" go!! go!!!");
		}else{
			System.out.println(" stop!! it's enough!!");
		}
		
		
		
//		
		
		
	}

}
