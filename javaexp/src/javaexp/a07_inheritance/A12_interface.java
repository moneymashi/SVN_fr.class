package javaexp.a07_inheritance;

class Mz01{
	Flyway f;
	void attack(){
		System.out.println("������ �ϸ鼭 ������ ��Ű��!!");
	}
	void setFlying(Flyway wing){
		this.f = wing;
	}
	void flytoTheSky(){
		System.out.print("��¡���� ~~ ");
		if(f!=null){
			f.fly();
		}else{
			System.out.println("������ ���� ���� ����!!");
		}
	}
}
interface Flyway{
	void fly();
}
// �������̽��� ��� ���� ���� Ŭ���� ����
// �������̽��� implements�� ���ؼ� ��� �޴´�!!
// Flyway f01 = new Wing01();
// f01.fly();
class Wing01 implements Flyway{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(" ���׸� ������!![ó������ �ϴ���~~]");		
	}	
}
class Wing02 implements Flyway{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(" �츮���� ������ ������.");		
	}	
}
public class A12_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mz01 m01 = new Mz01();
		Wing01 w01 = new Wing01();
		// ������ ������..
		// void setFlying(Flyway wing){
		// 	Flyway wing = w01;   
		//  Flyway wing = new Wing01();
		m01.setFlying(w01);
		m01.flytoTheSky();
		m01.setFlying(new Wing02());
		m01.flytoTheSky();		
	}

}
