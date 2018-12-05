package Y2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day_2_2 {

	public static ArrayList<String> ids = new ArrayList<String>();

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File inputText = new File("src/Y2018/santa_inventory.txt");

		Scanner scanner = new Scanner(inputText);

		while (scanner.hasNext()) {
			ids.add(scanner.nextLine());
		}

		System.out.println("Anser is: " + getAnswer());

	}

	public static String getAnswer() {

		for (String string1 : ids) {
			for (String string2 : ids) {
				if (isAlmostSame(string1, string2))
					return removeDifference(string1, string2);
			}
		}
		return "Error";
	}

	public static boolean isAlmostSame(String word1, String word2) {
		int fualt = 0;
		for(int i = 0; i < word1.length(); i++) {
			if(word1.charAt(i) != word2.charAt(i))
				fualt++;
		}
		if(fualt == 1)
			return true;
		else
			return false;
	}

	public static String removeDifference(String word1, String word2) {
		String outcome = "";
		for(int i = 0; i < word1.length(); i++) {
			if(word1.charAt(i) == word2.charAt(i))
				outcome += word1.charAt(i);
		}
		return outcome;
	}

}
