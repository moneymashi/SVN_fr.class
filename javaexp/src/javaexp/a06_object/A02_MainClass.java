package javaexp.a06_object;
// Ŭ���� ����!!
class Student{}
class Teacher{}

public class A02_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*   main()�޼��尡 �ִ� Ŭ�������� main()�κ��� �ܺ�
   Ŭ������ ����� �͵� ���� �����ڰ� ����ϴ� ���� �ȿ���
   ������ �����ϴ�.
*/
		// ����� class�� ��ü�� �����ؼ� �޸𸮿� �ø�~
		A01_Object obj01 = new A01_Object();
		// class(����)�� ������ ȣ���ϴ� ���� ��ü���� ��ü�� �������
		Student stu01 = new Student();
		Student stu02 = new Student();
		// ���踸 ���� ���⿡ �ٸ� �����͸� �����鼭, �ٸ� ��ü�� ��.
		// heap������ �ٸ� �ּҸ� �����ϴ� ��ü��
		System.out.println("stu01�ּ�:"+stu01);
		System.out.println("stu02�ּ�:"+stu02);
		
	}

}
