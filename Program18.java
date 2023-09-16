import java.util.Scanner;

public class Program18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int s = x % 10 + x / 10 % 10 + x / 100;
		if (x % 2 == 0 && s % 2 == 0) {System.out.println("Дважды четное");}
		else {System.out.println("Не дважды четное");}
	}
}