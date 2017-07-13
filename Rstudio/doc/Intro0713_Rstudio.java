package doc;

public class Intro0713_Rstudio {
/*
 * tplot<- plot(y~x, data = dataset)
 * tplot<- update(tplot, main = 'something new title' )
 * tplot
 * 
 * 
 * quakes를 기준으로 mag, stations 를 x,y로 xyplot처리하며 조건으로 depthzone을 4구간으로 나눈다. 레이아웃은 2,2로 설정
 * z <- function(zoneN){
   quakes$depth >= min(quakes$depth)+ zone*(zoneN-1) &quakes$depth < min(quakes$depth)+zone*zoneN
   }
   > quakes$depthzone01[z(1)]<-'z1'
   > quakes$depthzone01[z(2)]<-'z2'
   > quakes$depthzone01[z(3)]<-'z3'
   > quakes$depthzone01[z(4)]<-'z4'
 * xyplot(stations~mag|depthzone01, data = quakes, pch = '*', col = 'green', layout = c(2,2))
 * 
 * 
 * 함수 z대신... zN<- equal.count(quakes$depth, number =4, overlap = 0) 하고 |zN 조건설정해주면됨..
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
