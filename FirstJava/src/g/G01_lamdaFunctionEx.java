package g;

public class G01_lamdaFunctionEx {

	//	람다식 (간결한 코드를 위해서 사용) 
	//	고전적인 방식인 객체지향적인 프로그램 방식이 아닌 함수적 프로그래밍을 위한 기법에 사용
	//	람다는 익명함수를 위한 방식입니다.	람다는 기존 방식보다 자바코드를 간결하게 표현할 수
	//	있다는 장점을 가지고 있습니다.	다만, 처음에는 익숙하지 않아 혼란스러울 수 있음.
	
	//	람다식은 함수적 인터페이스를 자료형으로 사용.
	//	함수적 인터페이스란?	추상 메서드가 한 개만 존재하는 인터페이스를 의미함.
	
	//	람다식의 표현
	//	(타입매개변수) -> { 실행문들... }
	//	매개변수가 없는 경우에는 () -> {}; 식으로 표현이 됩니다.
	//	매개변수가 한개라면 ( )를 생략하여 표현하는 것도 가능합니다.
	
	//	람다식은 함수적 인터페이스를 사용하여 
	//	인터페이스(함수적 인터페이스) 변수 = 람다식;	같은 구조로 처리가 됩니다.
	
	static int sum(int x, int y) {		//	다른 메서드
		return x + y;
}
	
	
	public static void main(String[] args) {
		// 첫 번째 람다식
		InterfaceEx ie = (int x, int y) -> x + y;	// { }는 한 줄이기 때문에 생략.
		System.out.println(ie.sum(10, 20));
		
		// 함수적 인터페이스
		LambdaInterface li = () -> {	//The target type of this expression must be a functional interface
			String str = "메서드 출력";
			System.out.println(str);
		};
		li.print();
		
		// 표준
		LambdaInterface3 li3 = (String name) -> {
			System.out.println("제 이름은 " +name+ " 입니다.");
		};
		//	매개변수 타입을 생략
//		LambdaInterface3 li3 = (name) -> {
//			System.out.println("제 이름은 " +name+ " 입니다.");
//		};
		// ( ) 생략 - 하나의 매개변수일 경우...
//		LambdaInterface3 li3 = name -> {
//			System.out.println("제 이름은 " +name+ " 입니다.");
//		};
		// { }는 하나의 실행문으로 처리될 떄...
//		LambdaInterface3 li3 = name -> System.out.println("제 이름은 " +name +" 입니다.");
//		li3.print("홍길동");
		
		LambdaInterface4 li4 = (x, y) -> {
			return x * y;
		};
		System.out.println("두 수의 곱 : " +li4.cal(3, 2));
		li4 = (x, y) -> x + y;
		System.out.println("두 수의 합 : " +li4.cal(3, 2));
		
		li4 = (x, y) -> {return x/y;};	//{ }를 사용할 경우 return을 써야함
		System.out.println("두 수의 몫 : " +li4.cal(5, 2));
		li4 = (x, y) -> x%y;
		System.out.println("두 수의 나머지 : " +li4.cal(5, 2));
		
		li4 = (x, y) ->	sum(x, y);
		System.out.println("두 수의 합 : " +li4.cal(10, 20));
		
		//	람다식에 사용되는 this
		//	람다식은 내부클래스의 익명객체로 인식하므로 , 내부에 this는 람다 객체 그 자신을 의미함.
		//	즉, 내부 클래스와 같이 람다 표현식 내에서 지역변수 접근 시 지역변수는 상수화 해야 함.
		
		Outer o = new Outer();
		o.method();
		
		
	}

}

@FunctionalInterface
interface LambdaInterface5 {
	void methood();
}

class Outer {
	public int iv = 10;		//멤버변수
	void method() {			
		final int iv = 40;	//지역변수		// 때문에 지역변수를 상수로 변환.
		LambdaInterface5 f5 = () -> {		//내부클래스의 익명객체로 인식
			System.out.println("Outer.this.iv : " +Outer.this.iv);	//멤버변수
			System.out.println("this.iv : " + this.iv);				//멤버변수
			System.out.println("iv : " +iv);						//지역변수
		};
		f5.methood();
	}
}



@FunctionalInterface
interface LambdaInterface4 {
	int cal(int x, int y);
}



@FunctionalInterface
interface LambdaInterface3 {	//매개변수는 있고, 반환타입은 없는 경우...
	void print(String name);
}

interface InterfaceEx{
	public int sum(int x, int y);
}

@FunctionalInterface			//해당 인터페이스가 함수적 인터페이스임을 알림...
interface LambdaInterface {		//메서드는 무조건 한개.
	void print();
//	void print2();	// 오류 발생
}
