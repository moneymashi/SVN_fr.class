package javaexp.a07_inheritance.access.neightborhome;

import javaexp.a07_inheritance.access.woodhome.WoodCutter;

public class Uncle {
	void whatWoodCutterInfo(){
		WoodCutter w = new WoodCutter();
		// public
		System.out.println(w.weddingAnn);
		// ### protected  ��Ӱ��谡 �ƴϸ� ���� �� ��
//		System.out.println(w.cacheInheri);		
		// default(���� ��Ű��)
//		System.out.println(w.savingMoney);
		// private(X)
//		System.out.println(w.privSect);
	}
}
