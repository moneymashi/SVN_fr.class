package javaexp.a07_inheritance;

class Worker{
	String kind;
	public Worker(){}
	public Worker(String kind) {
		this.kind = kind;
	}
	public void working(){
		System.out.println(kind+"�� ���� �մϴ�!");
	}
}
class Engineer extends Worker{
	// ��ӿ��� �����ڴ� ������ ������ �������� ���� �Ǿ�� �Ѵ�.
	public Engineer(){
		super("������");
	}
	// ������!!!
	public void working(){
		System.out.println(kind+"�� ���α׷� ������ �մϴ�!!");
	}
}
class PoliceMan extends Worker{
	public PoliceMan(){
		super("������");
	}
	public void working(){
		System.out.println(kind+"�� ������ ����ϴ�!");
	}
}
public class A04_OverridingExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new Worker("��������");
		w1.working();
		Engineer w2 = new Engineer();
		w2.working();
		PoliceMan w3 = new PoliceMan();
		w3.working();
	}

}
