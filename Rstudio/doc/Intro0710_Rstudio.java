package doc;

public class Intro0710_Rstudio {
/*
 * 데이터 전처리
 * 
 * 데이터 수집 
 * 전처리: 수집된 자료중, 분석을 위하여 필요하는 데이터로 수정, 제거하는작업(불필요자료, 사용할수없늕자료)
 * 데이터 분석
 * 
 * 전처리작업에서 filtering하는 데이터 내용?
 * 결측치: NA, NAN
 * 극단치: 중간값을 
 * 
 * 
 * 
 * 데이터를 통합 : join
 *  - plyr 패키지  
 *  --install.packages('plyr'); library(plyr);
 *  - ex) join <- join(dataX, dataY, id = 'ename', type = 'inner')  # default 는 left.
 * 열이나 행추출, filter, 정렬, 집계
 *  - dplyr 패키지  
 *  - cf) select(), mutatie(), summarise(), group by
 * 긴형식
 * ?????
 * 데이터 조회
 * - head(), tail(), names(): 컬럼설정과 보기.
 * - dattributes(): 열, 클래스, 행이름, str() 구조보기
 * - 데이터세트명$변수(컬럼명)
 * - 데이터세트명['컬럼명']
 * - 데이터세트명[열index], 데이터세트명[행index,열, index] 
 * - 데이터세트명[c(열의index,  ??????
 * 
 * 결측값처리(NA) :제거방법
 * - 함수를통한 제거: na.omit(데이터셋변수/컬럼)
 * - ex) price2 <- na.omit(dataset$price) # price의 모든 NA제거하고 price2에 할당.
 * - sum, avg등 함수에 속성값을 지정: na.rm = T : not available remove 속성을 T로 처리.
 * - ex) sum(dataset$price, na.rm = T )  # 계산에 포함되지않음. 포함되면 NA결과값.
 * 
 * 결측치 변환
 * ifelse(!is.na(x), x, 0) ## x가 값이잇을경우 그대로, na인경우 0.
 * 
 * 극단치 발견과 정제
 * - 극단값의 원인: 잘못된 표본추출, 입력상오류
 * - 발견: 화면상 그래프를 통해확인
 *  	히스톡그램, 테이블, 파이차트를 통해서 outlier를 확인
 *  	ex) gender <- dataset$gender
 *  		hist(gender),
 *  		table(gener) - 빈도수 체크
 *  		pie(gender)
 * - 정제처리: 발견된 극단치를 원하는 데이터 범위안으로 filter처리
 * 	subset(param1, param2)
 * 	param1: 데이터셋 할당
 * 	param2: 정제할 조건처리, 주로 boolean할당
 * 		ex) subset(dataset01, dataset01$gender ==1 | dataset01$gender== 2)
 * 		dataset01에 있는 변수중, gender의 값이 1 이거나 2인값만 가져와 데이터 셋을 구성함
 * 		subset()을 통해 정제된 데이터를 새로운 데이터셋에 할당해 활용.
 * 		newdata <- subset(data, data$age > 20 & data$age <= 65)
 * 		화면상 비교분석  - pie(table(dataset01$gender) )
 * 
 * 코딩변경: 변수(컬럼) 추가, 변경
 *  - 기존의 데이터도 필요해, 새로운 변수를 추가하여 처리할때.
 *  - 기본형식:
 *  데이터셋$새로운변수[데이터셋$기존변수 조건식] <- 신규로 할당할 데이터.
	 *  ex) 연령별로 연령에 대한 표시를 해야하는 새로운 변수가 필요로하다.
	 *  <=30 청년층, 30< <=45중년층, 45< 장년층으로 구분된 내용의 새로운 변수설정.
	 *  ans) dataset01$age_lv[dataset01$age<=30] <- '청년층'
	 *  변경내용확인) ???????? data[c(age, age_lv)]
 *  - 데이터를 보다 효율적으로 활용하기 위하여  순서를 변경하는 내용.
 *  	ex) 성적이 좋은편? 1.아주좋음, 2.좋음, 3.중간, 4.별로, 5.공부와담
 *  	ex) 공부를 싫어햇습니까? 1.극혐 2.시름 3.보통 4.좋음 5.아주좋아함
 *  	>> 역순으로 변경해야할때 , 역코딩을 처리해야함.
 * 
 * 역코딩 처리순서: 
 * 1) 최소치와 최대치 가져오기. min =1 , max = 5
 * 2) 기준값 설정: 최소 + 최대
 * 		stVal <- min+ max
 * 3) 변수에 데이터할당 : 역코딩 기준값 - 원본데이터값. 
 * 	ex) survey <- data$survey;
 * 		csurvey <- stVal - survey;
 * 4) 새로운 변수에 해당 결과 할당.
 * 		data$new_survey <- csurvey
 * 
 * 전처리되 ㄴ데이터 검증을 위한 시각화
 * 명목척도(비연속데이터): 통계에 잇어서 연속적이지않고, 해당내용에 대하 ㄴ부분의 값이 의미있는코드로 지정한 데이터.
 * 		주로 해당내용에 대한 부분의 값이 중요 - survey의 남-1, 여-2, 최소값-1, 최대값-5
 * 		ex) 거주지역별 bar처리 : table()을 활용. 
 * 비율척도(연속적데이터): 데이터의 범위나 연속적으로 나타나서 비율로 데이터를 확인해야할 필요가 있는 데이터. 
 * 		수치가 중요한 데이터, 주로 나이, 키, 몸무게 등.
 * 
 * #####확인예제
 * setwd('c:/Rwork/Part-II/dataset.csv')로딩, dataset01 할당
 * 컬럼명확인 datasetcol01할당
 * pos변수를 호출하고 posData로 저장($)
 * age변수 호출 ageData할당([])
 * 2열 ~5열 벡터형식 로딩 choData할당
 * dataset01의 6행데이터값으로 로딩, 출력
 * dataset01의 3열 데이터값으로 로딩, 출력
 * plot을 이용해 age산점도 확인.
 * 
 * 
 * ######확인예제
 * dataset01의 job 직책을 신규변수로 poslv생성후 신규값 할당.
 * 신규값은 1= 사원, 2=대리, 3=과장, 4=차장, 5=부장
 * **poslv을 사원,대리/ 과장,차장,부장 두집단으로 분리해서 pie로 나타내세요.
 * dataset01$isworker[datset01$position==1|dataset01$position==2] <- '사원,대리'
 * dataset01$ismanager[datset01$position==3|...4|....5] <- '차장, 부장, 과장'
 * 
 * ##### 코딩변경 확인예제
 * gender를 역코딩으로 regender로 새로운변수만들고 처리.-역코딩순서에 맞게 처리.
 * >table(dataset01$gender)
 * dataset02<-subset(dataset01,
 * dataset01$gender==1| dataset01$gender ==2)
 * genMax <- max(datset02$gender)
 * genMin <- min(dataset02$gender)
 * stanGen <- genMax - genMin
 * dataset02$regender<- stanGen - datset02$gender
 * 
 * price기준으로, 극단치(10이상, 0이하),NA제거, 범위따른 다른 가격평가정리 -> priceEval
 * > dataset02$price <- ifelse(dataset02$price >0 & datset02$price<10,
 * na.omit(dataset02$price), 0)
 * ???????
 * 
 * 
 * 시각화 처리 프로세스
 *  명목척도 - 비연속적 데이터
 *   resident2 : 아래코드-- goekdzhemdp akwrp answkdufqusrud
 *   resident : 5시구군, 4.대구, 3.대전, 2.인천, 1서울
 *   gender2: gender기준으로 남, 여 변환
 *   table()통해서 데이터 빈도수체크. 
 *   
 *  ????
 *  ##### 명목척도 예제
 *  job에따른 position분포현황작성
 *  job 1.공무원, 2회사원, 3개인사업
 *  position 1사원 2대리 3과장 4차장 5부장
 *  
 *  파생변수생성
 *  파생변수 :데이터셋에 새로운 변수를 기존에 데이터와 연고나성있는 처리로 만들어짐
 *   	사칙연산자, 테이블의 조인을 통해 추가.
 *  사칙연산자: 변수간의 데이터의 연산처리를 통해서 새로운 변수를 생성, 활용
 *  데이터 조인: 기존 데이터의 key와 연관관계가 있는 다른데이터셋과 조인으로 추가적인 변수생성
 *  ex) 곡객정보user_id로 매칠되어있는 지불정보 pay_data, 반품정보return_data
 * 
 * 
 * 전처리 프로세스 - join.
 * join <- join(user_data, pay_data, by = 'user_id')  
 * ## join<- merge(user_data, pay_data, id = 'user_id')
 * ##### join에는 by를 merge에는 id를 사용한다!!!!
 * 
 * install.packages('dplyr'); library(dplyr);
 * data_all02 <- select ('data_all', 'user_id'....)
 * data_all01 <- group_by(data_all02_group, user_id, sum(price))
 * 
 * 
 * 
 */
}
