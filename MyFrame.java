package swings;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class MyFrame extends JFrame implements ActionListener{
	JPanel p1;
	JLabel l2,l3;
	JTextField TF,TF1;
	JButton b1;
	public MyFrame(){
		super("login page");
		Container c = getContentPane();
		p1 = new JPanel();

		l2 = new JLabel("user name");
		TF = new JTextField(20);
		
		l3 = new JLabel("password");
		TF1 = new JPasswordField(20);
		
		b1 = new JButton("login");
		c.add(p1);
		p1.add(l2);
		p1.add(TF);
		p1.add(l3);
		p1.add(TF1);
		p1.add(b1);
		setSize(300,300);
		setVisible(true);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String value = "hiii rangarao";
		String value1 = TF.getText();
		String value2 = TF1.getText();
		if(value1.equals("rangarao")&&value2.equals("12345")){
			NextPage page = new NextPage();
			page.setVisible(true);
			JLabel label = new JLabel("Welocme:"+value);
			page.getContentPane();
			page.add(label);
		}
		else{
			NextPage page = new NextPage();
			page.setVisible(true);
			JLabel label = new JLabel("pls enter correct inputs");
			page.getContentPane();
			page.add(label);
		}
	}
	public static void main(String[] args) {
		MyFrame obj = new MyFrame();
		obj.setSize(300,300);
		obj.setVisible(true);
	}

}
