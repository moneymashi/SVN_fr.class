/* ����
 ���࿡ ����(1�ܰ�)
 1) ����
 filed : ���¸�
 ������(���¸� �Է�)
 input(�Աݾ�)
 	@@@�� @@@�� �Ա��߽��ϴ�.(���ܾ� @@@)
 output(��ݾ�)
 	@@@�� @@@�� ����߽��ϴ�.(���ܾ� @@@)
 
 �ڱ�Ұ�(1�ܰ�)
 filed : �̸�, ��°�, ����
 	- ������(�̸��Է�)
 	- inputdata(��°�, ����)
 	- introMyself() : ���ó��
 	���̸��� @@�̰� ���̴� @@�̸� ��� ���� @@�̴�.
*/ 	
package javahomework.a13_SeoJunghyo;
class Intro{
	String name;
	String loc;
	int age;
	

	Intro(String name){
		this.name=name;
		this.loc="�����";
		this.age=31;
	}
	
	void info(String loc, int age){
		this.loc=loc;
		this.age=age;
	}
	void introMyself(){
		System.out.println("���̸��� "+name+"�̰� ���̴� "+age+"���̸� ��� ���� "+loc+"�̴�");
	}
}
public class a02_homework_intro_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intro me =  new Intro("ȣ����");
		Intro rival = new Intro("�޽�");
		Intro friend = new Intro("��������");
		me.info("��������", 32);
		me.introMyself();
		rival.info("�Ƹ���Ƽ��", 31);
		rival.introMyself();
		friend.introMyself();

	}

}
