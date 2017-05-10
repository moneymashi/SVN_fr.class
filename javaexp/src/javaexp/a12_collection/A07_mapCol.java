package javaexp.a12_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A07_mapCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map �÷��� ���� <key, value>
//		�Ϲ����� key, value�� ������ ���� type���� �����Ѵ�.
//		key : ���ڿ�
//		value : ��ü
		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put( key, value) ��ü ����
		String name="ȫ�浿";
		Integer num=70;
		map.put("ȫ�浿", 70);
		map.put("�ű浿", 80);
		map.put("ȫ�浿", 90); // ������ key���� ������ value�� �Ҵ�ȴ�.
		map.put("������", 100);
		System.out.println("���� map  entry�� ����:"+map.size());
//		Ư���� key�� ����������.. get(key)
		System.out.println("ȫ�浿key�� �� ��������:"+map.get("ȫ�浿"));
//		��ü ������ ��������..
//		1. key�� ���ؼ� ó���ϱ�.. keyset() : ��ü key���� Set���·� ��������
		Set<String> keyset = map.keySet();
//		Set�� iterator�� ���ؼ� �����͸� �����´�.
		Iterator<String> iter = keyset.iterator();
		String key="";
		Integer value=0;
		while(iter.hasNext()){
			key=iter.next();
			value=map.get(key);
			System.out.println(key+":"+value);
		}
//		remove(key) ��ü ����
		map.remove("ȫ�浿");
		System.out.println("���� map  entry�� ����:"+map.size());
//		2. Map.Entry�� ���� key,value�� ���ÿ� �����ͼ� ó��..
//		entrySet() : Set������ Map.Entry ������.
		Set< Map.Entry<String, Integer>  > entrySet=map.entrySet();
//		Set�����̱⿡ iterator���ؼ� ������ ó���� ����
		Iterator< Map.Entry<String, Integer> > entryIter=entrySet.iterator();
		
		// hasNext() �ݺ�ó��.. next()  ����������..
		// getKey() :  key��������.. getValue() : value ��������
		Map.Entry<String, Integer> entry=null;
		String inkey="";
		Integer invalue=0;
		System.out.println("==== Map.Entry ====");
		while(entryIter.hasNext()){
			entry=entryIter.next(); // ������ü�� ������
			inkey=entry.getKey();// key �Ҵ�
			invalue=entry.getValue();//value �Ҵ�
			System.out.println(inkey+":"+invalue);		
		}
		// clear() ���Ե� map ��ü ���� ó��
		map.clear();
		System.out.println("���� ��, ���� map  entry�� ����:"+map.size());
	}

}
