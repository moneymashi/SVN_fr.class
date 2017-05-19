package javaexp.a12_collection;

import java.util.ArrayList;
class Person{
	String name="�⺻��";
}
class Woman{
	private String name;
	public Woman(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ���ʸ��� ������� �ʾ��� ��.
 * */		
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");  // �پ��� ��ü���� �Ҵ� Object
		list.add(new Person());
		System.out.println(list.get(0));
		// �ش� ��ü�� ����� ������� ����.
		//  ==> ����� ���� ��ü�̱� ������.
//		System.out.println(list.get(1).name);
//		����ҷ��� type casting�� �ʿ��ϴ�.
		Person p = (Person)(list.get(1));
		System.out.println(p.name);
//  ������ ��ütype���� ArrayList�� ����� �ʿ䰡 �ִ�.
//	�� ��, �����ϴ� ���� ���ʸ��̴�.
//		1) String ���ʸ� ����
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("���");
		fruits.add("�ٳ���");
//		fruits.add(new Person()); �ٸ� ��ütype�� �Ҵ����� �� �Ѵ�.
//		2) Woman ���ʸ� ����
		ArrayList<Woman> ladies = new ArrayList<Woman>();
//		ladies.add("���"); �ٸ�  ��ütype �Ҵ�X
		ladies.add(new Woman("�ٸ��Ʒκ�"));
		ladies.add(new Woman("���̵𰡰�"));
		ladies.add(new Woman("�谡��"));
		// ���ʸ��� �����߱� ������, type casting ���̵�,
		// �ش� ����� ����� �� �ִ�.
		System.out.println(ladies.get(0).getName());
		System.out.println(ladies.get(1).getName());
		System.out.println(ladies.get(2).getName());
		
		

	}

}
