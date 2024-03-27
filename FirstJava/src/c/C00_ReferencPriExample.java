package c;

public class C00_ReferencPriExample {

	public static void main(String[] args) {
		// 참조형 객체 비교...
		
		// String 문장열 비교...
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("str1과 str2의 비교 결과 : " + (str1 == str2));	//문자열은 값이 같다면 해쉬 값이 일치함.
		
		// new를 이용한 객체 비교...
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println("str3과 str4의 비교 결과 : " + (str3 == str4));
		
		// 문자열 비교는 .equals()의 사용
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));

	}

}
