package springweb.a01_basic;

public class Intro0613_inclass {
/*
 * OGNL 페이지?
 * 
 * 
 * 
 * ---
 * 
 *  //// if 엘리멘트.
 * 모든 조건에 대해 처리하고 만족하는 조건의 결과를 모두 적용한다.
 * 	<select if = "selData" parameterType = "emp">
 * 		select * from emp
 * 		<if test = "ename!= null">
 * 			where ename = #{ename}
 * 		</if>
 * 	</select
 * 동적query: 위와같이 sql구문이 조건에따라서 변경되는것을 말한다.
 *  ...????
 *  
 * 기본예제<>
 * emp리스트 데이터중, ename이나 job등 해당 데이터가 있을때, 
 * 검색이되고 , 안그러면 전체검색이 되는 동적query문을 작성.
 * 조건으로 ename만, ename과 job이 있을떄, job만 있을떄, 전체조건이 없을떄.
 * select * from emp
 * where 1=1   // 이건 아래 구문에 쉽게 조율하기위함. 1=1 and ~~ and ~~
 * <if test = "ename != null"> and ename = #{ename } </if>
 * <if test = "job != null"> and job = #{job } </if>
 * 
 * 
 *  //// choose
 *  조건 지정과 그외에 대한 처리를 동적인 ㅇsql에서 진행할떄 활용된다
 *  <select parameterType = "emp" >
 *  select * from Emp
 *  where 1=1
 *  <choose>
 *  <when test = "sal>5000"> and deptno=10 </when>
 *  <when test = "sal>4000"> and deptno=20 </when>
 *  <when test = "sal>3000"> and deptno=30 </when>
 *  <otherwise> and deptno = 40 </otherwise>
 *  </choose>
 * 
 *  //// where
 *  if엘리먼트가 조건처리에서 where구문에 대한 처리를 보완하기위한 사용함.
 *  prefix : 처리후 엘리먼트 내용잇으면 앞에 붙여줌
 *  prefixOverrides: 처리후 앞에 해당문자잇으면 자동으로 지워줌.
 *  select * from emp
 *  // where 1=1 // 얘로 처리하는게 더 좋겟지만... 최악의경우 아래의방법.
 *  <where>
 *  	<trim prefix = "Where" prefixOverrides = "AND|OR">
 *  	<if test = "ename!= null and ename != '' "> ename = #{ename} </if>
 *  	<if test = "job!= null and job != '' "> job = #{job} </if>
 * 
 *  //// forEach
 *  동적 sql을 loop문으로 반복처리해야할 경우
 *  	조회조건에서 부서를 여러개 검색조건ㄴ으로 처리할떄
 *  select * from emp
 *  where deptno in (10, 30, 20);
 *  속성 
 *  	collection: 배열의 목록리스트를 가져올 ex) jstl items = "~"
 *  	item : 배열의 목록단위 ex) jstl의 var = "~"
 *  	index : 몇번쨰 값인지 나타내는 인덱스, 0
 *  	open :목록에 값을 가져와 설정할떄, 앞에 붙여주는 문자
 *  	ex) deptno in "("
 *  	close: 목록에 값을 가져와 설정한후, 마지막에 붙여주는 문자 (ex) deptno in ( ")"
 *  	separator: 목록에 값을 가져와 설정할떄, 값 사이에 붙여주는 문자 (ex) deptno in ( 'ㄱ' "," 'ㄴ' "," 'ㄷ' )   ","
 *  
 *  화면 : 검색할부서 []10 []20 []30
 *  	<input type = "checkbox" name= "deptnos" /> 10
 *  	<input type = "checkbox" name= "deptnos" /> 20
 *  	<input type = "checkbox" name= "deptnos" /> 30
 * 
 *  DTO
 *  	private String[] deptnos
 *  	setDeptno(String[] ), getDeptno()
 *  
 *  forEach를 활용한 동적sql
 *  	select * from emp where 1=1
 *  	<if test = "deptnos != null " >    // DTO: getDeptnos()
 *  	deptno in 
 *  	<forEach collection = "deptnos"    //  type = checkbox name = "deptnos"
 *  	item = "ckdeptno"
 *  	index = "idx"
 *  	open = "("
 *  	close = ")"
 *  seperator = "," >
 *  	</forEach>
 *  	</if>
 * 
 * 
 * 
 */
}
