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
        
        c.setColor(tkit.pumpkinStem);
        int [] x = {650, 520, 480, 514, 650};
        int [] y = {90, 70, 80, 50, 45};
        
        c.fillPolygon(x, y, 5);
    }
    
    public void bg2() {
        c.setColor(tkit.orangeBg);
        c.fillRect(0, 0, 650, 500);
        
        //sun
        
        c.setColor(tkit.moon3);
        tkit.drawCircle(315, 270, 380);
        c.setColor(tkit.sun); 
        tkit.drawCircle(315, 270, 340);
        
        c.setColor(tkit.spider);
        tkit.drawCircle(300, 690, 300);
        c.setColor(Color.black);
        c.drawOval(60, 390, 450, 300);
        
         //tree
        c.setColor(Color.black);
        for(int i=0; i<60; i++) {
            c.drawLine(50, 340, 20+i, 420);
        }
        for(int i=0; i<20; i++) {
            c.drawLine(40+i, 240, 40+i, 380);
        }
        for(int i=0; i<10; i++) {
            c.drawLine(50+i, 240, 70, 200);
            c.drawLine(50-i, 240, 30, 200);
            
            c.drawLine(60, 320+i, 80, 290+i);
            c.drawLine(40, 300+i, 20, 270+i);
            
        }
        for(int i=0; i<5; i++) {    
            c.drawLine(62, 215-i, 55, 205-i);
            c.drawLine(38, 215-i, 45, 205-i);
            
            c.drawLine(72, 310+i, 82, 306+i);
            c.drawLine(30, 292-i, 24, 268-i);
        }
        
        c.setColor(tkit.spider);
        tkit.drawCircle(-20, 700, 300);
        c.setColor(Color.black);
        c.drawOval(-200, 400, 450, 250);
        
        c.setColor(tkit.spider);
        tkit.drawCircle(560, 730, 350);
        c.setColor(Color.black);
        c.drawOval(260, 390, 800, 480);
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
