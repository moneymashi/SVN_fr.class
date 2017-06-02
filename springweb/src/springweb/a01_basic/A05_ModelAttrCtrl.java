package springweb.a01_basic;

import java.util.ArrayList; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.z01_database.A01_EmpDB;
import springweb.z01_dto.Code;
import springweb.z01_dto.Emp;
import springweb.z01_dto.Product;

// springweb.a01_basic.A05_ModelAttrCtrl
@Controller
public class A05_ModelAttrCtrl {
	
	@ModelAttribute("deptList")
	public ArrayList<Code> deptList(){
		ArrayList<Code> list = new ArrayList<Code>();
		list.add(new Code("10","�λ�"));
		list.add(new Code("20","�繫"));
		list.add(new Code("30","it�����"));
		list.add(new Code("40","�ѹ�"));
		return list;
	}
	

//	ȭ��� ȣ��..
//	http://localhost:6080/springweb/buyProduct.do
	@RequestMapping("/buyProduct.do")
	public String buyProduct(@ModelAttribute("prodmd")Product prod){
		
		prod.setTot(prod.getTot()+(prod.getPrice()*prod.getCnt()));
		
		return "a01_basic/a21_buyProduct.jsp";
	}
//	ȭ��� ȣ��
//	http://localhost:6080/springweb/emplist.do
	@RequestMapping("/emplist.do")
	public String empList(@ModelAttribute("sch") Emp sch, Model d){
		if(sch.getEname()!=null){
			d.addAttribute("list", new A01_EmpDB().searchPre(sch));
		}
		
		
		return "a01_basic/a22_empList.jsp";
	}
	
}


