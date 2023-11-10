package exam;

import java.util.Scanner;

public class Zigzag {
	public static void printZigzag(String str, int numRows) {
		int row = 0, col = 0;
		boolean flag = true;
		char[][] charZig = new char[4][str.length()];
		for (int i = 0; i < str.length(); i++) {
			charZig[row][col] = str.charAt(i);
			if (flag) {
				row++;
			} else {
				row--;
				col++;
			}
			if (row == numRows - 1) {
				flag = false;
			} else if (row == 0) {
				flag = true;
			}
		}
		printPattern(charZig);
	}

	public static void printPattern(char[][] charZig) {
		for (int i = 0; i < charZig.length; i++) {
			for (int j = 0; j < charZig[i].length; j++) {
				if (charZig[i][j] != '\0') {
					System.out.print(charZig[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String zigzag = scan.next();
		System.out.print("Enter the NumberOfRows : ");
		int numRows = scan.nextInt();
		printZigzag(zigzag, numRows);
	}

}
