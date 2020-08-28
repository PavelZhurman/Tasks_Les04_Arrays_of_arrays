package by.htp.les04.main;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		int[][] arr = new int[10][20];

		arr = initArr(arr);
		printArr(arr);
		findAndPrint(arr);

	}

	public static int[][] initArr(int[][] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(15);
			}
		}
		return mas;
	}

	public static void printArr(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void findAndPrint(int[][] mas) {
		int count;
		for (int i = 0; i < mas.length; i++) {
			count = 0;
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5)
					count++;

			}
			if (count >= 3)
				System.out.println("В " + i + " строке " + count + " числа равных пяти");
		}
	}

}
