package javaexp.a07_inheritance.access.son2home;

import javaexp.a07_inheritance.access.woodhome.WoodCutter;

// �ٸ� package�� WoodCutter�� ���
public class Son2 extends WoodCutter {
	void whatWoodCutterInfo(){
		// public
		System.out.println(weddingAnn);

		// protected ����..
//		��Ӱ��迡 ������ protected�̻��� ���������
//		������ �����ϴ�.
		System.out.println(cacheInheri);
		// default(���� ��Ű��)
//		 ����� �ִ��� ���� package�� �ƴϱ⿡ ���� �ȵ�.
//		System.out.println(savingMoney);		
		// private(X) :��Ӱ��迡���� ������ �ȵȴ�..
//		System.out.println(privSect);
	}
}

