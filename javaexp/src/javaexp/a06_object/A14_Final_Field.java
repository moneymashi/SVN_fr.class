package javaexp.a06_object;
class Man{
	static final double PI =3.145;
	final String nation="korean";
	final String ssn;
	String name;
	Man(String ssn, String name){
		//  �ʵ��� �����͸� �����ڸ� ���ؼ� �ʱ�ȭ
		this.ssn=ssn;
		this.name=name;
	}
	void showInfo(){
		System.out.println("����:"+nation);
		System.out.println("ssn:"+ssn);
		System.out.println("�̸�:"+name);
	}
}
public class A14_Final_Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m1 = new Man("800101-1802739","ȫ�浿");
		m1.showInfo();
		m1.name="�ű浿"; // �Ϲ� �ʵ��̱⿡ �Ҵ簡��..
//		m1.ssn="800102-1802749"; final�̱⿡ �ʵ��� ������ ���� �Ұ���
//		m1.nation="japan";
//		final�� ������ ��ü���� ������ �Ұ���
//	      ������ü�� �޶����� �ٸ� �����͸� �Ҵ��� �� �ִ�.
		Man m2 = new Man("900101-1802739","�ϱ浿");
		m2.showInfo();		
//		��ü ������� ������ �� ���� ����� ���?
//		static final�� ������ ��ü�� ���ӵ��� �ʴ� ����� ������ �� �ִ�.
		System.out.println("���̰�:"+Man.PI);
//		Man.PI=2.2111; �Ҵ��� �Ұ���..
//		�Ϲ������� ����� �빮�ڷ� �����Ѵ�.
		
	}

}
