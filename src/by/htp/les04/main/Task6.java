package by.htp.les04.main;

public class Task6 {
	public static void main(String[] args) {
		int n = 6;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == 0 | j == 0 | i == arr.length - 1 | j == arr[i].length - 1) {
					arr[i][j] = 1;
					System.out.printf("[%3d]", arr[i][j]);
				} else {
					System.out.printf("[%3d]", arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
