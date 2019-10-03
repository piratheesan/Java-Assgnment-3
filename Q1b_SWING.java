import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Q1b_SWING  
{
	
	JButton b5;
	JRadioButton b1,b2,b3,b4;
	JTextField textfield,textfield1,textfield2;
	JLabel label1,label2;
	
      	Q1b_SWING()
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
		//CheckboxGroup cbg = new CheckboxGroup();
		JRadioButton  b1 = new JRadioButton ("ADD");
		b1.setBounds(10,100,140, 40);	
		b1.setBackground( Color.ORANGE );
		JRadioButton  b2 = new JRadioButton ("SUBSTRACT");
		b2.setBounds(160,100,140, 40);
		b2.setBackground( Color.ORANGE );		
		JRadioButton  b3 = new JRadioButton ("MULTIPLY");
		b3.setBounds(310,100,140, 40);
        b3.setBackground( Color.ORANGE );		
		JRadioButton  b4 = new JRadioButton ("DIVIDE");
		b4.setBounds(460,100,140, 40);
		b4.setBackground( Color.ORANGE );		
		b5 = new JButton("Answer");
		b5.setBounds(270,200,100,30);		
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4);
		
		//textfield to enter numbers to do calcultaion
		textfield= new JTextField();
		textfield.setBounds(110, 50, 130, 30);
		textfield1= new JTextField();
		textfield1.setBounds(470, 50, 130, 30);
		textfield2= new JTextField();
		textfield2.setBounds(30,250,570,30);
					
					//add to frame
		f.add(label1);
		f.add(label2);
		f.add(textfield);
		f.add(textfield1);
		f.add(textfield2);		
		f.add(b1);  
        f.add(b2);
		f.add(b3);  
        f.add(b4);
		f.add(b5);
		
		f.setSize(650,400);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		f.getContentPane().setBackground( Color.ORANGE );
	
       
		b5.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {
			if(b1.isSelected()) {
				int num3=Integer.parseInt(textfield.getText())+Integer.parseInt(textfield1.getText());
				textfield2.setText("Answer when adding : "+Integer.toString(num3));
			}
			else if(b2.isSelected()) {
				int num3=Integer.parseInt(textfield.getText())-Integer.parseInt(textfield1.getText());
				textfield2.setText("Answer when subtracting : "+Integer.toString(num3));
			}
			else if(b3.isSelected()) {
				int num3=Integer.parseInt(textfield.getText())*Integer.parseInt(textfield1.getText());
				textfield2.setText("Answer when two numbers multipluing : "+Integer.toString(num3));
			}
			else if(b4.isSelected()) {
				int num3=Integer.parseInt(textfield.getText())/Integer.parseInt(textfield1.getText());
				textfield2.setText("Answer when two numbers multipluing : "+Integer.toString(num3));
			}
			
		}
		 
	 });
	 
		}	
		public static void main(String[] args) 
		{    
		    new Q1b_SWING();    
		}
}		
 
