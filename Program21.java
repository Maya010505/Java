import java.util.Scanner;

public class Program21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int a, b;
		a = x % 10; b = x / 10;
		if (a > b) {System.out.println("Вторая цифра больше первой");}
		else {System.out.println("Первая цифра больше второй");}
	}
}