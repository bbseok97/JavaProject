package homework;

public class Hw_C01 {

	public static void main(String[] args) {
		// Garbage Collecting
		//	- 객체 생성에 사용하는 new 키워드는 존재하지만, 생성된 메모리에서
		//	키워드는 존재하지 않는다.
		//	-키워드가 존재하지 않는 이유는 JVM(자바 가상 머신)이 알아서 메모리를
		//	관리하기 때문인데 이것을 가비지 컬렉팅이라고 한다.
		//	- 객체가 더 이상 프로그램에서 사용되지 않으면 가비지 컬렉터가
		//	스스로 판단하여 메모리를 해제하여 수거...
		
		
		// 참조형 객체 비교
		// String 문자열 비교
		 String name1 = "Hello";
		 String name2 = "Hello";
		 System.out.println("문자열 객체비교 :"+ (name1 == name2));
		 
		//	new를 이용한 객체 비교
		 String name3 = new String("Hello");
		 String name4 = new String("Hello");
		 System.out.println("new를 이용한 문자열 비교 : " +(name3 ==name4));
		 
		 //	문자열 비교는 .equals 사용
		 System.out.println(name1.equals(name2));
		 System.out.println(name3.equals(name4));
		 

	}

}
