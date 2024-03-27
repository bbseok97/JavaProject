package d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class D08_autoResourceManagerEx {

	public static void main(String[] args) {
		// 파일 입출력... (IO작업)
		// 자동으로 자원을 릴리즈... (자원관리)
		try (FileInputStream in = new FileInputStream("C:\\JavaProject\\FirstJava\\src\\a.txt")){
			System.out.println("read data : " +in.read());
		} catch (NullPointerException | IOException ex) {	//FileNotFoundException
//			System.out.println(in);// in 변수 참조 X
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}
		
		// 직접 자원에 대해서 제어
		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("C:\\JavaProject\\FirstJava\\src\\a.txt");
			System.out.println("read data : " +in2.read());
		} catch (NullPointerException ex) {
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		} catch (IOException ie) {
			System.out.println(in2);
			System.out.println("예외 처리합니다.");
			System.out.println(ie.toString());
		}finally {	//파일에 입출력시 try 바깥 쪽 데이터를 사용할 경우 close 해야 함.
			try {in2.close();} catch (IOException ie) {}
		}
		
		
	}

}
