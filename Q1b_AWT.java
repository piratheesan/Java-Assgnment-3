import java.awt.*;
import java.awt.event.*;


public class Q1b_AWT {

Q1b_AWT(){
	
	
	 Frame fr = new Frame();
	
	 Label lb1 = new Label("SIMPLE CALCULATOR");
	 lb1.setBounds(180,50,250,30);	 
	 Label lb2 = new Label("First Number:");
	 lb2.setBounds(20,100,100,30);		 
	 TextField tf1 = new TextField();
	 tf1.setBounds(130,100,100,30);	 
	 Label lb3 = new Label("Second Number:");
	 lb3.setBounds(250,100,100,30);	 
	 TextField tf2 = new TextField();
	 tf2.setBounds(360,100,100,30);	 
	 CheckboxGroup cbg = new CheckboxGroup();
	 Checkbox b1 = new Checkbox("ADD",cbg,false);
	 b1.setBounds(50,150,80,30);	 
	 Checkbox b2 = new Checkbox("SUBSTRACT",cbg,false);
	 b2.setBounds(150,150,100,30);	 
	 Checkbox b3 = new Checkbox("MULTIPLY",cbg,false);
	 b3.setBounds(270,150,80,30);	 
	 Checkbox b4 = new Checkbox("DIVIDE",cbg,false);
	 b4.setBounds(370,150,80,30);	 
	 Button b5 = new Button("Answer");
	 b5.setBounds(200,200,100,30);	 
	 TextField tf3 = new TextField();
	 tf3.setBounds(30,250,430,30);
	 fr.add(lb1);
	 fr.add(lb2);
	 fr.add(tf1);
	 fr.add(lb3);
	 fr.add(tf2);
	 fr.add(b1);	 
	 fr.add(b2);
	 fr.add(b3);
	 fr.add(b4);
	 fr.add(b5);
	 fr.add(tf3);	 
	 fr.setSize(500, 350);
	 fr.setLayout(null);
	 fr.setVisible(true);
	 fr.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
         }
     }
);
	  
	 
	 b5.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(b1.getState()==true) {
				int num3=Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText());
				tf3.setText("Answer when adding : "+Integer.toString(num3));
			}
			else if(b2.getState()==true) {
				int num3=Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText());
				tf3.setText("Answer when subtracting : "+Integer.toString(num3));
			}
			else if(b3.getState()==true) {
				int num3=Integer.parseInt(tf1.getText())*Integer.parseInt(tf2.getText());
				tf3.setText("Answer when two numbers multipluing : "+Integer.toString(num3));
			}
			else if(b4.getState()==true) {
				int num3=Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText());
				tf3.setText("Answer when Dividing : "+Integer.toString(num3));
			}
			
		}
		 
	 });
	 
	
	 
 }
 
 public static void main(String args[]) {
	 	new Q1b_AWT();
 	}
 }

