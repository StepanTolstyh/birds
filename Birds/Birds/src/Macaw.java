import java.awt.Color;

public class Macaw extends Bird{
	private String name = "Кеша";
	private static int num = 0;
	private int number = 0;
	public Macaw() {
		num = num + 1;
		number = num;
		size = 10;
		color = Color.green;
		System.out.println("Я попугай №" + num);
		Bird.Koor[Bird.num-1][0] = 0;
		System.out.println("Я птица типа " + Bird.Koor[Bird.num-1][0]);
	}
	public Macaw(String name) {
		this.name = name;
		num = num + 1;
		number = num;
		
		System.out.println("Я попугай №" + num);
	}
	public void speak() {
		System.out.println("Меня зовут " + this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void dialog(Macaw n) {
		System.out.println("Привет, попугай " + n.getName() + ". Я попугай " + this.name + ".");
	}
	public void dialog (Penguin n) {
		System.out.println("Я попугай. Попугаи не говорят с пингвинами.");
	}
	public static void kolvo() {
		System.out.println("Всего нас " + num + " попугая.");
	}
	public void Nomer() {
		System.out.println("Я попугай номер " + this.number);
	}
}
