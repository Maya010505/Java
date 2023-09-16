import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int u, s;
		u = sc.nextInt(); s = sc.nextInt();
		if (s > u) {System.out.println((s - u) + " стул/а/ьев лишний/х");}
		else if (s < u) {System.out.println((u - s) + " человек/а лишний/х");}
		else {System.out.println("Всё ок");}
	}
}