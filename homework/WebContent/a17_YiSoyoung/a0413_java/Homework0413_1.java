package a00_basic0413;
/* Ȯ�ο���..
 * Workman �Ӽ��� kind(������ ����)
 *         �޼��� work() @@�� ���� �ϴ�
 * FireMan �Ӽ��� wkLoc(���� �ϴ� ���)
 *         �޼��� turnoff() @@�� @@���� ���� ����
 * */
class Workman {
	private String kind;
	public Workman(){}
	public Workman(String kind){
		this.kind = kind;
	}
	public void work(){
		System.out.println(kind+"�� ���� �ϴ�");
	}
	public String getKind() {return kind;}
	public void setKind(String kind) {this.kind = kind;}
}
class FireMan extends Workman{
	private String wkLoc;
	public FireMan(){}
	public FireMan(String kind, String wkLoc){
		super(kind);
		this.wkLoc = wkLoc;
	}
	public void turnoff(){
		System.out.println(getKind()+"��(��) "+wkLoc+"���� ���� ����");
	}
}
public class Homework0413_1 {
	public static void main(String[] args) {
		FireMan fireMan = new FireMan("�ҹ��","�������94��");
		fireMan.turnoff();
	}
}
