import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		for (int i = x; i <= y; i++) {
			if (i % 3 == 0) System.out.println(i);
		}
	}
}