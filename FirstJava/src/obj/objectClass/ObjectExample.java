package obj.objectClass;

import obj.inheritance.Person;

public class ObjectExample {

	public static void main(String[] args) {
		Object obj = new Object();	//최상위 객체
		obj.hashCode();	 // 객체 동등 비교를 위해서	(같은지 확인)
		obj.equals(obj); // 객체 동등 비교를 위해서 보통은 재정의 해서 사용 !!
		obj.toString();	 // 기본적으로 클래스명@hashCode 값으로 출력
						 // 재정의해서 객체 내의 정보를 확인하는 용도로 사용됩니다 !!!
		
		Person p1 = new Person(20, "홍길동");
		Person p2 = new Person("홍길동", 20, 185.0f, 0);
		System.out.println("p1의 해쉬코드: " +p1.hashCode());
		System.out.println("p2의 해쉬코드: " +p2.hashCode());
		System.out.println("p1과 p2의 비교 결과: " +(p1.hashCode() == p2.hashCode()));
		
		
		Person o1 = new Person("홍길동", 20);
		Person oto1 = o1;
		Person o2 = new Person(20, "홍길동");
		System.out.println("o1의 해쉬값 : " + o1.hashCode());
		System.out.println("oto1의 해쉬값 : " + oto1.hashCode());
		System.out.println("o1과 oto1의 비교 결과: " +(o1.hashCode() == oto1.hashCode()));
		// ()값이 같아도 객체가 다르면 해쉬값을 비교할 수 없다.
		
		System.out.println("o1과 o2의 equals 사용 : " + o1.equals(o2));
		
		Person p3 = new Person();
		System.out.println(new String("hello").hashCode());	//obj의 값을 불러와서 비교하는게 아닌
		System.out.println("hello".hashCode());				// 재정의를 통해 비교함.
		// 참조자료형은 ==을 사용하여 비교할 수 없다.
		
		p3.name = "홍길동";
		p3.age = 20;
		System.out.println("hash 값 비교!!!");
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println("p3 객체의 getClass()의 결과 : " + p3.getClass().toString());
		System.out.println("p3와 p2값의 equals()의 결과 : " + p3.equals(p2));
		
		System.out.println();
		
	}
	
	
	
	
}