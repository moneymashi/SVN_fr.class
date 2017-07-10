package doc;

public class Intro0704_Rstudio {
/*
 * 
 * no <- 벡터형
 * pay <- 벡터형
 * name <- 벡터형
 * vemp <- data.frame(No = no, Name = name, Pay = pay)
 * 
 * subset(벡터, 컬럼명 비교연산 값)
 * ex) y1<- subset(df, y<=8)
 * 
 * 
 * 
 * str_extract_all (문자열, 추출조건)
 * ex) data01 <- str_extract_all("dakuifb42dhsi234asd", [0-9]{3})
 *  // 의미:: 문자열 dakuifb42dhsi234asd 중에 0-9 숫자중에 연속된 3자리수를 추출.
 * data01 // 234
 * 
 * String 처리
 * str<- "asdqwe123poi"
 * length()  // 리스트 목록 갯수를 센다. 아무리 길어도 한단어면 1. 
 * str_length() // 문자열의 길이. 1글자 = 1
 * str_replace(문자벡터, 바뀔문자열 , 바꿀문자열)  // 벡터안의 문자열을 변환
 * paste(리스트형태, collapse = ",")  // 문자열결합
 *  ex) str <- c("a", "b", "c")
 *  result<- paste(str, collapse = ",") 
 *  result // "a,b,c"
 * 
 * str_locate(벡터, "찾을문자") // substr
 * 
 * 
 *   //////#############
 *   다음과 같은 벡터 생성하세요
 *   1)vec1 벡터변수만들고, "R"문자가 5회 반복되도록하세요
 *   vec1 <- rep("R",5)
 *   2) Vec2 벡터변수에 1~10까지 3간격으로 연속된 정수를 만드세요
 * 	 vec2<- seq(1, 10, 3)  
 *   3) Vec3 : 1~10까지 간격으로 연속된정수가 3회반복되게 만드세요
 *   vec3<- rep(1:10, 3)
 *   4) Vec4 : Vec2~ vec3가 모두 포함되는 벡터를 만드세요
 *   vec4<- c(vec2, vec3)
 *   5) 25~ -15까지 5간격으로 벡터생성 - seq()함수이용
 *   seq(25, -15, -5)   ### 음수등차 주의!!!
 *   6) Vec4에서 홀수번쨰 값들만 선택해 vec5에 할당(첨자이용)  ?????????
 * 	 vec5<- vec4[seq(1,length(vec4),2)]
 * 
 * 분산 apply(데이터, 1, var)
 * 표준편차 apply(데이터, 1, sd)
 * 소수정 2자리 round(데이터, 2)
 * 
 * 
 * str_extract_all(email, '^[a-z][a-z0-9]{4,}@[a-z]{3,}.[a-z]{2,}')
 *   //의미: ^[a-z]  :: 첫자가 문자로 시작
 *   [a-z0-9]{4,}  :: 문자 숫자를 쓰되 4자이상
 *   {최소자리,최대자리}  :: {최소, 최대} : 자릿수 범위
 *   @[a-z]{3,} :: @ 이후  문자3자리
 *   .[a-z]{2,} ::  . 이후 문자 2자리
 *   
 * list 할당: 다른방법
 * y<- scan(what = "")
 * 1. 
 * 2.
 * 3.  ...
 * 
 * data.frame 할당: 다른방법..
 * df = data.frame()
 * df = edit(df)
 * >> 테이블이 나타남. > 닫기.
 * 
 * names(테이블명) <- c(....) 
 *   //테이블의 각 컬럼 별명 설정.
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
