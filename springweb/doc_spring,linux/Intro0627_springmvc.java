package a01_Intro;

public class Intro0627_springmvc {
/*
 * AOP. 
 * 
 * ex) public pointcut accountOperations() : call( * Account. *(...) )
 * 
 * xml설정
 * <aop:config>
 * 	<aop:aspect id = "logginAspect" ref = "loggingAspect2">
 * 		...
 * </aop:config>
 * 
 * 
 * ex) Advice 클래스 선언
 * 해당 특정시점에 처리할내용선언
 * ProceedingJoinPoint
 * 	수행하는 모듈에 대한 정보를 가지고옮.
 * 	getSignature() : 객체정보
 * 	proceed(): 실제처리되는 내용.
 *   - 처리할 프로그래밍 내용을 소스앞이나 뒤에선언.
 *   - ex) 시작시간과 종료시간.
 * pointcut 지정(조립기 수행시, dispatcher-servlet )
 *  - 언제 해당내용을 수행하는가?
 *  <aop:config>
 *  	<aop:aspect ref = "advise클래스 참조변수"
 *  		<aop:pointcut
 *  			언제수행될것.
 *  			expression = "execution(public * 
 *  							springweb...repository...*(...) )"
 *  				//의미: repository인터페이스가 실제객체를 할당하여 수행할떄.
 *  		</
 *  		<aop:around : 수행하고잇는중에처리
 *  				method: 특정한 advice메서드 수행
 *  		</ 
 *  	</
 *  </
 * 
 * 확인예제: src/springweb/g01_aop package.
 * 
 *  //////////
 * @ResponseBody 활용
 * spring ajax처리
 *  json문자열을 return받아서 처리
 * 	cons: 한글에 관련된 encoding작업필요.
 * 	ArrayList<클래스> ==> json형태 문자열 변환처리해야함.
 *  문자열사이에 " "  ==> + ==> " "공백으로 변환
 * 
 * json view를 활용
 * 	조립기에 해당 viewer를 등록
 *  MappingJacksonJsonView를 등록하고
 *  property: contentType
 *   text/html:charset = utf-8
 * 
 * view .jsp처리
 *  $("form").serialize();
 *  .form에 속한 내용 속성을 ajax통신에 전달처리하는 형식인 jquery.
 * 	string(id=@@&pass=@@@)으로 변환해준다
 *  dataType:"JSON"
 *  success  //한글은 decoding처리 decodeURIComponent...
 * 
 * Controller
 *  @RequestMapping  //요청값으로 공백들어오면 "+" => " "
 *  @ResponseBody //  호출하는 부분이 문자열인 json전달처리
 *  return "[{id:",pass:"}]"
 * 
 * Service
 *  DB ArrayList ==> json
 *  JSONArray, JSONObject
 * 
 * 
 * 
 */
}
