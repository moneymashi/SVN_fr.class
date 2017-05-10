package javahomework.a25_jujihoon.a0420;

class Account
{
	String accountName;
	int balance;
	String printList;
	
	Account()
	{
		this.accountName = "";		
		this.balance = 0;
		this.printList = "";
	}
	
	Account(String accountName)
	{
		this();
		this.accountName = accountName;
	}
	
	Account(String accountName, int balance)
	{
		this();
		this.accountName = accountName;
		this.balance = balance;
	}
	
	int save(int deposit, String content, String date)
	{
		this.balance += deposit;
		printList += "��¥ : " + date + 
					"	�뵷 : " + this.balance + 
					"	���� : " + this.accountName + 
					"	�Աݾ� : " + deposit + 
					"	���� : " + content + "\n";
		return this.balance;
	}
	
	int withdraw(int withdraw, String content, String date)
	{
		this.balance -= withdraw;
		printList += "��¥ : " + date + 
					"	�뵷 : " + this.balance + 
					"	���� : " + this.accountName + 
					"	��ݾ� : " + withdraw + 
					"	���� : " + content + "\n";
		return this.balance;
	}
	
	void print()
	{
		System.out.println(printList);
	}
}


public class My11_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account01 = new Account("ȫ�浿", 10000);
		account01.save(1000, "����", "2017.04.16");
		account01.withdraw(2000, "���ɽĴ�", "2017.04.17");
		account01.print();
	}

}
