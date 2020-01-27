import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyFrame extends JFrame{
	private Flock n;
	protected static int width = 600;
	protected static int height = 600;
		
	public MyFrame(Flock n) {
	//	super("Окошко");
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Окошко");
		this.setVisible(true);
		this.setLocation(width / 2, height / 4);
		this.n = n;
		
	}
	@Override
	public void paint(Graphics g) {
//		g.setColor(new Color(255, 99, 0));
//		g.drawLine(50, 50, 100, 100);
//		g.fillOval(100, 100, 50, 50);
		g.translate(width / 2, height / 2);
		g.setColor(Color.black);
		g.drawLine(-width / 2, 0, width / 2, 0);
		g.drawLine(0, height / 2, 0, -height / 2);
		//n.draw(g);
		int X, Y;
		int Xmin, Ymin;
		
		for (int t = 0; t < 3; t++) {
			ArrayList<Integer> f = new ArrayList<>();
			for (int i = 0; i < 15; i++) {
				if (Bird.Koor[i][0] == t) {
					f.add(i);
				}	
			}
			X = Bird.Koor[f.get(1)][1];
			Y = Bird.Koor[f.get(1)][2];
			Xmin = X;
			Ymin = Y;
			for (int i = 0; i < f.size(); i++) {
				if (Bird.Koor[f.get(i)][1] > X) {
					X = Bird.Koor[f.get(i)][1];
				}
				if (Bird.Koor[f.get(i)][1] < Xmin) {
					Xmin = Bird.Koor[f.get(i)][1];
				}
				if (Bird.Koor[f.get(i)][2] > Y) {
					Y = Bird.Koor[f.get(i)][2];
				}
				if (Bird.Koor[f.get(i)][2] < Ymin) {
					Ymin = Bird.Koor[f.get(i)][2];
				}
			}
			String type = null;
			int size = 0;
			if (t == 0) {
				g.setColor(Color.green);
				type = "Крайние точки попугаев. ";
				size = 10;
			}
			if (t == 1) {
				g.setColor(Color.blue);
				type = "Крайние точки пингвинов. ";
				size = 15;
			}
			if (t == 2) {
				g.setColor(Color.pink);
				type = "Крайние точки воробьев. ";
				size = 8;
			}
			System.out.println(type + "X = " + X + "; Xmin = " + Xmin + "; Y = " + Y + "; Ymin = " + Ymin);
			g.drawRect(Xmin, Ymin, X - Xmin + size, Y- Ymin + size);
			n.draw(g);
		}
	}
}
