package javaexp.a06_Object;

class Account{
	String name;
	String aName;
	String cal;
	int money;	
	int tot;
	
	Account(String name, String aName){
		this.name=name;
		tot=10000000;
		System.out.println(name+"���� "+aName+" �����Դϴ�.");
		System.out.println("�� �����ܰ�� "+tot+"���Դϴ�.");
	}
	
	int withdraw(int money){
		this.money=money;
		this.cal="����";
		tot-=money;
		return tot; 
	}
	
	int deposit(int money){
		this.money=money;
		this.cal="�Ա�";
		tot+=money;
		return tot;
	}
	
	void calCu(){
		System.out.println(name+"��, "+money+"�� "+cal+"�߽��ϴ�."+"(�� �ܾ� : "+tot+"��)");
	}

}


public class A20170419_hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("Choi","����û��");
		
		a1.withdraw(5000);
		a1.calCu();
		a1.deposit(10000000);
		a1.calCu();
	}

}
