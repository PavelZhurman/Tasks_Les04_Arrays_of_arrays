package by.htp.les04.main;

public class Task3 {
	public static void main(String[] args) {
		int m = 4;
		int n = 5;

		int[][] arr = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				arr[i][j] = (int) (Math.random() * 1000);
				System.out.printf("[%4d]", arr[i][j]);
			}
			System.out.println();

		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = arr[0].length - 1; j >= 0; j--) {

					System.out.printf("[%4d]", arr[i][j]);

				}
				System.out.println();
			} else {

				for (int j = 0; j < arr[0].length; j++) {
					System.out.printf("[%4d]", arr[i][j]);

				}
				System.out.println();

			}

		}
		System.out.println();
	}

}
