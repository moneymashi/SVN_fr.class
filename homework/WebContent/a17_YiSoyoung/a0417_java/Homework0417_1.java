package javaexp.a05_reference;
/* Ȯ�ο���
 *  args������ id�� password�� �޾�
 *  id�� himan, password�� 7777�� �Է¹����� ���� ����, �ƴϸ� ��������
 * */
public class Homework0417_1 {
	public static void main(String[] args) {
		if(args.length ==2){
			String id = new String(args[0]);
			String pw = new String(args[1]);
			if(id.equals("himan")&&pw.equals("7777")){
				System.out.println("�� �� �� �� �� �������� �� �� �� �� ��");
			}else{
				System.out.println("�� �� �� �� �� �������� �� �� �� �� ��");
			}
		}else{
			System.out.println("id�� password�� ����� �Է����� �ʾҳ׿�");
		}
	}
}
