package springweb.c01_database.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.z01_dto.Emp;

@Repository
public interface A01_EmpRep {
//	xml�� �ִ� id���� ���� ���� ��Ģ���� mapping
//	id="��Ű����.�������̽���.�޼����
//	id="springweb.c01_database.repository.A01_EmpRep.emplist"
//	�����ϴ� data�ִ� VO : Emp sch
//	parameterType="springweb.z01_dto.Emp"
//	������ ��� ó�� ArrayList<VO>
//	
	public ArrayList<Emp> emplist(Emp sch);
}
