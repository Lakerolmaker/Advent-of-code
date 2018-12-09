package Y2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//: inspiration from https://github.com/kodsnack/

public class day_5_1 {

	// public static List<Character> polymer = new ArrayList<Character>();
	//public static String polymer = "";

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File inputText = new File("src/Y2018/polymer.txt");

		Scanner scanner = new Scanner(inputText);

		String input = scanner.nextLine();

		// char[] line = string.toCharArray();

		// addToList(line);

		scanner.close();

		String output = react(input);

		System.out.println("Final plymer lenght : " + output.length());

	}
	/*
	 * public static void addToList(char[] input) { for (char c : input) {
	 * polymer.add(c); } }
	 */

	public static String react(String polymer)
    {
		StringBuilder input = new StringBuilder(polymer);
        int i = 0;
        while (true)
        {
            if (i >= input.length() - 1)
            {
                return input.toString();
            }

            char a = input.charAt(i);
            char b = input.charAt(i + 1);

            if (a != b && Character.toLowerCase(a) == Character.toLowerCase(b))
            {
                input.deleteCharAt(i + 1);
                input.deleteCharAt(i);
                i = 0 > i - 1 ? 0 : i - 1;

                continue;
            }

            i++;
        }
    }



}
