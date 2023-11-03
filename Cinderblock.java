import hsa.Console;
import java.awt.*;
import java.lang.*;
/*
 * Draws the cinderblock lines on the brick wall (it would take forever to implement getting the positon of all the moving things
 * @authors Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */
public class Cinderblock {
    public static void drawBricks() {
	Color outline = new Color(90, 90, 90);

	for (int i = 0; i < 375; i += 40) {
	    c.setColor(outline);
	    c.drawLine(0, i, 640, i);
	    c.drawLine(0, i + 1, 640, i + 1);
	    c.drawLine(0, i + 2, 640, i + 2);
	}

	for (int i = 0; i < 340; i += 80) {
	    c.drawLine(80, i, 80, i + 40);
	    c.drawLine(160, i, 160, i + 40);
	    c.drawLine(240, i, 240, i + 40);
	    c.drawLine(320, i, 320, i + 40);
	    c.drawLine(400, i, 400, i + 40);
	    c.drawLine(480, i, 480, i + 40);
	    c.drawLine(560, i, 560, i + 40);
	    c.drawLine(640, i, 640, i + 40);

	    c.drawLine(81, i, 81, i + 40);
	    c.drawLine(161, i, 161, i + 40);
	    c.drawLine(241, i, 241, i + 40);
	    c.drawLine(321, i, 321, i + 40);
	    c.drawLine(401, i, 401, i + 40);
	    c.drawLine(481, i, 481, i + 40);
	    c.drawLine(561, i, 561, i + 40);
	    c.drawLine(641, i, 641, i + 40);
	}

	for (int i = 40; i < 335; i += 80) {
	    c.drawLine(40, i, 40, i + 40);
	    c.drawLine(120, i, 120, i + 40);
	    c.drawLine(200, i, 200, i + 40);
	    c.drawLine(280, i, 280, i + 40);
	    c.drawLine(360, i, 360, i + 40);
	    c.drawLine(440, i, 440, i + 40);
	    c.drawLine(520, i, 520, i + 40);
	    c.drawLine(600, i, 600, i + 40);

	    c.drawLine(41, i, 41, i + 40);
	    c.drawLine(121, i, 121, i + 40);
	    c.drawLine(201, i, 201, i + 40);
	    c.drawLine(281, i, 281, i + 40);
	    c.drawLine(361, i, 361, i + 40);
	    c.drawLine(441, i, 441, i + 40);
	    c.drawLine(521, i, 521, i + 40);
	    c.drawLine(601, i, 601, i + 40);
	}
    }
}
