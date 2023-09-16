import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = (x % 10) + (x / 10);
		System.out.println(sum);
	}
}