package javaexp.a06_object;
/* �ڱ�Ұ�1�ܰ�
 * field : �̸�, ��� ��, ����
 * ������(�̸��Է�)
 * inputData(��� ��, ����)
 * introMyself() ���̸��� @@�̰� ���̴� XX�̸� ��°��� ����Դϴ�
 * */
class MySelfIntro {
	private String name;
	private String address;
	private int age;
	public MySelfIntro() {	}
	public MySelfIntro(String name) {
		this.name = name;
	}
	public void inputData(String address, int age){
		this.address = address;
		this.age = age;
	}
	public void introMyself(){
		System.out.println("�� �̸��� "+name+"�̰� ���̴� "+age+"���̸� ��� ���� "+address+"�Դϴ�.");
	}
}
public class Homework0419_selfintro_1step {
	public static void main(String[] args) {
		MySelfIntro lee = new MySelfIntro("�̱浿");
		lee.inputData("���� ���", 25);
		lee.introMyself();
	}
}