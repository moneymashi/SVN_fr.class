package javaexp.a00_basic;

public class A08_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 �ڹٿ����� ���α׷��ֻ� ��/�ܺ��� ������ ���� ó���� �ϰ� �ִ�.
 �Ϲ������� �����Ͱ� input, output�� �Ͼ�� ������ �ݵ��
 ���� ó���ؾ� �Ѵ�.
 ���� ���� �������� �ִ� code
 try{
 	//���� ���� �������� �ִ� code
 }catch(Exception e){
 	// ���� �߻���, ó���� ����..
 }finally{
 	// ���� �߻� ��� ����  ó���� ���μ���
 }
 * */
		try{
			System.out.println("���α׷�!!! start!!");
			int num = 3/0; // ���ܰ� �߻��ϸ� �ϴ��� ������ �������� �ʰ�..
			System.out.println("���α׷� end!!");
		}catch(Exception e){  // Jump Expception���� ó���� ��..
			System.out.println("���ܰ� �߻��߽��ϴ�.!!!");
			System.out.println("���ܳ���:"+e.getMessage());
		}finally{
			System.out.println("���� ��� ���� ó���� ����!!");
		}
		
		
	}

}
