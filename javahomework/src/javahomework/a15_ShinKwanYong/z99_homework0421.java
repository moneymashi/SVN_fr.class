package javahomework.a15_ShinKwanYong.company;

class Vehicle{
	String kind;
	int maxSpeed;
	
	void setInfo(String kind, int maxSpeed){
		this.kind = kind;
		this.maxSpeed = maxSpeed;
	}
	
	void showInfo(){
		System.out.println(kind+"�� �ְ� �ӵ��� "+maxSpeed);
	}
	
	
	
}

class Car extends Vehicle{
	String person;
	
	void setInfo2(String person,String kind, int maxSpeed){
		this.person = person;
		this.kind = kind;
		this.maxSpeed = maxSpeed;
		
	}
	
	void showInfo2(){
		System.out.println("Ÿ�� ����� "+person+" "+kind+"�� �ְ� �ӵ��� "+maxSpeed);
	}
	
}



public class z99_homework0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle();
		v1.setInfo("����", 150);
		v1.showInfo();
		Car c1= new Car();
		c1.setInfo2("����", "��", 200);
		c1.showInfo2();
		
		
		
	}

}
