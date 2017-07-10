package a01_Intro;

public class Intro0621_spring {
/*
 * 답글처리 프로그램
 * 메인화면
 *  jqury 해당글을 클릭시 상세화면 이동
 * 상세화면 
 * 	Controller -view(jsp) 화면구성
 *  모델데이터  - 단일데이터로딩
 *  	DAO, mybatis.xml, Service연결, COntroller에 모델처리, 화면단에서 호출.
 *  답글메뉴 버튼 클릭시 처리해야할 화면.
 * 		submit로 key값 no전달.
 * 		DB: 단일데이터로딩(service): 제목 => RE: 첨부, 내용  ++이전내용 ++
 * 		답글화면 구현.
 * 답글화면 
 * 	답글화면 로딩
 * 	답글처리 등록
 * 		refno: 원본글의 no입력처리.
 * 		게시글은 seq으로 1,2,3,4... 나오지만 
 * 		no:5의 refno:1라면  ==> 1번게시글의 답글이 5번게시글이된다. 유의: no < refno . 
 * 
 * ///////////////
 * 메인화면 
 * 계층형 sql
 * select * from board
 * where
 * start with refno = 0
 * connect by prior no = refno;
 * 
 * 
 * 
 *  ====================
 *  1. a01_boardList.jsp.
 *  <c:forEach var="board" items="${list}">
				<tr class ="data"><td>${board.no}</td><td>${board.subject}</td>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
	
}
