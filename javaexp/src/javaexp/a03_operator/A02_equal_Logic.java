package javaexp.a03_operator;

public class A02_equal_Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* �� ������*/
		int point = 75;
		int passTarget = 60;
		System.out.println(point + "=="+passTarget+"?"+(point==passTarget));
		System.out.println(point + ">"+passTarget+"?"+(point>passTarget));
		System.out.println(point + "<"+passTarget+"?"+(point<passTarget));
		System.out.println(point + ">="+passTarget+"?"+(point>=passTarget));
		System.out.println(point + "<="+passTarget+"?"+(point<=passTarget));
		// != ���� ���� ��..
		System.out.println(point + "!="+passTarget+"?"+(point!=passTarget));
/* �� ������*/
//		&&(and) : �ΰ��� �����ǿ� �� ��ġ�� ��, true
//		||(or)  : �ΰ��� ������ �� �ϳ����̶� ��ġ�� ��, true
		int getPoint= 85;
		System.out.println("ȹ���� ������ 80�̻� 90�̸�?"+
				( (getPoint>=80)  &&   (getPoint<90)   )  );
		System.out.println("������ ��ȿ���� ���� ����(0�̸�,100�ʰ�)?" +
				 ( (getPoint<0) || (getPoint>100) )      );
	}

}
