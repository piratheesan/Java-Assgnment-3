import java.awt.*;
import java.awt.event.*;



public class Q2a_AWT implements ActionListener{
 TextField tf1,tf2;
 Label lb1,lb2,lb3,lb4,lb5;
 Button b5;
 Q2a_AWT(){
	
	
	 Frame fr = new Frame();	
	 lb1 = new Label(" BMI CALCULATOR ");
	 lb1.setBounds(150,50,250,30);	
	 
	 Font f = new Font("Serif",Font.BOLD,20);
	 lb1.setFont(f);
	 
	 lb2 = new Label("Height(m):");
	 lb2.setBounds(50,100,100,30);
	 
	 tf1=new TextField();
	 tf1.setBounds(150,100,250,30);	 
	 lb3 = new Label("Weight (Kg): ");
	 lb3.setBounds(50,140,100,30);	 
	 tf2 = new TextField();
	 tf2.setBounds(150,140,250,30);
	
	 
	 
	 b5 = new Button("Calculate");
	 b5.setBounds(200,200,100,30);	
	 b5.addActionListener(this);
	 lb4 = new Label();	 
	 lb4.setBounds(30,250,200,30);
	 lb5 = new Label();	 
	 lb5.setBounds(390,250,200,50);
	 fr.add(lb1);
	 fr.add(lb2);
	 fr.add(tf1);	
	 fr.add(tf2);	 
	 fr.add(b5);
	 fr.add(lb3);
	 fr.add(lb4);
	 fr.add(lb5);	 
	 fr.setSize(500, 350);
	 fr.setLayout(null);
	 fr.setVisible(true);
	 
	 fr.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
         }
     }
	);
	  
}
	public void actionPerformed(ActionEvent e) {
		
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		
		double height = Double.parseDouble(s1);
		double weight = Double.parseDouble(s2);		
		double bmi=weight/(height*height);
		lb4.setText("Your BMI is : "+ String.format("%.2f", bmi));			 
		
		if(bmi<=16)
		{
			lb5.setText("You are Thin");
		}
		else if(bmi> 16 && bmi<=23)
		{
			lb5.setText("You are Normal");
		}
		else
		{
			lb5.setText("You are seems to be Obese");
		}
		
			
		
 
	}
 
 public static void main(String args[]) {
	 	new Q2a_AWT();
 	}
 }

