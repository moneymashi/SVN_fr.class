
package javaexp.a06_object.company.personnel;

//import javaexp.a06_object.company.manager.CheifMember;
import javaexp.a06_object.company.manager.HeadMember;
import javaexp.a06_object.company.manager.StaffMember;




public class CheifMember {

	void checkStaff(){
		CheifMember c01 = new CheifMember();
		HeadMember h01 = new HeadMember();
		StaffMember s01 = new StaffMember();

//		System.out.println(c01.projectConsult); //default����������. : ���� ��Ű��������
//		System.out.println(h01.familyBDdate); // private ����������. : ���� Ŭ��������.
		System.out.println(s01.marriageDate);
		s01.checkOthers();
		
	}
	
}
