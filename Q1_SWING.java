import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingUtilities;


public class Q1_SWING extends JFrame implements ActionListener 
{
	
	JButton b1,b2,b3,b4;
	JTextField textfield,textfield1,textfield2;
	JLabel label1,label2,label3,label4;
	
      	Q1_SWING()
		{    
		JFrame f=new JFrame("SIMPLE CALCULATOR"); 
		
		//label
		label1 = new JLabel();		
		label1.setText("First Number :");
		label1.setBounds(10, 10, 100, 100);
		label2 = new JLabel();
		label2.setText("Second Number :");
		label2.setBounds(350, 10, 100, 100);
		
		//button
		b1=new JButton("ADD");    
		b1.setBounds(10,100,140, 40); 
		b2=new JButton("SUBTRACT");    
		b2.setBounds(160,100,140, 40);
	    b3=new JButton("MULTIPLY");    
		b3.setBounds(310,100,140, 40);  
	    b4=new JButton("DIVIDE");    
		b4.setBounds(460,100,140, 40);  
					
		
				
		//label3 = new JLabel();
		//label3.setBounds(10, 110, 200, 100);
		
		label4=new JLabel("Output");
		label4.setBounds(350,300,200,30);
		
		//textfield to enter numbers to do calcultaion
		textfield= new JTextField();
		textfield.setBounds(110, 50, 130, 30);
		textfield1= new JTextField();
		textfield1.setBounds(470, 50, 130, 30);
		textfield2= new JTextField();
		textfield2.setBounds(400,300,200,30);
					//add to frame
		f.add(label1);
		f.add(label2);
		f.add(textfield);
		f.add(textfield1);
		f.add(textfield2);
		//f.add(label3);
		f.add(label4);
		f.add(b1);  
        f.add(b2);
		f.add(b3);  
        f.add(b4);		
		f.setSize(650,400);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		f.getContentPane().setBackground( Color.ORANGE );
		b1.addActionListener(this); 
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
       
		}         
	
		public void actionPerformed(ActionEvent e) {
		
		String s1 = textfield.getText();
		String s2 = textfield1.getText();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		int c=0;
		
		if(e.getSource().equals(b1))
		{
			c=a+b;
			
		}else if(e.getSource().equals(b2)) 
		{
			c=a-b;
		}else if(e.getSource().equals(b3)) 
		{
			c=a*b;
		}else if(e.getSource().equals(b4)) 
		{
			c=a/b;
		}
		String result = String.valueOf(c);
		textfield2.setText(result);
		}
		 	
		public static void main(String[] args) 
		{    
		    new Q1_SWING();    
		}
}		
 
