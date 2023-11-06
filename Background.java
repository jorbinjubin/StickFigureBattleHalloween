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

    //class to make background
    public void bg1() {
        c.setColor(tkit.orangeBg);
        c.fillRect(0, 0, 640, 500);
    }
    
    public void bg2() {
        c.setColor(tkit.orangeBg);
        c.fillRect(0, 0, 650, 500);
        
        c.setColor(tkit.spider);
        c.fillOval(180, 380, 400, 200);
        c.setColor(Color.black);
        c.drawOval(180, 380, 400, 200);

        c.setColor(tkit.spider);
        c.fillOval(-80, 390, 400, 250);
        c.setColor(Color.black);
        c.drawOval(-80, 390, 400, 250);
        
        c.setColor(tkit.spider);
        c.fillOval(340, 370, 500, 300);
        c.setColor(Color.black);
        c.drawOval(340, 370, 500, 300); 
    }
    
    public Background(Console con) {
        c = con;
    }
    public void moon() {
        for (int i = 0; i < 123; i++) {
            int red = (int) (102+ (i / 122.0) * 80.0);
            int green = (int) ((i / 122.0) * 28.0);
            int blue = (int) ((i / 122.0) * 28.0);
            Color moonColor = new Color(red, green, blue);
            c.setColor(moonColor);
            c.drawOval(325 - i, 140 - i, 2*i, 2*i);
        }
        
    }
    
    public void run() {
       bg1();
       moon();
    } 

}
