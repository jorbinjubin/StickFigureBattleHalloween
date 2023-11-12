// The "MyCreation" class.
import hsa.Console;
import java.awt.*;
/*
 * Runs the animation by creating objects and running them. Uses threads to run
 * multiple animated objects at the same time. Bubbles use an overloaded constructor
 * to create bubbles of different sizes and speeds.
 *
 * Thanks to Nicholas Ng for the drawCircle code, my math abilities are
 * nowhere good enough to figure that out. - Justin
 *
==========    ||     ||    ||======             ||=====
    ||        ||     ||    ||                   ||
    ||        ||=====||    ||====               ||
    ||        ||     ||    ||                   ||
    ||        ||     ||    ||======             ||======    onsole is 640 by 500 i dont wanna make the rest of the big letters lmfao


 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */

//try {Thread.sleep(ms);} catch (Exception e) {}
public class MyCreation
{
    static Console c; // The output console
    public static int scene = 0;

    // adds the Background thread to MyCreation
    public void background ()
    {
	// not a thread because it's not animated!!!
	Background b = new Background (c);
	if (scene == 0)
	{
	    b.bg1 ();
	    b.moon ();
	}
	else if (scene == 1)
	{
	    b.bg2 ();
	}
	else if (scene == 2)
	{
	    b.bg3 ();
	}
    }


    public void splash ()
    {
	Splash s = new Splash (c);
	s.start ();
	try
	{
	    s.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void spider ()
    {
	Spider sp = new Spider (c);
	sp.run ();
    }


    public void bat ()
    {
	Bat b = new Bat (c);
	if(scene == 0) {
	    int x = 100;
	    int y = 65;
	    for(double a = 0; a < 10; a += 0.1) {
		int batX = 100 - (int)(a*10);
		int batY = 65 + (int)(40*Math.sin(2*a));
		b.drawBat(batX, batY, true, 0);
		try {Thread.sleep(50); }
		catch(Exception e) {}
		b.drawBat(batX, batY, false, 0);
	    }
	}  
	else if(scene == 2) {
	    int x = 100;
	    int y = 40; 
	    for(double a = 0; a < 9; a += 0.2) {
		int bat1X = 110 - (int)(a*20);
		int bat1Y = 60 + (int)(20*Math.sin(2*a)); 

		int bat2X = 130 - (int)(a*20);
		int bat2Y = 45 + (int)(20*Math.sin(2*a)); 

		int bat3X = 160 - (int)(a*20);
		int bat3Y = 52 + (int)(20*Math.sin(2*a)); 
	    
		b.drawBat(bat1X, bat1Y, true, 2);
		b.drawBat(bat3X, bat3Y, true, 2);
		b.drawBat(bat2X, bat2Y, true, 2);
		try {Thread.sleep(50); }
		catch(Exception e) {}
		b.drawBat(bat1X, bat1Y, false, 2);
		b.drawBat(bat3X, bat3Y, false, 2);
		b.drawBat(bat2X, bat2Y, false, 2);
	    }
	} 
	b.run ();
    }


    public void ghost ()
    {
	Ghost g = new Ghost (c);
	g.run ();
    }


    // adds the Lightning thread to MyCreation
    //  public void lightning ()
    //  {
    //      //creates the thread
    //      Lightning j = new Lightning (c);
    //      //starts the thread
    //      j.start ();
    //
    //      //joins with SinkingBoat thread so that it only executes when
    //      lightning thread is done
    //      try
    //      {
    //          j.join ();
    //      }
    //      catch (InterruptedException e)
    //      {
    //      }
    //  }

    // creates a new window and gives window a title

    public MyCreation ()
    {
	c = new Console ("Stick Figure Battle");
    }


    public void sm1 ()
    {
	Stickman1 sm = new Stickman1 (c);
	sm.run ();
    } 


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.background ();
	z.splash ();
	z.sm1 ();
	z.bat ();
	z.spider ();
	c.getChar ();
	
	scene++;
	z.background ();
	z.ghost ();
	z.sm1();
	c.getChar ();
	
	scene++;
	z.background ();
	c.getChar ();
	scene++;
    }
}
