package javaexp.a07_inheritance.access.woodhome;

public class Son1 extends WoodCutter {
	void whatWoodCutterInfo(){
		// public
		System.out.println(weddingAnn);
		// default(���� ��Ű��)
		System.out.println(savingMoney);
		// protected ����..
		System.out.println(cacheInheri);
		// private(X) :��Ӱ��迡���� ������ �ȵȴ�..
//		System.out.println(privSect);
	}
}
