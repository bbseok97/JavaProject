package customer.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Customer> cusInfo = new ArrayList<>();
		
		
			while(true) {
				
				System.out.println(" [고객 관리 프로그램] ");
				System.out.println(" 1. 고객 정보 추가");
				System.out.println(" 2. 고객 정보 전체 조회");
				System.out.println(" 3. 특정 고객 조회");
				System.out.println(" 4. 고객 정보 삭제");
				System.out.println(" 5. 고객 정보 수정");
				System.out.println(" 6. 프로그램 종료");
				System.out.println(" 메뉴를 선택하세요 ");
				
				
				int select = scan.nextInt();
				
				switch(select) {
				case 1:
					System.out.print("이름을 입력하세요: ");
					String name = scan.nextLine();
					System.out.print("성별을 입력하세요:");
					String gender = scan.nextLine();
					System.out.print("이메일을 입력하세요: ");
					String email = scan.nextLine();
					System.out.print("생년월일을 입력하세요: ");
					String birthYear = scan.nextLine();
					
					
					
				}
				
				
			}
		
	}
	
}
