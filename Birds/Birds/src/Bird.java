import java.awt.*;
import java.util.Date;
public abstract class Bird {
	protected int x;
	protected int y;
	protected int size = 10;
	protected Color color = Color.black;
	protected static int num = 0;
	protected static int[][] Koor = new int[15][3];
	
	public Bird() {
		num = num + 1;
		x = (int) ((MyFrame.width - 50 + 1) * Math.random() - (MyFrame.width - 50) / 2);
		y = (int) ((MyFrame.height- 50 + 1) * Math.random() - (MyFrame.height - 50 ) / 2);
		Koor[num-1][1] = x;
		Koor[num-1][2] = y;
		Date date = new Date();
		int a = (int) (date.getHours() * Math.random());
		if ( a >= 12 && a < 18) {
			System.out.println("� ������ ����� " + num + ". ������ ����.");
		}
		if ( a >= 0 && a < 6) {
			System.out.println("� ������ ����� " + num + ". ������ ����.");
		}
		if ( a >= 6 && a < 12) {
			System.out.println("� ������ ����� " + num + ". ������ ����");
		}
		if ( a >= 18 && a < 24) {
			System.out.println("� ������ ����� " + num + ". ������ �����");
		}
		System.out.println("� �������� �� ����������� X " + x + " � Y " + y);
		
		
		
		
	}
	public void fly() {
		System.out.println("� ����!");
	}
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, size, size);
		
	}
 
	
	
}
