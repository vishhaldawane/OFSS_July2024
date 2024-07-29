import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {
	public static void main(String[] args) {
		MyNotepad notepad1 = new MyNotepad("Ping",100,200,200,80);
		MyNotepad notepad2 = new MyNotepad("Pong",400,200,200,80);
		MyNotepad notepad3 = new MyNotepad("Pang",700,200,200,80);
		
		Thread t1 = new Thread(notepad1);
		Thread t2 = new Thread(notepad2);
		Thread t3 = new Thread(notepad3);
		
		notepad1.setVisible(true);
		notepad2.setVisible(true);
		notepad3.setVisible(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
class MyNotepad extends JFrame implements Runnable { //isA
	
	JTextField data = new JTextField(20); //hasA
	
	MyNotepad(String title, int row, int col,int width , int height) {
		super(title);
		setLocation(row, col);
		setSize(width,height);
		add(data);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void run() {
		for(int i=1;i<=1000000;i++) {
			data.setText(""+i);
		}
	}
}