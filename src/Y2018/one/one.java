package Y2018.one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class one {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File inputText = new File("src/Y2018/one/input_file.txt"); 
		
		Scanner scanner = new Scanner(inputText);
		
		int frequency = 0;
		
		while(scanner.hasNext()) {
			frequency += scanner.nextInt();
		}
		
		System.out.println("Final frequency : " + frequency );
		
	}

}
