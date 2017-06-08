package springweb.c01_database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.c01_database.service.A01_EmpService;

@Controller
public class A01_EmpCtrl {
//	
	@Autowired(required=false)
	private A01_EmpService service;	
	@RequestMapping("/emplist_my.do")
	public String empList(Model d){
		
		d.addAttribute("emplist", service.empList());
		
		return "c01_database/a01_empList";
	}
}
