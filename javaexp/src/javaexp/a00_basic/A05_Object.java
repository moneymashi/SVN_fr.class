package javaexp.a00_basic;

/*��ü Ŭ���� ����*/
/*
class Ŭ������{

 * */
class Student{
	// Ŭ�������� ���� ���� ����
	String name;
	int age;
	// default������ ����..- ������ ������ ���� ����
	// �ڵ����� �����ȴ�.
	Student(){}
	// ������ : Ŭ����� ������ �޼���
	// ��ü ������ ��, �ѹ� ȣ��.
	Student(String name, int age){
		// �ܺο��� �Է��� ���� ���������� �Ҵ�.
		this.name = name;
		this.age = age;
	}
	
	// Ŭ�������� ���� �޼��� ����
	void printAll(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
}
public class A05_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ��ü �޸𸮿� ȣ��, ����..
		// Ŭ������ �������� = new Ŭ������();
		Student st01 = new Student();
		// ��ü�� ������ ������ �Ҵ�.
		// ��������.����
		st01.name="ȫ�浿";
		st01.age =25;
		// �޼��� ȣ��..
		// ��������.�޼���();
		st01.printAll();
		// �Է°��� �ִ� ������ ���� �� ȣ��..
		Student st02 = new Student("�ű浿",27);
		st02.printAll();
/*
Ȯ�ο���
	Person ��ü�� �����ϰ�,
		���� name(�̸�), loc(��� ��)
		show()�� ���ؼ� ����ϼ���..
		�������..
			�̸��� @@@�̰�, ��� ���� @@@ �Դϴ�.
 * */		
	}

}
