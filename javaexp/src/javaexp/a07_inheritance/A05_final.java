package javaexp.a07_inheritance;
class Animal{
	int speed;
	public void running(){
		speed+=5;
		System.out.println("�ٰ� �ֽ��ϴ�!");
		System.out.println("���� �ӵ�!"+speed);
	}
	// ����Ŭ�������� �����Ǹ� ���� ���ϰ� ó��.
	public final void stop(){
		speed=0;
		System.out.println("�ӵ��� ����!!");
	}
}
class Jubatus extends Animal{
	public void running(){
		speed+=20;
		System.out.println("�ٰ� �ֽ��ϴ�!");		
	}
	// ����Ŭ�������� final�� �޼��忡  �ٿ��� ������ ��������
	// ���� Ŭ�������� �޼��带 ���������� �� �Ѵ�.
//	public void stop(){}	
}
class Rabbit extends Animal{}
// ����Ŭ�������� ����� �����ϴ�..
class RabbitKind extends Rabbit{}
final class Turtle extends Animal{}
// ���� Ŭ������ class�տ� final���̸�
// ���� Ŭ�������� final���� ����Ŭ������
// ������� ���Ѵ�.
//class OceanTurtle extends Turtle{};


public class A05_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
