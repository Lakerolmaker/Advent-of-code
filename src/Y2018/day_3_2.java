package Y2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


//: inspiration from https://github.com/kodsnack/

public class day_3_2 {

	public static ArrayList<Square> elems = new ArrayList<Square>();

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File inputText = new File("src/Y2018/fabric_claim.txt");

		Scanner scanner = new Scanner(inputText);

		while (scanner.hasNext()) {
			addClaim(scanner.nextLine());
		}

		scanner.close();
		
		System.out.println("Single claimed id : " + getSingleClaim());

	}

	public static void addClaim(String input) {

		int id = Integer.valueOf(input.substring(input.indexOf("#") + 1, input.indexOf("@") - 1));
		int x = Integer.valueOf(input.substring(input.indexOf("@") + 2, input.indexOf(",")));
		int y = Integer.valueOf(input.substring(input.indexOf(",") + 1, input.indexOf(":")));
		int width = Integer.valueOf(input.substring(input.indexOf(":") + 2, input.indexOf("x")));
		int height = Integer.valueOf(input.substring(input.indexOf("x") + 1, input.length()));

		Square sqr = new Square(id, x, y, width, height);
		
		addSquare(sqr);
		
	}

	public static void addSquare(Square sqr) {
		for(int i = 0; i < elems.size(); i++) {
			 if(elems.get(i).intersects(sqr) > 0) {
				 elems.get(i).increaseIntersectCount();
                 sqr.increaseIntersectCount();   
             }
		}
		elems.add(sqr);
	}


	public static int getSingleClaim() {

		for (Square square : elems) {
			if (square.getIntersectCount() == 0)
				return square.getId();
		}

		return 0;
	}

}
