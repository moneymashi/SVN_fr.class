package javaexp.a10_api;
// ������ �� �ִ� �������̽� �߰�.
class Friend implements Cloneable{
	private String name;
	public Friend(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Friend getFriend(){
		Friend cloned=null;	
		try {
			cloned=(Friend)clone();
		// ������ ����, �ʼ� ���� ó�� �ʿ�	
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return cloned;
	}
}
public class A03_clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f1 = new Friend("�ڸ���");
		System.out.println("f1�� �̸�:"+f1.getName());	
		Friend f2 = f1;
		f2.setName("��ſ�");
		System.out.println("f2�� �̸�:"+f2.getName());
		System.out.println("f1�� �̸�:"+f1.getName());
		Friend f3 = f1.getFriend(); 
		System.out.println("f3�� �ʱ��̸�:"+f3.getName());
		// ������ ���ο� Friend��ü ����
		f3.setName("������");
		System.out.println("f3�� �̸�:"+f3.getName());
		System.out.println("f1�� �̸�:"+f1.getName());
	}

}
