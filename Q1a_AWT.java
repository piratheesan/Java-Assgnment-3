import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Frame;

public class Q1a_AWT extends Frame implements ActionListener {
	TextField tf1,tf2,tf3;
	Button b1,b2,b3,b4; 
	Label l1,l2,l3,l4,l5,l6;
	 
	 
	 Q1a_AWT() {
		 
		
		l1=new Label("SIMPLE CALCULATOR");
		l1.setBounds(260,50,200,30);
		l2=new Label("First Number");
		l2.setBounds(100,100,100,30);		
		tf1=new TextField();  
        tf1.setBounds(180,100,100,30);
        
        l3=new Label("Second Number");
		l3.setBounds(300,100,100,30);
        tf2=new TextField();  
        tf2.setBounds(400,100,100,30);  
        
        
		b1 = new Button("ADD");
		b1.setBounds(100,200,100,30);
		b1.setBackground(Color.MAGENTA);
		b2 = new Button("SUBTRACT");
		b2.setBounds(220,200,100,30);
		b2.setBackground(Color.ORANGE);
		b3 = new Button("MULTIPLY");
		b3.setBounds(340,200,100,30);
		b3.setBackground(Color.ORANGE);
		b4 = new Button("DIVIDE");
		b4.setBounds(460,200,100,30);
		b4.setBackground(Color.MAGENTA);
		
		
		
        l6=new Label("Output");
		l6.setBounds(310,300,200,30);
		tf3=new TextField();
		tf3.setBounds(360,300,200,30);
        
       
        
        b1.addActionListener(this); 
        b2.addActionListener( this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        
        add(tf1);add(tf2);add(tf3);add(b1);add(b2); add(l1);add(l2);add(l3);add(l6);add(b3);add(b4);
        setSize(600,400);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
        setVisible(true);
        
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
	}
	public void actionPerformed(ActionEvent e) {
		
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		int c=0;
		
		if(e.getSource()==b1) {
			c=a+b;
			
		}else if(e.getSource()==b2) {
			c=a-b;
		}else if(e.getSource()==b3) {
			c=a*b;
		}else if(e.getSource()==b4) {
			c=a/b;
		}
		String result = String.valueOf(c);
		tf3.setText(result);
		 
		
 
	}
	public static void main(String args[]) {
		new Q1a_AWT();
		
	}
	
	
     
	
}