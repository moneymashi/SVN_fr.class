package javaexp.a12_collection;

import java.util.ArrayList;

class Food{
	private String type;
	private int price;
	public Food(String type, int price) {
		this.type = type;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void show(int num){
		System.out.println(num+"\t"+type+"\t"+price);
	}
}
public class A02_basicExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Food> flist = new ArrayList<Food>();
		flist.add(new Food("���",3000));
		flist.add(new Food("¥���",5000));
		flist.add(new Food("«��",6000));
		System.out.println("NO\t���ĸ�\t����");
		// collection�� ũ��� .size()
		for(int idx=0;idx<flist.size();idx++){
			System.out.println((idx+1)
					 +"\t"+flist.get(idx).getType()
					+"\t"+flist.get(idx).getPrice());
//			flist.get(idx).show(idx+1);
		}
	}

}
