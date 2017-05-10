package javaexp.a07_inheritance;
abstract class Robot{
	String name;
	Robot(String name){
		this.name=name;
	}
	public abstract void attack();
	public void call(){
		System.out.println(name+"�� ȣ��Ǵ�!!");
	}
}
class Mz extends Robot{
	Mz() {
		super("��¡��Z");
	}
	@Override
	public void attack() {
		System.out.println(name+"�� �����ָ����� ������ �ϴ�!!");
	}
}
class Gundan extends Robot{
	Gundan() {
		super("�Ǵ�");
	}
	@Override
	public void attack() {
		System.out.println(name+"�� ���Ű������� ������ �ϴ�!!");
	}
}


public class A11_abstractExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r1 = new Mz();
		r1.call();
		r1.attack();
		Robot r2 = new Gundan();
		r2.call();
		r2.attack();		
	}

}
