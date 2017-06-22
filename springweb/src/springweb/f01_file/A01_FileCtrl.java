package springweb.f01_file;

import java.io.File; 
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

// springweb.f01_file.A01_FileCtrl.java
@Controller
@RequestMapping("/upload.do")
public class A01_FileCtrl {
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		return "f01_file/a01_uploadForm";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String upload(@RequestParam("report") 
			MultipartFile report){
		System.out.println("������ ������ �̸�:"
				+report.getOriginalFilename());	
		// service �� ó��..
		uploadProc(report);
		
		return "f01_file/a01_uploadForm";
	}
	// <input name="fname" />
	// <input name="report" />
	// �����̸��� �Ѱܿ� ��Ʈ�������� ��ü�� server�� Ư���� ��ġ�� ����
//	@Value("#{props['upload']}")

	
//	classpath:/resource/properties/info01
	@Value("${upload}")
	String path01;
	private void uploadProc( MultipartFile report){
		String name=report.getOriginalFilename();
		
//		path01="C:/a01_prog/eclipse/workspace_server"
//				+ "/springweb/WebContent/z02_upload/";
		// �ش� ��η� ������ �Ҵ�ó��..
		String file01 = path01+name;
		File f1 = new File(file01);
		// io�� exception ó�� �ʿ�
		try {
			report.transferTo(f1);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
