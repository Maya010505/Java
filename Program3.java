import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		while (true) {
			int x = scanner.nextInt();
			if (x == 0) {break;} 
			else {
				if (x == 5) {n += 1;}
				else {continue;}
			}
		if (n > 0) {System.out.println("YES");}
		else {System.out.println("NO");}
		}
	}
}