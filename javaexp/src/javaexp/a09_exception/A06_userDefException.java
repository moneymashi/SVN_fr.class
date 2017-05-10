package javaexp.a09_exception;

// ����� ���� ���� Ŭ���� �����
// class Ŭ������Exception extends Exception
class UserDefException01 extends Exception{

	public UserDefException01() {
		super("�⺻ ���� �޽���");
	}
	public UserDefException01(String message) {
		super(message);
	}
	@Override
	public String getMessage() {
		return "������� ���ܸ޽���:"+super.getMessage();
	}
	@Override
	public String toString() {
		return "������� Ŭ��������^^:"+super.toString();
	}
	
}
class Account{
	// ���ܾ�
	private long balance;
	public Account() {
	}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money){ // �Ա�
		balance += money;
	}
	// ����
	public void withdraw(int money) throws UserDefException01{
		// ����ݾ��� ���� �ܰ� ���� ���ٸ� ����� ���� ���� �߻�
		if(balance < money){
			// ����� ���� ���� ��ü ������ ����������
			// throw (���ǰ�ü) ó���� �Ͽ��� �Ѵ�.
			throw new UserDefException01("�ܰ����:"+(money-balance)
						+" ���ڶ�");
		}
		balance -= money;
	}
	
}
public class A06_userDefException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc01 = new Account();

		try {
			acc01.deposit(100000);
			acc01.deposit(100000);
			// ���� ó��.
			acc01.withdraw(50000);
			acc01.withdraw(200000); // ���ܰ� ������
			
			
		} catch (UserDefException01 e) {
			// ���ǵ� ����� ���� �޼��� ���.
			// getMessage()���� ���ǵ� �޽����� ȣ���ϴµ�,
			// �������� ���ؼ� �Ѱ��� ���ڿ��� �����´�.
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

}
