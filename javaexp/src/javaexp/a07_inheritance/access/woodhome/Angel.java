package javaexp.a07_inheritance.access.woodhome;

public class Angel {
	void whatWoodCutterInfo(){
		WoodCutter w = new WoodCutter();
		// public
		System.out.println(w.weddingAnn);
		// default(���� ��Ű��)
		System.out.println(w.savingMoney);
		// protected ����..
		System.out.println(w.cacheInheri);
		// private(X)
//		System.out.println(w.privSect);
	}
}
