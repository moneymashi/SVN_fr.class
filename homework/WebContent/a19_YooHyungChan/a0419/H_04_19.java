package javaexp.a06_object;



// ���� 1�ܰ�
class Account {
	String name;
	int account;
	int inputMoney;
	int outputMoney;
	int sum;
	static int tot = 10000000; //�������� �ʴ� ���..
	
	Account(String name, int account){
		this.name = name;
		this.account = account;
	}

	int input(int inputMoney){
		this.inputMoney = inputMoney;
		tot += inputMoney;
		return tot;
	}
	
	int output(int outputMoney){
		this.outputMoney = outputMoney;
		tot -= outputMoney;
		return tot;
	}
	
	void currentMoney(){
		System.out.println(name+"��  "+inputMoney+"�� �Ա�" );		
		System.out.println(name+"��  "+outputMoney+"�� ���" );		
		System.out.println(name+"�� ���¹�ȣ : "+account+"  �ܾ� : "+tot+"��");		
	}
}

//�ڱ�Ұ� 1�ܰ�
class Introduce{
	String name;
	String address;
	int age;
	String inf;
	
	Introduce(String name){
		this.name = name;
	}
	
	void inputData (String address, int age){
		this.address = address;
		this.age = age;
	}
	
	void introMyself(){
		System.out.println("���̸��� "+name+"�̰�, ���̴� "+age+"�̸�, ��� ���� "+address+"�Դϴ�.");
	}
}

class AccountVer2{
	int accountMum;
	String accountName; 
	String show= "";
	static int tot ;
	
	AccountVer2(String accountName,int accountMum, int tot){
		this.accountName = accountName;
		this.accountMum = accountMum;
		AccountVer2.tot = tot;
		System.out.println("������ : "+accountName+"\n���¹�ȣ :"+accountMum);
	}
	
	int save(int inputMoney, String inputWhy, String inputDate){
		tot += inputMoney;
		show += "+"+inputMoney+"\t\t"+inputWhy+"\t"+inputDate+"\n";
		return tot;
	}
	
	int withdraw(int outputMoney, String outputWhy, String outputDate){
		tot -= outputMoney;
		show += "-"+outputMoney+"\t\t"+outputWhy+"\t"+outputDate+"\n";
		return tot;
	}
	
	void print(){
		System.out.println(show);
		System.out.println("�ܾ� : "+tot);
		
	}
}

public class H_04_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� 1�ܰ�
		Account a1 = new Account("������", 11099999);
		a1.input(50000);
		a1.output(90000);
		a1.currentMoney();
		
		// �ڱ�Ұ� 1�ܰ�
		Introduce i1 = new Introduce("������");
		i1.inputData("�д�", 26);
		i1.introMyself();
		
		// ���� 2�ܰ�
		
		AccountVer2 a2 = new AccountVer2("������",123456, 999999999);
		a2.save(100000,"�뵷","17/04/19");
		a2.withdraw(20000, "��", "17/04/19");
		a2.print();
		
	}
}
