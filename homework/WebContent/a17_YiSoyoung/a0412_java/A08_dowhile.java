package javaexp.a04_statement;

import java.io.IOException;
public class A08_dowhile {
	public static void main(String[] args) throws IOException {
		char choieMenu = 'Q';
		System.out.print("�޴� ��ȣ�� �����ϼ���(1:¥���, 2:«��,3:������,Q:����) ��");
		do{
			choieMenu = (char)System.in.read();
			if((int)choieMenu==13||(int)choieMenu==10){
				continue;
			}else if(choieMenu=='1') System.out.println("¥��� ����");
			else if(choieMenu=='2') System.out.println("«�� ����");
			else if(choieMenu=='3') System.out.println("������ ����");
			else System.out.println("1,2,3,Q �߿� �ϳ��� �Է°����ؿ�");
			System.out.print("�޴� ��ȣ�� �����ϼ���(1:¥���, 2:«��,3:������,Q:����) ��");
		}while(choieMenu!='Q');
		System.out.println("�� �� �� �� �� �� �� �� �� �� �� �� �� �� ��");
		System.out.println("  �ߴ��մϴ�. �ȳ��� ������");
		System.out.println("�� �� �� �� �� �� �� �� �� �� �� �� �� �� ��");
	}
}
