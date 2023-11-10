package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Laxicographical {
	public static String laxicographical(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		String result = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			result += charArray[i];
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the string" + (i + 1) + ":");
			String str = scan.next();
			System.out.println(laxicographical(str));
		}

	}

}
