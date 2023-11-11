/*
 * Draws the bats using poly, oval, arcs, and lines
 * @authors Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Bat extends Thread {
    private Console c;
    private static Color bat = new Color(58, 9, 96);
    private static Color orangeBg = new Color(232, 104, 0);
    
    public void drawBat (int x, int y, boolean original) { 
            if(original) {
                c.setColor(bat);
            }
            else {c.setColor(orangeBg); }
            c.fillOval(x, y-5, 20, 20);
            int [] x1 = {x, x-20, x-30, x-28, x-12, x+5};
            int [] y1 = {y, y-15, y-7, y-2, y+5, y+10};
            c.fillPolygon(x1, y1, 6);
            int [] x2 = {x+15, x+40, x+50, x+48, x+32, x+15};
            int [] y2 = {y, y-15, y-7, y-2, y+5, y+10};
            c.fillPolygon(x2, y2, 6);
            c.setColor(orangeBg);
            c.fillArc(x-30, y-5, 12, 12, -10, 190);
            c.fillArc(x-20, y, 12, 12, -10, 190);
            c.fillArc(x-11, y+3, 12, 12, -10, 190);
            
            c.fillArc(x+39, y-5, 12, 12, 0, 190);
            c.fillArc(x+29, y, 12, 12, -10, 190);
            c.fillArc(x+19, y+3, 12, 12, -10, 190);
            c.fillOval(x+4, y+5, 4, 4);
            c.fillOval(x+12, y+5, 4, 4);
            
            if(original) {
                c.setColor(Color.black);
            }
            else {c.setColor(orangeBg); }
            c.drawLine(x, y, x-20, y-15);
            c.drawLine(x-20, y-15, x-31, y-5);
            c.drawLine(x+17, y, x+40, y-15);
            c.drawLine(x+40, y-15, x+51, y-5);
            
            c.drawLine(x, y-1, x-20, y-16);
            c.drawLine(x-20, y-11, x-31, y-5);
            c.drawLine(x+17, y-1, x+40, y-16);
            c.drawLine(x+40, y-11, x+51, y-5);   
            }  
    


    public Bat (Console con){
        c = con;
    }


    public void run () {
        int x = 100;
        int y = 65;
        for(double a = 0; a < 10; a += 0.1) {
            int batX = 100 - (int)(a*10); 
            int batY = 65 + (int)(40*Math.sin(2*a));
            drawBat(batX, batY, true);
            try {Thread.sleep(50);} 
            catch(Exception e) {}
            
            c.setColor(orangeBg);
            c.fillRect(60-(int)(10*a), 10, 100, 120);
            
        }
    }
}
