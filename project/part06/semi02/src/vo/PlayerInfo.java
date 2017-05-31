package vo;

public class PlayerInfo {
	private int rank;
	private String pid;
	private int mChoice;
	private String pass;
	private String pname;
	private String email;
	private String tel;
	private double totBet;
	private double totBenefit;
	private double totLose;
	private double curMoney;
	private int first;
	private int second;
	private int third;
	
	public PlayerInfo(){}
	
	public PlayerInfo(String pid, int mChoice, String pass, String email, String tel, int totBet, int totBenefit,
			int totLose, int curMoney, int first, int second, int third) {
		this.pid = pid;
		this.mChoice = mChoice;
		this.pass = pass;
		this.email = email;
		this.tel = tel;
		this.totBet = totBet;
		this.totBenefit = totBenefit;
		this.totLose = totLose;
		this.curMoney = curMoney;
		this.first = first;
		this.second = second;
		this.third = third;
	}

	
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getmChoice() {
		return mChoice;
	}

	public void setmChoice(int mChoice) {
		this.mChoice = mChoice;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public double gettotBet() {
		return totBet;
	}

	public void settotBet(double totBet) {
		this.totBet = totBet;
	}

	public double gettotBenefit() {
		return totBenefit;
	}

	public void settotBenefit(double totBenefit) {
		this.totBenefit = totBenefit;
	}

	public double gettotLose() {
		return totLose;
	}

	public void settotLose(double totLose) {
		this.totLose = totLose;
	}

	public double getCurMoney() {
		return curMoney;
	}

	public void setcurMoney(double curMoney) {
		this.curMoney = curMoney;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	
}
