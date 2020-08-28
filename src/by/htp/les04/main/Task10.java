package by.htp.les04.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];

		arr = initArr(arr, n);
		printArr(arr);
		findAndPrint(arr);

	}

	public static int[][] initArr(int[][] mas, int size) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				mas[i][j] = rand.nextInt(150) - 75;
			}
		}
		return mas;
	}

	public static void printArr(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void findAndPrint(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			if (mas[i][i] > 0) {
				System.out.printf("[%3d]", mas[i][i]);
			}
		}
	}

}
