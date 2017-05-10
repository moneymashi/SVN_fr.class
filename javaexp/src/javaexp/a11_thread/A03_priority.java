package javaexp.a11_thread;

class Patient extends Thread{
	private String kind;
	public Patient(String kind) {
		this.kind = kind;
	}
	@Override
	public void run() {
		Exam p = new Exam();
		p.proc();
	}	

}
class Exam{
	synchronized void proc(){
		for(int prcCnt=1;prcCnt<=10;prcCnt++){
			System.out.print(" �������� ");
					System.out.print(prcCnt);
							System.out.println("�ܰ� ��ġ�� �Ͽ����ϴ�.");
		}		
	}	
}
public class A03_priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient[] arr={new Patient("ġ��ȯ��"),new Patient("�Ϲ�ȯ��"),
				new Patient("����ȯ��")};
		// �ش� �����忡 ���� �켱������ ���� ó��..
		arr[2].setPriority(10);
		for(Patient p:arr){
			p.start();
		}
	}

}
