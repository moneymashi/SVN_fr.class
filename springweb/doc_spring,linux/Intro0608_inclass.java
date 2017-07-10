package springweb.a01_basic;

public class Intro0608_inclass {

/* 
 * /// 이날의 ppt는 엄청 중요하다.
 * 
 * 객체에 객체 할당처리
 * Main()나 외부 클래스에서 호출 형태
 * Woman woman = new Woman();
 * Man man = new Man();
 * man.setWoman(woman);   // 조립기형태
 *  // autowire: 자동으로 객체를 해당 엮음.
 * 
 * 조립기(Container) 처리
 * <bean id = "woman" class = "@@@.Woman" />
 * <bean id = "man" class = "@@@.Man" />
 * 	<property name = "woman" ref = "woman" />
 * 
 * autowire속성
       	1) byName은 해당메서드의 setXXXX에 property가 선언된 클래스의 id값과 같을때, 자동으로 할당됨.
       	setWoman()이라는 메서드가 존재해야지만 autowire가 가능함.
 * ex) <bean id = "man" class = "@@@.Man" autowire = "byName"/>
 * 
 * 
 * 
 *  z01_vo Duck - interface.
 * 2) bytype으로 해당 클래스와 입력 parameter의 type이 같은 메서드를 찾아서 자동 할당한다.
 * Duck d = new Duck();
 * d.settype("청둥오리");
 * LakeFlying flyway01 =dnew LakeFlying();
 * d.setFly(flyway01); 
 * 		// autowire 에 byType으로 선언하면, 해당 코드내용을 생략해도 type이 할당 될수 있는곳을 찾아서 할당이 된다. 
 * 
 * 조립기 선언!!!!!
 * <context:annotation-config>
 * //...??
 * 
 * --------------------------
 * Mybatis연결
 * 컨테이너(dispatcher-servlet.xml)에 모듈
 * DB연결정보
 * myBatis 모듈등록, 설정파일
 * dao interface 위치등록
 * 
 * Mybastis설정
 * 공통vo를 등록, alias이름
 * d업무별 XXXXmapper.xml을 등록
 * 
 * Mapper.xml
 * namespace 설정
 * resultMap 선언: vo
 * sql선언: select
 * 	입력값: parameterType
 * 	return: resultMap(ArrayList), resultType
 *  ...???
 * 
 * 
 * 
 * 
 */
}
