package javaexp.a03_operator;

public class A03_restore_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ���� ������ : �����͸� 1�� ���� �Ǵ� ���ҽ�Ű�� �����ڸ� ���Ѵ�.
 *    ����++, ����--, ++����, --����
 *    �ַ�, �ݺ������� ������ ������ �ʿ��� ��, ���� Ȱ��ȴ�.
 * */
		int no=1;
		System.out.println("��ȣ(����)!!!"+(no++));
		System.out.println("��ȣ(����)!!!"+(no++));
		System.out.println("��ȣ(����)!!!"+(no++));
		System.out.println("��ȣ(����)!!!"+(--no));
		System.out.println("��ȣ(����)!!!"+(--no));
		System.out.println("��ȣ(����)!!!"+(--no));
/* ���Կ����� : ������ ���ο� ���� �����ϴ� ��쿡 ���Ǵ� ������!*/
		int initSaveMoney= 1000;
//		 ����� ���Կ��� : �ش� ������ ���ٿ� �����͸� �Ҵ��ϴ� ���� ���Ѵ�.
//		���� +=���ٿ��Ҵ��� ������, ����-=������..
		System.out.println(" ����!!!! (�ſ� 10����)");
		int monthCnt=1; // �ʱ� ���Կ��� ó��..
		System.out.println( (monthCnt++)+"��° ��!!�� ����ݾ�:"+
				(initSaveMoney+=100000)+"��");
		System.out.println( (monthCnt++)+"��° ��!!�� ����ݾ�:"+
				(initSaveMoney+=100000)+"��");
		System.out.println( (monthCnt++)+"��° ��!!�� ����ݾ�:"+
				(initSaveMoney+=100000)+"��");
/* 3�� ������ : �ַ� 3���� �����ڸ� ���ؼ� ����� �ٷ� �� ��, Ȱ��ȴ�..
 *   ���ǽ� ? trueó����:false ó����
 * */		
		int age=62;
		System.out.println("��ο�� ���� :"+( (age>=65) ? "��ο��":"�Ϲ�") );
		
		
		
		
	}

}
