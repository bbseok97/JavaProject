package obj.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parent {

//	@Override //오버라이드가 생략되어있음.
//	public void doIt() throws SQLException {
//		//부모가 throws 하지않은 Exception은 throws 할 수 없다... 
//		System.out.println("Child.doIt");
//		try {
//			super.doIt();
//		} catch (IOException e) {
//			throw new SQLException(e.getMessage());
//		}
//	}
}
