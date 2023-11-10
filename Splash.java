import hsa.Console;
import java.awt.*;
import java.lang.*;

/*
 * Draws the splash screen
 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */

 public class Splash extends Thread {

    //Declaring the local console variable
    private Console c;
    private static Color moon1 = new Color(102, 0, 0);
    private static Color moon2 = new Color(150, 0, 0);
    private static Color moon3 = new Color(184, 28, 28);
    private static Color bat = new Color(58, 9, 96);

    //Declaring fonts for the title screen
    Font f1 = new Font("Bahnschrift", 1, 50);
    Font f2 = new Font("Bahnschrift", 1, 100);
    Font f3 = new Font("Times New Roman", 0, 45);
    Font f4 = new Font("Times New Roman", 1, 20);
    public Splash(Console con) {
	c = con;
    } 
    public void fancyprint(String s1, int x, int y, int speed) {
	for (int i = 0; i <= s1.length(); i++) {
	    c.drawString(s1.substring(0, i), x, y);
	    try{ Thread.sleep(speed);} catch(Exception e) {};
	}
    }
  
    public void splashText() {
	c.setColor(moon1);
	c.setFont(f2);
	c.drawString("S", 30, 350);
	c.setFont(f1);
	c.setColor(moon2);
	c.drawString("tick", 95, 350);
	try {Thread.sleep(100);} catch (Exception e) {}
	c.setFont(f2);
	c.setColor(moon1);
	c.drawString("F", 210, 350);
	c.setFont(f1);
	c.setColor(moon2);
	c.drawString("igure", 265, 350);
	try {Thread.sleep(100);} catch (Exception e) {}
	c.setFont(f2);
	c.setColor(moon1);
	c.drawString("B", 415, 350);
	c.setFont(f1);
	c.setColor(moon2);
	c.drawString("attle", 480, 350);
	try {Thread.sleep(100);} catch (Exception e) {}
	c.setFont(f3);
	c.setColor(moon1);
	fancyprint("Halloween", 225, 400, 100);
	c.setFont(f4);
	c.setColor(bat);
	fancyprint("By: Fei Wang, Justin Jiang", 210, 435, 40);
	c.setColor(Color.white);
	fancyprint("Press any key to continue", 215, 465, 80);
    }

    

    public void run() {
	splashText();
    }
}
