package javaexp.a06_object;

class Calculator{
	int num01;
	int num02;
	int sum;
	char cal;// ������
	
	int plus(int num01, int num02){
		this.num01=num01;
		this.num02=num02;
		cal='+';
		sum =num01+num02;
		return sum;
	}	
	// returntype  �޼����(�Է°�1, �Է°�2)
	int minus(int num01, int num02){
		this.num01=num01;
		this.num02=num02;		
		cal='-';
		sum=num01-num02;
		return sum;
	}
	int multi(int num01, int num02){
		this.num01=num01;
		this.num02=num02;		
		cal='*';
		sum=num01*num02;
		return sum;
	}
	int div(int num01, int num02){
		this.num01=num01;
		this.num02=num02;		
		cal='/';
		sum=num01/num02;
		return sum;
	}
	// ���ó�� �޼��� ����
	void print(){
		System.out.println(num01+ " "+cal+" "+num02+" = "+sum);
	}

}

public class A08_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		int tot=c1.plus(5,5);
		c1.print();
		tot+=c1.minus(7,2);
		c1.print();
		System.out.println("�� ��갪:"+tot);
	}

}
