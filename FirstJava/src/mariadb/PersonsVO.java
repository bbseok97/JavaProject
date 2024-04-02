package mariadb;

public class PersonsVO {

//	객체 생성
	private int id;
	private String lastname;
	private String firstname;
	private int age;
	private String city;
	
	//	기본생성자
	public PersonsVO() {}
	
	//	필드 생성자
	public PersonsVO(int id, String lastname, String firstname, int age, String city) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.age = age;
		this.city = city;
	}

	//	Getter, Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "[id: "+id+",lastname: "+lastname+",firstname: "
				+firstname+",age: "+age+",city: "+city+"]";
	}
	
}
