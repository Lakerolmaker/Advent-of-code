package Y2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day_1_2 {

	public static ArrayList<Integer> list_of_frequencies = new ArrayList<Integer>();
	public static int frequency = 0;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File inputText = new File("src/Y2018/input_file.txt"); 
		int pass = 0;
		
		while (true) {
			System.out.println("Pass : " + pass + " - lenght :" + list_of_frequencies.size());
			Scanner scanner = new Scanner(inputText);

			while (scanner.hasNext()) {
				addToList(Integer.valueOf(scanner.nextLine()));
			}
			pass++;
		}
	}

	public static void addToList(int input) {

		frequency += input;
		if (exists(frequency)) {
			System.out.println("First duplicate frequency: " + frequency);
			System.exit(0);
		}

		add(frequency);

	}

	public static void add(int input) {
		list_of_frequencies.add(input);
	}

	public static boolean exists(int input) {
		return list_of_frequencies.contains(input);
	}

}
