package springweb.c01_database.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.z01_dto.Emp;

@Repository
public interface A01_EmpRep {
//	xml�� �ִ� id���� ���� ���� ��Ģ���� mapping
//	id="��Ű����.�������̽���.�޼����
//	id="springweb.c01_database.repository.A01_EmpRep.emplist"
	public ArrayList<Emp> emplist();
}
