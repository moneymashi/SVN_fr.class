package javaexp.a09_exception;

public class A03_basicExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1�ܰ�
		try{
			System.out.println("id�� �Է��ϼ���!");
//			String id=null;
			String id="himan";
			System.out.println("�Էµ� id:"+id.toString());
		}catch(NullPointerException e){
			System.out.println("���̵� �Է� ���� �ʾҽ��ϴ�!");
		}
		System.out.println("1�ܰ�����");
		// 2�ܰ�
		try{
			System.out.println("id�� password�� �Է��ϼ���!");
//			String id=null;
			String id="himan";
//			String pass=null;
			String pass="7777";
			// �Է��� ���� �ʾ��� ��, ���� ���� ��.
			if(id.equals("himan")&&pass.equals("7777")){
				System.out.println(id+"�� ȯ���մϴ�.");
			}else{
				System.out.println("�������� �ʴ� �����Դϴ�!");
			}
		}catch(NullPointerException e){
			System.out.println("���̵� �Ǵ� password�� �Է� ���� �ʾҽ��ϴ�!");
		}	
		System.out.println("2�ܰ�����");
		
	}

}
