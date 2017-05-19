package javaexp.a09_exception;

// ���� �л�� Ŭ������ ������ ����ó���� ���ѱ��� ó���ؼ�,
// ȣ���ϴ� Ŭ������ main()���� �Ѳ����� ó���� �� �ִ�.
class MakeClass01{
	// ���� �߻��� ���ѱ��1
	// �޼���� throws ���� �ѱ�� ..
	public static void findClass() throws ClassNotFoundException{
		Class cass=Class.forName("java.lang.String");
	}
}
class MakeClass02{
	// ���� �߻��� ���ѱ��2
	public static void findClass() throws ClassNotFoundException{
		Class cass=Class.forName("java.lang.String");
	}
}
public class A05_throwsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �л�� Ŭ������ ������ ����ó���� ���ѱ��� ó���ؼ�,
		// ȣ���ϴ� Ŭ������ main()���� �Ѳ����� ó���� �� �ִ�.
		try {
			MakeClass01.findClass();
			MakeClass02.findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		main()������ ���ܸ� ������ �� ������, �ᱹ�� JVM�� ����������
//		���ܸ� ó���Ͽ��� �ϱ� ������, main()���� throws Exception��
//		���̴� ���� ���� ���� ���� ó������̴�.
//		�����ڰ� ����ó���� ���������� �����Ϸ���, main()������ �����ϱ�
//		���� try~catch�� ó���ϴ� ���� �Ϲ����̴�.
	}

}
