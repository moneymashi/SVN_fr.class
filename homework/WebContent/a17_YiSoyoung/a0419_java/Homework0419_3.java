package javaexp.a06_object;
/* ������ 3������ ��� �Դ� �̾߱�
 *   field�� : �̸�, ���� ���� ����, ���� ���� �������
 *    restoreApple(������� �߰�)
 *    eatApple();
 *    ���ڰ� ���� ����, ���� ��ü ���� ��� ����
 *    ��� : @@@�� ��� �Դ´�
 *          @@@�� ���� ��� ������ @@@
 *          ���� ���� ��� ���� @@
 * */
class Bear{
	private String name;
	private int eatNo;
	public static int appleNo;
	public Bear(String name){
		this.name = name;
	}
	public void restoreApple(int appleNo){ //  ������� �߰�
		this.appleNo += appleNo;
	}
	public void eatApple(){
		eatNo++;
		appleNo--;
		System.out.print(name+"��(��) ����� �Դ´�. ");
		System.out.println(name+"��(��) ���� ��� ������ "+eatNo);
		System.out.println("���� ���� ��� ���� : "+appleNo);
	}
}
public class Homework0419_3 {
	public static void main(String[] args) {
		Bear first = new Bear("first");
		Bear second = new Bear("second");
		Bear third = new Bear("third");
		first.restoreApple(100); //ù°�� ����� 100�� ä�� ����. ��°�� ��°�� ���ڳ׿�
		first.eatApple();
		first.eatApple();
		second.eatApple();
		third.eatApple();
	}
}
