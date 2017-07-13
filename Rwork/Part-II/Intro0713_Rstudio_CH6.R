library(reshape)
setwd('c:/Rwork/Part-II')
result <- read.csv('reshape.csv', header = T)
result<- rename(result, c('total', 'num1','num2','num3') )
head(result)

wide<- reshape(Indometh, v.names = 'conc', timevar = 'time',idvar = 'Subject', direction = 'wide')
wide

long<- reshape(wide, v.names = 'conc', idvar = 'Subject', varying = 2:12, direction = 'long')
head(long)

melt(smiths, id = c('subject', 'time'), measured = c('age', 'weight', 'height'))
melt(smiths, id = 1:2, na.rm = T)

smithsm<- melt(smiths, id = 1:2)
smithsm
cast(smithsm, subject + time ~ variable)
cast(smithsm, ... ~ variable)

long<- melt(Indometh, id = c('Subject', 'time'))
head(long)
cast(long , ...~ variable, sum)
install.packages("reshape")

#############
library(reshape2)

data<- read.csv('data.csv')
wide<- dcast(data, Customer_ID~ Date, sum)
wide
head(data)

write.csv(wide, 'wide.csv', row.names = F)

wider<- read.csv('wide.csv', header = T)
wider
names(wider)<- c('Customer_ID','day1','day2','day3','day4','day5','day6','day7')
wider
long<- melt(wider, id = 'Customer_ID')
head(long)
colnames(long) <- c('Customer_ID', 'Date', 'Buy')

#3차원 배열형식으로 변경
#형식) acast(dataset, col~ row ~ 측정col)
data("airquality")
str(airquality)
names(airquality) <- toupper(names(airquality)) #변수명 대문자화
head(airquality)
#month와 day를 기준으로 넓은형식 -> 긴형식
air_melt <- melt(airquality, id = c('MONTH', 'DAY'), na.rm = T) head(air_melt)
names(air_melt) <- tolower(names(air_melt))
acast <- acast(air_melt, day~month~ variable) # 3차원 형
acast
class(acast) #array
#month 기준 변수들의 합계계산. margin = T는 마지막에 (all)을 담당.
acast(air_melt, month~variable, sum, margins = T) 


#########연습문제.
#1. mean, sd
library(plyr)
library(dplyr)
data(mtcars)
head(mtcars)
gCyl <- group_by(tbl_df(mtcars), cyl)#dplyr

meanCyl <- summarise(gCyl, meanCyl = mean(gCyl, na.rm = T ))
meanCyl

