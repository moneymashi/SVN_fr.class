/* Ȯ�ο���
 ������ 3������ ��� �Դ� �̾߱�
 Ŭ���� Bear
 filed�� : �̸�, ���ڰ� ���� ����, ���� ��ü ���� ����
 ������ �̸� �Ҵ�
 �޼��� : restoreApple(��� �����߰�)
 		  eatApple(): �� �����̰� ����� ���� �� ó�� : ���� ���� ����, ���� ��ü ���� ����.
 ���
 @@@�� ����� �Դ´�.
 @@@ ���� ��������� @@@
 ���� ���� ������� @@��.		  
*/

package javahomework.a13_SeoJunghyo;

class Bear{
	String name;
	int eatCount;
	static int nowCount;
	Bear(String name){
		this.name=name;
		this.nowCount=100;		
	}
	void addApple(int addCount){
		nowCount+=addCount;
		System.out.println(name+"�� �߰��� ��� ����: "+addCount+"\t ���� ��� ����: "+nowCount);
	}
	void eatApple(int eatCount){
		nowCount-=eatCount;
		System.out.println(name+"�� ���� ��� ����: "+eatCount+"  \t ���� ��� ����: "+nowCount);
	}
}
public class a02_homework_staticBear_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bear b1 = new Bear("������");
		Bear b2 = new Bear("�����");
		Bear b3 = new Bear("��ģ��");
		System.out.println("���� ��� ����: "+Bear.nowCount);
		b1.eatApple(10);
		b2.eatApple(12);
		b3.addApple(14);
	}
}
