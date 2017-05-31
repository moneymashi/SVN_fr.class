package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// �޸𸮿� �ε��ϱ�
// 1. �� Ŭ���� �������� annotation����  Controller ����
// 2. dispather.xml�� xml��� ������� bean ���
// springweb.a01_basic.A01_StartCtrl
@Controller
public class A01_StartCtrl {
	// http://localhost:6080/springweb/start.do
	// ȣ��� �޼���.. annotation���� RequestMapping("������ ȣ���")
	
	@RequestMapping("/start.do")
	public String start(){
//		1. ��û��..
//		2. business login ó�� (service�� ���ؼ� model)
//		3. view�� ȣ��..
		
		return "a01_basic/a01_start.jsp"; //ȭ��� ȣ��..
	}

}
