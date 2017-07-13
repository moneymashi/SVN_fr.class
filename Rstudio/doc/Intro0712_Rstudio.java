package doc;

public class Intro0712_Rstudio {
/*
 * #####7장 연습문제
 * 
 * 1.
 * 본문의 dataset2의 직급변수(컬럼)을 대상으로 1급 -> 5급, 5급 -> 1급 형식으로 역코딩해서 position2에 할당
 * dataset<- read.csv('dataset.csv')
 * dataset2<- subset(dataset, price>=2 & price <=8)
 * reSt<- max(datset2$position, na.rm = T) - min(dataset2$position, na.rm = T)  ### 기준값정리.
 * cpos <- reSt - pos   ## 역순처리
 * dataset2$position <- cpos
 * dataset2$position2[dataset2$position ==1] <- '1급'  
 * ...
 * 
 * 2.
 * NA가 있는 row를 삭제처리.
 * subset(dataset3, !is.na(dataset2$resident))
 * 
 * 2.1 na -> 0 변환.
 * resident0 <-ifelse(!is.na(dataset2$resident), dataset2$resident, 0)
 * dataset4<- dataset2
 * dataset4$resident <- resident0
 * 
 * 
 * 
 * 
 * 5.
 * setwd('c:/Rwork/Part-II')
 * 
 * 따옴표와 행이름제거 : quote = F, row.names = F
 * 
 * 6.
 * 파일가져오기 user_data<- read.csv('user_data', header = T)
 * 파일가져오기 return_data<- read.csv('return_data', header = T)
 * 파생변수 생성.
 * library(reshape2)
 * u_return <- dcast(return_data, user_id~ return_code, length) # 행~열
 * names(u_return) <- c('user_id', 'return_code1','return_code2','return_code3','return_code4')
 * View(u_return)
 * -------------------------------------
 * -------------------------------------
 * 5장 리뷰.
 * 
 * ##### 시각화 확인예제
 * barplot작성
 * barplot(height, width = 1, space = NULL,
        names.arg = NULL, legend.text = NULL, beside = FALSE,
        horiz = FALSE, density = NULL, angle = 45,
        col = NULL, border = par("fg"),
        main = NULL, sub = NULL, xlab = NULL, ylab = NULL,
        xlim = NULL, ylim = NULL, xpd = TRUE, log = "",
        axes = TRUE, axisnames = TRUE,
        cex.axis = par("cex.axis"), cex.names = par("cex.axis"),
        inside = TRUE, plot = TRUE, axis.lty = 0, offset = 0,
        add = FALSE, args.legend = NULL, ...)
 * 세로막대차트
 *  학력별 평균키
 *  초 중 고 대 
 *  135 150 165 168
 *  차트데이터생성 타이틀 범위 색상.
 * > chart_data<- c(135,150,165,168)
	> names(chart_data) <- c('초등', '중등', '고등', '대딩')
 * > barplot(chart_data, ylim = c( 0 , 200 ) ,col = rainbow(4), space = 1, cex.names = 0.9, main = '학년별 평균키')
 * 
 * 추가 1행2열로 barplot이 출력되게 처리
 * 추가 barplot옵션
 * 학력별 소득
 * 누적데이터 표시
 * horiz = F
 * 가로표시
 * horiz = T
 * 범례(legend)표시
 * legend(19,71, c('레이블설명1','레이블설명2','레이블설명3'), cex = 0.8, fill = rainbow(4))
 * 
 * 점차트
 * dotchart(x, labels = NULL, groups = NULL, gdata = NULL,
         cex = par("cex"), pt.cex = cex,
         pch = 21, gpch = 21, bg = par("bg"),
         color = par("fg"), gcolor = par("fg"), lcolor = "gray",
         xlim = range(x[is.finite(x)]),
         main = NULL, xlab = NULL, ylab = NULL, ...)
 * 
 * 파이차트
 * pie(x, labels = names(x), edges = 200, radius = 0.8,
    clockwise = FALSE, init.angle = if(clockwise) 90 else 0,
    density = NULL, angle = 45, col = NULL, border = NULL,
    lty = NULL, main = NULL, ...)
 * 
 * 
 * 히스토그램
 * hist(x, breaks = "Sturges",
     freq = NULL, probability = !freq,
     include.lowest = TRUE, right = TRUE,
     density = NULL, angle = 45, col = NULL, border = NULL,
     main = paste("Histogram of" , xname),
     xlim = range(breaks), ylim = NULL,
     xlab = xname, ylab,
     axes = TRUE, plot = TRUE, labels = FALSE,
     nclass = NULL, warn.unused = TRUE, ...)
 * 
 * 밀도기준선표시
 * lines(density(chart_data), col = 'red' )
 * ### 밀도기준선을 표시할때는 hist의 freq = F를 해줘야 한다.
 * 
 * ---------------------
 * 8장. 고급 시각화.
 * lattice(Lattice Plotting System.)
 * 	다차원 데이터를 사용시, 여러개의 plot동시 생성
 *  높은 밀도의 plot을 효과적으로 그림
 *   - histogram, densityplot, barchart, dotplot, xyplot, equals.count()
 * ggplot
 * 	 
 * ggmap
 * 	
 * -----
 * lattic 메모리로딩
 * mlmRev
 *	영국학교 A레벨(대학시험) 화학점수
 *	score변수: 성별
 *	gcsescore :고등 재학설적 - 중등 수학능력
 *	
 * 
 * hist(~x| 조건변수, dataframe )
 *  x축변수를 대상으로 백분율적용 히스토그램
 *  ex) histogram(~gcsescore, data =Chem97)
 * 
 * 
 * ###기본예제
 * R:
 * install.packages('lattice'); library(lattice)  ## 시각화
 * install.packages('mlmRev'); library(mlmRev) ## 데이터
 * 
 * 백분율단위 히스토그램생성
 * histogram(~gcsescore, data= Chem97)
 * x축의 gcsescore를 대상변수, score 조건변수
 * 
 * ex)
 * histogram(~total| factor(student$grade, "-" , student$part), 
 * data = student, groups = str_c(student$grade, "-" , student$part))
 * 
 * 
 * 밀도그래프
 * densityplot(~x축|조건, dataframe, groups = 변수 , 기타속성 = 속성값)
 * 주요속성: 
 *  plot.points = T ## 밀도 점 표시
 *  auto.key = T ## 범례표시
 * ex) 
 * densityplot(~total| factor(student$grade, "-" , student$part), 
 * data = student, groups = str_c(student$grade, "-" , student$part),
 * plot.point = T, auto.key = T)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
