package javaexp.a13_stream;

import java.io.File;
import java.io.IOException;

public class A10_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File객체 생성
//		1) 파일생성:생성자에 경로명과 파일명 입력
		String dir="C:/a01_prog/eclipse/workspace_server/javaexp/src/javaexp/a13_stream/test/";
		String fileName="a03_file.txt";
		
		File file01 = new File(dir+fileName);
//		파일이 존재하는지 여부 check : .exists()
		System.out.println("파일 존재여부:"+file01.exists());
		if(!file01.exists()){
			// 파일 생성 메서드 : .createNewFile()
			// 새로운 파일 생성(IO) 예외처리
			try {
				file01.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		2) 디렉토리생성:생성자에 경로명 입력
		
	}

}
