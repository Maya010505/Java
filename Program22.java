import java.util.Scanner;

public class Program22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if (x % 2 == 0) {System.out.println("Up to " + (x / 10 * 10 + 10));}
		else {System.out.println("Down to " + (x / 10 * 10));}
	}
}