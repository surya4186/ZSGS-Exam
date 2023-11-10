package exam;

import java.util.Scanner;

public class Mathematical {
	public static void mathematical(String str) {
		int count = 0;
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				count++;
			} else if (str.charAt(i) == ')') {
				count--;
			} else if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/' || str.charAt(i) == '*') {
				if (!((str.charAt(i - 1) > 96 && str.charAt(i - 1) <= 122)
						&& (str.charAt(i + 1) > 96 && str.charAt(i + 1) <= 122))) {
					flag = false;
					break;

				}
			}
		}
		if (count == 0 && flag) {
			System.out.println("Valid");
		} else {
			System.out.println("invalid");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input :");
		String str = scan.next();
		mathematical(str);

	}

}
