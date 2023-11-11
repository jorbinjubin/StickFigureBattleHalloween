// The "MyCreation" class.
import hsa.Console;
import java.awt.*;
/*
 * Runs the animation by creating objects and running them. Uses threads to run
 * multiple animated objects at the same time. Bubbles use an overloaded constructor
 * to create bubbles of different sizes and speeds.
 *
 * Thanks to Nicholas Ng for the drawCircle code
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
        z.bat ();
        z.spider ();
        z.splash ();
        z.sm1 ();
        c.getChar ();
        
        scene++;
        c.clear();
        z.background ();
        z.ghost ();
        z.sm1();
        c.getChar ();
        
        scene++;
        c.clear();
        z.background ();
        c.getChar ();
        scene++;
    }
}
