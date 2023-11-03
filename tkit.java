import hsa.Console;
import java.awt.*;
import java.lang.*;

/*
 * Toolkit for Stickman Battles: Halloween
 * @author Justin Jiang, Fei Wang
 * ICS3UP
 *   2023/11/02
 */
public class tkit {

    private static Console c;
    public static void delay(int ms) {
	try {Thread.sleep(ms);} catch (Exception e) {}
    }

    public static void pauseProgram() {
	c.getChar();
    }

    public static void fancyprint(String s1, int x, int y, int speed) {
	for (int i = 0; i <= s1.length(); i++) {
	    c.drawString(s1.substring(0, i), x, y);
	    try{ Thread.sleep(speed);} catch(Exception e) {};
	}
    }

    public static double getSlope(int x1, int y1, int x2, int y2) {
	double slope = (y2 - y1) / (x2 - x1);
	return slope;
    }
    
    public tkit(Console con) {
	c = con;
    }
}
