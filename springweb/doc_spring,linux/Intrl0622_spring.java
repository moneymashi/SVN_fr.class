package a01_Intro;

public class Intrl0622_spring {
/*
 * 0621con't
 * refno등록처리
 * <input name = "refno" value = "${board.refno}"
 *  // 답글데이터 가져올떄, service getNo() => setRefno()로 할당.
 *  
 * main조회 list화면 계층형 sql만들기. 
 *  BoardMapper.xml   		// <select id = "listBoard"
 *  start with refno = 0   // 계층형 sql최상위.
 *  connect by prior no = refno
 *  
 *  계층형 sql에서 계층형도 지키면서 순위정하는 정렬처리...
 *  order siblings by no desc    // 내림차순.
 * 
 * A01_BoardDAO.java
 * 	public void uptBoardCnt(int no)
 * BoardMapper.xml
 * 	update board 
 * 	set readcount +1
 * 	where no = #{no}
 * A01_BoardCtrl.java
 * 	d.addAttribute("board", service.detailBoard(no));
 * 
 * 메인화면 numbering 처리
 *	글은 조회시, count처리
 *	상세화면에서만 글 고유번호확인.
 * 조회된 글수: @@
 * 처리.. 
 *  sql에서 조회된만큼 numbering처리
 *  	rownum
 *  
 *  BoardMapper.xml
 *  	select rownum cnt, a.* from board a
 *  
 *  Board.java 
 *  	private int cnt;
 *  	+ set, get
 *  a01_boardList.jsp
 *  	<caption style = "text-align:left">
 *  	총: ${list.size()}건
 *  </caption>
 *  66
 *  <tr class = "data" id = "${board.no}">
 *  <td>${board.cnt}</td>
 *  <td style = "text-align: left;">${board.cnt}</td>
 * 	27
 * $(".data").dblclick(function(){
 * 	var no = $(this).attr("id");
 * })
 * 51 검색초기화
 * <input type = "button" id = "initbtn" value = "검색초기화" />
 * 
 * A01_BoardCtrl.java
 * 17 @ModelAttribute("empsch")
 * public Board_Sch Board_Sch(){
 * return new Board_Sch();
 * }
 * 
 * 
 * 
 */
}
