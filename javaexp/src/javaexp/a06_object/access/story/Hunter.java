package javaexp.a06_object.access.story;

import javaexp.a06_object.access.story.friendship.WoodCutter;

public class Hunter {
	void askWhereDeer(){
		WoodCutter w; // public ���𰡴�
		w= new WoodCutter(); // ������ ���ٵ� ����.
//		System.out.println(w.cacheDeer);
		// cacheDeer�� �ʵ��� ���ٹ����� default �̱⿡.
		//cacheClothe�� �ʵ��� ���ٹ����� private�̱⿡
//		System.out.println(w.cacheClothe);
		// public�� ������ ���� ���� ������ �ܺ� ��Ű����
		// Ŭ������ import�� �ϸ� ��� �����ϴ�.
		System.out.println(w.weddingAnnounce);
	}
}
