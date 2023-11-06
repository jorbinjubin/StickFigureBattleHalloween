// The "MyCreation" class.
import hsa.Console;
import java.awt.*;
/*
 * Runs the animation by creating objects and running them. Uses threads to run 
 * multiple animated objects at the same time. Bubbles use an overloaded constructor
 * to create bubbles of different sizes and speeds.
 * 
 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */

public class MyCreation {
    static Console c; // The output console

    // adds the Background thread to MyCreation
    public void background() {
        // not a thread because it's not animated!!!
        Background b = new Background(c);
        b.bg1();
        b.moon();
    }

    public void splash() {  
        Splash s = new Splash(c);
        s.start();
        try{s.join();} catch (InterruptedException e){}
    }
    
    public void spider() {
        Spider sp = new Spider(c);
        sp.run();
        
    }
    
    public void sm1() {
        Stickman1 h = new Stickman1(c);
        h.run();
    }
    
    public void bat() {
        Bat b = new Bat(c);
        b.run();
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
    
    public MyCreation() {
        c = new Console("Stick Figure Battle");
    }

    public static void main(String[] args) {
        MyCreation z = new MyCreation();

        z.background();
        z.splash();
        z.sm1();
        z.spider();
        z.bat();
    }
}
