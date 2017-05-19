package javaexp.a07_inheritance;
interface SoundWay{
	void sound();
}
interface FlyWay1{
	void flying();
}
interface ShowColor{
	void paint();
}
class Duck_Model implements SoundWay, FlyWay1, ShowColor{
	private String modelType;
	Duck_Model(){
		modelType="���� �ʱ� �� ";
	}	
	@Override
	public void paint() {
		System.out.println(modelType+" ������ ���");
	}
	@Override
	public void flying() {
		System.out.println(modelType+" ������ �� �Ѵ�");	
	}
	@Override
	public void sound() {
		System.out.println(modelType+" �ваŸ���!!");
	}
}

public class A17_multi_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck_Model d = new Duck_Model();
		d.flying();
		d.paint();
		d.sound();
	}

}
