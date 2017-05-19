package javaexp.a09_exception;


public class A04_multiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayIndexOutOfBoundsException
		// NumberFormatException �ΰ��� ���ܰ�
		// �Բ� �߻��� ���� ó��..
/*
 try{
 }catch(������ ����Ŭ����){
 }catch(���� �����̸� ����Ŭ���� ){
 }catch(���������� ����Ŭ����){
 }catch(�ֻ��� ���� ���� Ŭ����){}
 * */		
		
		try{
			String data01= args[0];
			System.out.println(data01.toString());
			int num01 = Integer.parseInt(data01);
		}catch(ArrayIndexOutOfBoundsException aie){
			// .getMessage() : ���� ���� �޽���..
			System.out.println("�޽���:"+aie.getMessage());
			// .printStackTrace() : ���� ��� ����
			System.out.println("++++++++++++");		
			aie.printStackTrace();
			System.out.println("++++++++++++");
			
			System.out.println("args�� �ش� index�� ���� �Էµ��� �ʾҽ��ϴ�!!");
		}catch(NumberFormatException nfe){
			System.out.println("���������ڿ��� �Է��Ͽ��� �մϴ�!!");
		// XXXXException�� ���� Exception Ŭ����
		}catch(Exception e){
			System.out.println("��Ÿ ���� �߻�!!");
		}finally{
			System.out.println("���� �ֵ�, �������� ���μ��� ���� �ߵ�");
			System.out.println("ó���� ���μ����� �� finally�� ����!!");
		}
		
	}

}
