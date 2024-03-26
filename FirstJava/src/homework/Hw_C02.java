package homework;

import obj.Pen;

public class Hw_C02 {

	// 객체 지향 프로그래밍(OOP : Object Oriented Programing)
	
		//	객체(Object) : 세상에 존재하는 모든 것들(사물, 추상적인 것 등등)
		//	- 세상에 존재하는 모든 것은 변수와 메소드로 표현할 수 있다.
		//	- 메소드는 객체의 행동 및 기능을 나타내고,
		//		변수는 상태(설정값)을 나타낸다.
		//	- 클래스는 참조형 변수 타입이다.
			
		//	JAVA 클래스의 규칙들
		//	- public class는 파일 이름과 같아야 합니다.
		//	- public class는 한 파일에 한 개만 존재할 수 있다.
		//	- 같은 패키지 내에서는 같은 이름의 클래스는 사용할 수 없다.
		//	- 다른 패키지에서 import 할 떄는 public class만 접근할 수 있다.
		//	- public class는 파일의 이름이기 때문에 그 소스 파일 전체의
		//		주제를 알 수 있는 이름으로 짓는 것이 좋다.
		//	- 클래스의 이름은 대문자로 시작하는 것이 좋다.
	
	public static void main(String[] args) {
		
		// 인스턴스 객체 생성
		
		// 객체 생성 명렁어
		//	ClassName instanceName = new Constructor();
		//	이때 생성자명은 클래스 이름과 같아야 한다.
		//	생성자의 역할은 멤버변수(속성) 초기화 혹은 클래스 구동을 위한
		//	사전동작을 구현.
		
		Pen redPen = new Pen();
		redPen.color = "red";
		System.out.println(redPen);
		System.out.println(redPen.color);
		//	쓰기
		redPen.write();
		
		//클래스를 사용하는 이유
		//	- 대량으로 코드를 반복적으로 사용하는 경우 사전에 틀을 만들어
		//		사용하기 위함.
		//	- 코드를 최소화하여 작업할 수 있음(코드의 재사용)
		
		//	기본 생성자를 통한 instance 객체 생성
		Pen pen1 = new Pen();
		pen1.color = "black";
		System.out.println(pen1);
		System.out.println(pen1.color);
		
		//	멤버 초기화 생성자를 통한 instance 객체 생성
		Pen pen2 = new Pen("blue");
		System.out.println(pen2);
		System.out.println("펜의 색상은 : " +pen2.color);
		
		Pen pen3 = new Pen("white");
		System.out.println(pen3);
		System.out.println("펜의 색상은 : " +pen3.color);
		
		//	멤버 초기화 생성자를 통한 instance 객체 - 색상, 가격
		Pen pen4 = new Pen("viollet", 1500);
		System.out.println(pen4);
		System.out.println("펜의 색상은 : " +pen4.color);
		System.out.println("펜의 가격은 : " +pen4.getPrice());
		
		
		
	}

}
