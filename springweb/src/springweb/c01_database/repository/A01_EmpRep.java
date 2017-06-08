package springweb.c01_database.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.z01_dto.Emp;

@Repository
public interface A01_EmpRep {
//	xml에 있는 id값과 다음 같은 규칙으로 mapping
//	id="패키지명.인터페이스명.메서드명
//	id="springweb.c01_database.repository.A01_EmpRep.emplist"
	public ArrayList<Emp> emplist();
}
