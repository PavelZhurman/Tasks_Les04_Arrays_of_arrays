package by.htp.les04.main;

public class Task1 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100);
				System.out.printf("[%3d]", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d]", arr[i][i]);
		}
	}

}
