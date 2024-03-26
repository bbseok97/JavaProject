package homework;

public class Hw_B07 {

	public static void main(String[] args) {
		//	배열
		//	같은 타입의 변수를 한번에 여러 개 선언하는 방법
		
		//	배열의 선언 방법
		// 1. 타입[] 변수명 = new 변수명[배열의 길이];
		// 2. 타입[] 변수명 = {데이터들};
		// 3. 타입[] 변수명 = new 타입명[]{데이터들};
		
		//	배열의 인덱스 : 배열에 저장된 값을 불러올 땐 인덱스 값을 사용.
		//	인덱스 값은 0부터 시작한다.
		
		// 문자열 배열
		// char[] s;		//배열 선언
		// char[5] s2;		// 배열 선언 시 오류([]안에 숫자를 배열의 길이라고 생각하고 사용할 수 없다.
							// 배열 선언 시 크기를 명시하지 못함 !!
		
		// 문자열은 문자의 배열과 비슷하다.
		
		
		/*
		 * 	*** Enchanced For문(향상된 for문) ***
		 * 
		 * 		(형식)
		 * 		for(타입 변수명 : 배열명) {	## 배열명으로 불러오는 배열의 타입은 : 이전의 타입과 같아야 함 
		 *			반복 실행할 명령문 
		 * 			}
		 */
		
		//	배열 선언 시 자동적으로 기본값으로 초기화
		//	정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null
		
		//	배열의 복사
		//	배열의 얕은 복사(shallow copy)와 깊은 복사(deep copy)
		
		//	1. 얕은 복사(Shallow copy)
		//	(원본 배열) 변수에 (붙여넣기 할)변수의 주소값을 대입
		// byeMessage = byeMessage2;	//얕은 복사
		// byeMessage[1] = "hello bye bye";		// byeMessage 인덱스 1번에 값을 대입
		
		//	2. 깊은 복사(Deep copy)
//		System.arraycopy(src, srcPos, dest, destPos, length)
		
		//	scr : 원본 배열의 이름
		//	scrPos : 복사를 시작할 원본의 위치(인덱스 값)
		//	dest : 붙여넣기 할 배열의 이름
		//	destPos : 붙여넣기를 시작할 위치를 설정(인덱스 값)
		//	length	: 복사를 몇 개나 할 것인지 결정 !!!
		
		
		
		
		
		
		
	}

}
