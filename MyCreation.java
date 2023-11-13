// The "MyCreation" class.
import hsa.Console;
import java.awt.*;
/*
 * Runs the animation by creating objects and running them. Uses threads to run
 * multiple animated objects at the same time. Bubbles use an overloaded constructor
 * to create bubbles of different sizes and speeds.
 *
 * Thanks to Nicholas Ng for the drawCircle code
 *
==========    ||     ||    ||======             ||=====
    ||        ||     ||    ||                   ||
    ||        ||=====||    ||====               ||
    ||        ||     ||    ||                   ||
    ||        ||     ||    ||======             ||======    onsole is 640 by 500 i dont wanna make the rest of the big letters lmfao


 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */

//try {Thread.sleep(ms);} catch (Exception e) {}
public class MyCreation
{
    static Console c; // The output console
    public static int scene = 0;
    private Color potion = new Color(147, 4, 224);
    private Color moon2 = new Color(150, 0, 0);
    
    // adds the Background thread to MyCreation
    public void background ()
    {
        // not a thread because it's not animated!!!
        Background b = new Background (c);
        if (scene == 0)
        {
            b.bg1 ();
            b.moon ();
        }
        else if (scene == 1)
        {
            b.bg2 ();
        }
        else if (scene == 2)
        {
            b.bg3 ();
        }
    }
    
    public void ghost ()
    {
        Ghost g = new Ghost (c);
        g.run ();
    }
    
    public void splash ()
    {
        Splash s = new Splash (c);
        s.start ();
        try {    
            s.join ();
        }
        catch (InterruptedException e) {}
    }

    public void bat ()
    {
        Bat b = new Bat (c);
        if(scene == 0) {
            int x = 100;
            int y = 65;
            for(double a = 0; a < 10; a += 0.1) {
                int batX = 100 - (int)(a*10);
                int batY = 65 + (int)(32*Math.sin(2*a));
                b.drawBat(batX, batY, true, 0);
                try {Thread.sleep(50); }
                catch(Exception e) {}
                b.drawBat(batX, batY, false, 0);
            }
            b.start();
        }  
        
        Bat b2 = new Bat(c, potion);
        if(scene == 2) {
            int x = 100;
            int y = 40; 
            for(double a = 0; a < 9; a += 0.2) {
                int bat1X = 110 - (int)(a*20);
                int bat1Y = 60 + (int)(20*Math.sin(2*a)); 

                int bat2X = 130 - (int)(a*20);
                int bat2Y = 45 + (int)(20*Math.sin(2*a)); 

                int bat3X = 160 - (int)(a*20);
                int bat3Y = 52 + (int)(20*Math.sin(2*a)); 
            
                b2.drawBat(bat1X, bat1Y, true, 2);
                b2.drawBat(bat3X, bat3Y, true, 2);
                b2.drawBat(bat2X, bat2Y, true, 2);
                try {Thread.sleep(50); }
                catch(Exception e) {}
                b2.drawBat(bat1X, bat1Y, false, 2);
                b2.drawBat(bat3X, bat3Y, false, 2);
                b2.drawBat(bat2X, bat2Y, false, 2);
            }
            b2.start();
            try {b2.join();}
            catch (InterruptedException e){}
        } 

    }
    
    public void spider ()
    {
        Spider sp = new Spider (c);
        if(scene == 0) {
            for(int y = 0; y<25; y++) {
                sp.spiderCrawl(502, 110-y, true, 0);
                try {Thread.sleep(50);} catch (Exception e) {}
                sp.spiderCrawl(502, 110-y, false, 0);
            }
        
            for(int n = 0; n<42; n++) {
                sp.drawSpider(502+(6*n), 92+(n/2), true);
                try {Thread.sleep(50);} catch (Exception e) {}
                sp.drawSpider(502+(6*n), 92+(n/2), false);
            }
            sp.start();
        }
        Spider sp2 = new Spider(c, moon2);
        if(scene == 2) {
            for(int y = 0; y<25; y++) {
                sp2.spiderCrawl(582, 60-y, true, 2);
                try {Thread.sleep(50);} catch (Exception e) {}
                sp2.spiderCrawl(582, 60-y, false, 2);
            }
            sp2.spiderCrawl(582, 60-25, true, 2);
        }
        sp2.start();
    }

    public void bubbles() {
        Bubbles bub = new Bubbles(c);
        bub.start();   
    }

    public MyCreation ()
    {
        c = new Console ("Stick Figure Battle");
    }


    public void sm1 ()
    {
        Stickman1 sm = new Stickman1 (c);
        sm.run ();
    } 


    public static void main (String[] args)
    {
        MyCreation z = new MyCreation ();
        z.background ();
        z.bat ();
        z.spider ();
        z.splash ();
        z.sm1 ();
        c.getChar ();
        
        scene++;
        c.clear();
        z.background ();
        z.ghost ();
        z.sm1();
        c.getChar ();
        
        scene++;
        c.clear();
        z.background ();
        z.bubbles();
        z.bat();
        z.spider();
        
    }
}
