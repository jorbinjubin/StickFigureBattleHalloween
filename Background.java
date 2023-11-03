import java.awt.*;
import hsa.Console;

/*
 * Backgrounds for Stick Figure Battles.
 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/month/day
 */
 
public class Background {
    //Declaring the local console variable
    private Console c;
    
    //Declaring the color variables
    Color LOrange = new Color(224, 138, 67);
    
    
    
    //class to make background
    public void bg1() {
	c.setColor(LOrange);
	c.fillRect(0, 0, 640, 300);
	for(int i = 0; i <= 200; i++) {
	    int j = (int)(i*0.3);
	    Color LOrange_L = new Color(224 - j, 138 - j, 67 - j);
	    c.setColor(LOrange_L);
	    c.drawLine(0, (int)(300 + i), 640, (int)(300 + i));
	}
	
	
	
    }

    public Background(Console con) {
	c = con;
    }
    
    public void run() {
       bg1();
    } 
    
}
