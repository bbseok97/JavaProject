package homework;

public class Hw_B08 {

	public static void main(String[] args) {
		// 다차원 배열
		// 1차원 배열 : 데이터 타입이 int로 구성되어 있는 배열
		int[] numbers = {1,2,3,4,5};
		
		//	배열의 요소는 length -1번 공간(저장공간)까지 존재함.
		
		//	2차원 배열 : 데이터 타입이 int[]로 구성되어 있는 배열
		int[][] array2 = {
				{1,2,3},	//인덱스0
				{4,5,6},	//인덱스1
				{7,8,9},	//인덱스2
				numbers		//1차원 배열
		};
		
		//	3차원 배열 : int[][]을 요소로 가지고 있는 배열
		//	int[][][] array3 = new int[4][][];
		
		
		//	4차원 배열은 int[][][] 요소로 가지고 있는 배열
		//	int[][][][] array4 = {array3, array3, array3, array3};
		
		//	n차원 배열 : 배열의 요소로 (n-1)차원 배열을 가지고 있는 배열
		//	n차원 배열에 대한 모든 요소는 n중복 반복문을 이용하여 탐색할 수 있음.
		
		//	2차원 배열의 요소값을 알아오는 반복문 작성
		for (int i=0; i < array2.length; i++ ) {
			for(int j=0; j < array2[i].length; j++) {
				System.out.println(array2[i][j]+"\t");
			}
			System.out.println();
		}
		
		//	3차원 배열의 요소 값을 알아오는 반복문 작성
//		for (int i=0; i < array3.length; i++) {
//			for(int j=0; j < array3[i].length; j++) {
//				System.out.println("[");
//				for(int k=0; k < array3[i][j].length; k++) {
//					System.out.println(array3[i][j][k]);
//					if(k != array3[i][j].length -1)
//						System.out.println(" ");
//				}
//				System.out.println("]");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
	}

}
