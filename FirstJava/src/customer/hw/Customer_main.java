package customer.hw;

import java.util.Scanner;

public class Customer_main {

	public static void main(String[] args) {
		
		CustomerManager manager = new CustomerManager();
	      manager.loadFile();   // 데이터를 파일에서 읽어옴
	      
	      Scanner scan = new Scanner(System.in);
	      
	      while(true) {
	         
	         System.out.println(" [고객 관리 프로그램] ");
	         System.out.println(" 1. 고객 정보 추가");
	         System.out.println(" 2. 고객 정보 수정");
	         System.out.println(" 3. 고객 정보 삭제");
	         System.out.println(" 4. 고객 정보 전체 조회");
	         System.out.println(" 5. 특정 고객 조회");
	         System.out.println(" 6. 프로그램 종료");
	         System.out.println(" 메뉴를 선택하세요 ");
	         
	         
	         int select = scan.nextInt();
	         
	         switch(select) {
	         case 1:
	            System.out.print("이름을 입력하세요: ");
	            String name = scan.nextLine();
	            System.out.print("성별을 입력하세요:");
	            char gender = scan.nextLine().charAt(0);
	            System.out.print("이메일을 입력하세요: ");
	            String email = scan.nextLine();
	            System.out.print("생년월일을 입력하세요: ");
	            int birthYear = scan.nextInt();
	            
	            scan.nextLine();   //버퍼 비우기
	            
	            manager.addCustomer(new Customer(name, email, gender, select));
	            manager.saveFile();
	            break;
	            
	         case 2:
	            System.out.print("수정하실 고객님의 이름을 입력하세요:");
	            String updateName = scan.nextLine();
	            Customer updateInfo = manager.searchInfo(updateName);
	            
	            if(updateInfo != null) {
	            	System.out.println("새 성별을 입력하세요(남자:M, 여자:F): ");
	            	char newGender = scan.nextLine().charAt(0);
	               System.out.print("새 이메일을 입력하세요: ");
	               String newEmail = scan.nextLine();
	               System.out.println("새 출생년도를 입력하세요: ");
	               int newBirth = scan.nextInt();
	               
	               Customer update = new Customer(updateName, newEmail,newGender,newBirth);
	               
	            }
	         }
	         
	         
	      }

	}

}
