package javaexp_00;

//import java.util.Scanner;
//import java.io.Console;
import java.io.IOException;

//@SuppressWarnings("unused") // java.util.Scanner;�� ����޴��� ����. �����Ұ� ���̼� �ϴ��� �н�.
public class HW_0412 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("1. ���ǹ��� �ݺ����� ������ ��ȣ �ӿ� �־����.");
		System.out.println("�� :���ǹ� (if) (switch)\n �ݺ��� (for) (while) (do while)");
		//	1.	 ���ǹ� (if) (switch)
		//		 �ݺ��� (for) (while) (do while)
		
		//	2.	10~ 150���� 5�� ��� ����!
		System.out.println("\n** ����Ű�� �Է��Ͻø� ���������� ��µ˴ϴ�.");
		System.in.read();
		System.in.read();
		System.out.println("\n2. for���� �̿��Ͽ� 10~150���� ���� �߿� 5�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.");
		int sumNum = 0;
		for(int idx=10;idx<=150;idx++){
			if(idx%5==0){
			sumNum += idx;
			}
		}
		System.out.println("�� : 10~150�� 5��� ����: "+sumNum);
		
		//	2.2��ȥ�� ����.
		int startNum = 10;
		int endNum = 150;
/* 1���ڸ� �޾����� �ٸ���� ���
		System.out.println("\n2.2 10~ 150 ��ſ� �Է�â���� �ްڽ��ϴ�.");
		System.out.println("ù��° ���ڸ� �Է��� �ּ���");
		startNum = (int)System.in.read();
		System.out.println("ù��° �Է��� ���ڴ� : "+startNum);
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
		endNum = (int)System.in.read();
		System.out.println("�ι�° �Է��� ���ڴ� : "+endNum);
 */
/*	scaner?�� �غ����� ���� �ذ��ϱ⿡ �ð��� �ʹ� �ɷ��� ������ �ذ��ϱ����.
		Console console = System.console();
		String s = console.readLine();
		int i = Integer.parseInt(console.readLine());

		
		System.out.println("ù��° ���ڸ� �Է��� �ּ���");
		startNum = (int)System.in.read();
		System.out.println("ù��° �Է��� ���ڴ� : "+startNum);
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
		endNum = (int)System.in.read();
		System.out.println("�ι�° �Է��� ���ڴ� : "+endNum);
*/
		sumNum = 0;
		for(int idx=startNum;idx<=endNum;idx++){
			if(idx%5==0){
			sumNum += idx;
			}
		}
		System.out.println("�� : 10~150�� 5��� ����: "+sumNum);
		
		System.out.println("\n** ����Ű�� �Է��Ͻø� ���������� ��µ˴ϴ�.");
		System.in.read();
		System.in.read();
		// 3. while������ �ֻ��� �ΰ����� 5�� ������ ������ ��� ������
		System.out.println("\n3. while������ �ֻ��� �ΰ����� 5�� ������ ������ ��� ������");
		System.out.println("  �� ���� ��ſ�, �ֻ��� �ΰ� ���� �������� ������(5,5)�� �ʹ� �ȳ��ͼ�...");
		System.out.println("��  [����Ű]: �ֻ��� ������ [0�Է�]: ���� ");
		String dice00 [] ={
				"�� ��  ��  ��  ��\n��                  ��\n��       ��        ��\n��                  ��\n�� ��  ��  ��  �� ",
				"�� ��  ��  ��  ��\n��  ��             ��\n��                  ��\n��             ��  ��\n�� ��  ��  ��  �� ",
				"�� ��  ��  ��  ��\n��  ��             ��\n��       ��        ��\n��             ��  ��\n�� ��  ��  ��  �� ",
				"�� ��  ��  ��  ��\n��  ��       ��  ��\n��                  ��\n��  ��       ��  ��\n�� ��  ��  ��  �� ",
				"�� ��  ��  ��  ��\n��  ��       ��  ��\n��       ��        ��\n��  ��       ��  ��\n�� ��  ��  ��  �� ",
				"�� ��  ��  ��  ��\n��  ��       ��  ��\n��  ��       ��  ��\n��  ��       ��  ��\n�� ��  ��  ��  �� "
		};
		int keyCode;
		while(true){
			keyCode=(int)System.in.read();
			System.in.read();
			if(keyCode==13){
/*				�ܼ�â������ �������� ��� ��������.;; 
 * 				int noR1 = (int)(Math.random()*6);
 *				int noR2 = (int)(Math.random()*6);
 *				System.out.println(dice00[noR1]);
 *				System.out.println(dice00[noR2]);
 */

				int no1 = (int)(Math.random()*6);
				int no2 = (int)(Math.random()*6);
				System.out.println(dice00[no1]); 
				System.out.println(dice00[no2]);
				if(no1 == no2){ // 5,5�� �ʹ� �ȳ��ͼ� ���� ����
					System.out.println("****** CONGRATULATIONS ******");
					System.out.println("���� ����["+(no1+1)+"]�� ���ͼ� ������ �����մϴ�.");
					System.out.println("****** CONGRATULATIONS ******");
					break;
				}else{
					System.out.println("�ֻ���1:["+(no1+1)+"], �ֻ���2:["+(no2+1)+"], ��:["+(no1+no2+2)+"]�Դϴ�");
				}
			}else if(keyCode==48){
				System.out.println("[0]�� �ԷµǾ� ������ �����մϴ�!");
				break;
			}
		}
		System.out.println("\n** ����Ű�� �Է��Ͻø� ���������� ��µ˴ϴ�.");
		System.in.read();
		System.in.read();


		System.out.println("\n4. ���� for������ ������ 4x+5y =60�� ����ظ� ���϶�.\nx,y�� 10���� ����.");
		int intX=0;
		int intY=0;
		/*		ȥ�� �����غ�
		intX=10;
		intY=15;
		for(int idx=0;idx<= (intX>=intY ? intX : intY);idx++){
			System.out.println(idx);
		}
		System.out.println("\n** ����Ű�� �Է��Ͻø� ���������� ��µ˴ϴ�.");
		System.in.read();
		System.in.read();
*/
		int cntFunction = 0;
		for(intX=0;intX<=10;intX++){
			for(intY=0;intY<=10;intY++){
				if((4*intX)+(5*intY)==60){
					cntFunction++;
					System.out.println("- "+cntFunction+"��° �� [ x:"+intX+", y:"+intY+" ]");
				}
			}
		}
		
		System.out.println("�� "+cntFunction+"���� �ذ� ���Խ��ϴ�.\n\n��� �ظ� ���Ͽ����Ƿ�, ���α׷��� �����մϴ�.");
		System.out.println("\n** ����Ű�� �Է��Ͻø� ���������� ��µ˴ϴ�.");
		System.in.read();
		System.in.read();
		
		System.out.println("\n** ��� ������ �������ϴ�. �����մϴ�. **");
// 
		/* ��ĳ�ʸ� ���ų�, �޾Ƶ��� �� Ű�ڵ� ���� �ٽ� ���̽����� ���� ��������ߵ�.
		 	���� �ȵ��� ������ �غ�����.
		 */
/*		int cnslInput = 0;
		// �Լ� ��ȯ�� �ȵǼ� �ϴ� �����.
		void ChangeVal(){
			for (int idx=0;idx<=9;idx++){
				cnslInput = x;
			}
		}
		System.out.println("**** ������� �ٽ� ���� ���� ****");
		System.out.println("4.2 Ax^2+Bx+C=y �� Ax=Cy�� �ظ� ���϶�. A,B,C�� 0~9�� ���ڷ� �Է¹޴´�.");
		int A = 0;
		int B = 0;
		int C = 0;
		cntFunction=0;
*/
		
	}

}
