package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Quiz_240322AM2 {

	public static void main(String[] args) {
		File file = new File("D:\\filetest4\\윤동주.txt");
		File dir = new File("D:\\FileTest\\testFile\\temp");
		File dstFile = null;
		
		System.out.println("윤동주.txt는 파일인가요? " +file.isFile());
		System.out.println("dir은 존재하나요? : " +dir.exists());

		FileReader input = null;
		FileWriter output = null;
		
		if(dir.exists()) {
			dstFile = new File(dir.getPath()+"\\"+file.getName());
		}
			
			
			
			
			
		}
	}

