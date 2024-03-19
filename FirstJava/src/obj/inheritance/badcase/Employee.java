package obj.inheritance.badcase;

public class Employee {

	String name;
	int age;
	String employeeId;
	String department;
	
	public String getDetails() {
	     return "[이름: " +name+ "\t나이: " +age+ "\t사번: " +employeeId+ "\t부서: " +department+"]";
	}
	
}
