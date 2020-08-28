package by.htp.les04.main;

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		int m = 10;
		int n = 9;
		int u = 0;
		int count = 0;

		if (m < n) {
			System.out.println("Количество столбцов должно быть не больше количетсва строк");
		} else {

			int[][] arr = new int[m][n];

			Random rand = new Random();

			for (int j = 0; j < arr[0].length; j++) {
				count = 0;

				while (j + 1 != count) {
					u = rand.nextInt(arr.length);

					if (arr[u][j] == 0) {

						arr[u][j] = 1;

						count++;
					}
				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("[%3d]", arr[i][j]);

				}
				System.out.println();
			}
		}
	}
}
