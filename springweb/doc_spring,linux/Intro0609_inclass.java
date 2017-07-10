package springweb.a01_basic;

public class Intro0609_inclass {
/* <DB연동 방식 1,2,3모두 준수해야함>
 * dispatch-servlet.xml 조립기
 * 
 * 1. 연결 BasicDataSource: dataSource 
 * -드라이버
 * -DB서버 정보(ip, port, sid, 계정, 비밀번호)
 * 
 * 2. myBatis 설정
 * -연결정보를 받아서 mybatis와 설정...
 * 		dataSource ref => dataSource
 * -myBatis 공통 설정 config xml파일선언
 * 		configLocation 
 * 
 * 3. Repository(DAO) 설정
 * -MapperScannerCongifurer를 통해서 dao단의 패키지를 선언.
 * 
 * 
 *  ///////  myBatis 공통 설정 config xml>
 * classpath:resource/mybatis.Spring.xml
 * classpath:src를 기준으로 잡힘.
 * resource폴드에 mybatis공통선언 파일인 mybatis.Spring.xml
 * 주로하는 역할: 
 * 1) 모듈별 실제처리할 sql파일을 등록처리
 *  <mapper resource = "EmpMapper.xml" />
 * 2) 공통VO, DTO 등을 Alias으로 지정 (패키지명이 너무길다..)
 *  - sql에서 활용성 증가, 간단한 이름으로 설정.
 *  springweb.z01_dto.Emp ==> emp  // sql where부분에서 필요한 변수가져오기.
 *  
 * ///////  XXXXMapper.xml
 * mybatis 설정 config.xml에서 모듈별로 sql을 사용할수 잇게끔 처리하는파일
 * 
 * 1.sql입력처리:
 *  select * from emp where empno = sch.getEmpno()
 *  인식할수 있는id: dao단에서 호출시 필요
 *  입력관련 데이터값 처리 type : ParamType= "CallDto"  //아래
 *   class명과 일치시켜줘야함
 * 2.return : ArrayList<Emp>  
 * ->> ResultMap으로 결과값처리.(myBatis와 jdbc- ResultSet의 차이.)
 * return값에 대한 처리: resultMap = VO가 모인 ArrayList형태
 * namespace: hello.CallDao를 선언하면 id에 namespace명 생략가능!
 * 
 * DAO단 - interface와 밀접한 연관관계.
 * dao단 interface 패키지명.인터페이스명.메서드명
 * ex)
 * 	package hello;
 *  public interface CallDao{
 *  	public ArrayList<Vo> callList(CallDto dto);
 *  
 *  }
 *  // >>>> sql입력시 인식할수 있는 id : hello.CallDao.callList
 *  단, namespace가 있다면 앞부분 생략가능(위에 참조..)
 * 
 * 
 * 
 * 
 * 
 */
	
	
}
