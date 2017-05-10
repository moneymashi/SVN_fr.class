package javahomework.a11_baeksangwoo;

import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * ����
 * ���࿡ ����
 * Account(���°���)
 * field : ������, �Աݾ�, ��ݾ�, ���ܾ�
 * ������1 : ������ �Է�
 * ������2 : ������, �ʱ� �Աݾ�
 * save(�Աݾ�, ��¥) 
 * 	- ���ó��
 * 	- return �Աݵ� �ݾ�
 * withdraw(��ݾ�, ����, ��¥)
 * print()
 * ��¥ �뵷 	[@@@][@@@@][@@@@]
 */
class Account{
	String account_name;
	int deposit;
	int withdrawn;
	int total;
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	Account(String account_name){
		this.account_name=account_name;
	}
	Account(String account_name, int deposit ){
		this.account_name=account_name;
		this.deposit=deposit;
		total+=deposit;
	}
	 int save(int deposit){
		total=+deposit;
		return deposit;
	}
	 void withdraw(int withdrawn){
		 String msg="";
		 if(total<withdrawn) {
			msg="�ݾ׺���";
		 }
		 else {
			 total-=withdrawn;
			 msg="��ݵ�";
		 }
		 System.out.println(msg);
	 }
	 void print(){
		 System.out.println("��¥:"+sdf.format(d)+", ���¹�ȣ:"+account_name+", �Աݾ�:"+deposit+", ��ݾ�: "+withdrawn+", �Ѿ�: "+total);
	 }
}
/*
 * ����(1�ܰ�)
 * -����
 * 	field : ���¸�, (�Ѿ�)
 * ������(���¸� �Է�)
 * input(�Աݾ�)
 * 		@@�� @@@ �Ա��߽��ϴ�.(���ܾ�@@)
 * outpunt(��ݾ�)
 * 		@@�� @@@ ����߽��ϴ�.(���ܾ�@@)
 */
/*
 * �ڱ�Ұ�(1�ܰ�)
 * field : �̸�, ��°�, ����
 * 	������(�̸��Է�)
 * 	inputData(��°�, ����)
 * 	introMyself(): ��� ó��
 * 		�� �̸��� ~~�̰�, ���̴� ~~, ��� ���� ~~
 */
public class Homework_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a01=new Account("00-000-0000");
		Account a02=new Account("12-1212-1212", 50000);
		a01.withdraw(10000);
		System.out.println(a01.save(50000));
		a01.print();
		a02.withdraw(5000);
		System.out.println(a02.save(1000));
		a02.print();
	}
}