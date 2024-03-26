package homework;

public class Hw_B04 {

	public static void main(String[] args) {
		// 반복문(Loop) : for, while, do~while
		
		//	for문 : 횟차가 정해진 경우에 사용을 많이 한다.
		// for(초기값; 조건식; 증감값) { 형태로 사용
		//		조건이 참인 경우에 반복할 문장들
		// 		}
		
		
		//기본
		// 초기값은 for문에 사용할 변수의 초기값을 의미함.
//		for(int i=0; i < 10; i++) {
//			System.out.println("Hello, World");
//		}
//		System.out.println();
		
		// 초기값과 증감값의 위치는 변경이 가능하지만, 보기가 좋지 않다.
		// int i =0;	초기값
		// for(; i < 10;) {
			// 반복구문 내에서 증감값이 존재해야 함	
//			System.out.println("i의 값 : "+i);
//			i++;
//			}
		
		//다중 for문
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print("안녕하세요\t");
//			}
//			System.out.println();
//		}
		
		// for문의 무한 루프
//		for(int i=0; ture; i++) {	//condition 부분이 항상 참이되는 경우
//			System.out.println(i);
//		}
		
		
//		for(;;) {
//			System.out.println('a');
//		}
		// 이런 무한 루프문은 항상 빠져나올 코드를 만들어 놓아야 한다.
		
		//break문
		// 반복문에서 사용할 수 있다.
		// 반복문에서 break를 만나면 반복문을 종료 후 탈출
		// 다중 반복문 내부에 속해 있더라도 break를 만나면 해당 break가 포함된
		//	반복문 하나는 탈출 !
		
		// continue
		// 반복문 내부에서만 사용이 가능하다.
		// 반복문에서 continue를 만나면 아래 내용을 실행하지 않고, 
		//	다음 반복 회차로 이동
		
	}

}
