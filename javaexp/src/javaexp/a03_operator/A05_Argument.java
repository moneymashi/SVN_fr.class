package javaexp.a03_operator;

public class A05_Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ԷµȰ� 1:"+args[0]);
		System.out.println("�ԷµȰ� 2:"+args[1]);
		System.out.println("�ԷµȰ� 3:"+args[2]);
//		����ó���� ���ؼ� ����ó��..
//		Integer.parseInt("���������ڿ�)  ���           5        �ٳ���       2
		//                             args[0] args[1] args[2] args[3]
		String fruit1 = args[0];
		String fruit2 = args[2];
		int fruit1Cnt = Integer.parseInt(args[1]);
		int fruit2Cnt = Integer.parseInt(args[3]);
		System.out.println("���� ���ų���!!!");
		System.out.println(fruit1+"\t"+fruit1Cnt+"\t"+(fruit1Cnt*3000));
		System.out.println(fruit2+"\t"+fruit2Cnt+"\t"+(fruit2Cnt*4000));
	
		
	}

}
