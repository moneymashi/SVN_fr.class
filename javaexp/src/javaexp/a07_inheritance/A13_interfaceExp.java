package javaexp.a07_inheritance;

class Duck{
	ChangeColor cc;
	void setColor(ChangeColor cc){
		this.cc = cc;
	}
	void goColorWith(){
		// �������̽��� ���� ��ü�� �Ҵ� �Ǿ��� ��..
		if( cc!=null){
			cc.showColor();
		}
		System.out.println(" ������ ��������!!");
	}
}
interface ChangeColor{
	void showColor();
}
class WhiteColor implements ChangeColor{
	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.print("���");
	}	
}
class YellowColor implements ChangeColor{
	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.print("�����");
	}	
}
public class A13_interfaceExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d1 = new Duck();
		// ChangeColor cc = new YellowColor();
		d1.setColor(new YellowColor());
		d1.goColorWith();
		Duck d2 = new Duck();
		d2.setColor(new WhiteColor());
		d2.goColorWith();		
	}

}
