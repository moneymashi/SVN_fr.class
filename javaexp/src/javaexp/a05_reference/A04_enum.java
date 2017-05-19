package javaexp.a05_reference;

public class A04_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week week01 = Week.MONDAY;
		Week today = Week.MONDAY;
		System.out.println("enum������ ���Ͻ�:"+(week01==today));
		System.out.println(week01.valueOf("MONDAY"));
		System.out.println(Week.MONDAY);
		for(Week w:week01.values()){
			System.out.println(w);
		}
/*   ������ ��ü�� �޼ҵ��..
 * 	  name(): �ش� ���ڿ� �����´�.
 * */		
		String name=today.name();
		System.out.println("name() ȣ��:"+name);
//		ordinal() : index�� �����´�.
		today=Week.SUNDAY;
		int ordinalIdx = today.ordinal();
/* public enum Week�� ���� �������(0~6)
 * */		
		System.out.println("ordinal() ȣ��:"+ordinalIdx);
//		valueOf("���ڿ��� ������ ��")
		Week weekDay=Week.valueOf("SATURDAY");
		System.out.println("valueOf:"+weekDay.name());
//		values() : ���� Ÿ���� ��� �����͸�  �迭��ü�� ������
		Week[] days = Week.values();
		System.out.println("��ü week list ������");
		for(Week day:days){
			System.out.println(day);
		}

		
	}

}
