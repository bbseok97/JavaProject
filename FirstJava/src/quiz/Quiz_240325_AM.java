package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import util1.Closer;


	class phoneBook{
		// HashMap을 이용해 전화번호부를 구현해보세요   
		// 1. '그룹/전화번호/이름'을 저장해야 한다
		// 2. 그룹을 키값으로 넣으면 그 그룹에 해당하는 HashMap이 선택된다
		// 3. 그룹의 HashMap에 전화번호를 키값으로 넣으면 이름이 나온다
		HashMap<String, HashMap<String, String>> phoneBook;
		
		File saveFile = null;
		String savePath = "saveFile\\phoneBook.sav";
			
		public phoneBook() {
			// 객체 생성 시 파일에 저장된 내용을 불러오는 동작!
			// 파일이 존재하면 내용을 불러오고,
			// 존재하지 않다면 파일 및 디렉터리 생성
			phoneBook = new HashMap<>();
			saveFile = new File(savePath);		//파일 객체 생성 - 저장 파일에 대한 작업
			if(!saveFile.exists()) {
				File dir = new File(saveFile.getParent());
				dir.mkdirs();
			}
			load();		//객체 실행 시 파일의 정보를 불러와서 완성 !
		}
		
		// ### 메서드 ###
		// 1. phoneBook에 새로운 그룹을 추가하는 메서드
		public void addGroup(String groupName) {
			if(!phoneBook.containsKey(groupName)) {
				phoneBook.put(groupName, new HashMap<String, String>());
			}
		}
		
		// 2. phoneBook의 모든 목록을 한번에 출력해주는 메서드
		public void printAll() {
			Set<String> groupNames = phoneBook.keySet();	// 그룹이름 불러오기
			
			for(String groupName : groupNames) {
				System.out.println("* * * * * " + groupName + " * * * * *");
				
				//전화번호, 이름 (k, value)
				HashMap<String, String> numberAndNames = phoneBook.get(groupName);
				if(numberAndNames.size() == 0) {
					System.out.println("비어 있음");
				}else {
					for(String number : numberAndNames.keySet()) {
						System.out.printf("%s : %s\n", numberAndNames.get(number), number);
					}
				}
			}
		}
		
		// 3. 이미 존재하는 그룹에 전화번호를 추가하는 메서드 (그룹이 없으면 추가 못함)
		public AddPhMessage addPhoneNo(String groupName, String number, String name ) {
			if(!phoneBook.containsKey(groupName)) {
				return new AddPhMessage("없는 그룹입니다.", AddPhMessage.NOT_EXISTING_GROUP);	//어떤 상황인지를 출력
			}else {
				HashMap<String, String> numberAndNames = phoneBook.get(groupName);
				
				if(checkDupleNumber(number)) {
					return new AddPhMessage("이미 등록된 번호입니다. 수정하겠습니까?", 
												AddPhMessage.EXISTING_NUMBER);
				}
				
				numberAndNames.put(number, name);
				return new AddPhMessage("정상적으로 입력되었습니다.", AddPhMessage.ADD_SUCCESS);
				
			}
		}
		
		//모든 전화번호를 HashSet으로 반환하는 메서드
		private Set<String> getAllnumber() {
			HashSet<String> allNumbers = new HashSet<>();
			
			for(HashMap<String, String> group : phoneBook.values()) {
				allNumbers.addAll(group.keySet());	//Set 타입으로 모두 추가
			}
			return allNumbers;
		}
		
		// 전화번호 중복 체크 메서드
		private boolean checkDupleNumber(String number) {
			return getAllnumber().contains(number);		//boolean 타입으로 결과값 반환
		}
		
		// 4. 전화번호의 일부를 입력하면 입력한 부분과 일치하는 모든 사람의 목록을 출력하는 메서드
		public void searchByNumber(String number) {
			System.out.println("* * * * * " + number + " * * * * *");
			for(HashMap<String, String> group : phoneBook.values()) {	//HashMap 괄호의 값은 전화번호와 이름.
				for(String key : group.keySet()) {
					if(key.contains(number)) {
						System.out.printf("%s : %s\n", group.get(key),key);		//전화번호의 일부가 일치하면 모두 불러옴.
					}
				}
			}
		}

		// 5. 이름을 입력하면 해당하는 사람의 전화번호를 모두 출력하는 메서드 
		//		(동명이인이 있는 경우 여러개 출력되야함)
		public void searchByName(String inputName) {
			System.out.println("* * * * * " + inputName + " * * * * *");
			for(HashMap<String, String> group : phoneBook.values()) {
				for(Entry<String, String> entry : group.entrySet()) {	//key값과 value값이 한 쌍이므로 entrySet을 사용.
					String number = entry.getKey();
					String name = entry.getValue();	//이름을 value값으로 확인 후
					if(name.contains(inputName)) {
						System.out.printf("%s : %s\n", name, number);	//이름과 전화번호를 반환
					}
				}
			}
		}
		
		// ※ 변경된 내용이 파일에 저장되어 프로그램을 다시 실행할때도 유지되도록 만들어보세요
		public void save() {	//저장
			FileWriter out = null;
			
			try {
				out = new FileWriter(saveFile);
				//전화번호부의 내용을 나름의 문자열로 구성해서 저장 !!
				for(String groupName : phoneBook.keySet()) {
					out.write(groupName+":");
					for(Entry<String, String> e : phoneBook.get(groupName).entrySet()) {
						out.write(String.format("%s=%s ", e.getKey(), e.getValue()));
						// groupName:number=name 형식으로 저장이 될 것이다.
					}
					out.write('\n');
				}
			} catch (Exception e) {
			
			}finally {
				try {
					if(out != null) Closer.closer(out);
				} catch (Exception e2) {
				}
			}
			
		}
		
		public void load() {	//불러오기
			BufferedReader in = null;
			try {
				in = new BufferedReader(new FileReader(saveFile));
				String line = null;
				while((line=in.readLine()) != null) {
					String[] groupAndEntry = line.split(":");
					// 함수는 심플하게 만들어 사용하면 재사용성이 올라갈 수 있음.
					if(groupAndEntry.length == 1) {
						addGroup(groupAndEntry[0]);
					}else {
						addGroup(groupAndEntry[0]);
						String[] entry = groupAndEntry[1].split(" ");		//각 그룹의 전화번호, 이름
						
						for(String e : entry) {
							String[] phoneAndName = e.split("=");
							addPhoneNo(groupAndEntry[0], phoneAndName[0], phoneAndName[1]);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(in != null) Closer.closer(in);
				} catch (Exception e2) {
					
				}
			}
			
		}
		
	}			
		
class AddPhMessage {	//전화번호 처리 결과를 나타내는 클래스
	
	String msg;
	int type;
	
	//상수값을 지정해놓고 비교 (알아보기 편하다)
	final static int NOT_EXISTING_GROUP = 0;
	final static int EXISTING_NUMBER = 1;
	final static int ADD_SUCCESS = 2;
	
	public AddPhMessage(String msg, int type) {	// 타입값은 상수로
		this.msg = msg;
		this.type = type;
	}
	
		@Override
		public String toString() {
			return msg;
		}
}
public class Quiz_240325_AM {
	
	//폰북을 위한 객체 멤버
	static phoneBook book = new phoneBook();
	static Scanner sc = new Scanner(System.in);
	
	public static void doNewGroup() {
		System.out.print("Enter New Group Name > ");
		book.addGroup(sc.nextLine());
		book.save();
		System.out.println();
	
	}
	
	public static void doNewAddress() {
		System.out.println("Enter Group name > ");
		String groupName = sc.nextLine();
		
		System.out.println("Enter Phone Number > ");
		String number = sc.nextLine();
		
		System.out.println("Enter Name > ");
		String name = sc.nextLine();
		
		AddPhMessage addMsg = book.addPhoneNo(groupName, number, name);
		// addMsg를 적절히 처리...
		
		if(addMsg.type == AddPhMessage.ADD_SUCCESS)
			book.save();
		else if(addMsg.type == AddPhMessage.NOT_EXISTING_GROUP) {
			System.out.println(addMsg.msg);		//addMsg에 msg를 출력.
			return;
			}else if(addMsg.type == AddPhMessage.EXISTING_NUMBER) {
				//수정 여부를 선택... 수정해서 재등록 or 등록 안하기
		}
	}
	
	public static void doFindPhone() {
		System.out.println("Enter Phone Number > ");
		String number = sc.nextLine();
		book.searchByNumber(number);
	}
	
	public static void doFindName() {
		System.out.println("Enter Name > ");
		String name = sc.nextLine();
		book.searchByName(name);
	}
	
	
		public static void main(String[] args) {
		
		while (true) {
	         System.out.println("==== What to do ====");         
	         System.out.println("1. New Group");
	         System.out.println("2. Print");
	         System.out.println("3. New Address");
	         System.out.println("4. Find Phone");
	         System.out.println("5. Find Name");
	         System.out.println("6. Exit");
	         System.out.print("> ");
	         int behavior = sc.nextInt();
	         sc.nextLine();		//버퍼 정리를 위함
	         
	         switch (behavior) {
	         case 1:
	            doNewGroup();
	            break;
	         case 2:
	            book.printAll();
	            break;
	         case 3:
	            doNewAddress();
	         case 4:    
	        	 doFindPhone();
	        	 break;
	         case 5:
	        	 doFindName();
	        	 break;
	         case 6:
	        	 System.out.println("프로그램을 종료합니다.");
	        	 System.exit(0);
	        	 break;
	         default:
	        	 System.out.println("메뉴 선택을 잘못했습니다.");
	            break;
	         }
	      }      
	   }
		
				
		
	}
		

