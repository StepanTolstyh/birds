import java.util.ArrayList;

import java.awt.*;


public class Flock {
	private ArrayList<Bird> f = new ArrayList<>();
	
	public Flock() {
		int a;
		for(int i = 1; i <= 15; i++) {
			a = (int) (Math.random() * 3);
			System.out.println(a);
			if (a == 0) {
				f.add(new Macaw());
				
			}
			if (a == 1) {
				f.add(new Penguin());
			}
			if (a == 2) {
				f.add(new Sparrow());
			}
			if (a == 3) {
				System.out.println("В стае находится " + i + " птиц(ы).");
				break;
			}
		
		}
		
		
		
	}
	public void fly() {
		for (int i = 1; i <= f.size(); i++) {
			f.get(i).fly();
		}
		System.out.println("Мы стая, мы летим, или не летим. Точнее летят не только лишь все, а лишь немногие.");
	}
	public void draw(Graphics g) {
		for (int i = 0; i < f.size(); i++) {
			f.get(i).draw(g);
		}
		
	}
	
}
