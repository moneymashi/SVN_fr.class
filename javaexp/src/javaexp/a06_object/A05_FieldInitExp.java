package javaexp.a06_object;


class BaseBallTeam{
	String teamName="���̸� ����";
	int vic;
	int eq;
	int def;
	double vicRatio;
	BaseBallTeam(){
		System.out.println(teamName+" ��,  "+vic+"��, "+eq+
				"��, "+def+"��, �·� "+vicRatio);
	}
	BaseBallTeam(String n){}
	BaseBallTeam(String teamName, int vic, int eq, int def){
		this.teamName=teamName;
		this.vic = vic;
		this.eq=eq;
		this.def = def;
		double tot=vic+eq+def;
		this.vicRatio=vic/tot;
	}
}
class Person{
	Person(){}
	Person(int age){}  // �Է°��� ������ �ٸ��� ������ �����ϴ�.
	Person(int height, int age){}
	Person(String name){} // �Է°��� ������ ������ type�� �ٸ��� ������ ����
//	Person(int age, int height){} type�� ���� ������.
	Person(String name, int age){}
	Person( int age, String name){} // �Է°��� type�� ������ �ٸ��� ���𰡴�
	
}
public class A05_FieldInitExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseBallTeam t1 = new BaseBallTeam();
		BaseBallTeam t2 = new BaseBallTeam("KIA",11,0,3);
		System.out.println(t2.teamName+" ��,  "+t2.vic+"��, "+t2.eq+
				"��, "+t2.def+"��, �·� "+t2.vicRatio);
	}

}
