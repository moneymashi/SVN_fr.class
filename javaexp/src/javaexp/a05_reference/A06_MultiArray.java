package javaexp.a05_reference;

public class A06_MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ������ �迭 ����
 * ������type [][]  ������=new ������type[1����ũ��][2���� ũ��][][][n����ũ��]
 *          ������ ��ŭ[][][]..n��..
 * */
		String [][] products=new String[3][2];
		products[0][0]="���";
		products[0][1]="������";
		products[1][0]="����";
		products[1][1]="����";
		products[2][0]="��Ź��";
		products[2][1]="TV";
//		products.length :���� �ܺι迭 ũ��
		for(int idx=0;idx<products.length; idx++){
			// products[idx].length:�ش� �迭���� ���Ե� �迭�� ũ��..
			System.out.println("���� �ܺ�idx:"+idx);
			for(int ix=0;ix<products[idx].length;ix++){
				System.out.println( products[idx][ix] );
			}
		}
		
		
		
	}

}
