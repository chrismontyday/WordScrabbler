package wordScramble;

import java.util.ArrayList;
import java.util.Scanner;

public class WordScrambler {

	private static ArrayList<String> adjectives = new ArrayList<>();
	private static ArrayList<String> nouns = new ArrayList<>();
	private static ArrayList<String> names = new ArrayList<>();
	private static ArrayList<String> verbs = new ArrayList<>();
	private static int questions = 1;

	public static void main(String[] args) {
		
		while (true) {
		display();
		}
	}

	public static void display() {

		Scanner scanner = new Scanner(System.in);
		
		if (questions % 4 == 0) {
			System.out.println("Type in someone's name.");
			String input = scanner.nextLine();
			names.add(input.toString());
			
			randomSentence(randomNoun(), randomAdj());
			System.out.println("\n");
			questions++;
			
		} else if (questions % 5 == 0) {
			System.out.println("Type in a verb.");
			String input = scanner.nextLine();
			verbs.add(input.toString());
			
			randomSentence(randomNoun(), randomAdj());
			System.out.println("\n");
			questions++;
		} else
			askAndDisplay();
			
	}
	
	public static void askAndDisplay() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type in a noun(thing)");
		String input = scanner.nextLine();
		nouns.add(input.toString());

		System.out.println("Type in an adjective(descriptor)");
		String input2 = scanner.nextLine();
		adjectives.add(input2.toString());

		randomSentence(randomNoun(), randomAdj());
		System.out.println("\n");
		questions++;
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
	
	public static String randomName() {
		if (questions>=4) {
		int size = randomNumber(names.size());
		return names.get(size);
		}
		return "Frank";
	}
	
	public static String randomVerb() {
		if (questions>=5 ) {
		int size = randomNumber(verbs.size());
		return verbs.get(size);
		} else
			return "Corn Nobbled";
	}

	public static void randomSentence(String noun, String adj) {
		
		int num = randomNumber(adjectives.size());
		
		String nounTwo = randomNoun();
		String adjTwo = randomAdj();
		String name = randomName();
		String verb = randomVerb();
		
		if (num == 0) {
			System.out.println("The " + noun + " is very " + adj);
		} else if (num == 1) {
			System.out.println("How " + adj + " is your " + noun + " would you say?... don't answer that");
		} else if (num == 2) {
			System.out.println("I really hate " + adj + " and " + adjTwo + " " + noun + "s.");
		} else if (num == 3) {
			System.out.println("If you take a " + adj + " " + noun + " and add a " + nounTwo
					+ " then you got yourself an extremely " + adjTwo + " " + noun);
		} else if (num == 4) {
			System.out.println("If I had a " + noun + " for every time I heard that! Then I'd have a " + adj + " "
					+ nounTwo + ".");
		} else if (num == 5) {
			System.out.println("Take a " + adj + " " + adjTwo + " " + noun + " and put it on your " + nounTwo + " " + name + ".");
		} else if (num == 6) {
			System.out.println(
					"If feared for my " + noun + "'s life." + name + " had never seen such a " + adj + " " + nounTwo + " " + verb + " like that before.");
		} else if (num == 7) {
			System.out.println("Don't look at my " + noun + " like that " + name + "!");
		} else if (num == 8) {
			System.out.println("It was a " + adj + " and " + adjTwo + " night when the " + noun + " " + verb + " into the " + nounTwo + ".");
		} else if (num == 9) {
			System.out.println(
					"Just me and my " + adj + " " + adjTwo + " " + noun + " against your big " + nounTwo + " " + name + ". There's no telling who's gonna " + verb + " first.");
		} else
			System.out.println("Don't waste my " + noun + " on " + nounTwo + "s you " + adj + " dunderheads!" + " I'm talking to you " + name + "!");

	}

}
