package hw_ccp;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class CCP_cusManager {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		while(true) {
			System.out.println("[고객 관리 프로그램 메뉴]");
			System.out.println("1. 고객 정보 저장");
			System.out.println("2. 고객 정보 조회");
			System.out.println("3. 고객 정보 수정");
			System.out.println("4. 고객 정보 삭제");
			System.out.println("5. 전체 고객 정보 조회");
			System.out.println("0. 프로그램 종료");
			
			int num = scan.nextInt();
			scan.nextLine();
			
			switch(num) {
			
			case 1:
				
			}
			
		}
		
		
	
	
	
	}
}
//	고객 클래스 객체 생성
class Customer implements Serializable{
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	
	public Customer() {}
	
	public Customer(String name, char gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Customer[name= "+name+", gender = "+gender+", email= "
					+email+", birthYear= "+birthYear+"]";
	}
	
//	고객 관리 클래스
class CustomerManager{
	private ArrayList<Customer> cus;
	
	//	생성자
	public void CustomerManger() {
		cus = new ArrayList<>();
}
	//	고객 추가
	public void addCus(Customer customer) {
		cus.add(customer);
	}
	
	//	이름으로 고객 정보 조회
	public Customer findName(String name) {
		for(Customer customer : cus) {
			if(customer.getName().equals(name)) {
				return customer;
			}
		}
		return null;
	}
	
	//	고객 정보 수정
	public void updateCus(String name, Customer newName) {
		Customer exisCus = findName(name);
		if(exisCus != null) {
			int index = cus.indexOf(exisCus);
			cus.set(index, newName);
			System.out.println("고객 정보를 수정했습니다.");
		}else {
			System.out.println("고객 정보를 찾을 수 없습니다.");
		}
	}
	
	//	고객 정보 삭제
	public void deleteCus(String name) {
		Customer customer = findName(name);
		if(customer != null) {
			cus.remove(customer);
			System.out.println("고객 정보를 삭제했습니다.");
		}else {
			System.out.println("고객 정보를 찾을 수 없습니다.");
		}
	}
	
	//	전체 고객 정보 조회
	public void allCus() {
		System.out.println("모든 고객 정보를 불러옵니다");
		for(Customer customer : cus) {
			System.out.println(customer);
		}
	}

	//	파일에 데이터 저장(객체 직렬화 사용)
		
	public static void fileOutput() { 
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("CustomerData.ser");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(fos);
			System.out.println("고객 데이터가 저장되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(oos != null) oos.close();
			} catch (IOException e2) {}
		}
	}
	
	public static void fileInput() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("customer.data");
			dis = new DataInputStream(fis);
			
			String name = null;
			while((name = dis.readUTF()) != null) {
				System.out.println(name);
				System.out.println(dis.readUTF());
				System.out.println(dis.readInt());
				System.out.println(dis.readChar());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {if(dis != null) dis.close();} catch (IOException e2) {}
		}
	}
}
}