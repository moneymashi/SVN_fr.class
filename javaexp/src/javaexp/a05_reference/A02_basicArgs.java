package javaexp.a05_reference;

public class A02_basicArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id= new String(args[0]);
		String password = new String(args[1]);
		if(id.equals("himan")&& password.equals("7777")){
			System.out.println("��������");
		}else{
			System.out.println("������ ������ �ƴմϴ�.");
		}
	}

}
