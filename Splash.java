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

    //Declaring fonts for the title screen
    Font f1 = new Font("Bahnschrift", 1, 50);
    Font f2 = new Font("Bahnschrift", 1, 100);
    Font f3 = new Font("Times New Roman", 0, 45);
    Font f4 = new Font("Times New Roman", 1, 20);
    
    public void splashText() {
        c.setColor(tkit.moon1);
        c.setFont(f2);
        c.drawString("S", 30, 350);
        c.setFont(f1);
        c.setColor(tkit.moon2);
        c.drawString("tick", 95, 350);
        tk.delay(100);
        c.setFont(f2);
        c.setColor(tkit.moon1);
        c.drawString("F", 210, 350);
        c.setFont(f1);
        c.setColor(tkit.moon2);
        c.drawString("igure", 265, 350);
        tk.delay(100);
        c.setFont(f2);
        c.setColor(tkit.moon1);
        c.drawString("B", 415, 350);
        c.setFont(f1);
        c.setColor(tkit.moon2);
        c.drawString("attle", 480, 350);
        tk.delay(100);
        c.setFont(f3);
        c.setColor(tkit.moon1);
        tk.fancyprint("Halloween", 225, 400, 100);
        c.setFont(f4);
        c.setColor(tkit.bat);
        tk.fancyprint("By: Fei Wang, Justin Jiang", 210, 435, 40);
        c.setColor(Color.white);
        tk.fancyprint("Press any key to continue", 215, 465, 80);
    }

    public Splash(Console con) {
        c = con;
        tk = new tkit(c);
    } 

    public void run() {
        splashText();
    }

}
