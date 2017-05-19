package javaexp.a10_api;

import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class A07_String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greet="himan! good day1!";
		System.out.println("charAt(index):"+greet.charAt(3));
		// greet.getBytes(): ���ڿ��� ���� byte[]�� ��ȯ
		for(byte bt:greet.getBytes()){
			System.out.println(bt+":"+(char)bt);
		}
		try {
			for(byte bt:greet.getBytes("MS949")){
				// �ѱ��� 2byte�̻�..����..
				System.out.println(bt+":"+(char)bt);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		// .indexOf("ã�� ���ڿ�")
		System.out.println("indexOf(��ſ�):"+greet.indexOf("��ſ�"));
		// .length() :���ڿ��� ����
		System.out.println("length():"+greet.length());
		// .replace : json ==> �����, \,  +, ' '
		System.out.println("replace():"+greet.replace("��ſ�", "�ູ��"));
		// .substring() ==> Ư�����ڿ� ����..
		System.out.println("substring():"+greet.substring(3, 5));

		// split("������") ���ڿ��� �ش籸���ڷ� �����ؼ� �迭�� list ��Ÿ����..
		String data="ȫ�浿&��浿&�ű浿&���浿";
		String names[]=data.split("&");
		for(String name:names){
			System.out.println(name);
		}
		// StringTokenizer(���ڿ�,������)
		StringTokenizer st = new StringTokenizer("���/�ٳ���/����","/");
		// countTokens() :�����ڸ� ���ؼ� ��Ÿ�� ������ �Ǽ�
		int totCnt =st.countTokens(); 
			// nextToken()�� ���� countTokens()����
		// nextToken() : �����ڸ� ���� ��Ÿ�� �� ������
		String data01="";
		for(int cnt=1;cnt<=totCnt;cnt++){
			data01=st.nextToken();
			System.out.println(cnt+". "+data01);
		}
//		StringBuffer, StringBuilder Ŭ����
	//		�ڹٿ��� �����ϴ� String�� ���������� ���ڿ��� ������ ����.
	//		String data="���";
	//		data+=",�ٳ���";  �޸� ���ο� ��ü ����.....
	//		String���ڿ��� loop�ƴ�, +�� ���� �޸𸮿� ������ �߻�..
	//		ȿ�������� ���� ���ڿ��� ó���� Ȱ��ȴ�.
//		�����忡 ����ȭ ���� ���ο� ���� StringBufferȰ��
//		StringBuilder ���� ������ ȯ�濡�� ���ǵ��� ����
//		append("�߰����ڿ�");
//		toString() : ���� �߰��� ���ڿ��� ó��..
		StringBuffer sbf = new StringBuffer();
		for(int cnt=0;cnt<10;cnt++){
			sbf.append("��������~~");
		}
		System.out.println("���� ���ڿ�:"+sbf.toString());
		
		
		
		
	}

}
