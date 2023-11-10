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
    private static Color spider = new Color(74, 0, 0);
    private static Color orangeBg = new Color(232, 104, 0);
	
    public void drawSpider (Console con, int x, int y) {
	//x = 502, y=110
	for(int i=0; i<80; i++) {
	    c.setColor(Color.white);
	    c.fillRect(x+13, 0, x-498, y+10);
	    
	    c.setColor(spider);
	    //body
	    c.fillArc(x, y, 30, 20, 0, 180);
	    c.fillRect(x, y+10, 30, 10);
	    c.fillArc(x, y+6, 30, 20, 180, 180);
	    //legs
	    c.drawLine(x+4, y+20, x, y+30);
	    c.drawLine(x, y+30, x-2, y+37);
	    c.drawLine(x+5, y+20, x+1, y+30);
	    c.drawLine(x+1, y+30, x-1, y+37);
	    
	    c.drawLine(x+24, y+20, x+28, y+30);
	    c.drawLine(x+28, y+30, x+28, y+37);
	    c.drawLine(x+25, y+20, x+29, y+30);
	    c.drawLine(x+29, y+30, x+29, y+37);
	    
	    c.drawLine(x+4, y+5, x-2, y-5);
	    c.drawLine(x-2, y-5, x+8, y-7);
	    c.drawLine(x+3, y+5, x-3, y-5);
	    c.drawLine(x-3, y-5, x+7, y-7);
	    
	    c.drawLine(x+24, y+5, x+30, y-5);
	    c.drawLine(x+30, y-5, x+20, y-7);
	    c.drawLine(x+25, y+4, x+31, y-5);
	    c.drawLine(x+31, y-5, x+21, y-7);
	    
	    c.drawLine(x, y+8, x-8, y-4);
	    c.drawLine(x-8, y-4, x+4, y-14);
	    c.drawLine(x-1, y+8, x-9, y-4);
	    c.drawLine(x-9, y-4, x+3, y-14);
	    
	    c.drawLine(x+28, y+8, x+36, y-4);
	    c.drawLine(x+36, y-4, x+24, y-14);
	    c.drawLine(x+29, y+8, x+37, y-4);
	    c.drawLine(x+37, y-4, x+25, y-14);
	    
	    c.setColor(orangeBg);
	    c.fillOval(x+6, y+10, 5, 5);
	    c.fillOval(x+20, y+10, 5, 5);
	}
    }


    public Spider (Console con){
	c = con;
    }


    public void run () {
	drawSpider(c, 502, 110);
    }
}
