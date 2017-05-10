package javahomework.a04_KimDongBeom;

/*
	������1 : ������
	������2 : ��
*/

class Account{
	String aname;			// ������
	int ioMoney;			// ����ݾ�
	int totMoney;			// ���ܾ�
	String date;			// ��¥
	String content;			// ����
	String printf;
	
	Account(String aname){
		this.aname = aname;
		this.printf = aname+" ���� �ܾ�\n��¥\t����ݾ�\t�ܾ�\t����\n";
	}
	Account(String aname, int totMoney){
		this.aname = aname;
		this.totMoney = totMoney;
		this.printf = aname+" ���� �ܾ�\n��¥\t����ݾ�\t�ܾ�\t����\n";
	}
	int save(int ioMoney, String content, String date){
		this.totMoney += ioMoney;
		this.printf += date+"\t+"+ioMoney+"\t"+totMoney+"\t"+content+"\n";
		return this.totMoney;
	}
	int withdraw(int ioMoney, String content, String date){
		this.totMoney -= ioMoney;
		this.printf += date+"\t-"+ioMoney+"\t"+totMoney+"\t"+content+"\n";
		return this.totMoney;
	}
	
	void print(){
		System.out.println(this.printf);
	}
}

public class A0419_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account("ABC");
		Account a2 = new Account("DEF",80000);
		
		a1.save(100000, "�뵷", "2017/4/15");
		a2.save(150000, "�뵷", "2017/4/16");
		
		a1.withdraw(50000, "�����", "2017/4/15");
		a2.withdraw(200000, "�����", "2017/4/17");
		
		a1.print();
		a2.print();
	}

}
