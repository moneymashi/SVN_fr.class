package javaexp.a11_thread;

/*
�������� ���¸� ����ϴ� Ŭ����
 * */
class StatePrintThread extends Thread{
	private Thread targetThread;

	// �����ڸ� ���ؼ� �ʵ��Ҵ� : Thread ���°� Ȯ��
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	@Override
	public void run() {
		// NEW ==> RUNNABLE ==> TIMED_WAITING 
		//   ==> RUNNABLE ==> TERMINATED
		// ó�� ���μ����� ���� loop
		while(true){
			// ���°��� �޾Ƽ� �Ҵ�  �� ���
			Thread.State state= targetThread.getState();
			System.out.println("Ÿ�� ������ ����:"+state);
			// ���� Thread�� ������ ���� ��..
			if(state == Thread.State.NEW){
				// start()�� ���ؼ� runnable�� ����.
				targetThread.start();
			}
			// life cycle�� ������ �Ǹ� break ó��..
			if(state == Thread.State.TERMINATED){
				// �ݺ��� ����ó��..
				break;
			}
			// �Ͻ� ���� ���� ó��..0.5
			try {
				// Thread.State.TIMED_WAITING ����
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class TargetThead extends Thread{
	public void run() {
		// loop���� ���ؼ� ���Ƿ� ���α׷� ����..
		for(long cnt=0;cnt<1000000000;cnt++){}
		// thread ���� ���¸� �߻�..
		// 1.5�� ����, Thread.sleep() ����ó���ݵ��
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// �ٽ� �����ϴ� ����
		for(long cnt=0;cnt<1000000000;cnt++){}		
	}
	
}



public class A04_state {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����  NEW
		StatePrintThread  thread01 = new StatePrintThread(new TargetThead());
		// RUNNABLE ����
		thread01.start();
	}

}
