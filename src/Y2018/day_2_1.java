package Y2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day_2_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File inputText = new File("src/Y2018/santa_inventory.txt");

		Scanner scanner = new Scanner(inputText);

		int two = 0;
		int three = 0;
		
		while (scanner.hasNext()) {
			String word = scanner.nextLine();
			if(hasTwo(word))
				two++;
			if(hasThree(word))
				three++;
		}
		
		int checksum = two * three;
		
		System.out.println("Checksum : " +checksum );

	}

	public static boolean hasTwo(String input) {
		for (char ex : input.toCharArray()) {
			int counter = 0;
			for (char letter : input.toCharArray()) {
				if (ex == letter)
					counter++;
			}
			if (counter == 2)
				return true;
		}
		return false;
	}

	public static boolean hasThree(String input) {
		for (char ex : input.toCharArray()) {
			int counter = 0;
			for (char letter : input.toCharArray()) {
				if (ex == letter)
					counter++;
			}
			if (counter == 3)
				return true;
		}
		return false;
	}

}
