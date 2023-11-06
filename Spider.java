/*
 * Draws the spider usin ovals, lines, arcs, and rectangles.
 * @authors Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Spider extends Thread {
    private Console c;

    public void drawSpider () {
        c.setColor(tkit.pumpkinStem);
        int [] x = {650, 520, 480, 514, 650};
        int [] y = {90, 70, 80, 50, 45};
        
        c.fillPolygon(x, y, 5);
        
        for(int i=0; i<80; i++) {
            c.setColor(Color.white);
            c.fillRect(515, 0, 4, 120);
            
            c.setColor(tkit.spider);
            //body
            c.fillArc(502, 110, 30, 20, 0, 180);
            c.fillRect(502, 120, 30, 10);
            c.fillArc(502, 115, 30, 20, 180, 180);
            //legs
             c.drawLine(506, 130, 502, 140);
            c.drawLine(502, 140, 500, 147);
            c.drawLine(507, 130, 503, 140);
            c.drawLine(503, 140, 501, 147);
            
            c.drawLine(526, 130, 530, 140);
            c.drawLine(530, 140, 530, 147);
            c.drawLine(527, 130, 531, 140);
            c.drawLine(531, 140, 531, 147);
            
            c.drawLine(506, 115, 500, 105);
            c.drawLine(500, 105, 510, 98);
            c.drawLine(505, 115, 499, 105);
            c.drawLine(499, 105, 509, 98);
            
            c.drawLine(526, 115, 532, 105);
            c.drawLine(532, 105, 522, 98);
            c.drawLine(527, 114, 533, 105);
            c.drawLine(533, 105, 523, 98);
            
            c.drawLine(502, 118, 494, 106);
            c.drawLine(494, 106, 506, 96);
            c.drawLine(501, 118, 493, 106);
            c.drawLine(493, 106, 505, 96);
            
            c.drawLine(530, 118, 538, 106);
            c.drawLine(538, 106, 526, 96);
            c.drawLine(531, 118, 539, 106);
            c.drawLine(539, 106, 527, 96);
            
            c.setColor(tkit.orangeBg);
            c.fillOval(508, 120, 5, 5);
            c.fillOval(522, 120, 5, 5);
            
            try {Thread.sleep(15); }
            catch (Exception e) {}
        }
    }


    public Spider (Console con){
        c = con;
    }


    public void run () {
        drawSpider();
    }
}
