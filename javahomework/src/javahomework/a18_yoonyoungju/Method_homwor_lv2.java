package javahomework.a18_yoonyoungju;
/*
���࿡ ���� ( 2�ܰ�)
- Account(���°���)
	field�� : ������, (�Աݾ�,��ݾ�),���ܾ�,(��¥),(����)

������ : ������ �Է�
������ 2: ������ , �ʱ� �Աݾ�
save(�Աݾ�, ���� , ��¥ )
	-���ó�� 
	-return�Աݵ� �ݾ�
withdraw( ��ݾ�, ���� , ��¥)
-���ó��
- return ��ݾ� �ݾ�

withdraw(��ݾ�, ����, ��¥)
print()
��¥ �뵷 [@@@] [@@@@] [@@@@@]
*/
class Account{
	String accountname;
	int inprice;
	int firstinprice;
	int outprice;
	int total;
	String date;
	String remark;

	
	Account(String accountname){
		this.accountname=accountname;
	}
	Account(String accountname, int firstinprice){
		this.accountname=accountname;
		this.firstinprice=firstinprice;
		this.total =firstinprice ;
	}
	int save(int inprice,String remark,String date){
		this.inprice=inprice;
		this.remark = remark;
		this.date = date;
		return this.inprice=inprice;
	}
	int withdraw(int outprice,String remark,String date){
		this.outprice=(-outprice);
		this.remark = remark;
		this.date = date;
		return this.outprice=(-outprice);
	}
	void print(){
		System.out.println(date+ remark+"["+outprice+"] ["+inprice+"] ["+total+"]");
	}
}
public class Method_homwor_lv2{
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Account a = new Account("������");
			a.total=a.save(12000,"�˹ٺ�","2017.04.01");
			a.print();
			a.total += a.withdraw(5000,"������","2017.04.11");
			a.print();
			a.total += a.save(30000,"�뵷","2017.04.20");
			a.print();
	}
}





