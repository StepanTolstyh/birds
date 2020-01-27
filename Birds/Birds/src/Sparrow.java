import java.awt.Color;

public class Sparrow extends Bird{
	public Sparrow() {
		color = Color.pink;
		size = 8;
		System.out.println("Я воробей!");
		Bird.Koor[Bird.num-1][0] = 2;
		System.out.println("Я птица типа " + Bird.Koor[Bird.num-1][0]);
	}
	
}
