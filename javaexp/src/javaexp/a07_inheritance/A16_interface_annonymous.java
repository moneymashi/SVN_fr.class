package javaexp.a07_inheritance;

public class A16_interface_annonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new RemoteControl() {		
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("�ڵ����� �Ѵ�");
			}
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("�ڵ����� ����");
			}		
			@Override
			public void setVolume(int volumn) {
				// TODO Auto-generated method stub
				System.out.println("�ڵ�����  volumn�� "+volumn+"�� �����ϴ�");
				
			}
		};	
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
	}

}
