package d;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D04_anonymouseEx2 {
	
	private Frame f;
	
	
	
	public D04_anonymouseEx2() {
		f = new Frame("Anonymouse Ex2");
	}

	WindowAdapter handler = new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("X버튼을 클릭했습니다.");
		System.exit(0);
	 }
	};

	public void launchFrame() {
		f.addWindowListener(handler);
		f.setSize(640, 480);
		f.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		D04_anonymouseEx2 da2 = new D04_anonymouseEx2();
		da2.launchFrame();

	}

}
