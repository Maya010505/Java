import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x % 1000 < 10 && x > 0) {x -= 1;}
		System.out.println(x);
	}
}