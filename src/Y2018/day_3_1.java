package Y2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day_3_1 {

	public static int[][] grid = new int[1000][1000];

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File inputText = new File("src/Y2018/fabric_claim.txt");

		Scanner scanner = new Scanner(inputText);

		while (scanner.hasNext()) {
			addClaim(scanner.nextLine());
		}
		
		 System.out.println("Amount of dublicate claims : " + amountOfDublicates());

	}

	public static void addClaim(String input) {

		int id = Integer.valueOf(input.substring(input.indexOf("#") + 1, input.indexOf("@") - 1));
		int leftPadding = Integer.valueOf(input.substring(input.indexOf("@") + 2, input.indexOf(",")));
		int toppadding = Integer.valueOf(input.substring(input.indexOf(",") + 1, input.indexOf(":")));
		int width = Integer.valueOf(input.substring(input.indexOf(":") + 2, input.indexOf("x")));
		int height = Integer.valueOf(input.substring(input.indexOf("x") + 1, input.length()));

		addSquare(leftPadding, toppadding, width, height);

	}

	public static void addSquare(int left, int top, int width, int height) {

		for (int y = top; y < top + height; y++) {
			for (int x = left; x < left + width; x++) {
				grid[y][x] += 1;
			}
		}

	}

	public static int amountOfDublicates() {
		int amount = 0;

		for (int y = 0; y < grid.length; y++) {
			for (int x = 0; x < grid[y].length; x++) {
				if (grid[y][x] > 1) {
					amount++;
				}
			}
		}

		return amount;
	}

}
