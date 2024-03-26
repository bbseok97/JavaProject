package homework;

public class Hw_B02 {

	public static void main(String[] args) {
		// 단순 if구문
		
		// 단순 if(조건문) 명령문
		// if(조건문)
		//	System.out.println(명령문);
		// 형식으로 사용
		
		// 다중 if문일 때
		// if(조건문) {다중 실행문}; 형태로 사용함.
		
		//if ~ else문 : if조건문이 true이면 if에 종속 실행문을 동작
		//	false이면 else에 종속 실행문을 동작
		
		// 다중 if 구문 : if(조건식) ~ else if(조건식) ~ else
//		int score = (int)(Math.random()*100);
//		System.out.println("점수 :" +score);
//		
//		if(score >= 90) {
//			System.out.println("당신은 A학점 입니다.");
//		}else if (score >= 80) {
//			System.out.println("당신은 B학점 입니다.");
//		}else if (score >= 70) {
//			System.out.println("당신은 C학점 입니다.");
//		}else if (score >=60) {
//			System.out.println("당신은 D학점 입니다.");
//		}else {
//			System.out.println("당신은 F학점 입니다.");
//			System.out.println("당신은 재수강 대상자 입니다.");
//		}
		
		//if문 안에 if문이 존재하는 경우 (중복/중첩 if)
		int score = (int)(Math.random()*110);	// 0~109까지
		System.out.println("점수 : "+score);
		
		if(score >= 90) {
			if(score >= 100) {
				System.out.println("잘못 입력된 점수입니다.");
			}else {
				System.out.println("당신은 A학점 입니다.");
		}
			}else if(score >= 80) {
				System.out.println("당신은 B학점 입니다.");
			}else if(score >= 70) {
				System.out.println("당신은 C학점 입니다.");
			}else if(score >= 60) {
				System.out.println("당신은 D학점 입니다.");
			}else {
				System.out.println("당신은 F학점 입니다.");
				System.out.println("당신은 재수강 대상자 입니다.");
			}
		
		// 난수 생성 : 임의 값(Random)
		// 1. Math.random() : 0~1미만의 임의 값을 출력(double타입)
		//	- 사용 시 java.util의 random 클래스를 호출
		//	Random은 각 타입별로 난수를 발생시키는 메소드가 존재함.
		//	난수를 생성하기 위해서 Seed를 지정할 수 있음. Seed값이 동일하면 동일한 값이 발생
		
		//	Random 클래스 메소드
		//	-nextFloat()	: 0.0이상 1.0미만의 float형 난수 발생
		//	-nextBoolean()	: true or false 중 임의 값을 발생
		//	-nextInt()		: int형 타입 이내의 모든 값에서 난수 발생
		//	-nextInt(int)	: 0부터 (생성자)에 들어간 숫자 -1까지 int형 난수 발생
		
		//	Random rand = new Random();
		//	float a = rand.nextFloat();
		//	boolean b = rand.nextBoolean();
		//	int c = rand.nextInt();
		//	int d = rand.nexInt(10);	0~9까지 난수 발생
		
	}

}
