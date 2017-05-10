package javaexp.a06_object;

import java.util.Date;

/*  ���࿡ ���� 2�ܰ�
 *  Account2 : ������, �Աݾ�, ��ݾ�, ���ܾ�
 *  ������2�� - ������, ������� �Աݾ�
 *  save(�Աݾ�, ����, ��¥){
 *  	���ó��
 *  	return �Աݵ� �ݾ�
 *  }
 *  withdraw(��ݾ�, ����, ��¥)
 *  print()
 *  	��¥ �뵷 [@@@] [@@@] [@@@] */
class Account2{
	private String accountName; //������
	private int inMoney;
	private int outMoney;
	private String memo; //����
	private Date date;
	private int balance; //�ܾ�
	public Account2(String accountName){
		this.accountName = accountName;
		System.out.println("�� �� �� "+ accountName+"������ ���� �ּż� �����մϴ� �� �� ��");
	}
	public Account2(String accountName, int balance){
		this(accountName);
		this.balance = balance;
	}
	public int save(int inMoney, String memo, Date date){
		this.inMoney = inMoney;
		this.memo = memo;
		this.date = date;
		balance+=inMoney;
		return inMoney;
	}
	public void withdraw(int outMoney, String memo, Date date){
		if(balance>=outMoney){
			this.outMoney = outMoney;
			this.memo = memo;
			this.date = date;
			balance -= outMoney;
		}else{
			System.out.println("@ @ �ܾ��� ������ ������ "+outMoney+"�� ����Ϸ� �߽��ϴ�. �Ұ����մϴ�(���ܾ�:"+balance+"��) @ @");
		}
	}
	public void print(){
		System.out.printf(accountName+" ��¥:%TF \t ����:%s \t �ܾ�:%d\n",date,memo,balance);
	}
}
public class Homework0419_Account_2step {
	public static void main(String[] args) {
		Account2 acc_lee = new Account2("�̱浿_����_110-12-123");
		Account2 acc_kim = new Account2("��浿_����_110-12-123",100000);
		
		acc_lee.save(20000, "����", new Date());
		acc_lee.print();
		acc_kim.save(20000, "����", new Date());
		acc_kim.print();
		acc_lee.withdraw(2000, "�뵷", new Date());
		acc_kim.print();
	}
}
