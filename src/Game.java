import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = { "welcome", "to", "java" };//the set of word in my game
		String word = words[(int) (Math.random() * words.length)];//randomly select one
		String[] stars = getStars(word);//get an array of stars of size equals the number of letters in word
		printArray(stars);
		while (indexOf("*", stars) != -1) {
			System.out.println("Enter a letter");
			String guess = scanner.nextLine();
			if (word.contains(guess)) {
				updateStars(word, guess, stars);//replace stars with correct guessed letter
				printArray(stars);
			} else
				System.out.println("Wrong Guess. try again");
		}
	}

	private static int indexOf(String key, String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key)
				return i;
		}
		return -1;
	}

	private static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	private static String[] getStars(String word) {
		String[] starsArray = new String[word.length()];
		for (int i = 0; i < starsArray.length; i++) {
			starsArray[i] = "*";
		}
		return starsArray;
	}

	private static void updateStars(String word, String guess, String[] stars) {
		for (int i = 0; i < word.length(); i++) {
			if (word.substring(i, i + 1).equalsIgnoreCase(guess))
				stars[i] = guess;
		}
	}

}
