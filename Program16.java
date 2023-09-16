import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt(); y = sc.nextInt();
		if (x * y > 0) {System.out.println("Один и тот же знак");}
		else if (x * y < 0) {System.out.println("Разные знаки");}
		else {System.out.println("Некорректно");}
	}
}