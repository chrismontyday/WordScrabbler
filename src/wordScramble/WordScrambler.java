package wordScramble;

import java.util.ArrayList;
import java.util.Scanner;

public class WordScrambler {

	private static ArrayList<String> adjectives = new ArrayList<>();
	private static ArrayList<String> nouns = new ArrayList<>();

	public static void main(String[] args) {

		askNumber();
	}
	
	public static void askNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number");
		try {
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			repeatDisplay(num);
		} catch (Exception e) {
			System.out.println("Ain't you ever typed a number before? Try again!");
			askNumber();
		}
		
	}

	public static void repeatDisplay(int num) {
		for (int i = 0; i < num; i++) {
			display();
		}
	}

	public static void display() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type in a noun");
		String input = scanner.nextLine();
		nouns.add(input.toString());

		System.out.println("Type in an adjective");
		String input2 = scanner.nextLine();
		adjectives.add(input2.toString());

		randomSentence(randomNoun(), randomAdj());

	}

	public static int randomNumber(int limit) {
		int randomInt = (int) (limit * Math.random());
		return randomInt;
	}

	public static String randomNoun() {

		int size = randomNumber(nouns.size());

		return nouns.get(size);
	}

	public static String randomAdj() {

		int size = randomNumber(adjectives.size());

		return adjectives.get(size);
	}

	public static void randomSentence(String noun, String adj) {

		int num = randomNumber(adjectives.size());
		String nounTwo = randomNoun();
		String adjTwo = randomAdj();

		if (num == 0) {
			System.out.println("The " + noun + " is very " + adj);
		} else if (num == 1) {
			System.out.println("How " + adj + " is your " + noun + " would you say?");
		} else if (num == 2) {
			System.out.println("I really hate " + adj + " and " + adjTwo + " " + noun + "s.");
		} else if (num == 3) {
			System.out.println("If you take a " + adj + " " + noun + " and add a " + nounTwo
					+ " then you got yourself an extremely " + adjTwo + " " + noun);
		} else if (num == 4) {
			System.out.println("If I had a " + noun + " for every time I heard that! Then I'd have a " + adj + " "
					+ nounTwo + ".");
		} else if (num == 5) {
			System.out.println("Take a " + adj + " " + adjTwo + " " + noun + " and put it on your " + nounTwo + ".");
		} else if (num == 6) {
			System.out.println(
					"If feared for my " + noun + "'s life. I had never seen such a " + adj + " " + nounTwo + ".");
		}

	}

}
