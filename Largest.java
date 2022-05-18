import java.awt.*;
import java.awt.event.*;

class Largest extends Frame implements ActionListener
{
	Label l1 ,l2,l3;//l4,l5;
	TextField t1,t2;
	Button b1,b2;//b3,b4;



Largest(String title)
{
   super(title);
   setLayout(null);

   l1=new Label("Enter First number");
   l1.setBounds(50,100,150,90);
   add (l1);
   l1.setFont(new Font("Arial",Font.BOLD,15));

    l2=new Label ("Enter Second number");
    l2.setBounds(50,200,150,90);
    add(l2);
    l2.setFont(new Font("Arial",Font.BOLD,15));

    t1=new TextField();
    t1.setBounds(250,100,120,90);
    add(t1);
    t1.setFont(new Font("Arial",Font.BOLD,22));

    t2=new TextField();
    t2.setBounds(250,200,120,90);
    add(t2);
    t2.setFont(new Font("Arial",Font.BOLD,22));

     b1=new Button("Display largest number");
     b1.setBounds(100,410,250,80);
     add(b1);
     b1.setFont(new Font("Arial",Font.BOLD,20));


     b2=new Button("clear");
	 b2.setBounds(350,410,150,80);
     add(b2);
     b2.setFont(new Font("Arial",Font.BOLD,20));

      l3=new Label("");
	  l3.setBounds(220,308,175,80);
	  add(l3);
	  l3.setFont(new Font("Arial",Font.BOLD,20));
	  l3.setBackground(Color.yellow);

     b1.addActionListener(this);
     b2.addActionListener(this);

   setSize(600,600);
   setVisible(true);
 }

 public void actionPerformed(ActionEvent ae)
 {
	 int  n1=Integer.parseInt(t1.getText());
     int  n2=Integer.parseInt(t2.getText());

	 if(ae.getSource()==b1)
	        {
          		l3.setText(String.valueOf(n1>n2||n2>n1)); //|| l3.setText(String.valueOf(n2>n1));
		     }

		  	if(ae.getSource()==b1)
		  	{
		        	l3.setText(String.valueOf(n1=n2));
		  	}



	  if(ae.getSource()==b2)
	  {
		  t1.setText("");
		  t2.setText("");
		  l3.setText("");
		  l1.requestFocus();
	  }
  }

 public static void main (String args[])
 {
	 new Largest("Largest number");
 }
}