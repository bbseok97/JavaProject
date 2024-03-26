package homework;

public class Hw_C03 {

		static int getInteger() {
			final int seed = 5;
			double result = 1;
			
			for(int i=1; i<seed; i++) {	
				result = seed * result;
			}
			// 반환값
			return(int)result;
		}
	
	
	
	
	
	public static void main(String[] args) {
		//	메서드(method)
		//	클래스의 행동 및 기능을 나타낸다. 다른 언어에서는 함수(function)이라고도 불린다.
		//	JAVA에서는 클래스 내부에만 정의할 수 있기 때문에 
		//	메서드라는 용어를 사용한다.
		
		//	메서드 특징
		//	- 어떤 단어 뒤에 ()가 붙는 경우 메서드
		//	- 한번 만들어 두면 여러 번 사용할 수 있음.
		//	- 여러 기능들을 묶어서 이름을 붙여 놓은 것이 메서드
		//	- 값을 반환할 수 있음.
		
		//	메서드 형식
		//	(접근제한자) (static) 반환타입 메서드명(매개변수타입 매개변수이름) {
		//	{ } 안에서 여러가지 기능을 구현
		//			}
		
		//	반환타입 : 메서드가 모든 기능을 수행한 후에 전달할 반환 값의 타입을 지정
		//			반환할 때 사용하는 키워드는 return.	ex) return 10; (반환값)
		//	- 반환 타입 종류 : int, String, Student, char, float, double, boolean 등...
		//	- void 타입을 지정한 경우 함수의 반환값이 없음... 즉, return으로 변환할 값이 없음을 의미
		//	메서드명 : 메서드를 호출할 때 사용할 이름
		//	매개변수 : 함수를 호출하면서 ()안에 전달해 주는 값을 의미함
		//	매개변수타입 : 매개변수의 타입을 지정
		
		
		//	메서드 정리
		
		//	메서드의 반환 설정은 키워드 'return'을 사용합니다.
		//	return은 메서드 실행을 끝내고, 결과 값을 호출될 부분에 반환하는 키워드
		//	사용법은 return '반환값' 으로 사용하고, 반환 값이 없이 사용되는
		//		returnd은 함수의 종료만을 의미하게 되어 호출된 위치로 이동하게 됨.
		//	만약 return에 연산식을 사용하여 처리하는 그 결과
		//	값과 제어(호출위치로 이동)가 함께 동작함. 
		
		//	메서드 형식(선언 방법)
		// <반환 유형> <메서드 식별자-이름>(매개변수) {
		//		기능 상세부분...
		//		}
		
		
		//	메서드 구분, 매개변수와 반환값으로 구분
		//	- 유형1 : 매개변수 O,	반환값 O		전달인자(O), 반환값(O)
		//	- 유형2 : 매개변수 O,	반환값 X		전달인자(O), 반환값(X)
		//	- 유형3 : 매개변수 X,	반환값 O		전달인자(X), 반환값(O)
		//	- 유형4 : 매개변수 X,	반환값 X		전달인자(X), 반환값(X)
		
		//	**매개변수(parameter)
		//	- 매개변수는 메서드가 실행될 때에 필요한 데이터를 외부로부터 받기 위해 사용.
		//	- 매개변수도 변수의 일종으로 데이터 타입과 함께 선언해서 사용해야 함.
		//		단, 초기화는 하지 않음.
		//	- 매개변수를 여러 개 선언할 수 있고, 메서드가 외부로부터 받을 데이터가
		//		없다면 선언하지 않아도 됨.
		//	- 매개변수가 없다면 반환 유형 처리 void는 사용하지 않고, 소괄호 안을 비워둠.
		
		//	** 반환 유형(return type)
		//	- 반환 유형은 메서드가 실행한 후에 메서드를 호출한 곳에서 반환하는 값을
		//		전달하는 데이터...
		//	- 메서드는 반환값이 있을 수 있고, 없을 수도 있는데 없는 경우에는 반환
		//		유형에 'void'를 사용함.
		//	- 반환값이 있는 메서드를 호출할 때는 해당 반환 유형에 맞는 변수에
		//		반환값을 저장해야 함.
		//	- 메서드 실행에 결과값을 반환할 때는 return 키워드를 사용.
		
		
	}

}
