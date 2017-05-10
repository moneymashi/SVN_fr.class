package javahomework.a20_YiSoyoung.a0427;
/* 1�ܰ�) MusicStartListener : ������ ������ ������ ���� 
 * 2�ܰ�)
	- Draw
		�ʵ弱��..
		OnTouchListener(��ø�������̽�)
			onTouch(); - �߻�޼���
		drawing()
	- CircleListener : ���׶�� �׷��ִ� ����Ŭ����
	- TriangleListener : ���� �׷��ִ� ����Ŭ���� */
class Draw{
	private OnTouchListener touchListener;
	public void setOnTouchListener(OnTouchListener touchListener) {
		this.touchListener = touchListener;
	}
	public void drawing(){
		if(touchListener!=null)
			touchListener.onTouch();
		else
			System.out.println("�����ʵ� �Ҵ� �� ��");
	}
	interface OnTouchListener{
		public void onTouch();
	}
}
class CircleListener implements Draw.OnTouchListener{
	@Override
	public void onTouch() {
		System.out.println("���׶�̸� �׷����");
		
	}
}
class TriangleListener implements Draw.OnTouchListener{
	@Override
	public void onTouch() {
		System.out.println("�ﰢ���� �׷����");
		
	}
}
public class A02_dupInterfaceExp {
	public static void main(String[] args) {
		Draw draw = new Draw();
		CircleListener circleListener = new CircleListener();
		TriangleListener triangleListener = new TriangleListener();
		draw.setOnTouchListener(circleListener);
		draw.drawing();
		draw.setOnTouchListener(triangleListener);
		draw.drawing();
	}
}
