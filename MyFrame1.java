package swings;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class MyFrame1 {
	JFrame frame;
	public MyFrame1(){
		frame  = new JFrame();
		Container c = frame.getContentPane();
		FlowLayout f = new FlowLayout();
		c.setLayout(f);
		frame.setTitle("login page");
		JLabel l1 = new JLabel("enter userId");
		JTextField tf = new JTextField(20);
		JButton b = new JButton("login");
		c.add(l1);
		c.add(tf);
		c.add(b);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		MyFrame1 obj = new MyFrame1();

	}

}
