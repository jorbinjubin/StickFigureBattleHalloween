import hsa.Console;
import java.awt.*;
/*
 * Draws the first stick figure for the animation. Draws the stickman at x and y coordinates.
 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
*/

public class Stickman1 extends Thread{
    private static Console c;
    private static Color broom = new Color(237, 197, 128);
    private static Color broom2 = new Color(217, 167, 98);
    private static Color wizardHat = new Color(81, 0, 242);
    private static Color stars = new Color(252, 255, 89);
    
    public Stickman1(Console con) {
        c = con;
    }

    public static void drawStickman(int x, int y) {
        //Stickman head
        c.setColor(Color.black);
        c.fillOval(x, y, 50, 50);
        c.setColor(Color.white);
        c.fillOval(5 + x, 5 + y, 40, 40);
        
        c.setColor(broom);
        c.fillRoundRect(x - 50, y + 99, 220, 5, 4, 4);
        int[] broomX = {x+200 - 90, x+240- 50, x+218 - 90, x+245- 50, x+218 - 90, x+245- 50, x+218 - 90, x+240- 50, x+200 - 90};
        int[] broomY = {y+98,  y+88,  y+98, y+100, y+101, y+108, y+105, y+120, y+105};
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
        
        //Stickman legs
        for(int i = 0; i < 5; i++) {
            c.drawLine(x+60+i, y+100, x+40+i, y+120);
            c.drawLine(x+40+i, y+120, x+75+i, y+150); 
        }
        
    }
    public static void drawStickmanSilhouette(int x, int y) {
        
        //Broom
        c.setColor(Color.black);
        c.fillRoundRect(x - 50, y + 99, 160, 5, 4, 4);
        int[] broomX = {x+200 - 90, x+240- 50, x+218 - 90, x+245- 50, x+218 - 90, x+245- 50, x+218 - 90, x+240- 50, x+200 - 90};
        int[] broomY = {y+98,  y+88,  y+98, y+100, y+101, y+108, y+105, y+120, y+105};
        
        c.fillPolygon(broomX, broomY, 9);
        //Stickman head
        c.setColor(Color.black);
        c.fillOval(x, y, 50, 50);
        c.fillOval(5 + x, 5 + y, 40, 40);
        
        
        //Stickman body
        
        for(int i = 0; i < 5; i++) {
            c.drawLine(x + 30 + i, y + 48, x + 60 + i, y + 100);
        }
        
        //Stickman arms
        
        for(int i = 0; i < 5; i++) {
            c.drawLine(x + 30 + i, y + 48, x + 30 + i, y + 80);
            c.drawLine(x + 30 + i, y + 80, x + 10 + i, y + 100);
        }
        
        //Stickman legs
        for(int i = 0; i < 5; i++) {
            c.drawLine(x+60+i, y+100, x+40+i, y+120);
            c.drawLine(x+40+i, y+120, x+75+i, y+150); 
        }
    }
    public void run() {
        drawStickmanSilhouette(280, 80);
        for(int i = 0; i < 100; i+=2) {
           drawStickman(40 + i, 100 + i);
           try{Thread.sleep(50)} catch(Exception E) {};   
        }
    }
}
    
    
    
