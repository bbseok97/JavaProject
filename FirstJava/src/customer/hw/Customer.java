package customer.hw;

public class Customer {
	public String name;
	public String email;
	public char gender;
	public int birthYear;
	
	//	기본 생성자
	public Customer() {
	}
	//	필드 생성자
	public Customer(String name, String email, char gender, int birthYear) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.birthYear = birthYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return "Customer["+"name = "+name+"email= "+email
				+"gender= "+gender+"birthYear= "+birthYear+"]";
	}
	
}
