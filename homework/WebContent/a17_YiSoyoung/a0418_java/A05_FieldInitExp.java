package javaexp.a06_object;
/* Ȯ�ο���
 * BaseballTeam ��ü Ŭ���� ����, ��, ��, ��, �·�
 * ��� ����
 * @@@��, @@��, @@��, @@��, �·� @@@
 * �Է°��� ���� �����ڸ� ���� ���
 * field���� ó���� �����ڸ� ���� �ʱ� ������ ����
 * */
class BaseballTeam{
	private String teamName;
	private int win; 	//��
	private int tie;	//��
	private int loss;	//��
	private double winRate; //�·�
	public BaseballTeam(){	}
	public BaseballTeam(String teamName,int win,int tie,int loss){
		this.teamName = teamName;
		this.win = win;
		this.tie = tie;
		this.loss = loss;
		this.winRate = (double)win/(win+loss);
	}
	@Override
	public String toString() {
		String temp;
		temp = teamName +"��,\t"+win+"��,\t"+tie+"��,\t"+loss+"��,\t�·� "+winRate;
		return temp;
	}
}
public class A05_FieldInitExp {
	public static void main(String[] args) {
		BaseballTeam hanwha = new BaseballTeam();
		BaseballTeam dusan = new BaseballTeam("�λ�",9,0,0);
		System.out.println(hanwha);
		System.out.println(dusan);
		// ��ü�迭�� �̿��� ����
		System.out.println("�� �� �� �Ʒ��� ��ü �迭�� ó���� �� �� ��");
		BaseballTeam[] teams = new BaseballTeam[2];
		teams[0] = new BaseballTeam();
		teams[1] = new BaseballTeam("�λ�",9,0,0);
		for(BaseballTeam t : teams)
			System.out.println(t);
	}
}
