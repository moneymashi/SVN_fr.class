package javahomework.a20_YiSoyoung.a0421;
/* ��ü�� Ŭ������ ���� ������ Ʋ�� ����? ��
 	�� Ŭ������ ��ü�� �����ϱ� ���� ���赵�� ���� ���̴�
 	�� new �����ڷ� Ŭ������ �����ڸ� ȣ�������ν� ��ü�� �����ȴ�.
 	�� �ϳ��� Ŭ������ �ϳ��� ��ü�� ������ �� �ִ�.
 	�� ��ü�� Ŭ������ �ν��Ͻ��̴�
 * Ŭ������ ��������� �ƴ� ���� �����ΰ�? ��
 	�� �ʵ�
 	�� ������
 	�� �޼ҵ�
 	�� ���ú���
 * �ʵ忡 ���� �������� Ʋ�� ���� �����ΰ�?��
	�� �ʵ�� �޼ҵ忡�� ����� �� �ִ�
	�� �ν��Ͻ� �ʵ� �ʱ�ȭ�� �����ڿ��� �� �� �ִ�
	�� �ʵ�� �ݵ�� ������ ���� ���� ����Ǿ�� �Ѵ�
	�� �ʵ�� �ʱⰪ�� ���� �ʴ��� �⺻������ �ڵ� �ʱ�ȭ�ȴ�
 * �޼ҵ� �����ε��� ���� �������� Ʋ������ �����Դϱ�? ��
	�� ������ �̸��� �޼ҵ带 ������ �����ϴ� ���� ���Ѵ�.
	�� �ݵ�� ���� Ÿ���� �޶�� �Ѵ�.
	�� �Ű������� Ÿ��, ��, ������ �ٸ��� �����ؾ� �Ѵ�.
	�� �Ű����� Ÿ�� �� ���� ���� ȣ��� �޼ҵ尡 ���õȴ�.
 * final �ʵ�� ���(static final)�� ���� �������� Ʋ�� ����?��
	�� final �ʵ�� ����� �ʱⰪ�� ����Ǹ� ���� ������ �� ����.
	�� final �ʵ�� ����� �����ڿ��� �ʱ�ȭ�� �� �ִ�
	�� ����� �̸��� �빮�ڷ� �ۼ��ϴ� ���� �����̴�
	�� ����� ��ü�������� Ŭ������ ���� ����� �� �ִ�
 * ���� ���ѿ� ���� �������� Ʋ�� ���� �����Դϱ�? ��
	�� ���� �����ڴ� Ŭ����, �ʵ�, ������, �޼ҵ��� ����� �����Ѵ�
	�� public ���� ������ �ƹ��� ���� ���� �ش��Ҹ� ����� �� �ְ� �Ѵ�
	�� default ���� ������ �ش� Ŭ���� ���ο����� ����� �㰡�Ѵ�
	�� �ܺο��� �������� ���ϵ��� �Ϸ��� private ���� ������ �ؾ� �Ѵ�.
 * ���� Ŭ�������� �ش� ����� �ʵ�, ������, �޼ҵ� �� � ������ ��ĭ�� ä�켼��
 	public class Member{
 		private String name;		�禡��������(�ʵ�)
 		public Member(String name){	�禡��������(������)
 			this.name = name;
 		}
 		public void setName(String name){�禡��������(�޼ҵ�)
 			this.name = name
 		}
 	}
 * ���� ���� ��ü�� Account ��ü�� �ܰ�(balance) �ʵ带 ������ �ִ�. balance �ʵ��
 * �������� �� �� ����, �ִ� �鸸�������� ������ �� �ִ�. �ܺп��� balance �ʵ带 ������� 
 * �������� ���ϵ��� �ϰ�, 0 <=balance<=1,000,000,000 ������ ���� ���� �� �ֵ��� 
 * Account Ŭ������ �ۼ��� ������
 	- setter�� getter�̿�
 	- 0rhk 1,000,000 �� MIN_BALANCE, MAX_BALANCE����� �����ؼ� ���
 	- setter�Ű����� �����̰ų� �鸸���� �ʰ��ϸ� ���� balance�� ����
 * */
class Account{
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000000; // ¦�� �������� 10������ �ش޶� �ؼ� ��¦ �ٲ���ϴ�
	private String accountNo;
	private String name;
	private int balance;
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<=MAX_BALANCE && balance>=MIN_BALANCE){			
			this.balance = balance;
		}else{
			System.out.println(MIN_BALANCE+"�̻� "+MAX_BALANCE+"���� �Ǵ� �����Դϴ�");
		}
	}
	public void deposit(int money){ // ���� - MAX_BALANCE Ȯ��
		if(balance+money>MAX_BALANCE){
			System.out.println(MAX_BALANCE+"�̻��� �Ǹ� �ȵǴ� ���¿���");
		}else{
			balance += money;
			System.out.println("�ԱݿϷ�(���ܰ� : "+balance+")");
		}
	}
	public void withdraw(int money){ // ����� return
		if(balance>=money){
			balance -= money;
			System.out.println("��ݿϷ�(���ܰ� : "+balance+")");
		}else{
			System.out.println("�ܾ��� �����Ͽ� ��ݾȵǿ�.");
		}
	}
}
public class Homework0421_2 {
	public static void main(String[] args) {
		Account a1 = new Account("11-101-111", "������");
		a1.deposit(700000000);
		a1.deposit(200000000);
		a1.withdraw(990000000);
		a1.deposit(99999999);
	}
}
