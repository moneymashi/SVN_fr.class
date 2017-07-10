package doc;

public class Intro0703_Rstudio {

/*
 * 
 * 
 * 
//////////////////// 1장. 기초문법
mode("~~")   == typeof()
is.numeric()  == boolean 
is.character()
ls()  //현재사용중인 변수객체list
as.데이터Type(데이터) : 자료형변환

mode()
class()

args(해당요소) : 활용되는 파라미터값에 대한 정의
args(read.csv) : csv파일을 읽는 형태를 자세히 설명해준다.

par(mfrow = c(1,2) )
plot()

NA  : 결적치, Not Available


############# 시험에 나온다
연습문제// pg40
1.
setwd("c:/Rwork/Part-I")
getwd()

3/
데이터 모음? data(women)
자료형? 자료성격: mode(women)
자료구조? class(women)

4.R프로그래밍 언어의 특징.
1) 일반데이터, 함수, 차트 등 모든 데이터가 객체형태로 관리됨
2) 모든객체는 메모리로 로딩되어 고속으로 처리되고 재사용 가능
3) 데이터 분석에 필요한 최신의 알고리즘 및 방법론을 제공
4) 데이터 분석과 표현을 위한 다양한 그래픽도구제공
##########

//////////////2장. 데이터의 유형과 구조
rep(1:3,3) 123123123
rep(1:3,each=3)111222333
seq(1,5) 12345
seq(1,5,2) 1 3 5
union(x,y)
setdiff(x,y)
intersect(x,y)

//// 리스트 형태의 데이터 접근방법
벡터명 [index번호] : 벡터 index는 1부터 시작.


### 벡터 범위의 벡터를 가져올때는 , 사용 안함!!!
ex) ex <- c(1:5, 8,10)
ex[1:length(ex)]
ex[1,5]  // ### 에러가 뜬다.



####### 매트릭스 확인예제
4행 5열의 21~40데이터를 matrix출력
row단위를 우선으로 출력
3행만 출력
2열만 출력
row(1~2), col(3~5) box출력
3행 3열 데이터 출력

exp <- matrix(21:40, nrow = 4, ncol =5, byrow=T)
exp[3,0]
exp[0,2]
exp[c(1:2), c(3:5)]
exp[3,3]


apply()함수
행렬구조의 자료를 처리하는데 함수를 통해서 원하는 데이터를 로딩하기 위해 사용됨
apply(행ㅇ렬객체, margin(1==행 / 2==열), 적용할 함수)
적용할 함수 : amx, min, mean, 사용장정의
ex)지정한 ㅋ매트릭스의 행단위(1)의 최대값을 구하기
apply(m0, 1, max) // m0매트릭스의 각 행마다 최대값구하기.


List : 서로다은 데이터 구조.
성격이 다른 데이터 (벡터, 행렬, 데이터프레임 등등 모든 데이터)
1차원리스트 : 1개의 key = 1개의 원소값을 할당
 1개의 key값을 생략처리.. 
 list("lee", "이순신", 95, "hong", 65)
list 이용해 key, value반환
value 통짜 => list[[1]] -> lee
key를 이용한 특정 value반환 list[[1]][1] -> lee
list구조 제거 -> vector
vec_list <- unlist(list)
vec_list

key-value list 형식 (객체 생성)
member <- list(name = c("이순신", "hong"), age =25, address = 'seoul')

key로 value 부르기
member$name  ->"이순신", "hong"
key로 특정 value 부르기
member$name[1] ->"이순신"
전체 리스트 확인하기

str(member)










 * 

 * 
 */
}
