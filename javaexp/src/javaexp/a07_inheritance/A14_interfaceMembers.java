package javaexp.a07_inheritance;

// �������̽� ����
interface RemoteControl{
	// �ʵ� ==> ��� [public static final] Ÿ�� ����� = ��;
	// ����� �Ϲ������� �빮��, _(�����) �� ����
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	// �߻�޼��� ���� [abstract]
	public void turnOn(); 
	// ; body�� ���� ���� ���(implements)���� Ŭ��������
	// ������(overriding)�� �������� �ϱ� ������.
	public void turnOff();
	public void setVolume(int volumn);
	/* java 8 ���� ���� */
	// ����Ʈ �޼ҵ� : ���(implements)
	// �޴� ���� Ŭ�������� �������� ��� ����
	default void setMute(boolean mute){
		// ���� ������ ���� ö..
		if(mute){
			System.out.println("���� ó���մϴ�.");
		}else{
			System.out.println("���� �����մϴ�!!");
		}
	}
	// ���� �޼ҵ� [public] static ����Ÿ�� �޼ҵ��(�Ű�����...)
	static void changeBattery(){
		System.out.println("�������� ��ȯ�մϴ�~~");
	}
}
// ���� implements�� Ŭ���� ����
// class ������ ����Ŭ������ implments �������̽���{}
class Television implements RemoteControl{
	// �ʵ�� volume ����..
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �Ѵ�~~");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ����~~");
	}

	@Override
	public void setVolume(int volumn) {
		// TODO Auto-generated method stub
		// �Էµ� volume ���� �ְ�ġ���� ũ��..
		if( volumn >RemoteControl.MAX_VOLUME){
			// �ʵ�(volumn)���� �ְ�ġ�� ����
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volumn < RemoteControl.MIN_VOLUME){
			// �ʵ�(volumn)���� ����ġ�� ����
			this.volume=RemoteControl.MIN_VOLUME;
		}else{
			// �������� ����� ������ �Է°����� �ʵ尪�Ҵ�
			this.volume=volumn;
		}		
		System.out.println("���� volumn�� "+this.volume);
		
	}}
class Audio implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("������� �Ѵ�~~");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("������� ����~~");
	}
	@Override
	public void setVolume(int volumn) {
		// TODO Auto-generated method stub
		if( volumn >RemoteControl.MAX_VOLUME){
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volumn < RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		}else{
			this.volume=volumn;
		}		
		System.out.println("���� ������� volumn�� "+this.volume);
		
	}}
public class A14_interfaceMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static �̱⿡ ��ü �������̵� Ȱ���� �� �ִ�.
		System.out.println("�ִ뺼��ũ��:"+RemoteControl.MAX_VOLUME);
		// staic �޼��� ��ü ���� ���� ��밡��.
		RemoteControl.changeBattery();
		
		Television tv01 = new Television();
		tv01.turnOn();
		tv01.setVolume(15);
		tv01.setMute(true);
		tv01.turnOff();
		Audio ad01 = new Audio();
		ad01.turnOn();
		ad01.setVolume(8);
		ad01.setMute(true);
		ad01.turnOff();		
	}

}
