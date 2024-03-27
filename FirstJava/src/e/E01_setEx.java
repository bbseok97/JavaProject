package e;
import java.util.HashSet;
import java.util.Set;

public class E01_setEx {

	public static void main(String[] args) {
		// HashSet
		// 해싱 : 하나의 문자열을 보다 빨리 찾을 수 있도록 주소에 직접 접근할 수 있는 
		//			짧은 길이의 값이나 키로 변환하는 것을 말함.
		Set set = new HashSet();
		
		// add() : 추가
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		boolean isAdded = set.add("five");	//add() boolean으로 true/false
		
		System.out.println(set);
		System.out.println(isAdded);
		
		// size()
		System.out.println("set의 크기 : " +set.size());
		
		// remove() : 제거
		set.remove("two");
		System.out.println("remove(\"two\") 실행 후 결과 : " +set);
		
		// clear() : 모두 제거
		set.clear();
		System.out.println("clear()의 결과 : " +set);
		
		// isEmpty() : 비어있는지 여부확인
		if (set.isEmpty()) {
			System.out.println("set is Empty");
		}
		
		
	}

}
