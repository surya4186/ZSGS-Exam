package exam;

import java.util.Scanner;

public class JumbledNumber {
	public static boolean jumbledNumber(int number) {
		int tem = number % 10;
		number = number / 10;
		while (number != 0) {
			if (Math.abs(tem - (number % 10)) != 1) {
				return false;
			}
			tem = number % 10;
			number = number / 10;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scan.nextInt();
		if (jumbledNumber(number)) {
			System.out.println(number + " is a jumbled number");
		} else {
			System.out.println(number + " is not jumbled number");
		}

	}

}
