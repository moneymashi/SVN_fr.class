package javaexp.a04_statement;

public class A02_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch( ���� ) : ����, char, ���ڿ�
		int score = (int)(Math.random()*101);// 0~100 ������ �߻�..
		char ptGrade; // ���..
		switch( score/10){ // ����/���� ==> ����, ����/�Ǽ� ==> �Ǽ�, 
							//  �Ǽ�/���� ==> �Ǽ�
			case 10:  // break�� ������ ���� flow�� �귯����.
				      //  ptGrade = 'A'�� ó�� ��.
			case 9: ptGrade = 'A'; break;
			case 8: ptGrade = 'B'; break;
			case 7: ptGrade = 'C'; break;
			case 6: ptGrade = 'D'; break;
			default : ptGrade = 'F';
		}
		System.out.println("������ "+ score+", ��������� "+ptGrade);
		/* ���ڿ� ó�� switch*/
//		String [] compos=new String[]{"","",""}; 
		String [] compos = {"���","�븮","����","����","����"};
		// �迭�� ��츸 ó�� �ǰ�..
		int ranPosIdx = (int)(Math.random()*compos.length);
		String chPos = compos[ ranPosIdx ];
		System.out.println("���õ� ����:"+chPos);
		switch(chPos){
			case "���": System.out.println("200~300"); break;
			case "�븮": System.out.println("240~350"); break;
			case "����": System.out.println("300~650"); break;
			case "����": System.out.println("400~700"); break;
			case "����": System.out.println("450~"); break;
		}
		
		
	}

}
