import java.util.Scanner;

public class Program20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, a, b;
		x = input.nextInt();
		a = x / 100; b = x % 10;
		if (a == b) {System.out.println("Симметричное");}
		else {System.out.println("Асимметричное");}
	}
}