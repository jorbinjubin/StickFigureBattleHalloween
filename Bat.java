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

    public void drawBat (int x, int y) {      
        for(int i=0; i<100; i++) {
            c.setColor(tkit.bat);
            c.fillOval(100, 60, 20, 20);
            int [] x1 = {105, 80, 70, 72, 88, 105};
            int [] y1 = {65, 50, 58, 63, 70, 75};
            c.fillPolygon(x1, y1, 6);
            int [] x2 = {115, 140, 150, 148, 132, 115};
            int [] y2 = {65, 50, 58, 63, 70, 75};
            c.fillPolygon(x2, y2, 6);
            c.setColor(tkit.orangeBg);
            c.fillArc(70, 60, 12, 12, -10, 190);
            c.fillArc(80, 65, 12, 12, -10, 190);
            c.fillArc(89, 68, 12, 12, -10, 190);
            
            c.fillArc(139, 60, 12, 12, 0, 190);
            c.fillArc(129, 65, 12, 12, -10, 190);
            c.fillArc(119, 68, 12, 12, -10, 190);
            c.fillOval(104, 70, 4, 4);
            c.fillOval(112, 70, 4, 4);
            
            c.setColor(tkit.spider);
            c.drawLine(100, 65, 80, 50);
            c.drawLine(80, 50, 69, 60);
            c.drawLine(117, 65, 140, 50);
            c.drawLine(140, 50, 151, 60);
            
            c.drawLine(100, 64, 80, 49);
            c.drawLine(80, 49, 69, 60);
            c.drawLine(117, 64, 140, 49);
            c.drawLine(140, 49, 151, 60);
        }       
    }


    public Bat (Console con){
        c = con;
    }


    public void run () {
        drawBat(105, 65);
    }
}
