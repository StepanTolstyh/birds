import java.awt.Color;

public class Macaw extends Bird{
	private String name = "����";
	private static int num = 0;
	private int number = 0;
	public Macaw() {
		num = num + 1;
		number = num;
		size = 10;
		color = Color.green;
		System.out.println("� ������� �" + num);
		Bird.Koor[Bird.num-1][0] = 0;
		System.out.println("� ����� ���� " + Bird.Koor[Bird.num-1][0]);
	}
	public Macaw(String name) {
		this.name = name;
		num = num + 1;
		number = num;
		
		System.out.println("� ������� �" + num);
	}
	public void speak() {
		System.out.println("���� ����� " + this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void dialog(Macaw n) {
		System.out.println("������, ������� " + n.getName() + ". � ������� " + this.name + ".");
	}
	public void dialog (Penguin n) {
		System.out.println("� �������. ������� �� ������� � ����������.");
	}
	public static void kolvo() {
		System.out.println("����� ��� " + num + " �������.");
	}
	public void Nomer() {
		System.out.println("� ������� ����� " + this.number);
	}
}
