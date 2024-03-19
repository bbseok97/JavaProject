
public class D07_runtimeException {
	public static void main(String[] args) throws Exception {
		// Runtime Exception = UncheckedException...
//		makeException(5);
//		makeException2();
		try {makeException3();
			makeException4();
			makeException5();
//			makeException6();
			makeException7();
		}
		catch (Exception e) {
			System.out.println("예외발생");
		}
		makeException8();
	}

	public static int makeException(int input) {
		int divide = 0;
		int result = input/divide;
		return result;
	}
	
	public static void makeException2() {
		String s = "가";
		System.out.println(s.charAt(1));
	}
	
	public static void makeException3() throws Exception {
		int[] a = {1,2,3};
		System.out.println(a[3]);
	}
	
	public static void makeException4() {
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	
	public static void makeException5() {
		String notInt = "가나다";
		int a = Integer.parseInt(notInt);
	}
	
	public static void makeException6() {
		for (int i=0; i < Integer.MAX_VALUE; i++) {	//MAX_VALUE = 
			makeException6();
		}
	}
	
	public static void makeException7() {	//ArrayStoreException : 배열저장예외.
		Object[] objArr = new String[3];
		objArr[0] = 0;	//선언 자체가 Object로 되어있으므로 컴파일 오류 발생 X
	}
	
	public static void makeException8() {	//ClassCastException
		Object[] objArr = new String[3];
		objArr[0] = "0";
		Integer a = (Integer) objArr[0];	//[]안에 0은 정수가 아님.
	}

}
