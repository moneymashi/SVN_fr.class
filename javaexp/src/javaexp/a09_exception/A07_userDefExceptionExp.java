package javaexp.a09_exception;
class ShoppingException extends Exception{

	public ShoppingException() {
	    super("�⺻ ���ο��� ��ü ȣ��");
	}

	public ShoppingException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		// �޼��� + �����ڸ� ���ؼ� �޾Ҵ� ���� 
		return "����, ��Ÿ��� �����̱���!! "+super.getMessage();
	}	
}
class Market{
	private String martName;
	private int curMoney;
	public Market(String ... names ){
		martName=names.length==0?"�ູ��Ʈ":names[0];
	}
	public void goShopping(int money){
		curMoney=money;
		System.out.println(martName+"���� ��ſ� ������ ���� "
				+curMoney+"���� ������~~");
	}
	public void buyProduct(int spmoney) throws ShoppingException{
		if(curMoney<spmoney){
			throw new ShoppingException("���� ���� ����:"
					+(spmoney-curMoney)+"�� �ʿ�" );
		}
		curMoney-=spmoney;
		System.out.println(spmoney+"�� ����, ���ܾ�"+curMoney);
	}
	
}
public class A07_userDefExceptionExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Market m1 = new Market();
			m1.goShopping(100000);			
			m1.buyProduct(30000);
			m1.buyProduct(20000);
			m1.buyProduct(50000);
			Market m2 = new Market("��ġ��Ʈ");
			m2.goShopping(1000000);			
			m2.buyProduct(300000);
			m2.buyProduct(200000);
			m2.buyProduct(500000);
			m2.buyProduct(600000);				
		} catch (ShoppingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
		
	}

}
