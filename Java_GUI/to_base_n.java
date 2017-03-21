import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class to_base_n extends JFrame{

	private static final long serialVersionUID = 7081334948411216002L;
	private JTextField text1,text2,text3;
	private JButton button;
	private JLabel label1,label2,label3;
	public to_base_n(){
		super("to_base_n");
		Container container = getContentPane();
		container.setLayout( new FlowLayout());
		label1 = new JLabel("Base:");
		container.add(label1);
		text1 = new JTextField(10);
		container.add(text1);
		label2 = new JLabel("System:");
		container.add(label2);
		text2 = new JTextField(10);
		container.add(text2);
		button = new JButton("Go");
		container.add(button);
		label3 = new JLabel("The result is:");
		container.add(label3);
		text3 = new JTextField("Waiting input...",20);
		text3.setEditable(false);
		text1.setText("0");
		text2.setText("0");
		button.addActionListener(new handler());
		container.add(text3);
		setSize(400,95);
		setVisible(true);
	}
	
	private class handler implements ActionListener{
		String str = "";
		public void actionPerformed(ActionEvent e){
			
			double x = Double.parseDouble(text1.getText());
			double y = Double.parseDouble(text2.getText());
			str="";
			go((int)x,(int)y);
		}
		public void go(int base,int n){
			int temp;
			if(base<0||n<=0||n>=36)
			{
				text3.setText("You have input the wrong number!!!");
				return;
			}
			temp = base % n;
			if(base >= n)
			{
				base = base / n;
				go(base,n);
			}
			if(temp < 10)
			{
				str = str + String.valueOf(temp);
			}
			else
			{
				str = str + (char)(temp + '7');
			}
			text3.setText(str);
			return;
		}
	}
	
	public static void main(String args[]){
		to_base_n to_base_n1 = new to_base_n();
		to_base_n1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

