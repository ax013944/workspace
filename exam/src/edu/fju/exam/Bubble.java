package edu.fju.exam;

public class Bubble {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int y = 0; y < numbers.length; y++) {
			for (int l = y + 1; 1 < numbers.length; l++) {
				if (numbers[y] >numbers[l]) {
					int bac = numbers[y];
					numbers[y] = numbers[l];
					numbers[l] = bac;
				}
			}
			for (int num : numbers) {
				System.out.print(num + " ");
			}
		}
	}
}
