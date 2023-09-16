import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1, y1;
		x1 = x / 10 * 10 + y % 10;
		y1 = y / 10 * 10 + x % 10;
		System.out.println(x1 + " " + y1);
	}
}