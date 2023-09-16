import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = -100;
		while (true) {
			int x = scanner.nextInt();
			if (x == 0) {break;}
			else if (x > n) {n = x;}
		}
		System.out.println(n);
	}
}