package by.htp.les04.main;

public class Task2 {
	public static void main(String[] args) {
		int k = 0;
		int p = 5;
		int[][] arr = new int[5][6];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int) (Math.random() * 100);
				if (i == k) {
					System.out.printf("[%3d]", arr[i][j]);
				}

			}
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				if (j == p) {
					System.out.printf("[%3d]", arr[i][j]);
					System.out.println();
				}
			}
		}
	}
}
