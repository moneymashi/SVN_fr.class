package javaexp.a06_object;
/*
 * ���࿡ ����
 * field�� : ������, (�Աݾ�, ��ݾ�), ���ܾ�, (��¥)
 * Account(���°���)
 * ������1 : ������ �Է�
 * ������2 : ������, �ʱ��Աݾ�
 * save(�Աݾ�,��¥)
 * ���ó��
 * - return
 * 
 * �ڱ�Ұ�
 * field : �̸�, ��°�, ����
 * ������(�̸��Է�)
 * inputData(��°�,����)
 * introMyself():���ó��
 * ���̸��� @@�̰�, ���̴� @@, ��°��� @@�Դϴ�
 * 
 * 
 * */

class Account{
	String name03;
	String text;
	int input;
	int sum02;
	int total;
	String date01;
	
	Account(String name03){
		this.name03=name03;
	}
	

	int Save(String date01,String text, int input){
		this.date01=date01;
		this.text=text;
		this.input=input;
		total+= input;
		return total;
	}
	void print(){
		System.out.println(date01+"\t"+name03+"��"+"\t"+text+"\t"+input+
				"\t�Ѿ�: "+total);		
	}
	
}

class Myself{
	String name01;
	String address;
	int age;
	
	
	Myself(String name01){
		this.name01=name01;
	}

	void InputData(String address, int age){
		this.address=address;
		this.age=age;
	}
	
	void introMyself(){
		System.out.println("�� �̸��� "+name01+"�̰� ���̴� "
	+age+", ��°��� "+address+"�Դϴ�");
	}
	
	
}

class Bear{
	String name;
	int bearApple;
	static int totApple;
	
	Bear(String name){
		this.name=name;
	}

	void eatApple(int bearApple){
		totApple-=bearApple;
		System.out.println(name+"�� ����� �Դ´�");
		System.out.println(bearApple+"���� �Ծ");
		System.out.println("�� ���� �����"+totApple);
	}
	
	
	
	
}









public class Z99_homework0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account p1= new Account("����");
		p1.Save("0419","�ǵ�",50000000);
		p1.print();
		System.out.println("-----------------");
		
		
		Myself s = new Myself("�Ű���");
		s.InputData("���� ����",31);
		s.introMyself();
		System.out.println("-----------------");
		
		
		Bear b1 = new Bear("������");
		Bear.totApple+=10;
		b1.eatApple(1);
	
		
		
		

	}

}
