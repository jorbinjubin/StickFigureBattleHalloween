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
    private static Color branch = new Color(54, 23, 1);
    private static Color moon1 = new Color(102, 0, 0);
    private static Color moon2 = new Color(150, 0, 0);
    private static Color moon3 = new Color(184, 28, 28);
    private static Color lightOrange = new Color(224, 138, 67);
    private static Color floor = new Color(120, 120, 120);
    private static Color darkBrown = new Color(38, 13, 10);
    private static Color lightBrown = new Color(66, 29, 25);
    private static Color leaf = new Color(16, 97, 0);
    private static Color potion = new Color(147, 4, 224);
    private static Color cauldron = new Color(141, 130, 176);
    
    public Background(Console con) {
        c = con;
    }   
    //method to draw a circle without using fill commands
    public void drawCircle(Console c, int startX, int startY, int radius) {
        for(int i=-radius; i<=radius; i++) {
            c.drawLine(startX-(int)Math.sqrt(radius*radius-i*i), startY-i, startX+(int)Math.sqrt(radius*radius-i*i), startY-i);
        }
    }
        
    //class to make background
    public void bg1() {
        c.setColor(orangeBg);
        for(int i=0; i<500; i++) {
            c.drawLine(0, i, 640, i);
        }
        
        //branch
        c.setColor(pumpkinStem);
        int [] x1 = {650, 520, 480, 514, 650};
        int [] y1 = {90, 70, 80, 50, 45};
        
        c.fillPolygon(x1, y1, 5);
        
        //spider string
        c.setColor(Color.white);
        for(int i=0; i<35; i++) {
            c.drawLine(502+13, 70+i, 502+13+3, 70+i);
        }
    }
    
    public void bg2() {
        c.setColor(orangeBg);
        for(int i=0; i<500; i++) {
            c.drawLine(0, i, 640, i);
        }
        
        //sun
        c.setColor(moon3);
        drawCircle(c, 315, 270, 380);
        c.setColor(sun); 
        drawCircle(c, 315, 270, 340);
        
        
        c.setColor(spider);
        drawCircle(c, 300, 690, 300);
        
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
        drawCircle(c, -20, 700, 300);
        
        c.setColor(spider);
        drawCircle(c, 560, 730, 350);
    }
    
    public void bg3() {
        c.setColor(floor);
        for(int i=400; i<500; i++) {
            c.drawLine(0, i, 640, i);
        }
        c.setColor(lightBrown); 
        for(int i=120; i<400; i++) {
            c.drawLine(0, i, 640, i);
        }
        c.setColor(darkBrown); 
        for(int i=0; i<120; i++) {
            c.drawLine(0, i, 640, i);
        }
        
        //jagged outline layer between dark and light brown
        for(int x = 0; x<20; x++) {
            int[] x2 = {x, 40-x, x};
            int[] y2 = {200-x, 120-x, 120-x};
            c.drawPolygon(x2, y2, 3);
        }
        
        for(int x = 0; x<20; x++) {
            int[] x3 = {40+x, 110-x, 80};
            int[] y3 = {120+x, 120+x, 140-x};
            c.drawPolygon(x3, y3, 3);
        }
        
        c.setColor(lightBrown); 
        for(int j = 0; j<30; j++) {
            c.drawLine(270, 90+j, 470, 90+j);
        }
        
        for(int x = 0; x<20; x++) {
            int[] x3 = {80, 110, 160};
            int[] y3 = {140-x, 120-x, 130-x};
            c.drawPolygon(x3, y3, 3);
        }
        
        for(int x = 0; x<40; x++) {
            int[] x3 = {160, 180, 210, 230};
            int[] y3 = {130-x, 120-x, 100-x, 130-x};
            c.drawPolygon(x3, y3, 4);
        }
        
        for(int x = 0; x<30; x++) {
            int[] x3 = {230, 260, 280, 350};
            int[] y3 = {130-x, 110-x, 120-x, 90-x};
            c.drawPolygon(x3, y3, 4);
        }
        
        for(int x = 0; x<40; x++) {
            int[] x3 = {350, 370, 430, 470};
            int[] y3 = {90-x, 110-x, 100-x, 120-x};
            c.drawPolygon(x3, y3, 4);
        }
       
                
        c.setColor(darkBrown); 
        for(int x=0; x<50; x++) {
            int[] x3 = {530+x, 600-x, 600-x}; 
            int[] y3 = {120+x, 120+x, 170-x};
            c.drawPolygon(x3, y3, 3);
        }

        //spiderweb 
        c.setColor(Color.WHITE);
        
        c.drawLine(635, 5, 560, 5);
        c.drawLine(635, 5, 583, 33);
        c.drawLine(635, 5, 608, 65);
        c.drawLine(635, 5, 635, 90);
        
        c.setColor(pumpkin);
        drawCircle(c, 50, 450, 30);
        drawCircle(c, 80, 450, 30);
        
        c.setColor(pumpkinStem);
        for(int x = 405; x<430; x++) {
            c.drawLine(61, x, 69, x);
        }
        
        c.setColor(pumpkinEyes); 
        for(int e = 0; e<3; e++) {
            int[] x = {45, 50-e, 40+e};
            int[] y = {445+e, 450-e, 450-e};
            c.drawPolygon(x, y, 3);
        }
        
        for(int e = 0; e<3; e++) {
            int[] x = {85, 90-e, 80+e};
            int[] y = {445+e, 450-e, 450-e};
            c.drawPolygon(x, y, 3);
        }
        
        for(int m = 0; m < 5; m++) {
            int[] x = {55+m, 75-m, 65};
            int[] y = {458+m, 458+m, 465-m};
            c.drawPolygon(x, y, 3);
        }
        
        c.setColor(leaf);
        for(int l = 0; l < 8; l++) {
            int[] x = {70+(int)(l/2), 77, 88-l, 81-l};
            int[] y = {430-l, 412+l, 408+l, 424+l};
            c.drawPolygon(x, y, 4);
        }
        
        //cauldron 
        c.setColor(cauldron);
        for(int  u= 0; u<20; u++) {
            c.drawLine(280, 340+u, 460, 340+u);
        }

        for(int u = 0; u<20; u++) {
            c.drawLine(310, 360+u, 430, 360+u);
        }
        
        for(int m = 0; m<110; m++) {
            c.drawLine(280, 380+m, 460, 380+m);
        }
        
        for(int i = 0; i < 10; i++) {
            c.drawLine(280, 350+i, 310, 355+i);
            c.drawLine(460, 350+i, 430, 355+i);
            
            c.drawLine(310, 375+i, 280, 380+i);
            c.drawLine(430, 375+i, 460, 380+i);
        }
        
    }
    
    
    public void moon() {
        for (int i = 0; i < 123; i++) {
            int red = (int) (102+ (i/122.0)*80.0);
            int green = (int) ((i/122.0)*28.0);
            int blue = (int) ((i/122.0)*28.0);
            Color moonColor = new Color(red, green, blue);
            c.setColor(moonColor);
            c.drawOval(325 - i, 140 - i, 2*i, 2*i);
        }
        
    } 
}
