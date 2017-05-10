/***
	숙제 : 연봉단위별로 인원수를 체크하세요.
	~1000미만
	~2000미만
	~3000미만
	~4000미만
	~5000미만
	~5000미만
***/
SELECT ((FLOOR(SAL/1000))+1)*1000||'미만' 연봉단위, COUNT(*)||'명' 인원 
	FROM EMP 
	GROUP BY FLOOR(SAL/1000) 
	ORDER BY FLOOR(SAL/1000);


-- 확인예제) 보너스가 있는 사원의 이름과 부서명을 출력하세요
SELECT ENAME, DNAME FROM EMP E, DEPT D 
	WHERE E.DEPTNO=D.DEPTNO AND COMM IS NOT NULL;

/***
	과제 : 부서위치별 사원의 수를 아래 형식으로 출력
		(형식) 부서위치, 사원수
***/
SELECT LOC, COUNT(*) FROM EMP E, DEPT D
	WHERE E.DEPTNO=D.DEPTNO
	GROUP BY LOC;


/***
	숙제 : student10 아이디, 이름
		 studentPoint 아이디, 과목, 점수
		 GradeCheck 최저점수lopoint, 최고점수hipoint, 학점등급(A~F)
	   1) 아이디를 조인해서 "이름 과목 점수" 출력
	   2) 점수를 조인해서 "과목 점수 학점"출력
	   3) "이름 과목 학점등급" 출력
***/
CREATE TABLE STUDENT10 (
	ID VARCHAR2(20) PRIMARY KEY,
	NAME VARCHAR2(30)
);
INSERT INTO STUDENT10 VALUES ('a01','홍길동');
INSERT INTO STUDENT10 VALUES ('a02','마길동');
select * from student10;
CREATE TABLE STUDENTPOINT (
	ID VARCHAR2(20) REFERENCES STUDENT10(ID),
	SUBJECT VARCHAR2(30),
	POINT NUMBER(3)
);
INSERT INTO STUDENTPOINT VALUES ('a01','국어', 85);
INSERT INTO STUDENTPOINT VALUES ('a01','수학', 100);
INSERT INTO STUDENTPOINT VALUES ('a02','국어', 75);
INSERT INTO STUDENTPOINT VALUES ('a02','수학', 89);
SELECT * FROM STUDENTPOINT;
CREATE TABLE GRADECHECK (
	LOPOINT NUMBER(3),
	HIPOINT NUMBER(3),
	HAKJUM VARCHAR2(2)
);
INSERT INTO GRADECHECK VALUES (0,59,'F');
INSERT INTO GRADECHECK VALUES (60,69,'D');
INSERT INTO GRADECHECK VALUES (70,79,'C');
INSERT INTO GRADECHECK VALUES (80,89,'B');
INSERT INTO GRADECHECK VALUES (90,100,'A');
SELECT * FROM GRADECHECK;
COMMIT;
-- 1) 아이디를 조인해서 "이름 과목 점수" 출력
SELECT NAME, SUBJECT, POINT FROM STUDENT10 S, STUDENTPOINT P
	WHERE S.ID=P.ID;
-- 2) 점수를 조인해서 "과목 점수 학점"출력
SELECT SUBJECT, POINT, HAKJUM FROM STUDENTPOINT P,  GRADECHECK G 
	WHERE POINT BETWEEN LOPOINT AND HIPOINT;
-- 3) "이름 과목 학점등급" 출력
SELECT NAME, SUBJECT, HAKJUM FROM STUDENT10 S, STUDENTPOINT P,  GRADECHECK G 
	WHERE S.ID=P.ID AND POINT BETWEEN LOPOINT AND HIPOINT;


/***
	숙제)OUTER JOIN, GROUP을 활용하여 부서명별 인원을 확인할려고 한다. 아래의 형식으로 출력하되 
	     인원이 없는 곳은 0으로 표시
		 부서명  인원
***/
SELECT DNAME, COUNT(ENAME) FROM EMP E, DEPT D 
	WHERE E.DEPTNO(+)=D.DEPTNO
	GROUP BY DNAME;



-- 확인예제 ) 보너스가 있는 사원의 이름과 부서명을 출력하세요!!
SELECT ENAME, DNAME FROM EMP E, DEPT D
	WHERE E.DEPTNO=D.DEPTNO AND COMM IS NOT NULL;