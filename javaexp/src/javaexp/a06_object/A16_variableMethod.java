package javaexp.a06_object;

class GoMountain{
	
	// String ...names ���� �Է°� ����..
	// ȣ���ϴ� ������ ���� ���� �Է°���
	// ���������� �Է��� �����ϵ��� ó��
	public void callName(String ...names){
		// names�� �迭
		for(String name:names){
			// �θ��̸�..!!
			System.out.println(name+"~~~ �� �ִ���?");
		}
	}
}

public class A16_variableMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoMountain m1 = new GoMountain();
		System.out.println("�꿡 ���� �θ� �̸�!!");
		m1.callName("ȫ�浿");
		System.out.println("�꿡 ���� �θ� �̸�!!");
		m1.callName("��浿","�ű浿");
		System.out.println("�꿡 ���� �θ� �̸�!!");
		m1.callName("��ö��","�迵��","�ű���");
	
		
	}

}
