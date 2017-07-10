package springweb.a01_basic;


public class Intro0612_inclass {

/*
 * 개발 process>>>>>>
 * 화면단 구성.jsp
 * sql처리(raw데이터 확인)
 * 	ex) select empno, ename from emp
 * 		where ename like '%'||'himan'||'%'
 * 		and job like '%'||'CLARK'||'%'
 *   	// 항상 말하지만 JAVA안의 sql은 ";"없음.
 * 
 * DTO, VO, ArrayList<DTO>
 * 	class Emp{
 * 	private int empno;
 * 	private String job;  // 위의 sql parameter와 일치시켜줘야함.
 * }
 * 
 * Repository(DAO)
 * 	public interface Emp_Dao
 *  //return 될값:  ArrayList<Emp>  // resultMap = VO가 모인 ArrayList형태
 *  //조건 처리할 형식: Emp sch  (객체 형식)
 *  public ArrayList<Emp> empList(Emp sch);
 * 
 * mybatis.Spring.xml
 * 	핵심 DTO/VO 클래스를 alias이름으로 등록
 * 		<typeAlias alias = "emp" 
 * 		type = "springweb.dto.Emp" />
 * 
 * sql을 처리할 XXXMapper.xml등록
 * 		<mapper resource = "resource/EmpMapper.xml" />
 * 
 * EmpMapper.xml처리(sql)
 * 	repository/dao를 연결할 id
 * 		namespace로 선언 : dao패키지명.인터페이스명
 * 		id: dao인터페이스의 메서드명
 * 	입력처리할 dto/vo단 처리
 * 		<select parameterType ="emp"  //mybatis.Spring.xml의 alias이름
 * 		where ename like '%'||#{ename}||'%'    // ==#{emp.ename} == emp.getEname();
 * 	return 할 객체(dto, ArrayList<vo> )
 *  //resultMap: VO -> ArrayList   // reusltType: VO - 단일객체
 *  	<resultMap type = "한개의VO객체" id = "id값선언 (ex)empMap" />
 *  	// 만약 VO의 get,set명이 Ename, Job처럼 defualt가 아닌 name, position이런식이라면..	 
 *  	//<result column = "ename" property = "name" />  
 *  	 
 *		<select resultMap = "empMap" 
 * 	
 * 	Service단에 처리.
 *  //.....???
 *  @Autowired(required=false)
 *  //....?? 조건, 반복처리
 *  
 *  Controller처리
 *  	service호출
 *  	model처리
 *  	view선택
 *  
 *  화면단 마무리
 * 		넘겨온 model데이터 el/jstl/jquery처리
 * 
 * 
 */
	
	
}
