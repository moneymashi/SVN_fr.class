package javaexp.a10_api;

class Counter{
	private int cnt;
	public Counter(int cnt) {
		this.cnt = cnt;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(cnt+"�� ��ü�� �Ҹ��� finalized()�� ȣ���!");
	}
	
}
public class A04_finalized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter count=null;
		for(int cnt=1;cnt<=100;cnt++){
			// ����
			count = new Counter(cnt);
			// ������� ����
			count = null;
			// ������ �����⸦ ���� ��û..
			// ��ü�� finalize()�� ȣ���..
			System.gc();
		}
	}

}
