import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class

public class Bubble extends Thread {
    private Console c;
    private int size;
    private int speed;
    private int delay;

    public void bubble() {
    
    }

    public Bubble(Console con) {
	c = con;
    }
    public Bubble(Console con, int s) {
	c = con;
	speed = s;

    }

    public Bubble(Console con, int s, int t) {
	c = con;
	speed = s;
	size = t

    }

    public void run() {
	cloud();
    }
}
