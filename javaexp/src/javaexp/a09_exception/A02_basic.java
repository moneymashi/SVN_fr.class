package javaexp.a09_exception;

public class A02_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// ���ܰ� �߻� ������ �ִ� �ڵ�.
			System.out.println("�ȳ��ϼ���!!1");
			System.out.println("�ȳ��ϼ���!!2");
			String name="ȫ�浿"; // ������ �Է��� ��Ȯ�� �� ��..
			System.out.println(name.toString()); // throw ���� ��ü
			                                    // NullPointerException()
			System.out.println("�ȳ��ϼ���!!3");
			System.out.println("�ȳ��ϼ���!!4");
			System.out.println("�ȳ��ϼ���!!5");
		}catch(NullPointerException e){
			// ���ܰ� �߻����� ��, ó���� �ڵ�.
			// NullPointerExceptionŬ���� �̻��� ����Ŭ���� ����..
			System.out.println("���ܰ� �߻� �߳׿�~~ �̷��� ó���ϰڽ��ϴ�!!");
		}
		System.out.println("���α׷� ���� ����!!");
		
	}

}
