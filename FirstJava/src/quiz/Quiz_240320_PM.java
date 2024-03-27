package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Quiz_240320_PM {

	public static void main(String[] args) {
	
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {4,5,6,7,8,9};
		
//		List list1 = Arrays.asList(arr1);
//		List list2 = Arrays.asList(arr2);
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for(int i=0; i<arr1.length; i++) {
			list1.add(arr1[i]);
			list2.add(arr2[i]);
		}
		System.out.println("ArrayList1 : " +list1);
		System.out.println("ArrayList2 : " +list2);
		
		ArrayList union = new ArrayList(list1);
		for (Object o : list2) {
			if(!union.contains(o)) {
				union.add(o);
			}
		}
		System.out.println("합집합 : " +union);
		
		
		union.addAll(list1);
		union.addAll(list2);
		HashSet result = new HashSet(union);
		
//		List<Integer> arr1 = new ArrayList<>();
//		List<Integer> arr2 = new ArrayList<>();
//		arr1.add(1);
//		arr1.add(2);
//		arr1.add(3);
//		arr1.add(4);
//		arr1.add(5);
//		arr1.add(6);
//		System.out.println(arr1);
//		
//		arr2.add(4);
//		arr2.add(5);
//		arr2.add(6);
//		arr2.add(7);
//		arr2.add(8);
//		arr2.add(9);
//		
//		System.out.println(arr2);
		
//		 [[[2. 로또 번호 생성하기]]]
//		 TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하세요!!!
//		 1. TreeSet을 생성하세요
//		 2. 무한루프를 사용하여 1 ~ 45까지의 난수를 발생시키세요. 
//		 3. 발생한 난수를 추가합니다. 
//		 4. 크기가 6이되면 무한 루프를 빠져 나옵니다.
		
		// 1.
		TreeSet<Integer> lotto = new TreeSet<>();
		// 2.
		Random r = new Random();
		while(true) {
			int rn = r.nextInt(45)+1;
			
			// 3.
			lotto.add(rn);
			
			// 4.
			if (lotto.size() == 6) break;
		}
			System.out.println("로또번호 : " +lotto);
		
		
		
		
		
	}

}
