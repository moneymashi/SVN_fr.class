package jspexp.c01_mvc;

import jspexp.z01_database.A04_MemeberDao;
import jspexp.z02_vo.Member;
// A05_Service
public class A05_Service {
	// DB�� �����ؼ� id�� password ��ȿ������ Ȯ���ϴ�
	// �޼��� ����.
	// 1. �����Ͻ� ����ó��..
//	   2. DB ���� ȣ��.
//	     A04_MemeberDao getMember(Member sch)
	private A04_MemeberDao dao;
	// ��ȿ���� üũ
	public boolean isValid(Member vo){
		boolean hasData=false;
		dao= new A04_MemeberDao();
		// �ش� db���� �����Ͱ� ���� ��, ��ȿ
		if(dao.getMember(vo)!=null){
			hasData=true;
		}
		return hasData;
	}
	// ������ data ������..
	public Member getMember(Member vo){
		dao= new A04_MemeberDao();
		return dao.getMember(vo);
	}
}
