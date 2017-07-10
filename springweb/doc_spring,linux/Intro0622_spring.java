package a01_Intro;

public class Intro0622_spring {
/*
 * 첨부파일등록
 * 사용자 처리 프로세스
 *  - 게시판 등록화면에서 여러 첨부파일등록
 * 프로그램 처리 프로세스
 *  DB설계    게시판main  - 첨부파일 테이블 생성(key(PK), no(FK), fileName, etc, regDate);
 * 게시판 등록화면 처리
 * <form 속성 enctype = "multipart/form-data" >
 *  <input type ="text" name ="name" />
 *  
 * spring 첨부파일 필요부분.
 * 	파일을 업로드하는 viewResolve setting이 필요.
 *  - dispatcher-servlet.xml에 파일다운로드 , 업로드 모듈설정
 *  	파일업로드 모듈
 *  	<bean id = "" class = "org.springframework.web.multipart.commons.CommonMultipartResolver" />
 * 		파일다운로드 모듈.
 * 		사용자정의 클래스선언
 * 		<bean id = "bnViewResolver" class = "springweb.z01_util.Z03_DownloadViewResolver" >
 * 			<property name = "order" value = "0" />   // 최우선 viewresolver...  
 * 첨부파일 처리시 Ctrl/server
 *  Controller에서 Param
 *  	<input name = "id" />
 *  	<input type = "file" name = "report" />
 *    //////////////commons-fileupload-1.2.jar를 lib에 처리해줘야함.
 *  
 *  controller
 *  	list(@RequestParam("id") String id, Model d)
 * 		list(@RequestParam("report") MultipartFile report )
 * 	MultipartFile을 물리적 저장, DB저장
 * 		getOriginalFilename(): 업로드 파일명
 * 		transferTo("저장할 경로 파일객체")
 * 		FileInputStream, FileOutStream을 을 통해 
 * 		 네ㅇ트워크로 전달받은 파일을 서버에 특정한 위치로 지정.
 * 		Db에 getOriginalFilename()로 DB insert..
 * 
 * 
 * 
 * 
 */
}
