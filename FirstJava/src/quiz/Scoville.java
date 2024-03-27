package quiz;

import java.util.PriorityQueue;

public class Scoville {
	
		
		public static void main(String[] args) {
			int[] scoville = {1, 2, 3, 9, 10, 12};
			int k = 7;
			
			System.out.println("음식을 최소 몇번 섞었을 떄 원하는 맵기가 될까?"
					+ solution(scoville, k));
		}
		
	
		public static int solution(int[] scoville, int k) {
			int answer = 0;		//시도횟수
			PriorityQueue<Integer> que = new PriorityQueue<>();
			for (int i : scoville) {
				que.add(i);
			}
			System.out.println("PriorityQueue 내용 : " +que);
			
			while(true) {
				answer ++;
				int result = que.poll() + (que.poll()*2);
				que.add(result);
				System.out.println(answer + "번쨰 Que의 내용 : "+que);
				// 정해진 맵기 k값을 넘어서는 섞은 음식인 경우, 그 회차를 반환
				if(que.peek() >= k) return answer;
				// k이상으로 만들 수 없는 반환값은 -1
				if(que.size()==1) return -1;
			}
			

		}
			



}
