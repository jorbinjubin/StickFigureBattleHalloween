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

    public void drawGhost (int x, int y) {
        c.setColor(Color.white);
        c.fillRect(x, y, 60, 30);
        c.fillArc(x, y-30, 60, 60, 0, 180);
        c.fillArc(x, y+20, 20, 20, 180, 180);
        c.fillArc(x+20, y+20, 20, 20, 180, 180);
        c.fillArc(x+40, y+20, 20, 20, 180, 180);
    }


    public Ghost (Console con){
        c = con;
    }


    public void run () {
        drawGhost(450, 150);
    }
}
