import java.awt.*;
import java.applet.*;
import java.util.Random;
import java.lang.Math;


public class FontIncreasing extends Applet implements Runnable
{

    int x,y,z,a,b,c;
    String msg ="A Simple Moving Banner";
    Thread t=null;
    int state;
    boolean stopFlag;
    public void init()
    {
		z = 10;
        x=100;y=100;

		setBackground(Color.pink);
		setForeground(Color.black);


		//this.setFont(new Font("Arial",Font.BOLD,45));
	}
	public void start()
	{
		 msg=getParameter("message");
		 if(msg==null)
		 msg="Applet Programs";
		 msg=" "+msg;
		 t=new Thread(this);
		 t.start();
	 }
	 public void run()
	 {
		 char ch;
		 for(;;)
		 {
			 try
			 {
				 repaint();

                 z=z+2;
                 System.out.println(z);

				 if(z<0){}

				  this.setFont(new Font("Arial", Font.BOLD,z));

				  Thread.sleep(500);
				  if(stopFlag)
				   break;
			   }catch(InterruptedException e){}
		   }
	   }
	   public void paint (Graphics g)
	   {
		   g.drawString(msg,x,y);

	   }
   }