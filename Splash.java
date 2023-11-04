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
    //Setting up the toolkit class 
    private tkit tk; 
    //Declaring the color variables
    Color wht = new Color(255, 255, 255);
    Color orn1 = new Color(255, 119, 2);
    Color red = new Color(255, 0, 0);
    Color red1 = new Color(160, 0, 0);
    Color gry1 = new Color(100, 100, 100);
    
    //Declaring fonts for the title screen
    Font f1 = new Font("Bahnschrift", 1, 50);
    Font f2 = new Font("Bahnschrift", 1, 100);
    Font f3 = new Font("Times New Roman", 0, 60);
    Font f4 = new Font("Times New Roman", 1, 20);
    public void splashText() {
	c.setColor(red1);
	c.setFont(f2);
	c.drawString("S", 30, 330);
	c.setFont(f1);
	c.setColor(red);
	c.drawString("tick", 95, 330);
	tk.delay(100);
	c.setFont(f2);
	c.setColor(red1);
	c.drawString("F", 210, 330);
	c.setFont(f1);
	c.setColor(red);
	c.drawString("igure", 265, 330);
	tk.delay(100);
	c.setFont(f2);
	c.setColor(red1);
	c.drawString("B", 415, 330);
	c.setFont(f1);
	c.setColor(red);
	c.drawString("attle", 480, 330);
	tk.delay(100);
	c.setFont(f3);
	c.setColor(red);
	tk.fancyprint("Halloweeeeeen", 130, 390, 100);
	c.setFont(f4);
	c.setColor(wht);
	tk.fancyprint("By: Fei Wang, Justin Jiang", 200, 420, 100);
	tk.fancyprint("Press any key to continue:", 200, 450, 100);
    }
   
    public Splash(Console con) {
	c = con;
	tk = new tkit(c);
    } 
    
    public void run() {
	splashText();
    }
	
}
    
