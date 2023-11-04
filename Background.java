import java.awt.*;
import hsa.Console;

/*
 * Backgrounds for Stick Figure Battles.
 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/2
 */

public class Background {
    //Declaring the local console variable
    private Console c;

    //Declaring the color variables
    Color LOrange = new Color(224, 138, 67);

    //class to make background
    public void bg1() {
	c.setColor(LOrange);
	c.fillRect(0, 0, 640, 500);



    }

    public Background(Console con) {
	c = con;
    }

    public void run() {
       bg1();
    } 

}
