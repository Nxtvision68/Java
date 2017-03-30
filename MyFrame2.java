package swings;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class MyFrame2 extends JFrame implements ActionListener{
	Container c;
	JButton b,b1;
	public MyFrame2(){
		c = getContentPane();
		FlowLayout f = new FlowLayout();
		b = new JButton("GREEN");
		b1 = new JButton("RED");
		c.add(b);
		c.add(b1);
		c.setLayout(f);
		setSize(300,300);
		setVisible(true);
		b.addActionListener(this);
		b1.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
			c.setBackground(Color.green);
		}
		else if(e.getSource()==b1){
			c.setBackground(Color.red);
		}
	}
	public static void main(String[] args) {
		MyFrame2 obj = new MyFrame2();
	}

	
}
