package springweb.d01_board.service;

import java.util.ArrayList; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springweb.d01_board.repository.A01_BoardDao;
import springweb.d01_board.vo.Board;
import springweb.d01_board.vo.Board_Sch;

@Service
public class A01_BoardService {
	@Autowired(required=false)
	private A01_BoardDao dao;

	public void insertBoard(Board ins){
		dao.insertBoard(ins);
	}
	public ArrayList<Board> listBoard(Board_Sch sch){
		return dao.listBoard(sch);
	}	
	public Board getBoard(int no){
		return dao.getBoard(no);
	} 
	// ��ȭ�� ȣ���, ��ȸ���� update,
	//  �ϳ��� �����͸� �������� ó��.
	public Board detailBoard(int no){
		// readCount�� update ó��..
		dao.uptBoardCnt(no);
		
		// �ϳ��� �����͸� ������ �κ�
		return getBoard(no);
	}
	
	public Board getReBoard(int no){
		Board reboard = dao.getBoard(no);
		reboard.setRefno(no);
		reboard.setSubject("RE:"+reboard.getSubject());
		reboard.setContent("\n\n\n\n=======\n"
						+reboard.getContent());
		Board reboard=null;
		// �ʱ� ��� ȭ��
		if(no==0){
			reboard = new Board();
		// ��� ��� ȭ��
		}else{
			reboard = dao.getBoard(no);
			// ��ۿ� refno������ �������� no���� �Ҵ��Ͽ�,
			// ����� ��Ͻ�, refno�� ���� �ֵ��� ó��..
			reboard.setRefno(no);
			reboard.setSubject("RE:"+reboard.getSubject());
			reboard.setContent("\n\n\n\n====��������===\n"
							+reboard.getContent());
		}
>>>>>>> .r507
		return reboard;
	} 	
	public Board detailBoard(int no){
		return dao.detailBoard(no);
	}
	
	
}
