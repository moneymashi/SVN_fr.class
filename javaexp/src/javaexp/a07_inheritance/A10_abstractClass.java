package javaexp.a07_inheritance;

abstract class Animal01{
	// ���� �޼���..
	public void eat(){
		System.out.println("���ְ� �Դ�!!");
	}
	// ����Ŭ�������� �������� �޼���..
	// �߻�޼���� �տ� abstract modifier�� �ٰ�,
	// �޼����� {}<body> �κ��� ����..
	// Ŭ���� �޼��� ��� �߻�޼��尡 �ϳ��� ������,
	// �߻� Ŭ������ �ȴ�. �߻�Ŭ������ abstract�� �ٿ� �ش�.
	public abstract void move();
	
}

class Bird extends Animal01{
	// �߻�Ŭ������ ��ӹ��� ���� Ŭ������
	// �ݵ�� �߻�޼��带 ������ �Ͽ��� �Ѵ�.
	// ��� �޼����� ������ ������ �� �ִ�.
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Flying!!! Sky~~");
	}	
}
// Insect (����Ŭ����)
class Insect extends Animal01{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("��� �ٴϴ�!!");
	}	
}
class Fish extends Animal01{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("������ swimming!!!");
	}	
}

public class A10_abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal01[] ans={new Bird(), new Insect(), new Fish()};
		for(Animal01 an:ans){
			an.eat();
			an.move();
		}
	}

}
