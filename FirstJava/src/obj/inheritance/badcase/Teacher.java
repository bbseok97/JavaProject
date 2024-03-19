package obj.inheritance.badcase;

public class Teacher {

	
	// 이름, 나이, 교번, 담당 과목
	String name;
	int age;
	String teacherId;
	String subject;
	
	public String getDetails() {
	     return "[이름: " +name+ "\t나이: " +age+ "\t교번: " +teacherId+ 
	    		 "\t담당과목: " +subject+"]";
	}
}
