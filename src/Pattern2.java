import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		System.out.println("enter the number.");
		Scanner in = new Scanner(System.in);
		int num_rows = in.nextInt();
		in.close();

		for (int i = num_rows; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = num_rows; k >= i; k--) {
				System.out.print("*");
			}

			System.out.print("\n");
			
		}

	}
}
