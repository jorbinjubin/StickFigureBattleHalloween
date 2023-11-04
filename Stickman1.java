import hsa.Console;
import java.awt.*;
/*
 * Draws the first stick figure for the animation. Draws the stickman at x and y coordinates.
 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
*/

public class Stickman1 extends Thread{
    private static tkit tk;
    private static Console c;
    public Stickman1(Console con) {
	c = con;
	tk = new tkit(c);
    }

    public static void drawStickman(int x, int y) {
	//Stickman head
	c.setColor(Color.black);
	c.fillOval(x, y, 50, 50);
	c.setColor(Color.white);
	c.fillOval(5 + x, 5 + y, 40, 40);
	
	//Broom
	c.setColor(tk.broom);
	c.fillRoundRect(x - 50, y + 99, 220, 5, 4, 4);
	int[] broomX = {x+200 - 50, x+240, x+218 - 40, x+245, x+218 - 40, x+245, x+218 - 40, x+240, x+200 - 50};
	int[] broomY = {y+98,  y+88,  y+98, y+100, y+101, y+108, y+105, y+120, y+105};
	c.setColor(Color.red);
	//c.fillRoundRect(
	
	c.setColor(tk.broom2);
	c.fillPolygon(broomX, broomY, 9);
	
	//Stickman body
	
	c.setColor(Color.black);
	for(int i = 0; i < 5; i++) {
	    c.drawLine(x + 30 + i, y + 48, x + 60 + i, y + 100);
	}
	
	//Stickman arms
	
	for(int i = 0; i < 5; i++) {
	    c.drawLine(x + 30 + i, y + 48, x + 30 + i, y + 80);
	    c.drawLine(x + 30 + i, y + 80, x + 10 + i, y + 100);
	}
	c.drawLine(x + 35, y + 80, x + 15, y + 100);
	
    }
    public static void drawStickmanSilhouette(int x, int y) {
	//Stickman head
	c.setColor(Color.black);
	c.fillOval(x, y, 50, 50);
	c.fillOval(5 + x, 5 + y, 40, 40);
	
	//Broom
	c.fillRoundRect(x - 50, y + 99, 220, 5, 4, 4);
	int[] broomX = {x+200 - 50, x+240, x+218 - 40, x+245, x+218 - 40, x+245, x+218 - 40, x+240, x+200 - 50};
	int[] broomY = {y+98,  y+88,  y+98, y+100, y+101, y+108, y+105, y+120, y+105};
	//c.fillRoundRect(
	
	c.fillPolygon(broomX, broomY, 9);
	
	//Stickman body
	
	for(int i = 0; i < 5; i++) {
	    c.drawLine(x + 30 + i, y + 48, x + 60 + i, y + 100);
	}
	
	//Stickman arms
	
	for(int i = 0; i < 5; i++) {
	    c.drawLine(x + 30 + i, y + 48, x + 30 + i, y + 80);
	    c.drawLine(x + 30 + i, y + 80, x + 10 + i, y + 100);
	}
	c.drawLine(x + 35, y + 80, x + 15, y + 100);
	
    }
    public void run() {
	drawStickmanSilhouette(130, 130);
	tk.pauseProgram();
	drawStickman(120, 120);
    }
}
    
    
    
