/*
 ArrayList Ȯ�ο���   0509
 ���ϰ��� ArrayList : sellList
 �庸�� ��� ArrayList : buyList
 �ó����� 
 - ���, �ٳ���, ����, ������, ������ �Ȱ� �ֽ��ϴ�. addó��
 - �庸�� ����� ����� ���⸦ �����߽��ϴ�. remove, addó��
 - ���ϰ��Կ��� �ٳ����� ����� ���������ϴ�. setó��
 - �庸�� ����� ����� ���⸦ �� �Ծ����ϴ�. removeó��
 - �庸�� ����� ������ �ִ� ������ ���ٸ� ���ϰ��Կ��� ���� ���� �� �ϳ��� �庸�� ������� ����ǰ���� �ֱ�� �߽��ϴ�.
 
*/
package javahomework.a13_SeoJunghyo;

import java.util.ArrayList;

class Fruit{
	private String name;

	public Fruit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	static void showStatus(String phase, ArrayList<Fruit> seller, ArrayList<String> buyer ){
		String sellList="";
		String buyList="";
		for(Fruit goods : seller){
			sellList+=goods.getName()+"   ";
		}
		for(String goods : buyer){
			buyList+=goods+"   ";
		} 
		switch(phase){
			case "Phase 1":
				System.out.println(phase+" - Ronaldo is selling fruits(Apple, Banana, Starwberry, Orange, Watermelon).");
				break;
			case "Phase 2":
				System.out.println(phase+" - Messi bought apple and strawberry from Ronaldo. ");
				break;
			case "Phase 3":
				System.out.println(phase+" -Ronaldo switched his banana to apple.");
				break;
			case "Phase 4":
				System.out.println(phase+" - Messi ate apple and strawberry.");
				break;
			case "Phase 5":
				System.out.println(phase+" -If Messi has no fruit, Ronaldo will give one of fruits to Messi.");
				break;
		}
		System.out.println("Seller: "+sellList);
		System.out.println("Buyer: "+buyList+"\n");	
	}
}

public class a05_homework_ArrayList_0509 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit> seller = new ArrayList<Fruit>();
		ArrayList<String> buyer = new ArrayList<String>();
		
		// ���, �ٳ���, ����, ������, ������ �Ȱ� �ֽ��ϴ�. addó��
		seller.add(new Fruit("Apple"));
		seller.add(new Fruit("Banana"));
		seller.add(new Fruit("Strawberry"));
		seller.add(new Fruit("Orange"));
		seller.add(new Fruit("Watermelon"));
		Fruit.showStatus("Phase 1", seller, buyer);
		
		// �庸�� ����� ����� ���⸦ �����߽��ϴ�. remove, addó��
		buyer.add(seller.get(0).getName());
		buyer.add(seller.get(2).getName());
		seller.remove(0);
		seller.remove(1);
		Fruit.showStatus("Phase 2", seller, buyer);
		
		// ���ϰ��Կ��� �ٳ����� ����� ���������ϴ�. setó��
		seller.set(0, new Fruit("Apple"));
		Fruit.showStatus("Phase 3", seller, buyer);
		
		// �庸�� ����� ����� ���⸦ �� �Ծ����ϴ�. removeó��
		buyer.clear();
		Fruit.showStatus("Phase 4", seller, buyer);
		
		// �庸�� ����� ������ �ִ� ������ ���ٸ� ���ϰ��Կ��� ���� ���� �� �ϳ��� �庸�� ������� ����ǰ���� �ֱ�� �߽��ϴ�.
		if(buyer.size()==0){
			int ranIdx = (int) (Math.random()*3);
			buyer.add(seller.get(ranIdx).getName());
			seller.remove(ranIdx);
		}
		Fruit.showStatus("Phase 5", seller, buyer);
	}





}
