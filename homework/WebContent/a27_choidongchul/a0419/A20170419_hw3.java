package javaexp.a06_Object;

class Account01{
	String name;
	String aName;
	String cal;
	String date;
	String body;
	int money;	
	int tot;
	
	Account01(String aName){
		this.aName=aName;
		tot=1000;
	}
	
	Account01(String aName, int tot){
		this.aName=aName;
		this.tot=tot;
		System.out.println(aName+" �����Դϴ�.");
		System.out.println("�� �����ܰ�� "+tot+"���Դϴ�.");
		System.out.println("��¥\t\t���Ա�\t\t����\t\t�ܰ�");
		System.out.println("2017/01/01\t+"+tot+"\t\t���ʰ���\t\t"+tot);
	}
	
	int withdraw(int money, String body, String date){
		this.money=money;
		this.body=body;
		this.date=date;
		
		this.cal="-";
		tot-=money;
		return tot; 
	}
	
	int deposit(int money, String body, String date){
		this.money=money;
		this.body=body;
		this.date=date;
		
		this.cal="+";
		tot+=money;
		return tot;
	}
	
	void print(){
		System.out.println(date+"\t"+cal+money+"\t\t"+body+"\t\t"+tot);
	}

}

public class A20170419_hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account01 a1 = new Account01("KB�����ູ��������",100000);
		a1.withdraw(5000,"���","2017/02/15");
		a1.print();
		
		a1.withdraw(10000,"����","2017/02/27");
		a1.print();
		
		a1.deposit(500000, "���ϰݷ���", "2017/04/17");
		a1.print();
		
		
	}

}
