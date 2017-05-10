package javaexp.a06_object;

import java.util.Date;

/*  ���࿡ ���� 1�ܰ�
 *  Account1 : ������, ���ܾ�
 *  ������- ���������� ����
 *  input(�Աݾ�){
 *  	@@�� @@�� �Ա��߽��ϴ�(���ܾ�:@@@)
 *  }
 *  output(��ݾ�)
 *  	@@�� @@�� ����߽��ϴ�(���ܾ�:@@@)
 * */
class Account1{
	private String accountName; //������
	private int balance; //�ܾ�
	public Account1(String accountName){
		this.accountName = accountName;
		System.out.println("�� �� �� "+ accountName+"������ ���� �ּż� �����մϴ� �� �� ��");
	}
	public void input(int inMoney){
		balance+=inMoney;
		System.out.println(accountName+"��\t"+inMoney+"�� �Ա��ϼ̽��ϴ�(���ܾ�:"+balance+"��)");
	}
	public void output(int outMoney){
		if(balance>=outMoney){
			balance -= outMoney;
			System.out.println(accountName+"��\t"+outMoney+"�� �Ա��ϼ̽��ϴ�(���ܾ�:"+balance+"��)");
		}else{
			System.out.println("@ @ �ܾ��� �����Ͽ� "+outMoney+"�� ����� �Ұ����մϴ�(���ܾ�:"+balance+"��) @ @");
		}
	}
}
public class Homework0419_Account_1step {
	public static void main(String[] args) {
		Account1 acc_hong = new Account1("ȫ�浿_����_110-12-123");
		acc_hong.input(3000);
		acc_hong.output(5000);
		acc_hong.input(6000);
		acc_hong.output(5000);
	}
}
