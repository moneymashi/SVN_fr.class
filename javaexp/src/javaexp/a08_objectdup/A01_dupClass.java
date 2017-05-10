package javaexp.a08_objectdup;

// �ν��Ͻ� ��� Ŭ���� : �ܺ� ��ü�� ����, ���� Ŭ���� ��밡��
class InstOuter{	
	/*�ν��Ͻ� ��� Ŭ����
	 InstOuter.InstInnerMember
	 * */
	class InstInnerMember{
		String name="ȫ�浿"; // �ν��Ͻ� �ʵ�
//		static int number; static ��� �Ұ�.
		void callName(){ // �ν��Ͻ� �޼ҵ�
			System.out.println(name+"�� ȣ�� �˴ϴ�!!");
		}
		
	}
}
// ���� ��� Ŭ����
// ���ο� static ��� Ŭ������ ����� ���� ���Ѵ�.
class OuterClass{
	/*����(static) ��� Ŭ����
	 * OuterClass.StaticMemberClass
	 * */
	static class StaticMemberClass{
		String name="����(static) ��� Ŭ����";
		static int number; // static ��� ��� ����
		void callName(){
			System.out.println(name+"�� ȣ�� �˴ϴ�!!");
		}
	}
}
public class A01_dupClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܺ� Ŭ�������� �ν��Ͻ� ��� Ŭ���� ���� Ŭ������ ȣ���ҷ���,
		// ���� �ܺ� ��ü ����..
		InstOuter outer = new InstOuter();
		// ���� ��ü  ==> 
		// �ܺ�Ŭ������.����Ŭ������  �������� = �ܺΰ�ü����.new ����Ŭ������();
		InstOuter.InstInnerMember inner = outer.new InstInnerMember();
		System.out.println("���� Ŭ���� �ʵ�(�̸�):"+inner.name);
		inner.callName();
		// ���� ��� Ŭ������ 
		// �ܺ�Ŭ������.����Ŭ������ �������� = new �ܺ�Ŭ������.����Ŭ������();
		OuterClass.StaticMemberClass stinner = new OuterClass.StaticMemberClass();
		System.out.println("���� ��� Ŭ������ ���� ��ü ���� �ʵ�:"+stinner.name);
		stinner.callName();
		
	}

}
