package javaexp.a00_basic;

import java.util.ArrayList;

public class A09_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*  Collection �ڹٿ����� ���� �޸� ������ ����
 *   ������ ��ü�� ���� �����Ѵ�.
 * */
		// �迭�� �ѹ� ����� ����, 
		// �� �迭�� ���� ��ü�� ������ �߰��ҷ���, 
		// ���ο� �迭�� �����ؾ� �ϴ� �������� Ư���� �迭�� �ִ�.
		String []names={"ȫ�浿","��浿","�ű浿"};
		// �����迭�� ���Ͽ� ��ü�� �����Ѵ�.
		// 1) ArrayList<Type>    class������ import java.util.ArrayList;
		//   ����.
		ArrayList<String> list = new ArrayList<String>();
		// add(�߰���ü)
		list.add("���");
		list.add("�ٳ���");
		list.add("����");
		// .size() :  ��ü�� ũ��..
		// .get(index) : �ش� ��ü�� ������
		for(int idx=0;idx<list.size();idx++){
			System.out.println( list.get(idx) );
		}
		// .remove(index) : Ư�� ��ü�� ���� ��Ŵ
		// .set(index, ��ü) : Ư�� ��ü�� ������..
		list.remove(0);//ù��° ��ü�� ����..
		System.out.println("���� ��!!!");
		for(int idx=0;idx<list.size();idx++){
			System.out.println( list.get(idx) );
		}		
		list.set(1, "������");//�ι�° ��ü�� �������� ������..
		System.out.println("���� ��!!!");
		for(int idx=0;idx<list.size();idx++){
			System.out.println( list.get(idx) );
		}		
	}

}
