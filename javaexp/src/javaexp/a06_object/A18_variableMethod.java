package javaexp.a06_object;

class GoRestaurant1{
	public void orderFood(String ... foods){
		System.out.print("�ֹ��� ������!! :");
		for(String food:foods){
			System.out.print(food+",");
		}
		System.out.println();
	}	
}
class GoRestaurant2{
	private String name;
	public GoRestaurant2(String name){
		this.name=name;
	}
	public void orderFood(String ... foods){
		System.out.println("�������!! "+name+"�Դϴ�");
		System.out.println("�ֹ��� ������!! :");
		int tot=0;
		int price=0;
		for(String food:foods){
			if(food.equals("¥���")) price=4000; 
			if(food.equals("«��")) price=6000;
			if(food.equals("������")) price=12000;
			System.out.print(food+"("+price+"),");
			tot+=price;
		}
		System.out.println();
		System.out.println("���ջ�:"+tot);
	}	
}
public class A18_variableMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoRestaurant1 g1 = new GoRestaurant1();
		g1.orderFood("¥���");
		g1.orderFood("¥���","«��");
		GoRestaurant2 g2 = new GoRestaurant2("�ҳ��� ¥��!!");
		g2.orderFood("¥���");
		g2.orderFood("¥���","¥���");
		g2.orderFood("«��","¥���","������");		
	}

}
