package javaexp.a05_reference;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
## jvm�޸�1
stack������ heap����
stack���� : 
	1) primitive data type
	   �⺻ ������Ÿ��(����, �Ǽ�, boolean) �Ҵ�
	   ���� ���念���� ���� �������� �޸� ������ ����.. 
		== : �񱳿����� - ���� �����Ͱ��� ���念���� Ȯ���Ҽ� �ִ�.
	2) reference data type
	  ������ ������Ÿ��(��ü, �迭, �������̽�) �Ҵ�.
	  ���� ���念������ ���� ������ �޸��� �ּҰ��� �Ҵ��ϰ�,
	  ���� �����ʹ�  heap������ �Ҵ�Ǵ� ���� ���Ѵ�.	
	  javaexp.a05_reference.A01_basic@15db9742
	  ��ü��@heap������ �ּҰ��� 16�����ڵ�� �Ҵ�(JVM���� �ڵ��Ҵ�)
	  stack�������� 15db9742�ּҸ� �Ҵ��ϰ�, ���� A01_basic()��
	  heap������ 15db9742�ּҿ� ��ü�� �Ҵ�Ǿ� �ִ�.
heap ����
	  ������ �����Ͱ� ���� ���� �޸𸮷� stack�� �ּҰ��� ����
	  ȣ��ȴ�.
##�޼ҵ念�� : ���Ǯ, �ʵ嵥����, �޼ҵ� ������, �޼ҵ� �ڵ�, ������ �ڵ� ��
     �� �з��ؼ� �����Ѵ�. jvm�� ������ �� �����ǰ� ��� �����尡 �����ϴ� �����̴�.
     
	 
 * */
		int age=25;
		System.out.println(age==25);
		A01_basic  p = new A01_basic();
		System.out.println(p);
/*
�޸��� ==, != ������ Ȱ��
	stack�ּҰ��� ���� ��������
	 �⺻ ���������� ���� �����ϸ� true��.
	 �������������� ���� ��ü�� �����ϴ���,
	 	 heap ������ ���� ��ü�� �ٸ��Ƿ� false�� ���´�. 
 * */		
		int num01 = 25;
		int num02 = 25;
		System.out.println("�⺻��������:"+(num01==num02));
		A01_basic a01 = new A01_basic();
		A01_basic a02 = new A01_basic();
		// ������ ��ü�� �����ϴ���, heap������ �ٸ� ��ġ�� �����ϱ⿡
		// stack������ �ּҰ��� �ٸ��Ƿ� false���� ���´�.
		System.out.println("������������:"+(a01==a02));
/*
null���� �Ҵ�!
���� ������ ��ü�� �Ҵ����� ���� ��, ó�� �κ�.
�Ϲ������� ��ü�� �ʱ�ȭ�� ��, Ȱ��ȴ�.
 * */		
		A01_basic a03=null;
		String name=null;
		System.out.println("������ü�� ���� ��������");
		System.out.println("a03:"+a03);
		System.out.println("name:"+name);
//		int num07=null; �⺻���������� �������� �ƴϱ⿡ null�� �Ҵ��� �� ����.
//	  �������� �����͸� �Ҵ�Ǿ��� ����, �Ҵ���� �ʾ��� ��, �����߻��κ�..
//		heap������ �����Ͱ� ��, ���� ��ü�� �Ҵ���� �ʾұ⿡..
//		������ �޼ҵ峪 ������ ȣ���ϸ� NullPointerException  �߻��Ѵ�.
		String name02 = "�ȳ��ϼ���!!!";// new String("�ȳ��ϼ���!!!")
		System.out.println("��ü�� �Ҵ�� ���:"+name02.length());
		// ���ڿ�.length():���ڿ��� ����..
//		System.out.println("��ü�� �Ҵ���� ���� ���:"+name.length());
//		NullPointerException : �����Ǵ� ��ü�� ���µ�, �ش� ���� �޼��带 ȣ��
//		                       �Ͻø�!!?? �ʵ���!!!
//		�迭������ �ش� ��ü�� �����Ͱ� �Ҵ���� �ʾ��� ��..
//		ArrayIndexOutOfBoundsException : �迭�� �ش� ������ �����Ͱ� ������ ��Ÿ��.
//		System.out.println(args[0]);
		System.out.println(args.length);
		// �迭 ��ü�� �������� �ʾ��� ��, �ش� ������ ȣ���ϸ�,  NullPointerException
		// �߻�..
		String names[]=null;
	//	System.out.println(names[0]);
/*
 	String���� �ּҿ� ���ڿ��� ��..
 	1. String�� ��ü�̴�..
 		������ ���Կ����ڿ� ���ؼ� ���������� ���ڿ��� �Ҵ��ϸ�,
 		���ڿ��� ���� ���� ���� �ּҿ� �Ҵ��� �ȴ�...
 		
 * */	
		String name05 = "���̸�";
		String name06 = "���̸�";
		System.out.println(name05 == name06);
/*
 	2. ��ü�� ��Ģ�����δ�  String ��������= new String(���ڿ�)�� 
 	   ������ �Ǹ�, �Ϲ����� �����ӿ���, ������ �ε��� ���ؼ� ó�� �Ǵ� ����
 	   ���������� �̿� ���� ������� ó���ȴ�..
 	   �̷��� �� ���� ��ü�� ���ڿ��� ������ �ٸ� ���������� Ȱ���ϱ⿡
 	   �ٸ� �ּҷ� �Ҵ�Ǿ�, �ּҰ� �񱳴� false���� �ȴ�.
 * */	
		String name07=new String("ȫ�浿");
		String name08=new String("ȫ�浿");
		System.out.println(name07==name08);// false�� ��Ÿ��..
/*  ���ڿ� ��ü�� ���� �񱳴� ��Ģ������ ���ڿ� ��ü���� �����ϴ�
 *  �޼���(.equals)�� Ȱ���ؼ� ó���Ͽ��� �Ѵ�.
 *     	���ڿ�����.equals("���ڿ�")
 * */
		System.out.println(name07.equals(name08));
		//���ڿ��� ���� ��, true���� ��µȴ�.
/* Ȯ�ο���..
 * args ������   id password
 * args[0] ==> id������ �Ҵ�  new String(args[0]);
 * args[1] ==> password������ �Ҵ�. new String(args[1]);
 * id�� himan
 * password�� 7777
   �Է¹����� �������� , �ƴϸ� ������ ������ �ƴմϴ�.. 
 * */		
		
	}

}
