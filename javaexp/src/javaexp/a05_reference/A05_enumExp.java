package javaexp.a05_reference;

import java.util.Calendar;

public class A05_enumExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���� ���� ���� enum ����..*/
		Week today=null; // ���� ���� ���� Week enum
		// ���� ��¥�� ���� ���� index�� ��������..
		// Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		// Calendar.DAY_OF_WEEK:���� ���Ͽ� ���õ� ���� (1~7-�Ͽ�ȭ...)
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("��ü ���� ����:"+Calendar.DAY_OF_WEEK);
		System.out.println("���� ���� index��:"+week);		
		switch(week){
			case 1: today= Week.SUNDAY; break;
			case 2: today= Week.MONDAY; break;
			case 3: today= Week.TUESDAY; break;
			case 4: today= Week.WEDNESDAY; break;
			case 5: today= Week.THURSDAY; break;
			case 6: today= Week.FRIDAY; break;
			case 7: today= Week.SATURDAY; break;
		}
		System.out.println("������ ������?"+today);
		if(today==Week.SUNDAY){
			System.out.println("����̳� ��� ��Ȱ�� �Ѵ�!!");
		}else{
			System.out.println("������ �����Ѵ�!!");
		}
		
		
	}

}
