package javaexp.a06_object;

class SingleWoman{
	private int num01;
	// �̱����� �ϱ����� �ʵ�� ��ü ����
	private static SingleWoman singleWm = new SingleWoman();
	// �ܺο��� ��ü������ ����. : private ����..
	private SingleWoman(){} // public SingleWoman(){} :�������� ������
	// static���� �̱��� ��ü�� �����ϰ� ó��.
	static SingleWoman getInstance(){
		return singleWm;
	}	
	public int getCount(){
		num01++;
		return num01;
	}
}

public class A13_SingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingleWoman w1 = new SingleWoman();�����߻� ������  ����private�̱⿡
		SingleWoman w1 = SingleWoman.getInstance();
		SingleWoman w2 = SingleWoman.getInstance();
		SingleWoman w3 = SingleWoman.getInstance();
		// w1, w2 �� ���� heap������ ��ü�� �ٶ󺸰� �ִ� ��..
		if( w1 == w2){
			System.out.println("w1,w2�� ���� ��ü");
		}else{
			System.out.println("w1,w2�� �ٸ� ��ü");
		}
		System.out.println(w1.getCount());
		System.out.println(w1.getCount());
		System.out.println(w2.getCount());
		System.out.println(w3.getCount());
		System.out.println(w2.getCount());
	}

}
