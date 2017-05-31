package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 메모리에 로딩하기
// 1. 각 클래스 선언위에 annotation으로  Controller 선언
// 2. dispather.xml에 xml등록 방식으로 bean 등록
// springweb.a01_basic.A01_StartCtrl
@Controller
public class A01_StartCtrl {
	// http://localhost:6080/springweb/start.do
	// 호출될 메서드.. annotation으로 RequestMapping("마지막 호출명")
	
	@RequestMapping("/start.do")
	public String start(){
//		1. 요청값..
//		2. business login 처리 (service를 통해서 model)
//		3. view단 호출..
		
		return "a01_basic/a01_start.jsp"; //화면단 호출..
	}

}
