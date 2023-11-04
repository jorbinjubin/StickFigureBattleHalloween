import java.awt.*;
import hsa.Console;

public class Driver {
    static Console c;
    
    public Driver() {
	c = new Console();
    }
    public static void main(String[] args) {
	Driver d = new Driver();
	Background b = new Background(c);
	Stickman1 s = new Stickman1(c);
	b.run();
	s.run();
    }
}
