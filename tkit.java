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

  public static Color pumpkin = new Color(255, 170, 10); 
  public static Color pumpkinEyes = new Color(255, 219, 77); 
  public static Color pumpkinStem = new Color(112, 58, 3);
  public static Color lightPink = new Color(252, 159, 238);
  public static Color mouse = new Color(212, 212, 212);
  public static Color bat = new Color(58, 9, 96);
  public static Color spider = new Color(74, 0, 0);
  public static Color broom = new Color(237, 197, 128);
  public static Color broom2 = new Color(217, 167, 98);
  public static Color wizardHat = new Color(81, 0, 242);
  public static Color stars = new Color(252, 255, 89);
  public static Color orangeBg = new Color(232, 104, 0);
  public static Color tree = new Color(24, 0, 48);
  public static Color cinderBlocks = new Color(150, 150, 150);
  public static Color branch = new Color(54, 23, 1);
  public static Color moon1 = new Color(102, 0, 0);
  public static Color moon2 = new Color(150, 0, 0);
  public static Color moon3 = new Color(184, 28, 28);
  public static Color lightOrange = new Color(224, 138, 67);
  public static Color walloutline = new Color(90, 90, 90);
  public static Color floor = new Color(120, 120, 120);
  
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
