import java.awt.*;
import java.awt.event.*;
class pass extends Frame implements ActionListener
{
Label lblCorrect,lblIncorrect;
  TextField t1,t2,t3;
  Button b1,b2;
public pass()
{
super("Password match"); 
t1=new TextField();
t2=new TextField();
b1=new Button("Accept");
b1.setBackground(Color.GREEN);
b2=new Button("Reset");
lblCorrect=new Label("Password Sucessfully Matched");
lblCorrect.setBackground(Color.GREEN);
lblCorrect.setSize(50,20);

lblIncorrect=new Label("Password dose not Matched");
lblIncorrect.setBackground(Color.RED);
lblCorrect.setVisible(false);
lblIncorrect.setVisible(false);

b2.setBackground(Color.RED);
setSize(1000,1000);
setVisible(true);
setLayout(null);
setBackground(Color.BLUE);
t1.setBounds(350,150,400,50);
t2.setBounds(350,250,400,50);
lblCorrect.setBounds(350,500,400,30);
lblIncorrect.setBounds(350,500,400,30);
b1.setBounds(450,350,80,50);
b2.setBounds(550,350,80,50);

add(t1);
add(t2);
add(lblCorrect);
add(lblIncorrect);
add(b1);
add(b2);
b1.addActionListener(this); 
this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
}

public void actionPerformed(ActionEvent e) {       
        if (e.getSource()==b1)
       {    
           String x = t1.getText();
	    String y = t2.getText();
            if (x.equals(y)) 
		{ 
		lblCorrect.setVisible(true);
		lblIncorrect.setVisible(false);
		
}
	    else{
		lblIncorrect.setVisible(true);
		lblCorrect.setVisible(false);
		}

}
}

		
}
class pass3
{
public static void main(String args[])
{
   pass obj=new pass();

}}