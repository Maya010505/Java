import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y1, y2, y3;
		y1 = x % 10;
		y2 = x / 10 % 10;
		y3 = x / 100;
		System.out.println(y1 + " " + y2 + " " + y3);
	}
}