

/*
 * 	Usage Modifier final
 * 	의미
 * 	- 일반적으로 final 그 값이 변하지 않음을 의미한다.
 * 	- 변수에 final이 붙으면 그 값은 변경할 수 없어요. 때문에 static하고 같이 사용시 상수로 사용
 * 	- 메서드에 final이 붙으면 그 메서드는 재정의할 수 없어요.	재정의 될 필요가 없는 메서드일 때 사용
 *		개발자가 재정의를 허용하지 않기 위해서 사용합니다.
 * 	- 클래스에 final이 붙으면 그 클래스는 자식 클래스를 가질 수 없어요.
 */

class MyDate {
	int year = 2024;
	int month = 3;
	int day = 15;
	
	public String toString() {
		return "["+year+"-"+month+"-"+day+"]";
	}
	
//	public void doIt(final int a) {
//		a++;	//The final local variable a cannot be assigned.
//	}
//}


//final class Parent {
//	public final void method() {
//		System.out.println("Parent - Method()");
//	
//	}
//}

//class Child extends Parent {	//The type Child cannot subclass the final class Parent (상속 불가)
	
	// 부모가 final로 정의한 메서드는 Override 불가 !!
//	public void method() {	//Cannot override the final method from Parent.
		
//	}
	
	
}

class FinalInit {	//final 초기화자
	final int a;
	
	// final int a = 10;	// 1) 선언과 동시에 초기화
	
	// 2) 인스턴스 초기화자를 사용
//	{
//		a = 10;
//	}
	
//}

// 3) 생성자를 이용
//	FinalInit() {
//		a = 10;
//	}
	
	FinalInit(int a) {
		this.a = a; 	// 초기화자를 이용한 방식이 아니다...
	}
	
	
	
public class C07_finalExample {
	
	static final MyDate date = new MyDate();	//기본형은 상수
	
	public int data = 100;
	
	public static void main(String[] args) {
		
//		date = new MyDate();	//date변수로 새로운 객체 생성X
		
		
		System.out.println(date.toString());
		date.year = 2025;
		System.out.println(date.toString());
		
		//Local variable의 사용
//		new C07_finalExample().doIt("홍길동");
		
	
		System.out.println(new FinalInit(100).a);
	
	
	}
		
	
	
	public void doIt(final String name) {
		final int age = 28;	//내부 클래스에 전달되어야 할 지역변수는 final 꼭 붙여서 사용!!!
		class InnerLocal {	//내부 클래스 중 하나...
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버변수 date : "+date);
				System.out.println("외부 클래스의 파라미터 변수 name : "+name);
				System.out.println("외부 클래스의 지역 변수 age : "+age);
			}
		}
		
		new InnerLocal().innerDoIt();
		
		
	}
	
	

}
}