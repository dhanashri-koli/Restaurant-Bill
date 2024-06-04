import java.util.Scanner;

public class Restaurants {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] s = new String[] { "Idly  ", "Meduwada  ", "Dosa   ", "Chinese  ", "Pizza  ", "Faludaa ", "Burger   ",
				" Pulav  ", "Coffee   ", "Quit  " };
		int[] rate = new int[] { 25, 45, 30, 150, 299, 50, 130, 80, 25, 0 };
		int[] qt = new int[10];
		int sum = 0;
		boolean quit = true;

		do {
			System.out.println("ITEM" + "\t\t\tPrice");
			for (int i = 0; i < 10; i++)
				System.out.println((i + 1) + "." + s[i] + "\t\t" + rate[i]);

			int ch = input.nextInt();
			if (ch > 0 && ch < 10) {
				System.out.println("enter the no of quantites of " + s[ch - 1]);
				int q = input.nextInt();
				qt[ch - 1] += q;

			} else {
				quit = false;

			}

			
		} while (quit);

		System.out.println("Your Orders are:\n");
		for (int i = 0; i < 10; i++) {
			if (qt[i] != 0) {
				sum += qt[i] * rate[i];
				System.out.println(s[i] + "*   " + qt[i] + " :--- " + qt[i] * rate[i] + "" + "/- .");

			}
		}

		System.out.println("Your total bill Rs = " + sum + " /- .");

		System.out.println("Please Visit Again!!! ");
		System.out.println("Thank You...");

	}

}