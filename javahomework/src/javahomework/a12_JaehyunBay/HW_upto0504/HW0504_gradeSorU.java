package javaexp.a09_exception;
/*
 * a09/a06 ����;
 * PointException: ������ Ư�� �������Ϸ� �Ǿ�����, ����ó����
 * "���հ��Դϴ�. ������� ��Ź�帳�ϴ�."
 * 
 * exam:
 * 	getPoint(������ ����): ����ó�� �޼���
 * 	-�Է¹��� ������ 60�� �����ϋ�, ���ܰ�üȣ��
 * 	-Main()
 * 
 * 2�ܰ� -
 * PointException
 * �߰� �޼���: showResult()
 *  @@����, @@�� ȹ��-- ����� @@@(�հ�/���հ�) �Դϴ�.
 * Exam
 * 	�����, ��������
 * 	getPoint(): ����� Random next()Ȱ��.
 */

class Check{
	int grade;
	String subject;
	public void getPoint(int grade) throws PointException{
		this.grade = grade;
		if(this.grade <= 60){
			throw new PointException("���հ��Դϴ�. ������� ��Ź�帳�ϴ�.");
		}
		else{
			System.out.println("�հ��ϼ̽��ϴ�. ���ϵ帳�ϴ�!");
		}
	}
	public void showResult(String subject, int grade) throws PointException{
		this.subject = subject;
		this.grade = grade;
		System.out.print("����: "+ this.subject + " \t����: "+ this.grade + "   \t�����...");
		getPoint(this.grade);
	}
}

class PointException extends Exception{
	public PointException(){
		System.out.println("Point Exception");
		}
	public PointException(String msg){
		super(msg);
		System.out.println(msg);
	}
}

public class HW0504_gradeSorU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Check chk01 = new Check();
			int[][] gradeList = new int[10][2];
			String[] subject = {"Kor","Eng","Math","Sci"};
			for(int idx = 0; idx<gradeList.length; idx++){
				gradeList[idx][0] = (int)(Math.random()*4);
				gradeList[idx][1] = (int)(Math.random()*101);
				//System.out.println( "�л���ȣ "+idx+"\tSub: "+ subject[gradeList[idx][0]] + "\tgrade: "+ gradeList[idx][1]);
				//chk01.getPoint(gradeList[idx][1]);
				chk01.showResult(subject[gradeList[idx][0]], gradeList[idx][1]);
			}
		} catch (PointException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
