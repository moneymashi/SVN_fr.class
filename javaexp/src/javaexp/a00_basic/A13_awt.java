package javaexp.a00_basic;

import java.awt.*;

class ShowJava{
	// �ڹٿ��� ȭ��ó��..
	Frame frame;
	Button btnWest;
	Button btnEast;
	Button btnNorth;
	Button btnSouth;
	Button btnCenter;
	
	ShowJava(){
		frame = new Frame("�ڹٵ� ȭ����!!");
		btnWest = new Button("���ʹ�ư");
		btnEast = new Button("���ʹ�ư");
		btnNorth = new Button("���ʹ�ư");
		btnSouth = new Button("���ʹ�ư");
		btnCenter = new Button("�߾ӹ�ư");
	}
	void launchFrame(){
		// frame�� ���ʿ�..
		frame.add(btnWest,"West");
		frame.add(btnEast,"East");
		frame.add(btnNorth,"North");
		frame.add(btnSouth,"South");
		frame.add(btnCenter,"Center");
		frame.setSize(300, 300);
		frame.setVisible(true);
	}	
}
public class A13_awt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowJava sj = new ShowJava();
		sj.launchFrame();
	}

}
