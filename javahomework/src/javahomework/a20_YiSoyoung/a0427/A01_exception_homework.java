package javahomework.a20_YiSoyoung.a0427;

import java.util.Scanner;

/* Ȯ�ο���
 * 1�ܰ�) id�� �Է��ϼ���
		id=null; �Է��� �� �� ���, id="himan";
	- catch���� id���� �Էµ��� �ʾҽ��ϴ�.
 * 2�ܰ�) id�� pw �� ó��
 * */
public class A01_exception_homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pw;
		System.out.print(" id �� ");
		id = sc.nextLine();
		System.out.print(" password �� ");
		pw = sc.nextLine();
		if(id.equals("")||pw.equals("")){
			// id�� pw�� �Է����� ������ ������ ���� �߻�.
			try {
				throw new Exception("id �Ǵ� password�� �Է����� �ʾҽ��ϴ�");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				id = "himan";
			}
		}
		System.out.println("id : "+id+"\t pw : "+pw);
		sc.close();
	}
}
