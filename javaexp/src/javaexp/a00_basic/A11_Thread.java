package javaexp.a00_basic;

//������ ó��
// class Ŭ���� extends Thread{}
class Come extends Thread{
	// ������ ó���ϴ� run()�� ������!!
	public void run(){
		for(int cnt=0;cnt<1000;cnt++){
			System.out.println("�̸� ���ÿ�!!!");
		}
	}
}
class Go extends Thread{
	public void run(){
		for(int cnt=0;cnt<1000;cnt++){
			System.out.println("����  ���ÿ�! ���� �����ÿ�!!!!");
		}
	}
}
class Bank extends Thread{
	String account;
	Bank(String account){
		this.account = account;
	}
	public void run(){
		for(int cnt=1;cnt<1000;cnt++){
			System.out.println(account+"�� "+cnt+"�� ������ �����մϴ�!!");
		}
	}
}


public class A11_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank("ȫ�浿");
		Bank b2 = new Bank("��浿");
		Bank b3 = new Bank("�ű浿");
		b1.start();
		b2.start();
		b3.start();
		/*
		Go g = new Go();
		Come c = new Come();
		// Thread ��ü�� run�� start()�� ȣ��ȴ�.
		g.start();
		c.start();
		*/
/*
�ϳ��� ���μ��������� ���� ���α׷��� ȿ�������� ó���� ����,
���α׷������� ���� �߻��Ѵ�.
�̰��� Thread��� �ϴµ�, ���� Server vs Client���α׷��̳�,
���������� ���� ������ ó���ؾ� �ϴ� ���α׷�, ��Ʈ��ũ���α׷�����
Ȱ��ǰ� �ִ�.
����Ȯ���� ��Ȯ�ϰ� ������ ������, time slicing ������� ������
ȿ�������� ó���� �� �ʿ��� ���α׷��̴�.
 * */
	}

}
