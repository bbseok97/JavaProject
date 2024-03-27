package g;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

import obj.inheritance.goodcase.Student;

public class G04_functionEx {

	/*
	 * 	Function 인터페이스는	매개변수와 리턴값이 모두 있는 추상 메서드 apply를 가지고 있음.
	 * 	Function 인터페이스는 주로 매개변수로 받은 값을 리턴값으로 매핑하여 사용.	(타입을 바꿔준다)
	 * 
	 * 		인터페이스						메서드
	 * 	 Function<T, R>					R apply(T t)
	 * 	BiFunction<T, U, R>				R apply(T t, U u)
	 * 	xxxFunction<R>					R apply(xxx x)
	 * 	xxxToyyyFunction				yyy applyAs(yyy)(xxx x)		ex) double apllyAs(double)(int x)
	 * 	ToxxxBiFunction(T, U)			xxx applyAs xxx(T t, U u)
	 * 	ToxxxFunction<T>				xxx applyAs xxx(T t)
	 * 
	 * 	To 앞에 오는 건 매개변수, To 뒤에 오는 건 반환타입
	 */
	
	static Student[] List = {
		new Student("홍길동", 20, "2403251", "컴공"),
		new Student("이순신", 28, "2403252", "통계")
	};
	
	
	public static void main(String[] args) {
		
		System.out.print("학생명 : ");
		printString(t -> t.getName());
		System.out.print("전공 :");
		printString(t -> t.getMajor());
		System.out.print("나이 : ");
		printInt(t -> t.age);
		System.out.print("나이 합계 : ");
		printTot(t ->t.age);
		System.out.print("나이 평균 : ");
		printAvg(t -> t.age);
		printAvg();
	}
	
	static void printAvg() {
		ToDoubleFunction<Student> f = t -> t.age;
		double sum = 0;
		for(Student s : List) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum / List.length);
	}
	
	
	
	static void printAvg(ToDoubleFunction<Student>f) {
		double sum = 0;
		for(Student s : List) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum / List.length);
	}
	
	
	static void printTot(ToIntFunction<Student>f) {	//Student 매개변수를 Int타입으로 
		int sum = 0;
		for(Student s : List) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	
	// Function<Student, Integer> f = t -> t.age;		t(
	static void printInt(Function<Student, Integer>f) {
		for(Student s : List) {
			System.out.printf(f.apply(s)+" ");
		}
	}
	
	static void printString(Function<Student, String>f) {
		for(Student s : List) {
			System.out.printf(f.apply(s)+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
}
