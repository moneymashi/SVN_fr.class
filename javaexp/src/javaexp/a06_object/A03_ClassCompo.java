package javaexp.a06_object;

/*
��ü�� ������� 
 * */
class Movie{
//	field : ��ü�� ���������� ��� �����ڿ� �޼��忡 ������ 
//	        ��ĥ �� �ִ�.
	String title;
//	 ������ :�������� ������ �⺻ �����ڰ� ���ԵǾ� �ִ�..
//	main()  Movie m = new Movie();
//	public Movie(){}
	public Movie(){
		System.out.println("������ ȣ��!!!");
	}
//	�����ڴ� ��ü ������, ���� �������� �ѹ� �� ȣ���Ͽ� ���ȴ�.
//	�����ڴ� �Է°��� �ٸ���, ���� �����ڸ� �����Ͽ� ����� �� �ִ�.
	public Movie(String name){
		title=name;// �����ڷ� ������ �����͸� ���������� �Ҵ�..
		System.out.println("�Է°��� �ִ� ������");
	}
// �޼���..
//	�޼���� ��ü�� ���ó���� �Ѵ�.
//	1)����������  2)return�� type(������void) 3)�޼���� 4) (�Է°�)
//	  ���� ������ default
	void show(){
		System.out.println("������ "+title+" �Դϴ�!!");
	}
	
}
public class A03_ClassCompo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1 = new Movie();// ȣ���� ������ ������
		// �����ڸ� �������� ������ default �����ڰ� ����������
		// �����Ǿ� �ֱ� �����̴�.
		Movie m2 = new Movie("����ִ� ��ȭ");
		Movie m3 = new Movie("���� ��ȭ");
		System.out.println("m2��ü�� �Ӽ�title��:"+m2.title);
		System.out.println("m3��ü�� �Ӽ�title��:"+m3.title);
		m2.show();
		m3.show();
	
	}

}
