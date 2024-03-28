package i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class I02_urlEx {

	/*
	 * 	URL 객체를 생성
	 * 	- URL url = new URL("전체주소");
	 * 	- URL url = new URL("호스트명", "경로/파일명");
	 * 	- URL url = new URL("호스트명", 포트번호, "경로/파일명");
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		try {
			URL url = null;
			url = new URL("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ssc=tab.nx.all&query=url&oquery=%EC%BF%BC%EB%A6%AC%EC%8A%A4%ED%8A%B8%EB%A7%81&tqi=ilglcwqpsECssTkzs3dssssstj0-401980");
			System.out.println("authority : " + url.getAuthority());
			System.out.println("content : " + url.getContent());
			System.out.println("protocol : " + url.getProtocol());
			System.out.println("host : " + url.getHost());
			System.out.println("port : " + url.getPort());
			System.out.println("path : " + url.getPath());
			System.out.println("file : " + url.getFile());
			System.out.println("query : " + url.getQuery());
			
			// URL을 통해서 정보 읽기
			int data = 0;
			try {
				Reader is = new InputStreamReader(url.openStream());
				while((data = is.read()) != -1) {
					System.out.print((char)data);
				}
				System.out.println();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
			// URLConnection
			// 추상 클래스로 URL간의 연결을 담당하는 역할을 함.
			// URLConnection을 상속받아 구현한 클래스 HttpURLConnection, JarURLConnection
			url = null;
			String address = "https://www.egovframe.go.kr/home/sub.do?menuNo=9";
			
			try {
				url = new URL(address);
				URLConnection conn = url.openConnection();		//	openConnection - URLConnection객체 반환
				// 헤더 정보
				System.out.println("conn.toString() : " +conn);
				System.out.println("getAllowUserInteraction() : " + conn.getAllowUserInteraction());	//UserInteraction의 허용여부
				System.out.println("getConnectTimeout() : " + conn.getConnectTimeout());		// 연결 종료시간 리턴
				System.out.println("getContent() : " + conn.getContent());	// content 객체 리턴
				System.out.println("getContentEncoding() : " + conn.getContentEncoding()); // content의 인코딩 리턴 **
				System.out.println("getContentLength() : " + conn.getContentLength());	// content의 크기 리턴 **
				System.out.println("getContentType() : " + conn.getContentType());	//content의 type리턴 **
				System.out.println("getDate() : " + conn.getDate());	//헤더의 date값 리턴
				System.out.println("getDefaultAllowUserInteraction() : "
									+ conn.getDefaultAllowUserInteraction());	//defaultAllowUserInteraction값 리턴
				System.out.println("getDefaultUserCaches() : " + conn.getDefaultUseCaches());	//useCache 기본값 리턴
				System.out.println("getDoInput() : " + conn.getDoInput());	//doInput값 리턴
				System.out.println("getDoOutput() : " + conn.getDoOutput());	//doOutput값 리턴
				System.out.println("getExpiration() : " + conn.getExpiration());	//URL의 만료일 리턴
				System.out.println("getHeaderFields() : " + conn.getHeaderFields());	//
				System.out.println("getIfModifiedSince() : " + conn.getIfModifiedSince());	//변경여부값 리턴
				System.out.println("getLastModified() : " + conn.getLastModified());	//최종변경일 리턴
				System.out.println("getReadTimeout() : " + conn.getReadTimeout());	//읽기 타임아웃시간 리턴
				System.out.println("getURL() : " + conn.getURL());		//URL Connection 객체 리턴
				System.out.println("getUseCaches() : " + conn.getUseCaches());	//캐쉬사용여부 리턴
				
				
				BufferedReader br = null;
				String readline = "";
				
				try {
					url = new URL(address);
					br = new BufferedReader(
							new InputStreamReader(url.openStream()));
					
					while((readline = br.readLine()) != null) {
						System.out.println(readline);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						if(br != null) br.close(); } catch (Exception e) {}
					} 
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
