import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x % 10 * 10 + x / 10;
		y += 8;
		System.out.println(y);
	}
}