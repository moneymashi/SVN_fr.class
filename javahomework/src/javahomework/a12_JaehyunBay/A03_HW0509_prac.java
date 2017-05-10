package javaexp.a12_collection;

import java.util.ArrayList;

/*
	ArrayList Ȯ�ο��� 
	���ϰ��� ArrayList : sellList
	�庸�� ��� ArrayList : buyList
	�ó�����
	 
	- ���, �ٳ���, ����, ������, ������ �Ȱ� �ֽ��ϴ�. addó��
	- �庸�� ����� ����� ���⸦ �����߽��ϴ�. remove, addó��
	- ���ϰ��Կ��� �ٳ����� ����� ���������ϴ�. setó��
	- �庸�� ����� ����� ���⸦ �� �Ծ����ϴ�. removeó��
	- �庸�� ����� ������ �ִ� ������ ���ٸ� ���ϰ��Կ��� ���� ���� �� �ϳ��� �庸�� ������� ����ǰ���� �ֱ�� �߽��ϴ�.
*/


class Seller{
	private String sName;
	Seller(String sName){
		this.sName = sName;
		System.out.println("�������!" + this.sName + "�Դϴ�! ���ǵ� �ʹ� �δ�!");
	}
	private ArrayList<String> sellList = new ArrayList<String>();
	private int findpId(String pName){
		int found=0;
		for(int seek = 0; seek<sellList.size(); seek++){
			if(sellList.get(seek).equals(pName)){
				found = seek;
			}
		}
		return found;
	}
	
	public void addProduct(String...pNames){
		for(String pName:pNames)
			sellList.add(pName);
	}
	public void changeProduct(String pName, String newpName){
		int pId = findpId(pName);
		sellList.set(pId, newpName);
	}
	public String removeProduct(String...pNames){
		try {
			for(String pName:pNames){
			if(!sellList.contains(pName)){
				//throw new IsEmptyException();
				System.out.println("�˼��մϴ�."+ pName+"��� ������ �����ϴ�!");
				int rand01=(int)(Math.random()*sellList.size());
				String reward = sellList.get(rand01);
				System.out.println("���."+ reward+"���� ���� �ص帳�ϴ�!");
				return reward;
			}
			int pId = findpId(pName);
			sellList.remove(pId);
			}
		} catch (/*IsEmpty*/Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	public void nowOwn(){
		System.out.println("���� �������ִ� �̽��� ���ǵ��Դϴ�!!");
		for(int all =0; all<sellList.size(); all++){
			System.out.println( (all+1)+ ". "+ sellList.get(all) );
		}
	}
}

class Buyer{
	Buyer(){}
	private ArrayList<String> buyList = new ArrayList<String>();
	
	private int findpId(String bName){
		int found=0;
		for(int seek = 0; seek<buyList.size(); seek++){
			if(buyList.get(seek).equals(bName)){
				found = seek;
			}
		}
		return found;
	}
	
	public void buyProduct(String...bNames){
		for(String bName:bNames){
			buyList.add(bName);
		}
	}
	public void eatProduct(String...bNames){
		for(String bName:bNames){
			int bId = findpId(bName);
			buyList.remove(bId);
		}
	}
	public void nowOwn(){
		System.out.println("������ ���� ���ǵ��Դϴ�!!");
		for(int all =0; all<buyList.size(); all++){
			System.out.println( (all+1)+ ". "+ buyList.get(all) );
		}
	}
}

public class A03_HW0509_prac {
	public static void main(String[] args) {
		Seller s01 = new Seller("û����ȸ");
		//1��. ���, �ٳ���, ����, ������, ������ �Ȱ� �ֽ��ϴ�. addó��
		s01.addProduct("���","�ٳ���","����","������","����");
		s01.nowOwn();
		
		//2��. �庸�� ����� ����� ���⸦ �����߽��ϴ�. remove, addó��
		Buyer b01 = new Buyer();
		b01.buyProduct("���","����");
		s01.removeProduct("���","����");
		s01.nowOwn();
		b01.nowOwn();
		
		//3��. ���ϰ��Կ��� �ٳ����� ����� ���������ϴ�. setó��
		s01.changeProduct("�ٳ���", "���");
		s01.nowOwn();
		
		//4��. �庸�� ����� ����� ���⸦ �� �Ծ����ϴ�. removeó��
		b01.eatProduct("���","����");
		b01.nowOwn();
		
		//5��. ����!! ������ ���ٸ� ���ϰ��Կ��� ���� ���� �� �ϳ��� �庸�� ������� ����ǰ
		b01.buyProduct(s01.removeProduct("����"));
		b01.nowOwn();
	}
}