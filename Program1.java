import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int s = 0;

		while (true) {
			int x = scanner.nextInt();
			if (x != 0) s += x;
			else break;
		}
		System.out.println(s);

	}
}