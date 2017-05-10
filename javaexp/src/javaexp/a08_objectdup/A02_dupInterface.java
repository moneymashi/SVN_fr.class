package javaexp.a08_objectdup;
/* Button Ŭ������ ��, �̺�Ʈ ó���ϴ� ��ø �������̽�
 * Ȱ��..
 * */
class Button{
	// �������̽� Ÿ�� �ʵ�..
	OnClickListener listener;
	
	// �ܺο��� �پ��ϰ� ó���ϴ� ������ü�� �޾Ƶ��� �� �ְ�
	// �޼��� ����..
	void setOnClickListener(OnClickListener listener){
		this.listener = listener;
	}
	void touch(){
		if(listener!=null){
			listener.onClick();
		}else{
			System.out.println("�����ʿ� ���� ��ü �Ҵ���� ����!!");
		}
	}
	
	// Button Ŭ������ ���ӵ� ��ø �������̽� ����
	interface OnClickListener{
		// �߻�޼��� ����..
		void onClick();
	}
}
// ���� Ŭ���� ����..OnClickListener�� implements��...
//  ��ư�� Ŭ������ ��, ��ȭ�� �ɾ� �ִ� Ŭ����..
//                    �޽����� ���� �ִ� Ŭ����.
// ��ø�������̽��� Ŭ����.�������̽���..Button.OnClickListener
class CallListener implements Button.OnClickListener{

	@Override  // Button.OnClickListener�� onClick()�߻�޼��尡
	// ���ǵǾ� �ֱ� ������, �ݵ�� implements�ϴ� ���� ������ �Ͽ��Ѵ�.
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �ɴ�!!");
	}	
}
// �޼��� �����ִ� Ŭ����..
class MessageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �����ϴ�.");
	}
}
class MusicStartListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("������ �����ϴ�!!");
	}
}
public class A02_dupInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ư Ŭ���� ����.
		Button btn01 = new Button();
		btn01.touch(); // Listener ��ü�� �Ҵ���� �ʾұ⿡ 
		// listener ��ü �Ҵ���� �޽��� ǥ��.. null.
		// void setOnClickListener(OnClickListener listener)
		// �������̽��� ���� ��ü�� �Ҵ�..
		// ����: OnClickListener listener = new CallListener();
		btn01.setOnClickListener(new CallListener());
		btn01.touch();
		btn01.setOnClickListener(new MessageListener());
		btn01.touch();
		btn01.setOnClickListener(new MusicStartListener());
		btn01.touch();		
	}

}
