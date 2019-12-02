package wordScramble;

import java.util.ArrayList;
import java.util.Scanner;

public class WordScrambler {

	private static ArrayList<String> adjectives = new ArrayList<>();
	private static ArrayList<String> nouns = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		repeatDisplay(num);
	}
	
	public static void repeatDisplay(int num) {
		for(int i = 0; i < num; i++) {
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
		
		System.out.println("The " + randomNoun() + " was " + randomAdj());
		
	}

	public static int randomNumber(int limit) {
		 int randomInt = (int)(limit * Math.random());
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

}
