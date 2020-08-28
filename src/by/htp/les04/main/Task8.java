package by.htp.les04.main;

public class Task8 {

	public static void main(String[] args) {
		int n = 6;
		int count = 0;
		int z = 0;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			z = 1;
			for (int j = 0; j < arr[i].length - count; j++) {

				arr[i][j] = i + z;
				z++;
			}
			count++;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%2d]", arr[i][j]);
			}
			System.out.println();
		}

	}

}
