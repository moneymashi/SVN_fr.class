package javaexp.a05_reference0417;

public class Homework0417_2 {
	public static void main(String[] args) {
		String[] orginArray = {"���","�ٳ���","����"};
		String[] targetArray = new String[5];
		System.arraycopy(orginArray, 1, targetArray, 3, 2);
		for(int idx=0 ; idx<targetArray.length ; idx++)
			if(targetArray[idx]!=null)
				System.out.println(idx+"��° ������ : "+targetArray[idx]);
			else
				System.out.println(idx+"��° ������ : NULL");
	}
}
