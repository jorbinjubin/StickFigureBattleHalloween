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
    private static Color sun = new Color(208, 66, 14); 
    private static Color pumpkin = new Color(255, 170, 10); 
    private static Color pumpkinEyes = new Color(255, 219, 77); 
    private static Color pumpkinStem = new Color(112, 58, 3);
    private static Color lightPink = new Color(252, 159, 238);
    private static Color mouse = new Color(212, 212, 212);
    private static Color bat = new Color(58, 9, 96);
    private static Color spider = new Color(74, 0, 0);
    private static Color broom = new Color(237, 197, 128);
    private static Color broom2 = new Color(217, 167, 98);
    private static Color wizardHat = new Color(81, 0, 242);
    private static Color stars = new Color(252, 255, 89);
    private static Color orangeBg = new Color(232, 104, 0);
    private static Color tree = new Color(24, 0, 48);
    private static Color cinderBlocks = new Color(150, 150, 150);
    private static Color branch = new Color(54, 23, 1);
    private static Color moon1 = new Color(102, 0, 0);
    private static Color moon2 = new Color(150, 0, 0);
    private static Color moon3 = new Color(184, 28, 28);
    private static Color lightOrange = new Color(224, 138, 67);
    private static Color walloutline = new Color(90, 90, 90);
    private static Color floor = new Color(120, 120, 120);
    
    //class to make background
    public void bg1() {
	c.setColor(orangeBg);
	c.fillRect(0, 0, 640, 500);
	
	c.setColor(pumpkinStem);
	int [] x = {650, 520, 480, 514, 650};
	int [] y = {90, 70, 80, 50, 45};
	
	c.fillPolygon(x, y, 5);
    }
    
    public void bg2() {
	c.setColor(orangeBg);
	c.fillRect(0, 0, 650, 500);
	
	//sun
	
	c.setColor(moon3);
	tkit.drawCircle(315, 270, 380);
	c.setColor(sum); 
	tkit.drawCircle(315, 270, 340);
	
	c.setColor(spider);
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
	
	c.setColor(spider);
	tkit.drawCircle(-20, 700, 300);
	c.setColor(Color.black);
	c.drawOval(-200, 400, 450, 250);
	
	c.setColor(spider);
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
