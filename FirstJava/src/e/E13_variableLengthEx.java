package e;

public class E13_variableLengthEx {

	public static void main(String[] args) {
		// 가변인자 : 인자의 개수를 미리 정해 놓지 않고, 여러 개의 인자를 받을 수 있게 만든 것...
		log("Hello");
		log("VarialbeLengthExample", "Test");
		log("A", "B", "C");
		log();
		
		
	}

	public static void log(String...msg) {	// 가변인자 설정...
		System.out.print("로그 : ");
		for(String message : msg) {
			System.out.print(message + ", ");
		}
		System.out.println();
	}
	
	
	
}
