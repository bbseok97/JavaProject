package C;
import java.util.Scanner;

import customermanager.oop.Customer;

public class C00_CustomerManager {
	
	
	//고객 정보를 저장할 수 있는 배열 지정... 
	
	static final int MAX = 100;   // final 한번 입력된 값은 변경X
	
	// 고객 정보를 저장할 변수를 배열로 선언 : 이름, 성별, 이메일, 출생년도
	static String[] nameList = new String[MAX]; 	//이름 저장
	static String[] genderList = new String[MAX];	//성별 저장
	static String[] emailList = new String[MAX]; 	//이메일 저장
	static int[] birthYearList = new int[MAX];		//출생년도 저장
	
	// 배열을 참조하기 위해서 인덱스가 필요함... 
//	static int index = -1; // 배열의 인덱스 시작은 0부터, 때문에 최소 인덱스는 -1이되어야 함. 
	
	// 배열의 처음 선언한 크기보다 같거나 작은 개수의 자료를 저장
	// 때문에 현재 데이터가 몇개 저장되어 있는지 알 수 있는 변수가 필요... 
	static int count; // 저장 개수
	
	// 기본 입력장치로부터 데이터를 입력 받기 위해서 Scanner 객체 생성
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		// 고객 관리 프로그램 메뉴
		while(true) {
			// 고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객 수 : %d\n",  count);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (S)elect, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase();  // 대소문자 구분X 
			// 메뉴 선택시 동작을 구현... 
			switch(menu.charAt(0)) {
			case 'ㅑ':
			case 'i':  // insert
				System.out.println("고객 정보 입력을 시작합니다.");
				if (count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다. ");
				}else {
					//저장을 위한 메서드... 
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;

			case 'ㄴ':
			case 's':
				System.out.println("현재 데이터를 출력합니다.");
				if(count > 0) {
					printCustomerData(seLectCustomerDate());
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅕ':
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if(count > 0) {
					updateCustomerData(u)
				}
				break;
			case 'ㅇ':
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if (count > 0) {
					deLeteCustomerData(selctCustomerData())
				}
				break;
			case 'ㅂ':
			case 'q':  //종료
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0); //프로세스 종료
				break;
			default :
				System.out.println("메뉴를 잘 못 입력했습니다. 다시 선택해 주세요");
			}
		}

	}


	private static Customer seLectCustomerDate() {
		// TODO Auto-generated method stub
		return null;
	}


	public static void insertCustomerData() {
		// 이름, 성별, 이메일, 출생년도 입력
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별 : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		// 고객 객체를 배열에 저장
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count ++;   //count번째 배열에 객체 저장 후에 count값 증가... 	
		
	}
	
	public static Customer selctCustomerData() {
		while(true) {
			System.out.println("출력, 수정 또는 삭제할 사람의 이름을 입력하세요.");
			String name = scan.next();
			for (int i=0; i <count; i++) {
				if(cusList[i].getName().equals(name)) {
					return cusList[i]
				}
			}
		}
		
	}
	
	public static void printCustomerData(Customer cus) {
		System.out.println("==========CUSTOMER INFO==========");
		System.out.println("이름 : "+cus.getName());
		System.out.println("성별 : "+cus.getGender());
		System.out.println("이메일 : "+cus.getEmail());
		System.out.println("출생년도 : "+cus.getBirthYear());
		System.out.println("=================================");
	}
	
	public static void updateCustomerData(Customer cus) {
		System.out.println("-------UPDATE CUSTOMER INFO-------");
		System.out.print("이름("+getName+") :");
		String name = scan.nextLine();
		if(name.length() != 0) {  // 검증... 
			nameList[index] = name;
		}
		System.out.print("성별("+genderList[index]+") : ");
		genderList[index] = scan.next();
		System.out.print("이메일("+emailList[index]+") : ");
		emailList[index] = scan.next();
		System.out.print("출생년도("+birthYearList[index]+") : ");
		birthYearList[index] = scan.nextInt();
	}
	
	public static void deleteCustomerData(Customer cus) {
		for (int i = 0; i < count - 1; i++) {
			if(cusList[i].getName().equals(cus.getName())) {
				for(int j=i; j < count; j++) {
					cusList[j] = cusList[j+1];
				}
			}
		}
		count --;
	}
	

}
