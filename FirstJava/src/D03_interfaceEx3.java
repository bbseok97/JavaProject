import interface_.iSomething;

public class D03_interfaceEx3 implements iSomething {

	@Override
	public void run() {		//인터페이스는 반드시 재정의가 필요함...
//		My_INT = 33;
		System.out.println("run() : " +iSomething.A);
		
	}
	public static void main(String[] args) {
		System.out.println(iSomething.My_INT);
		System.out.println(D03_interfaceEx3.My_INT);
		
		
		// 메서드의 동작이 같을 겁니다.	다형성
		iSomething is = new D03_interfaceEx3();
		is.run();
		D03_interfaceEx3 di = new D03_interfaceEx3();
		di.run();
	}

}
