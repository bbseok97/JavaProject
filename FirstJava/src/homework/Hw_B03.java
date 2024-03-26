package homework;

//import java.util.Scanner;

public class Hw_B03 {

	public static void main(String[] args) {
		// switch(수식) ~ case구문

//		switch (변수) {
//		case 값 :	//변수와 값이 일치하면 해당 case 실행문을 작동
//			실행문
//			break; // 조건에 해당하는 실행문을 작동시키고 switch문을 종료
//			default;	// 변수와 값이 불일치하면 default 실행문을 작동
//		}
		
		
		int score = (int)(Math.random()*100);	//0 ~ 99까지
		System.out.println("점수 : " +score);
		
		switch(score / 10) {
		case 9 :
			System.out.println("당신은 A학점 입니다.");
			break;
		case 8 :
			System.out.println("당신은 B학점 입니다.");
			break;
		case 7 :
			System.out.println("당신은 C학점 입니다.");
			break;
		case 6 :
			System.out.println("당신은 D학점 입니다.");
			break;
			default :
				System.out.println("당신은 F학점 입니다.");
				System.out.println("당신은 재수강 대상자 입니다.");
			break;
		}
		
		// switch case문을 사용하여 특정 문자를 입력받는 경우 내용 출력
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
		// system.out.println(str.charAt(0));
		// charAt(int)는 인자 int에 들어가는 문자열 값의 위치에 있는 
		//	char 출력 시작은 0부터...
		
		
	}

}
