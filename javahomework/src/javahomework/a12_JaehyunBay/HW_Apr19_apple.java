package javahomework.a12_JaehyunBay;
/*
������ ��� �Ա�.
Ŭ���� Bear
field��: �̸�, ���ڰ� ���� ����, ���� ��ü����.
������: �̸��Ҵ�
method: restoreApple(������� �߰�)
eatApple() : �� �����̰� ����� ������ ó��.
	���ڰ� ���� ����, ���� ��ü��������.

output: @@@����� �Դ´�.
		@@@���� ������� @@@
		���� ���� �������@@@.
*/
class Bear01{
	String name;
	int nowEat;
	static int currRest =10;
	String eating(String name, int nowEat){
		this.name = name;
		this.nowEat = nowEat;
		return name;
	}
	void print(){
		System.out.println(name+ "�� "+ nowEat +"���� ��ƿ��!!"+" ���� "+ currRest+"�� ���ѳ׿�.");
	}
}



public class HW_Apr19_apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bear01 b1 = new Bear01();
		System.out.println("���� ��������� "+ Bear01.currRest +"�� �Դϴ�!");
		b1.eating("taddy1",3);  // ����� ����.. name, nowEat;
		Bear01.currRest -= 3;  // ���� ������� ó��  ��� b1,b2,b3������ Bear01Ŭ������ �ٲٴµ�..
		b1.print();
		Bear01 b2 = new Bear01();
		b2.eating("taddy2",1);  // ����� ����.. name, nowEat;
		b2.currRest -= 1;// ���� ������� ó��
		b2.print();
		Bear01 b3 = new Bear01();
		b3.eating("taddy3",4);   // ����� ����.. name, nowEat;
		b3.currRest -= 4;// ���� ������� ó��
		b3.print();
		
	}

}
