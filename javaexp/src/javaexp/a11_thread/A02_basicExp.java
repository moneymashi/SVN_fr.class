package javaexp.a11_thread;
class Person{}
class Customer01 implements Runnable {
	private String name;
	public Customer01(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int workProc=1;workProc<=10;workProc++){
			System.out.println(name+" ������ "+workProc+"��° ������ ó���մϴ�!!");
		}		
	}	
}

class Customer02 implements Runnable{
	private String name;
	
	public Customer02(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		String []prc={"�α���","����Ȯ��","���Ǳ���",
				    "��ٱ���Ȯ��","����","���ó��","�α׾ƿ�"};
		for(int  prodIdx=0;prodIdx<prc.length;prodIdx++){
			System.out.println(name+" ������ "+(prodIdx+1)+"��° ���� "
					+prc[prodIdx]+"�� ó���մϴ�!!");
		}		
	}	
}
public class A02_basicExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer01[] arrayCus={new Customer01("������"),
						new Customer01("������"),new Customer01("�̹̿�")};
		Thread t=null;
		for(Customer01 cus:arrayCus){
			t= new Thread(cus);
			t.start();
		}
		
		
		
		Customer02[] arrayCus2={new Customer02("������"),
				new Customer02("������"),new Customer02("�̹̿�")};
		Thread t2=null;
		for(Customer02 cus:arrayCus2){
			t2= new Thread(cus);
			t2.start();
		}		
		
	}

}
