package javahomework.a12_JaehyunBay;
/*
���� - 1�ܰ�
����
	field: ���¸�, (�Ѿ�)
	������(���¸� �Է�)
	input(�Աݾ�)
		@@@�� @@@�� �Ա��ϼ˽��ϴ�.(���ܾ�@@@)
	output(��ݾ�)
		@@@�� @@@�� ����ϼ˽��ϴ�.(���ܾ�@@@)
*/
class Bank{
	String owner;
	String category;
	int input;
	int currValue;
	Bank(String owner){
		this.owner = owner;
	}
	int calc(String category, int input){
		this.category = category;
		this.input = input;
		if(category.equals("withdraw")){
			currValue -= input;
		}
		else if(category.equals("deposit"))
			currValue += input;
		return currValue;
	}
	void printOut(){
		System.out.println(owner+"��\t" + category+" "+input+"��\t �����ܾ�: " + currValue+ "��");
	}
	
}

/*
 �ڱ�Ұ� - 1�ܰ�
	field: �̸�, ��°�, ����
	������(�̸��Է�)
	inputData(��°�, ����)
	introMyself(): ���ó��.
	���̸��� @@�̰�, ���̴� @@�̸�, ��°��� @@@�Դϴ�.

*/

class Introduction{
	String myName;
	String myLoc;
	int age;
	Introduction(String myName){
		this.myName = myName;
	}
	
	String inputData(String myLoc, int age){
		this.myLoc = myLoc;
		this.age = age;
		return myLoc+ age;
	}
	
	void introMyself(){
		System.out.println(myName + "�Դϴ�. "+ myLoc +"�������� ��� " + age + "�� �Դϴ�.");
	}
}




public class HW_Apr19_Bank_Introduction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Bank b1 = new Bank("jb");  //String owner
		b1.calc("deposit",5000);  //String category,int input
		b1.printOut();
		b1.calc("withdraw",2000);  
		b1.printOut();
		b1.calc("deposit",4000);  
		b1.printOut();
		b1.calc("deposit",5000);  
		b1.printOut();
		Bank b2 = new Bank("jj");  //String owner
		b2.calc("withdraw",5000);  //String category,int input
		b2.printOut();
		b2.calc("withdraw",2000);  
		b2.printOut();
		b2.calc("deposit",4000);  
		b2.printOut();
		b2.calc("deposit",5000);  
		b2.printOut();
		
		
		Introduction i01 = new Introduction("ȫ�浿");
		i01.inputData("������", 28);
		i01.introMyself();
		Introduction i02 = new Introduction("�ݱ浿");
		i02.inputData("����", 27);
		i02.introMyself();
		Introduction i03 = new Introduction("��浿");
		i03.inputData("ȭ��", 22);
		i03.introMyself();
	}

}
