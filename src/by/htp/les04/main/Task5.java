package by.htp.les04.main;

public class Task5 {
	public static void main(String[] args) {
		int n = 6;
		int z = 0;

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			n--;
			z++;
			for (int j = 0; j < arr[i].length; j++) {
				if (n == j) {
					arr[i][j] = z;
					System.out.printf("[%3d]", arr[i][j]);
				} else {
					System.out.printf("[%3d]", arr[i][j]);
				}
			}
			System.out.println();
		}

	}
}
