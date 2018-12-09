package Y2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//: inspiration from https://github.com/kodsnack/

public class day_5_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File inputText = new File("src/Y2018/polymer.txt");

		Scanner scanner = new Scanner(inputText);

		String input = scanner.nextLine();

		scanner.close();

		char[] alphabet = IntStream.rangeClosed('a', 'z').mapToObj(c -> "" + (char) c).collect(Collectors.joining())
				.toCharArray();

		int min = Integer.MAX_VALUE;
		for (char c : alphabet) {
			String tmp = input;
			tmp = tmp.replace("" + c, "");
			tmp = tmp.replace("" + Character.toUpperCase(c), "");
			String reaction = react(tmp);
			if (reaction.length() <= min) {
				min = reaction.length();
				System.out.println(min);
			}
		}

		System.out.println("Shortest polymer lenght : " + min);

	}

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
