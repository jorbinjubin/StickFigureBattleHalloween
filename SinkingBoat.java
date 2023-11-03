import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class SinkingBoat implements Runnable
{
    private Console c;

    public void sinkingBoat ()
    {c.setColor(new Color(0,0,0));
    for(int i = 0; i < 1000; i+=10) {
    c.fillRect(i, i / 2, 40, 50);}}

  public SinkingBoat (Console con)
    {
	c = con;
    }
 public void run ()
    {
	sinkingBoat ();
    }

    
}
