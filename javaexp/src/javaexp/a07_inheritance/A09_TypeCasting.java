package javaexp.a07_inheritance;
class Parent{
	void getInfo(){
		System.out.println("�θ� Ŭ����[����޼���]");
	}
}
class Child extends Parent{
	void getInfo(){
		System.out.println("�θ� Ŭ���� [�޼��� ������]");
	}
	void childInfo(){
		System.out.println("�ڽ� Ŭ����[�߰��޼���]");
	}
}
class Child2{
	
}
public class A09_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Child();  // ������ ó��..
		p1.getInfo();// ������ �ִ� �޼��� �����Ǵ� �������� ������ �� ��������
		             //Ȱ���� ����
//		p1.childInfo(); // �������� �������� �߰��Ǵ� �޼����
//		                          ó������ �� �Ѵ�.
		Child c1 = (Child)p1; // ������ �߰��Ǵ� ����� ó���ϰ� �� ��,
		c1.childInfo();    
		// 1. �������� �ִ� ��ü ����
		Parent p2 = new Parent();
		Child2 c2 = new Child2();
		System.out.println("p2�� Parent�� ��ü��������?"+(p2 instanceof Parent));
		// 2. ��Ӱ��迡 �ִ� ���� /���� ��ü�� Ȯ���ϴ� ���
		// Parent p1 = new Child()�� ���� �������� �Ͼ�� p1�� Child�� �����Ѵ�.
		System.out.println("p1�� Child�� ��ü��������?"+(p1 instanceof Child));
		// c2
	}

}
