package javaexp.a10_api;

class Woman{
	private String name;

	public Woman(String name) {
		this.name = name;
	}
	
}
public class A02_equals_hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
equals : ��ü�� �ּҰ� �ٸ����� ���� �����͸� ������ ���� type��
���� ������ boolean���� true�� ó���Ѵ�.
 * */
		String name01 = new String("ȫ�浿");
		String name02 = new String("ȫ�浿");
		System.out.println("�ּ�Ȯ��:"+(name01==name02));
		// ���� class�� ����ϰ�, �����͵� ���⿡..
		System.out.println("������Ȯ��:"+(name01.equals(name02)));
/*
 hashcode() : ��ü�� �ĺ��� �� �ִ� �������� ����.
 * */		
		Woman w01 = new Woman("�̿���");
		Woman w02 = new Woman("�̿���");
		
		System.out.println("equals:"+w01.equals(w02));
		System.out.println("w01�� hashCode:"+w01.hashCode());
		System.out.println("w02�� hashCode:"+w02.hashCode());
// toString() : ��ü ���� ���� 'Ŭ������@16�����ؽ� �ڵ�
		System.out.println("w01�� ��ü����:"+w01.toString());
		System.out.println("w02�� ��ü����:"+w02.toString());
	}

}
