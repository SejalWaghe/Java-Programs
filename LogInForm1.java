import java.awt.*;
import java.awt.event.*;

class LogInForm1 extends Frame implements ActionListener
{
   Label L1, L2 , L3;
   TextField T1, T2;
   Button B1,B2;


   LogInForm1( String title )
   {
     super(title);

     setLayout(null);

      L1= new Label ("Username ");
      L1.setBounds(50,60,100,25);
      add(L1);

      T1= new TextField();
      T1.setBounds(175,60,125,25);
      add(T1);

      L2= new Label ("Password ");
      L2.setBounds(50,120,100,25);
      add(L2);

      T2= new TextField();
      T2.setBounds(175,120,125,25);
      T2.setEchoChar('*');
      add(T2);

      B1= new Button(" Login");
      B1.setBounds(70,170,80,25);
      add(B1);

      B2= new Button(" Clear");
	  B2.setBounds(180,170,80,25);
      add(B2);


      B1.addActionListener(this);
	  B2.addActionListener(this);

	  L3= new Label ("");
	  L3.setBounds(90,230,175,25);
	  L3.setBackground(Color.yellow);
      add(L3);


      setSize(400,300);
      setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
		 String u1= "Sejal";
         String Pwd ="123456";
		 if (ae.getSource()==B1)
		 {
			   if (( T1.getText().equals(u1)) && (T2.getText().equals(Pwd)))
			   {
				   L3.setText(String.valueOf("sucessful login"));
			   }
			   else
			       L3.setText(String.valueOf("invaliddetails"));


	     }
	     if ( ae.getSource()==B2)
	     {
			 T1.setText("");
			 T2.setText("");

			 T1.requestFocus();
	     }
     }
    public static void main(String args[])
    {
       new LogInForm1( "Login form");
     }
   }
