import hsa.Console;
import java.awt.*;
/*
 * Draws the first stick figure for the animation. Draws the stickman at x and y
 * coordinates.
 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */

public class Stickman2 implements Runnable {
    private Console c;
    private Color broom = new Color(237, 197, 128);
    private Color broom2 = new Color(217, 167, 98);
    private Color wizardHat = new Color(81, 7, 5);
    private Color stars = new Color(252, 255, 89);

    public Stickman2(Console con) {
	c = con;
    }

    public void drawStickman(int x, int y) {
	synchronized(c) {
	// Stickman head
	c.setColor(Color.black);
	c.fillOval(x, y, 50, 50);
	c.setColor(Color.white);
	c.fillOval(5 + x, 5 + y, 40, 40);

	c.setColor(broom);
	c.fillRoundRect(x - 50, y + 99, 220, 5, 4, 4);
	int[] broomX = {x + 200 - 90, x + 240 - 50, x + 218 - 90, x + 245 - 50,
	    x + 218 - 90, x + 245 - 50, x + 218 - 90, x + 240 - 50,
	    x + 200 - 90};
	int[] broomY = {y + 98, y + 88, y + 98, y + 100, y + 101, y + 108,
	    y + 105, y + 120, y + 105};
	c.fillPolygon(broomX, broomY, 9);
	// Stickman body

	c.setColor(Color.black);
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x + 30 + i, y + 48, x + 60 + i, y + 100);
	}

	// Stickman arms

	for (int i = 0; i < 5; i++) {
	    c.drawLine(x + 30 + i, y + 48, x + 30 + i, y + 80);
	    c.drawLine(x + 30 + i, y + 80, x + 10 + i, y + 100);
	}
	c.drawLine(x + 35, y + 80, x + 15, y + 100);

	// Stickman legs
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x + 60 + i, y + 100, x + 40 + i, y + 120);
	    c.drawLine(x + 40 + i, y + 120, x + 75 + i, y + 150);
	}

	// Stickman hat
	c.setColor(new Color(81, 7, 5));
	int[] hatX = {x - 10, x - 10, x + 10, x + 30, x + 45, x + 60, x + 60};
	int[] hatY = {y + 5, y - 15, y - 15, y - 65, y - 15, y - 15, y + 5};
	c.fillPolygon(hatX, hatY, hatX.length);
	c.setColor(stars);
	c.fillOval(x + 5, y - 5, 4, 4);
	c.fillOval(x + 17, y - 3, 4, 4);
	c.fillOval(x + 23, y - 3, 4, 4);
	c.fillOval(x + 20, y - 30, 4, 4);
	c.fillOval(x + 23, y - 37, 4, 4);
	c.fillOval(x + 23, y - 27, 4, 4);
	c.fillOval(x + 28, y - 14, 4, 4);
	c.fillOval(x + 23, y - 37, 4, 4);
	}
    }

    public void drawStickmanBackwards(int x, int y) {
	synchronized(c) {
	// Stickman head
	c.setColor(Color.black);
	c.fillOval(x - 50, y, 50, 50);
	c.setColor(Color.white);
	c.fillOval(x - 45, 5 + y, 40, 40);

	c.setColor(broom);
	c.fillRoundRect(x - 150, y + 99, 220, 5, 4, 4);
	int[] broomX = {x - 200 + 90, x - 240 + 50, x - 218 + 90, x - 245 + 50,
	    x - 218 + 90, x - 245 + 50, x - 218 + 90, x - 240 + 50,
	    x - 200 + 90};
	int[] broomY = {y + 98, y + 88, y + 98, y + 100, y + 101, y + 108,
	    y + 105, y + 120, y + 105};
	c.fillPolygon(broomX, broomY, 9);
	// Stickman body

	c.setColor(Color.black);
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x - 30 - i, y + 48, x - 60 - i, y + 100);
	}

	// Stickman arms

	for (int i = 0; i < 5; i++) {
	    c.drawLine(x - 30 - i, y + 48, x - 30 - i, y + 80);
	    c.drawLine(x - 30 - i, y + 80, x - 10 - i, y + 100);
	}
	c.drawLine(x - 35, y + 80, x - 15, y + 100);

	// Stickman legs
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x - 60 - i, y + 100, x - 40 - i, y + 120);
	    c.drawLine(x - 40 - i, y + 120, x - 75 - i, y + 150);
	}

	// Stickman hat
	c.setColor(new Color(81, 7, 5));
	int[] hatX = {x + 10, x + 10, x - 10, x - 30, x - 45, x - 60, x - 60};
	int[] hatY = {y + 5, y - 15, y - 15, y - 65, y - 15, y - 15, y + 5};
	c.fillPolygon(hatX, hatY, hatX.length);
	c.setColor(stars);
	c.fillOval(x - 5, y - 5, 4, 4);
	c.fillOval(x - 17, y - 3, 4, 4);
	c.fillOval(x - 23, y - 3, 4, 4);
	c.fillOval(x - 20, y - 30, 4, 4);
	c.fillOval(x - 23, y - 37, 4, 4);
	c.fillOval(x - 23, y - 27, 4, 4);
	c.fillOval(x - 28, y - 14, 4, 4);
	c.fillOval(x - 23, y - 37, 4, 4);
	}
    }

    // Redraws the stickman with the color of the background to clear it out
    public void clearSF(int scene, int x, int y) {
	synchronized(c) {
	if (scene == 2) {
	    c.setColor(new Color(208, 66, 14));
	}
	// Broom
	c.fillRoundRect(x - 50, y + 99, 160, 5, 4, 4);
	// int[] broomX = {x + 200 - 90, x + 240 - 50, x + 218 - 90, x + 245 -
	// 50,
	//     x + 218 - 90, x + 245 - 50, x + 218 - 90, x + 240 - 50,
	//     x + 200 - 90};
	// int[] broomY = {y + 98, y + 88, y + 98, y + 100, y + 101, y + 108,
	//     y + 105, y + 120, y + 105};
	//
	// c.fillPolygon(broomX, broomY, 9);

	c.fillRect(x + 100, y + 80, 150, 50);
	// Stickman head
	c.fillOval(x, y, 50, 50);
	c.fillOval(5 + x, 5 + y, 40, 40);

	// Stickman body

	for (int i = 0; i < 5; i++) {
	    c.drawLine(x + 30 + i, y + 48, x + 60 + i, y + 100);
	}

	// Stickman arms

	for (int i = 0; i < 7; i++) {
	    c.drawLine(x + 29 + i, y + 48, x + 29 + i, y + 80);
	    c.drawLine(x + 29 + i, y + 80, x + 9 + i, y + 100);
	}

	// Stickman legs
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x + 60 + i, y + 100, x + 40 + i, y + 120);
	    c.drawLine(x + 40 + i, y + 120, x + 75 + i, y + 150);
	}
	// Stickman hat
	int[] hatX = {x - 10, x - 10, x + 10, x + 30, x + 45, x + 60, x + 60};
	int[] hatY = {y + 5, y - 15, y - 15, y - 65, y - 15, y - 15, y + 5};
	c.fillPolygon(hatX, hatY, hatX.length);
	}
    }

    // clears the stickman off the screen, overloaded method
    public void clearSF(int scene, int x, int y, boolean a) {
	synchronized(c) {
	if (scene == 2) {
	    c.setColor(new Color(208, 66, 14));
	}

	// Stickman head
	c.fillOval(x - 50, y, 50, 50);
	c.fillOval(x - 45, 5 + y, 40, 40);

	c.fillRoundRect(x - 150, y + 99, 220, 5, 4, 4);
	c.fillRect(x-200, y+80, 100, 50);

	// Stickman body
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x - 30 - i, y + 48, x - 60 - i, y + 100);
	}

	// Stickman arms
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x - 30 - i, y + 48, x - 30 - i, y + 80);
	    c.drawLine(x - 30 - i, y + 80, x - 10 - i, y + 100);
	}
	c.drawLine(x - 35, y + 80, x - 15, y + 100);

	// Stickman legs
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x - 60 - i, y + 100, x - 40 - i, y + 120);
	    c.drawLine(x - 40 - i, y + 120, x - 75 - i, y + 150);
	}

	// Stickman hat
	int[] hatX = {x + 10, x + 10, x - 10, x - 30, x - 45, x - 60, x - 60};
	int[] hatY = {y + 5, y - 15, y - 15, y - 65, y - 15, y - 15, y + 5};
	c.fillPolygon(hatX, hatY, hatX.length);
	}
    }

    // Fully animates the stickman and removes it for the next frame

    public void dSm(int scene, int x, int y) {
	drawStickman(x, y);
	try {
	    Thread.sleep(30);
	} catch (Exception e) {
	}
	clearSF(scene, x, y);
    }
    public void dSm(int scene, int x, int y, boolean a) {
	drawStickmanBackwards(x, y);
	try {
	    Thread.sleep(30);
	} catch (Exception e) {
	}
	clearSF(scene, x, y, true);
    }
    public void anim1() {
	Font font = new Font("Times New Roman", 0, 12);
	c.setFont(font);
	try {
	    Thread.sleep(10000);
	} catch (Exception e) {
	}
	for (int i = 0; i < 50; i++) {
	    dSm(2, 350, -150 + 2*i, true);//end pos 350, -50
	}
	for(int i = 0; i < 250; i++) {
	    dSm(2, 350 + i, -50 + i, true);//end pos 500, 200
	}
	drawStickman(450, 200);
	try {
	    Thread.sleep(500);
	} catch (Exception e) {
	}
	c.drawString("1v1 me nerd", 530, 150);
	try {
	    Thread.sleep(500);
	} catch (Exception e) {
	}
	c.setColor(new Color(208, 66, 14));
	//c.setColor(Color.white);
	c.fillRect(530, 135, 70, 18);
	try {
	    Thread.sleep(6500);
	} catch (Exception e) {
	}
	c.setColor(stars);
	c.drawString("ayo what was that for", 480, 130);
	try {
	    Thread.sleep(500);
	} catch (Exception e) {
	}
	c.setColor(new Color(208, 66, 14));
	//c.setColor(Color.white);
	c.fillRect(480, 120, 140, 18);
	c.drawString(">:(", 480, 130);
	try {
	    Thread.sleep(500);
	} catch (Exception e) {
	}
	c.setColor(new Color(208, 66, 14));
	//c.setColor(Color.white);
	c.fillRect(480, 120, 40, 18);
	try {
	    Thread.sleep(2000);
	} catch (Exception e) {
	}
    }
    
    public void drawWalking(int x, int y) {
	synchronized(c) {
	c.setColor(Color.black);
	c.fillOval(x - 50, y, 50, 50);
	c.setColor(Color.white);
	c.fillOval(x - 45, 5 + y, 40, 40);
	Color hat = new Color(81, 7, 5); c.setColor(hat);
	int[] hatX = {x + 10, x + 10, x - 10, x - 30, x - 45, x - 60, x - 60};
	int[] hatY = {y + 5, y - 15, y - 15, y - 65, y - 15, y - 15, y + 5};
	c.fillPolygon(hatX, hatY, hatX.length);
	c.setColor(stars);
	c.fillOval(x - 5, y - 5, 4, 4);
	c.fillOval(x - 17, y - 3, 4, 4);
	c.fillOval(x - 23, y - 3, 4, 4);
	c.fillOval(x - 20, y - 30, 4, 4);
	c.fillOval(x - 23, y - 37, 4, 4);
	c.fillOval(x - 23, y - 27, 4, 4);
	c.fillOval(x - 28, y - 14, 4, 4);
	c.fillOval(x - 23, y - 37, 4, 4);
	c.setColor(Color.black);
	//arms
	for(int i = 0; i < 5; i++) {
	    c.drawLine(x - 25 + i, y + 50, x - 10 + i, y + 90);
	    c.drawLine(x - 25 + i, y + 50, x - 40 + i, y + 90);
	}
	//body
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x -25 + i, y + 48, x - 25 + i, y + 100);
	}
	//legs
	for(int i = 0; i < 5; i++) {
	    c.drawLine(x - 25 + i, y + 100, x  - 50 + i, y + 150);
	    c.drawLine(x - 25 + i, y + 100, x + i, y + 150);
	}
	}
    }
    public void drawWalking(int x, int y, boolean a) {
	synchronized(c) {
	c.setColor(Color.black);
	c.fillOval(x - 50, y, 50, 50);
	c.setColor(Color.white);
	c.fillOval(x - 45, 5 + y, 40, 40);
	Color hat = new Color(81, 7, 5); c.setColor(hat);
	int[] hatX = {x + 10, x + 10, x - 10, x - 30, x - 45, x - 60, x - 60};
	int[] hatY = {y + 5, y - 15, y - 15, y - 65, y - 15, y - 15, y + 5};
	c.fillPolygon(hatX, hatY, hatX.length);
	c.setColor(stars);
	c.fillOval(x - 5, y - 5, 4, 4);
	c.fillOval(x - 17, y - 3, 4, 4);
	c.fillOval(x - 23, y - 3, 4, 4);
	c.fillOval(x - 20, y - 30, 4, 4);
	c.fillOval(x - 23, y - 37, 4, 4);
	c.fillOval(x - 23, y - 27, 4, 4);
	c.fillOval(x - 28, y - 14, 4, 4);
	c.fillOval(x - 23, y - 37, 4, 4);
	c.setColor(Color.black);
	//arms
	for(int i = 0; i < 5; i++) {
	    c.drawLine(x - 25 + i, y + 50, x - 10 + i, y + 90);
	    c.drawLine(x - 25 + i, y + 50, x - 40 + i, y + 90);
	}
	//body
	for (int i = 0; i < 5; i++) {
	    c.drawLine(x -25 + i, y + 48, x - 25 + i, y + 100);
	}
	//legs
	for(int i = 0; i < 5; i++) {
	    c.drawLine(x - 25 + i, y + 100, x  - 25 + i, y + 150);
	    c.drawLine(x - 25 + i, y + 100, x +i, y + 150);
	}
	}
    }
    //clears the area around the stickman for the next scene
    public void clearWalking(int x, int y) {
	synchronized(c) {
	c.setColor(new Color(66, 29, 25));
	c.fillRect(x - 60, y - 70, 80, 221);
	}
    }
    
    //draws and erases the stickman
    public void drawLoop(int x, int y) {
	drawWalking(x, y);
	try {Thread.sleep(150);
	} catch (Exception e) {
	}
	clearWalking(x, y);
	drawWalking(x, y, true);
	try {Thread.sleep(150);
	} catch (Exception e) {
	}
	clearWalking(x, y);
    }
    //second animation phase
    public void anim2() {
	try {Thread.sleep(9000);
	} catch (Exception e) {
	}
	for(int i = 0; i < 80; i++) {
	    drawLoop(-20 + i * 3, 249);
	    try {Thread.sleep(50);
	    } catch (Exception e) {
	    }
	}
	drawWalking(220, 249);
    }
    //stickman 2
    public void anim() {
	if (MyCreation.scene == 1) {
	    anim1();
	}
	if (MyCreation.scene == 2) {
	    anim2();
	}
    }
    public void run() {
	// drawStickmanSilhouette(280, 80);
	anim();
    }
}
