import java.awt.Color;
import java.awt.*;

public class Penguin extends Bird{
	public Penguin() {
		color = Color.blue;
		size = 15;
		System.out.println("Я пингвин!");
		Bird.Koor[Bird.num-1][0] = 1;
		System.out.println("Я птица типа " + Bird.Koor[Bird.num-1][0]);
	}
	@Override
	public void fly() {
		System.out.println("Я не умею летать.");
	}
	public void draw (Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, size, size);
		g.setColor(Color.white);
		g.fillOval(x + size / 2 - 3, y + size / 2 - 3, 6, 6);
	}
}
