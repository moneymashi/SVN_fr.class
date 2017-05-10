package javaexp.a06_object;

class Entertainer{
	String name;
	String gender;
	String kind;
	Entertainer(String name, String gender, String kind){
		this.name=name;
		this.gender=gender;
		this.kind=kind;
	}
	Entertainer(String name, String gender){
		this(name,gender,"���׸�");
	}	
	Entertainer(String name){
		this(name,"����","����");
	}	
	Entertainer(){
		this("caren(cps)","����","����");
	}		
}

public class A07_ConstructorExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Entertainer en01 =new Entertainer();
		Entertainer en02 =new Entertainer("������(�ڿ츲)");	
		Entertainer en03 =new Entertainer("���缮","����");	
		Entertainer en04 =new Entertainer("�����","����","Ż��Ʈ");
		
		System.out.println("== ���� �����ϴ� ������ ==");
		int num=1;		
		System.out.println((num++)+". "+en01.name+"\t"+en01.gender+"\t"+en01.kind);
		System.out.println((num++)+". "+en02.name+"\t"+en02.gender+"\t"+en02.kind);
		System.out.println((num++)+". "+en03.name+"\t"+en03.gender+"\t"+en03.kind);
		System.out.println((num++)+". "+en04.name+"\t"+en04.gender+"\t"+en04.kind);		
	}

}
