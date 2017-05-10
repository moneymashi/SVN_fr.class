package javaexp.a06_object;
/* Ȯ�ο���
 * Class�� �����ϴ� ������
 * 	�̸�, ����, �о�, �����ڵ�
 * */
class Entertainer{
	private static int cnt=0;
	private int no;
	private String name;
	private char gender;
	private String kind;
	public Entertainer(){
		this("�ڹ̰�", 'f',"����");
	}
	public Entertainer(String name){
		this(name, 'f',"����");
	}
	public Entertainer(String name, char gender){
		this(name, gender, "����");
	}
	public Entertainer(String name, char gender, String kind){
		no = ++cnt;
		this.name = name;
		this.gender = gender;
		this.kind = kind;
	}
	@Override
	public String toString() {
		String temp;
		temp = no+". "+name+"\t\t"+gender+"\t"+kind;
		return temp;
	}
}
public class Homework0419_1 {
	public static void main(String[] args) {
		Entertainer[] entertainers = new Entertainer[4];
		entertainers[0] = new Entertainer();
		entertainers[1] = new Entertainer("�ϴ�");
		entertainers[2] = new Entertainer("��Ǹ�");
		entertainers[3] = new Entertainer("���ؿ�",'m',"���");
		for(Entertainer entertainer: entertainers)
			System.out.println(entertainer);
	}
}
