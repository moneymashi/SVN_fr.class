package javaexp.a10_api;

public class A06_timecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println("���� �ð�:"+start);
		for(int cnt=1;cnt<100000;cnt++){
			System.out.println("ī��Ʈ:"+cnt);
		}
		long end = System.currentTimeMillis();
		System.out.println("���� �ð�:"+end);
		System.out.println("�ð���:"+(end-start));
			
	}

}
