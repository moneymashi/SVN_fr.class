package javaexp.a09_exception;

public class A01_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����Ͱ� �Էµ��� �ʾ��� ��, ����.
		String data=null;
		// null ��Ȳ����  (.)�� Ȱ���ؼ� �ش� ����� ȣ���
		// �߻�.
		//System.out.println(data.length());
		// ���ܰ� �߻���, jvm���� �����ϴ� ���� ������ Ȯ�� ��,
		// �� ������ �����ؼ� ���� ó���ϸ� �ȴ�.
		// NullPointerException
		// �迭�� �����Ͱ� ���µ�, index������ �Ѿ ȣ��Ǿ��� ��,
		// �߻��ϴ� ���� ArrayIndexOutOfBoundsException
		//String data2 = args[0];
		//String data3 = args[1];
		//System.out.println("�Է°�1��°:"+data2);
		//System.out.println("�Է°�2��°:"+data3);
		/* NumberFormatException
		 * Integer.parseInt("���������ڿ�") ==> ������ȯ
		 * Double.parseDouble("�Ǽ������ڿ�") ==> �Ǽ���ȯ
		 * ���������ڿ��̳� �Ǽ������ڿ��� �ƴ� ���, ���� ���
		 * "1", "2", "3.4"�� �ƴϰ�, "a1", "3.4b"���� �� ������
		 * ������ �߻��Ѵ�. �̶� �߻��ϴ� ������ NumberFormatException
		 * */
		String data4 = "100";
		String data5 = "a100";
		int num01 = Integer.parseInt(data4);
		int num02 = Integer.parseInt(data5);
		
		
		
	}

}
