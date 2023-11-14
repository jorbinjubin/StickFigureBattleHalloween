import hsa.Console;
import java.awt.*;
/*
 * A simple transition between scenes
 * @author Justin Jiang, Fei Wang
 * ICS3UP
 * 2023/11/02
 */
public class Transition {
    private Console c;
    public void draw() {
	c.setColor(Color.black);
	c.fillRect(0, 0, 640, 500);
	Font f = new Font("Times New Roman", 0, 80);
	c.setFont(f);
	c.setColor(Color.white);
	c.drawString("A few mintues later...", 30, 130);
	try {Thread.sleep(300);
	}catch(Exception e){}
	c.drawString("They find a cave and go inside", 10, 200);
	try {Thread.sleep(500);
	}catch(Exception e){}
	Font f1 = new Font("Times New Roman", 0, 30);
	c.setFont(f1);
	c.drawString("Press any key to continue", 200, 300);
    }
    public Transition(Console con) {
	c = con;
    }
    public void run() { 
	draw();
    }
}
