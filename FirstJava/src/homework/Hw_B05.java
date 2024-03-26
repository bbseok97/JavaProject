package homework;

public class Hw_B05 {

	public static void main(String[] args) {
		// while문
		// for문보다 좀 더 자유도가 높은 반복문
		//	why? for문(for(초기값;조건식;증감값))과 달리 while은 
		//	조건이 참인지 여부만 확인 
		
		/*
		 * 	(형식)
		 * 	while (condition) {
		 * 		조건이 참일 때 실행할 반복문
		 * 	}
		 */
		
		// 증감값의 위치에 따라서 결과에 차이가 존재할 수 있다.
//		int i = 0;		//시작값
//		
//		while(i < 10) {	// 조건
//			i++;		// 증감값
//			System.out.println(i);
//			i++;
//		}
		
		// while의 무한 루프
//		while(true) {
//			System.out.println(i += 10000);
//			if(i % 20000 == 0)
//				continue;
//			if(i < 0)	//반복 종료 시점
//				break;
//		}
		
		// do ~ while 구문 : 거의 안씀
		// 반복할 때에 무조건 한번 이상 실행해야 하는 경우
		
		//Labeled Loop
		// 루프 앞에 이름을 지정 후 ":"를 사용.
		// break문은 가장 가까운 반복문 하나를 벗어날 수 있는데
		// break 루프이름; 을 지정해줌으로써 최상위 반복문을 탈출함.
		
//		Loop1 :
//			for(int i=1; i<=2; i++) {
//				System.out.println("첫 번째 for문");
//				for(int k=1; k<=10; k++) {
//					if(k==3) break Loop1; 	// 레이블이 Loop1인 반복문 종료.
//						System.out.println("두 번째 for문");
//				}
//			}
		
		
		
		
		
		
	}

}
