// The "MyCreation" class.
import hsa.Console;
import java.awt.*;

public class MyCreation {
    static Console c; // The output console

    // adds the Background thread to MyCreation
    public void background() {
	// not a thread because it's not animated!!!
	Background b = new Background(c);
	b.bg1();
    }
    
    public void splash() {  
	Splash s = new Splash(c);
	s.start();
	try{s.join();} catch (InterruptedException e){}
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
    }
}

