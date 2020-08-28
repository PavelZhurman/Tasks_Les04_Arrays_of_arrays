package by.htp.les04.main;

import java.util.Random;

public class Task9 {
	public static void main(String[] args) {
		int n = 6;
		int[] arr = new int[n];
		int[][] doubleArr = new int[n][n];

		arr = initArr(n);
		printArr(arr);
		doubleArr = initSquareMatrix(arr, n);
		printDoubleArr(doubleArr);

	}

	private static int[] initArr(int size) {
		int[] mas = new int[size];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(30);
		}
		return mas;
	}

	private static void printArr(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]", mas[i]);
		}
		System.out.println();
	}

	private static int[][] initSquareMatrix(int[] mas, int size) {
		int[][] mas2 = new int[size][size];
		
		for (int i = 0; i < mas.length; i++) {
			mas2[0][i] = mas[i];
		}

		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = (int) Math.pow(mas2[0][j], i + 1);
			}
		}
		return mas2;
	}

	private static void printDoubleArr(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%10d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
