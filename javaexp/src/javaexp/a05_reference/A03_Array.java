package javaexp.a05_reference;
//enum Week{}
public class A03_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// �迭�� ����
		int [] points;
//	�⺻ ũ�Ⱑ ����� �迭��ü ����
		points=new int[5];
//	�迭 ��ü ������ �Ҵ�.
		points[0] = 90;
		points[1] = 80;
		points[2] = 70;
//	�ش� ��ü ȣ��.. �⺻���� �����Ͱ� �Ҵ���� ������ 0���� �ڵ��Ҵ�
		for(int idx=0;idx<points.length;idx++){
			System.out.println("����:"+points[idx]);
		}
//	�迭��ü ����, ������ �Ҵ� 
		double[] weights = new double[]{67.5, 70.4, 98.2};
		for(int idx=0;idx<weights.length;idx++){
			System.out.println("������:"+weights[idx]);
		}
// �迭 ����.
//	System.arraycopy( �����迭��ü, int �����迭����index, ���纻�迭��ü,
//		               int ���纻�迭������ġ, int �����ұ���)
		int[] orginArray={1,3,5};
		int[] targetArray= new int[5];
		System.arraycopy(orginArray, 0, targetArray, 0, 3);
		System.out.println("����� �迭");
		for(int idx=0;idx<targetArray.length;idx++){
			System.out.println("������:"+targetArray[idx]);
		}
		String[] orgFruits={"���","�ٳ���","����"};
		String[] targetFruits= new String[5];
		//                        �ٳ���(1)    4��°����  2������
		System.arraycopy(orgFruits, 1, targetFruits, 3, 2);
		for(String fruit:targetFruits){
			System.out.println("����� ����"+fruit);
		}
		
		
		
		
		
		
	}

}
