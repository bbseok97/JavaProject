import java.io.IOException;

public class D07_checkedExceptionEx {

	public static void main(String[] args) {
		// checkedException은 예외처리 해야 함. 잘못된 값이 들어와서 예외발생 가능...
		System.out.println("값을 입력받는 프로그램입니다.");
		
		byte[] data = new byte[100];	// 한번에 100byte 처리할 공간을 의미함.
		try {
			System.in.read(data);
		}catch (IOException e) {	//입출력과 관련된 Exception
			e.printStackTrace();
		}
		System.out.print("입력할 문자열은 : ");
		System.out.println(new String(data).trim());
	}
	
}
