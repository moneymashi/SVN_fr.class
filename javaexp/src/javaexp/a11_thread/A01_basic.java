package javaexp.a11_thread;
/*
������ ���α׷��� �ϳ��� ���μ������� ���� ��Ƽ�½�ŷ�� ��
�ִ� �����带 ���� ȿ�����̰� ������ ó���� �� �ְ�
���� �ش�.
���࿡ ���� �ѻ���� ������ ������ ����, �ٸ� ����� ���� ��������
���Ѵٸ� ��ȿ�����̰� �ð��� ���� ����ϰ� �ȴ�.
thread��� ���� ������ �־� ������ �ܰ躰�� ���� ��������ڰ�
ó���� �� �ִٸ�, ���� ����� ���ôٹ������� ������ ó���� �� �ְ�
�ȴ�.
 * */
/*
1.  implements�� Thread ó��..
 * */
class Person01{}
// implements�� ������ �߰� ����� ����
class Account extends Person01 implements Runnable{
	private String name;	
	public Account(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int workProc=1;workProc<=10;workProc++){
			System.out.println(name+"���� "+workProc+"��° ������ ó���մϴ�!!");
		}
	}	
}
/*
 2. extends Thread�� ���� ���
 1) Ŭ������  Thread�� ��ӵǾ��⿡..
 2) Ŭ������ ��ü�� �ٷ� Ȱ���� �� �ִ�.
 * */
// extends Person �� �ڹٿ����� ���� ��Ӹ� �����ϱ⿡ �߰�
// ����� �Ұ����ϴ�.
// �߰������ �ʿ��� ��쿡�� Runnable interface�� implements
// �ؾ��Ѵ�.
class Traveler extends Thread{
	private String name;
	public Traveler(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		String []locs={"����","����","�뱸","�λ�","���ؾ�","����","����"};
		for(int idx=0;idx<locs.length;idx++){
			System.out.println(name+"���� "+locs[idx]+"�� ������ ���ϴ�!!");
		}
	}
	
}
public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Runnable�� implements�� Thread ó�� �ܰ�
		//    1) ��ü ����
		//    2) Thread�� �����ڷ� �ش� ��ü����
		Account acc01 = new Account("ȫ�浿");
		Thread t1 = new Thread(acc01);
		//    3) start()�� run()�� ȣ��
		t1.start();
		Thread t2 = new Thread(new Account("�ű浿") );
		t2.start();		
		new Thread(new Account("���浿") ).start();
		// Thead ����� �ٷ� Ȱ�� ����..
		Traveler t01= new Traveler("������");
		Traveler t02= new Traveler("���ϳ�");
		Traveler t03= new Traveler("��̼�");
		t01.start();
		t02.start();
		t03.start();
		
	}

}
