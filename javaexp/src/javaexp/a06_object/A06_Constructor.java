package javaexp.a06_object;

class Car{
	/* this Ű����� field���� ���������� ������ ��,
	 * �������ִ� ������ �� �Ӹ� �ƴ϶�,
	 * ����Ǿ� �ִ� �����ڸ� ��Ȱ���� ���� Ȱ��ȴ�.
	 * ps) super. :����� �Ͼ ��, ������ ���ҷ� ���� Ŭ������
	 * field��, ������, �޼��带 ȣ���� ��, ����Ŭ������ �����ϱ�
	 * ���Ͽ� Ȱ��ȴ�.
	 * */
	// field ����!!
	String model;
	String color;
	int maxSpeed;
	Car(String model){
		// this.field�� : ���ú����� field���� ������ ��
		// �����ϱ����Ͽ� Ȱ��.
		// �ߺ��ڵ尡 �߻��ϴ� ���� ��������..������ ������ �����ڸ� Ȱ��
		this(model, "����", 250);
//		this.model=model; 
//		color="����";
//		maxSpeed=250;
	}
	Car(String model, String color){
		this(model, color, 250);
//		this.model=model;
//		this.color=color;
//		maxSpeed=250;
	}	
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}		
	
}

public class A06_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("������");
		System.out.println("c1�� ����"+c1.model);
		System.out.println("c1�� ����"+c1.color);
		System.out.println("c1�� �ְ�ӵ�"+c1.maxSpeed);
		Car c2 = new Car("BMW","���");
		System.out.println("c2�� ����"+c2.model);
		System.out.println("c2�� ����"+c2.color);
		System.out.println("c2�� �ְ�ӵ�"+c2.maxSpeed);
		Car c3 = new Car("��Ծ�","���Ѻ��",280);
		System.out.println("c3�� ����"+c3.model);
		System.out.println("c3�� ����"+c3.color);
		System.out.println("c3�� �ְ�ӵ�"+c3.maxSpeed);		
		
	}

}
