package by.htp.les04.main;

public class Task7 {

	public static void main(String[] args) {
		int n = 6;
		int x = 0;
		int count = 0;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			x++;
			for (int j = 0; j < arr[i].length - count; j++) {
				arr[i][j] = x;
			}

			count++;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("[%3d]", arr[i][j]);
			}
			System.out.println();
		}

	}

}
