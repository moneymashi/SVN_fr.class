package javaexp.a00_basic;
/*
��� : ��ü�� ����� ���� �پ��� ��ü�� ����� �� �ְ� �����
�ڹٿ����� oop(��ü�������α׷�)�� �մ��� ������ ���Ѵ�.
 * */
class Father{
	String name;
	void intro(){
		System.out.println("�̸��� "+name+"�Դϴ�!!");
	}
}
// Father Ŭ������ ��ӹ��� Son Ŭ����
// class Ŭ������ extends ����Ŭ������
class Son extends Father{
	int age;
	void intro2(){
		System.out.println("���̴� "+age+"�Դϴ�!!");
	}
}
/* ����� �ϰ� �Ǹ� ���� Ŭ������ ����Ŭ������ ����� ������
 * �������� �ʴ��� ����� �� �ְ� �ȴ�.!!*/

public class A06_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		f.name="ȫ�Ǽ�";
		f.intro();
		Son s = new Son();
		s.name = "ȫ�浿";
		// ������ �޼��� ����Ǿ� ���� �ʴ���,
		// ����� �ϸ� Ȱ���� �� �ִ�.
		s.age=25;
		s.intro();
		s.intro2();
	}
/*
 Ȯ�� ����..
 Workman
 	�Ӽ���  kind (������ ����)
 	�޼��� work()  @@@ �� ���� �ϴ�.
 FireMan
 	�Ӽ��� wkLoc (���� �ϴ� ���)
 	�޼���  turnoff()  @@@�� @@@���� ���� ����.
 	 
 
 
 * */
	
}
