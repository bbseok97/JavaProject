package customer.hw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CustomerManager {
	private static final String fileName = "CustomerManager.txt";
	   //   생성자 정의
	   private ArrayList<Customer> cusInfo;
	   
	   //   생성자 만들기
	   public CustomerManager() {
	      cusInfo = new ArrayList<>();
	      loadFile();
	   }
	   
	   //   고객 정보 추가
	   public void addCustomer(Customer customer) {
	      cusInfo.add(customer);
	   }
	   
	   //   고객 정보 수정
	   public void updateInfo(String name, Customer updateInfo) {
	      for(int i=0; i < cusInfo.size(); i++) {
	         Customer customer = cusInfo.get(i);
	         if(customer.getName().equals(name)) {
	            cusInfo.set(i, updateInfo);
	            return;
	         }
	      }
	      System.out.println("입력하신 고객 정보를 찾을 수 없습니다.");
	   }
	   
	   //   고객 정보 삭제
	   public void deleteInfo(String name) {
	      for(int i=0; i < cusInfo.size(); i++) {
	         Customer customer = cusInfo.get(i);
	         String loadName = customer.getName();
	         if(loadName == name) {
	            cusInfo.remove(i);
	            System.out.println("고객 정보가 삭제되었습니다.");
	            return;
	         }
	      }
	   }
	   
	   //   이름으로 고객 정보 조회
	   public Customer searchInfo(String name) {
	      for(Customer customer : cusInfo) {
	         if(customer.getName().equals(name)) {
	            return customer;
	         }
	      }
	      System.out.println("입력하신 고객 정보를 찾을 수 없습니다.");
	      return null;
	   }
	   
	   //   고객 정보 전체 조회
	   public void allInfo() {
	      for(Customer customer : cusInfo) {
	         System.out.println(customer);
	      }
	   }
	   
	   //   고객 정보를 파일에 저장
	   public void saveFile() {
	      try(ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream(fileName))){
	         ops.writeObject(cusInfo);
	         System.out.println("파일에 고객 정보를 저장했습니다.");
	      }catch(IOException e){
	         System.out.println("파일에 저장 중 오류가 발생했습니다.");
	         System.out.println(e.getMessage());
	      }
	   }
	   //   고객 정보 파일을 불러오기
	   public void loadFile() {
	      try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
	      cusInfo = (ArrayList<Customer>) ois.readObject();
	      System.out.println("고객 정보를 불러왔습니다.");
	      
	      }catch(IOException | ClassNotFoundException e) {
	         System.out.println("파일을 읽어오는 중 오류가 발생했습니다.");
	         System.out.println(e.getMessage());
	      }
	   }

	
}
