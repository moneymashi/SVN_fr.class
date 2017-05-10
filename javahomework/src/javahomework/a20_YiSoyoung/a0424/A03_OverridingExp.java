package javahomework.a20_YiSoyoung.a0424;
/* Work - super class
    �ʵ� : kind(��������) 
   �����ڿ��� �ʵ� �ʱ�ȭ
    �޼��� : working() @@�� ���� �մϴ�
 * Engineer extends Work
 	�ʵ� : kind(��������) 
 	������ �ʵ� �ʱ�ȭ
 	�޼��� : @@�� ���α׷� ������ �մϴ�
 * PoliceMan extends Work
 	�ʵ� : kind(��������) 
 	������ �ʵ� �ʱ�ȭ
 	�޼��� : @@�� ������ ����ϴ� */
class Work{
	private String kind;
	public Work(){}
	public Work(String kind){this.kind = kind;}
	public void working(){System.out.println(kind+"�� ���� �մϴ�");}
	public String getKind() {return kind;}
}
class Engineer extends Work{
	public Engineer(String kind){super(kind);}
	@Override
	public void working() {
		System.out.println(getKind()+"�� ���α׷� ������ �մϴ�");
	}
}
class PoliceMan extends Work{
	public PoliceMan(String kind){super(kind);}
	@Override
	public void working() {
		System.out.println(getKind()+"�� ������ ����ϴ�");
	}
}
public class A03_OverridingExp {
	public static void main(String[] args) {
		PoliceMan p = new PoliceMan("���");
		Engineer e = new Engineer("���� ���α׷���");
		p.working();
		e.working();
	}
}
