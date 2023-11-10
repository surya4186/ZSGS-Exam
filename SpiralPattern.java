package exam;

import java.util.Scanner;

public class SpiralPattern {
	public static void printPattern(int size) {
		int[][] spiral = new int[size][size];
		int count = 1;
		int top = 0, bottom = size - 1;
		int b = 0, n = size - 1;
		int len = size * (size + 1) / 2;
		while (count <= len) {
			for (int i = top; i <= bottom; i++) {
				spiral[i][b] = count;

				count++;

			}
			b++;
			bottom--;
			for (int i = bottom; i >= top; i--) {
				spiral[i][n] = count;
				count++;

			}
			n--;
			for (int i = n; i >= b; i--) {
				spiral[top][i] = count;
				count++;
			}
			top++;
			bottom--;
		}
		for (int i = 0; i < bottom; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print("  ");
			}

			for (int j = 0; j < bottom; j++) {
				if (spiral[i][j] == 0)
					continue;
				System.out.print(" " + spiral[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPattern(n);

	}

}
