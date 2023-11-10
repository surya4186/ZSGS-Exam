package exam;

import java.util.Scanner;

public class SpiralPattern {
	public static void printPattern(int size) {
		int[][] spiral = new int[size][size];
		int count = 1;
		int top = 0, bottom = size - 1, left = 0, n = size - 1;
		int len = size * (size + 1) / 2;
		while (count <= len) {
			for (int i = top; i <= bottom; i++) {
				spiral[i][left] = count;
				count++;
			}
			left++;
			bottom--;
			for (int i = bottom; i >= top; i--) {
				spiral[i][n] = count;
				count++;

			}
			n--;
			for (int i = n; i >= left; i--) {
				spiral[top][i] = count;
				count++;
			}
			top++;
			bottom--;
		}
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print("  ");
			}

			for (int j = 0; j < size; j++) {
				if (spiral[i][j] != 0) {
					System.out.print(" " + spiral[i][j]);
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = scan.nextInt();
		printPattern(n);

	}

}
