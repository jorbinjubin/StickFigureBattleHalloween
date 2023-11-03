import java.awt.*;
import hsa.Console;

public class Lightning extends Thread {
    private Console c;

    public void lightning() {

	for (int i = 0; i <= 300; i++) {
	    c.setColor(new Color(255, 0, 0));
	    c.fillOval(50 + i, 50 + i, 100, 100);
	    try {
		Thread.sleep(20);
	    } catch (Exception e) {}
	    c.setColor(new Color(0, 255, 255));
	    c.fillOval(50 + i, 50 + i, 100, 100);
	}
    }

    public Lightning(Console con) {
	c = con;
    }

    public void run() {
	lightning();
    }
}
