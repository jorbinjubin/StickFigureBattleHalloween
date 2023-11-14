/*
 * Draws the spider usin ovals, lines, arcs, and rectangles.
 * @authors Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class
 
public class Bubbles extends Thread {
    private Console c;
    public static Color potion = new Color(147, 4, 224);   
    private Color lightBrown = new Color(66, 29, 25);

    int bubble1X, bubble1Size;
    int bubble2X, bubble2Size;
    int bubble3X, bubble3Size;
    int bubble4X, bubble4Size;
    int bubble5X, bubble5Size;
    
    int bubble1Y = 310; 
    int bubble2Y = 310;
    int bubble3Y = 310;
    int bubble4Y = 310;
    int bubble5Y = 310;
    
    public void generateBubbles() {
	bubble1X = (int)(Math.random()*140+280);
	bubble1Size = (int)(Math.random()*12+8);
	bubble2X = (int)(Math.random()*140+280);
	bubble2Size = (int)(Math.random()*12+8);
	bubble3X = (int)(Math.random()*140+280);
	bubble3Size = (int)(Math.random()*12+8);
	bubble4X = (int)(Math.random()*140+280);
	bubble4Size = (int)(Math.random()*12+8);
	bubble5X = (int)(Math.random()*140+280);
	bubble5Size = (int)(Math.random()*12+8);
    }

    public void drawBubbles() {
	    synchronized(c) {
	    c.setColor(potion);
	    bubble1Y -= 1; 
	    bubble2Y -= 1; 
	    bubble3Y -= 2; 
	    bubble4Y -= 3; 
	    bubble5Y -= 3; 
	    
	    c.fillOval(bubble1X, bubble1Y, bubble1Size, bubble1Size);
	    c.fillOval(bubble2X, bubble2Y, bubble2Size, bubble2Size);
	    c.fillOval(bubble3X, bubble3Y, bubble3Size, bubble3Size);
	    c.fillOval(bubble4X, bubble4Y, bubble4Size, bubble4Size);
	    c.fillOval(bubble5X, bubble5Y, bubble5Size, bubble5Size);
	    }
    }
    
    public void bubbleCover() {
	    synchronized(c) {
	    c.setColor(lightBrown);
	    c.fillOval(bubble1X, bubble1Y, bubble1Size, bubble1Size);
	    c.fillOval(bubble2X, bubble2Y, bubble2Size, bubble2Size);
	    c.fillOval(bubble3X, bubble3Y, bubble3Size, bubble3Size);
	    c.fillOval(bubble4X, bubble4Y, bubble4Size, bubble4Size);
	    c.fillOval(bubble5X, bubble5Y, bubble5Size, bubble5Size);
	    }
    }
    
    public Bubbles(Console con) {
	c = con;
    }
    
    public void run () {
	generateBubbles();
	for(int i = 0; i < 70; i++) {
	    drawBubbles();
	    try {Thread.sleep(60);} catch (Exception e) {}
	    bubbleCover();
	    
	    for(int s = 0; s<100; s++) {
		if(bubble1Y <= 100) {
		    generateBubbles();
		    bubble1Y = 310;
		    bubble2Y = 310; 
		    bubble3Y = 310; 
		    bubble4Y = 310; 
		    bubble5Y = 310;
		    try {Thread.sleep(2000);} catch (Exception e) {} 
		    drawBubbles();
		    s++;
		}
	    }
	}   
    }
}
