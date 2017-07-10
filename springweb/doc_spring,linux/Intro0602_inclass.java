package springweb.a01_basic;

public class Intro0602_inclass {
/*
 * 어제 학습내용 복습.
 * 
 * 
 * 요청
 * http://localhost:8080/springweb/callctrl.do
 * 
 * 자바 컨트롤러 @Controller
 * @RequestMapping("/callctrl.do")
 * public String call(요청객체Member mem , 결과로 Model d){
 * 요청 DTO
 * 결과 Model : jsp단에 보여질 d.addAttribute()
 * }
 * 
 * >>> get방식
 * http://localhost:8080/springweb/callctrl.do?id=himan&pass=7777
 * 자바에서 요청객체 Member mem 패러미터 포함하고
 * mem.getId(); mem.getPass(); 이런식.
 * 
 * 
 * ///////////// 본수업
 * public String call(@@@@, Model d){}
 * 1. 클래스 선언  // 한계점. 데이터형식이 맞아야함. .jsp?뒤에 일일히 해줘야한다? 어우...
 * Member m : ?id=himan&pass=777
 * 2.한개단위 입력값 처리
 * @RequestParam(value= "id", defaultValue = "")  >> String id
 * 	-value: query string key를 지칭
 * 	-defaultValue : 실제 stringkey 가 없거나, 데이터를 할당할지 않을경우.
 *  ** 데이터 형식도 맞춰야하고 값이 없을경우 에러가 아니라 호출자체가 안된다.
 * 
 *  
 *  ///////// Controller에 공통 RequestMapping annotation 설정. get/post
 *  @RequestMapping( value = "요청주소" method = RequestMethod.GET )  // GET대문자만 인식됨.
 *   -해당요청주소로 get방식 처리
 *  @RequestMapping( value = "요청주소" method = RequestMethod.POST ) // POST대문자만 인식됨.
 *   -해당요청주소로 post방식 처리
 *   
 * ////////// @ModelAttribute
 * Controller 생성 - get/ post방식.  
 *   
 *   
 *   
 *   
 *   예제: 구매금액 누적확인.
 *   물건가격: []
 *   갯수: []
 *   [구매완료]
 *   
 *   누적금액: []
 *   -------
 *   ++ db연동으로 searchPre
 *   
 *   
 *   ///// ModelAttribute
 *   
 *   
 *   
 *   
 * */
}
