package D;

class Member {
	String name;
	String phone;
	String address;
	
	public Member(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	
}


public class D09_userDefineException {

	public static void main(String[] args) {
		D09_userDefineException memberManager = new D09_userDefineException();
		try {
			memberManager.insert(new Member("홍길동", "010-1223-2836", "서울시 마포구"));
		} catch (DuplicateKeyException e) {
			System.out.println(e.toString());
		}

	}

	public void insert(Member member) throws DuplicateKeyException {	//insert 고객정보를 추가하는 것
		System.out.println("고객 정보를 저장합니다.");
		System.out.println(member.name + "님의 정보");
		// DB에 홍길동/010-1223-2836 정보가 있다고 간주 !!
		if ("홍길동".equals(member.name) && "010-1223-2836".equals(member.phone)) {
			// 이 경우에 DB에는 이미 정보가 있는 경우가 됩니다.
			// 이때 예외를 발생시켜서 insert메서드를 호출한 곳으로 데이터가 중복됨을 알림
			throw new DuplicateKeyException("데이터가 중복됩니다.");
		} else {
			System.out.println("데이터베이스에 저장되었습니다.");
		}
	}
	
	
}

@SuppressWarnings("serial")
// 사용자정의 메서드 예외....
class DuplicateKeyException extends Exception {
	
	public DuplicateKeyException(String message) {
		super(message);
	}
}









