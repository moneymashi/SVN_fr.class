package javahomework.a23_Janghyeyeong.a170419.Step1;

class Account{
	String name;
	int total;
	
	Account(String name){
		this.name=name;
	}
	int input(int inMoney){
		total+=inMoney;
		System.out.println(name+"�� "+inMoney+"�� �Ա��߽��ϴ�. \t[�� �ܾ� "+total+"]");
		return total;
	}
	int output(int outMoney){
		total-=outMoney;
		System.out.println(name+"�� "+outMoney+"�� ����߽��ϴ�. \t[�� �ܾ� "+total+"]");
		return total;
	}
	
}

public class AccountExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("ȫ�浿");
		Account a2 = new Account("��浿");
		Account a3 = new Account("�ű浿");
		
		a1.input(200000);
		a1.output(10000);
		a2.input(500000);
		a2.output(500000);
		a3.input(1000);
		a2.input(100);
		a3.output(50);
		
		
		
	}

}
