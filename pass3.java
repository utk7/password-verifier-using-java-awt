import java.awt.*;
import java.awt.event.*;
class pass extends Frame implements ActionListener
{
Label lblCorrect,lblIncorrect,lblpa,lblpa2,lblheading;
  TextField t1,t2,t3;
  Button b1,b2;
public pass()
{
super("Password match"); 
Font titleFont=new Font("SansSerif",Font.BOLD,20);
Font h=new Font("",Font.ITALIC,15);
Color h1=new Color(21,76,121);
Color h2=new Color(189, 35, 38, 1);
Color h3=new Color(66, 222, 48, 1);
Color h4=new Color(93, 208, 81, 1);



lblpa=new Label("Enter Your Password");

lblpa.setSize(50,20);
lblpa.setBounds(350,100,400,30);
lblpa.setVisible(true);
lblpa.setFont(h);



lblheading=new Label("-:WELCOME TO PASSWORD MATCHER:-");
lblheading.setSize(50,20);
lblheading.setBounds(360,50,400,30);
lblheading.setVisible(true);
lblheading.setFont(titleFont);



lblpa2=new Label("Re-enter Your Password");

lblpa2.setSize(50,20);
lblpa2.setBounds(350,210,400,30);
lblpa2.setVisible(true);
lblpa2.setFont(h);
t1=new TextField();
t2=new TextField();
b1=new Button("Accept");
b1.setBackground(h4);
b1.setBackground(h3);
b1.setFont(h);
b2=new Button("Reset");
b2.setFont(h);
lblCorrect=new Label("Password Sucessfully Matched");
lblCorrect.setBackground(h3);
lblCorrect.setSize(50,20);

lblIncorrect=new Label("Password dose not Matched !! you can't even remember your password");
lblIncorrect.setBackground(h2);
lblCorrect.setVisible(false);
lblIncorrect.setVisible(false);

b2.setBackground(h2);
setSize(1000,1000);
setVisible(true);
setLayout(null);
setBackground(h1);
t1.setBounds(350,150,400,50);
t2.setBounds(350,250,400,50);
lblCorrect.setBounds(350,500,400,30);
lblIncorrect.setBounds(350,500,400,30);
b1.setBounds(450,350,80,50);
b2.setBounds(550,350,80,50);
add(lblpa);
add(lblpa2);
add(t1);
add(t2);
add(lblCorrect);
add(lblIncorrect);
add(b1);
add(b2);
add(lblheading);
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