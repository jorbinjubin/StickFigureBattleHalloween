/*
 * Draws the ghosts using arcs, ovals, rects, and polygons.
 * to allow us to make bubbles of many sizes, colors, and speeds.
 * @authors Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Ghost extends Thread {
    private Console c;
    private static Color lightPink = new Color(252, 159, 238);
    
    public void drawGhost (int x, int y) {
        c.setColor(Color.white);
        c.fillRect(x, y, 60, 40);
        c.fillArc(x, y-30, 60, 60, 0, 180);
        c.fillArc(x-1, y+30, 22, 20, 180, 180);
        c.fillArc(x+19, y+30, 22, 20, 180, 180);
        c.fillArc(x+39, y+30, 22, 20, 180, 180);
        
        c.setColor(Color.black);
        c.fillOval(x+12, y-2, 10, 15);
        c.fillOval(x+40, y-2, 10, 15);
        
        //tongue
        c.setColor(lightPink);
        int[] n = {x+23, x+38, x+31, x+29};
        int[] m = {y+20, y+20, y+25, y+25};
        c.fillPolygon(n, m, 4);
    }


    public Ghost (Console con){
        c = con;
    }


    public void run () {
        drawGhost(450, 150);
    }
}
