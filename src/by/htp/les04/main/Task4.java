package by.htp.les04.main;

public class Task4 {
	public static void main(String[] args) {
		int n = 6;
		int x;
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			x = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = j + 1;
					System.out.printf("[%4d]", arr[i][j]);
				} else {
					arr[i][j] = arr[i].length - x;
					System.out.printf("[%4d]", arr[i][j]);
					x++;
				}

			}
			System.out.println();
		}
	}
}
