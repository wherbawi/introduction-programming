import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		char x = 'a';
		int w = x;
		char z = (char) (w + 1);
		char c='d';
		System.out.println(++c);
		System.out.println(x);
		System.out.println(w);
		System.out.println(z);
		System.out.println((int) z);

		int userInput = 'D';
		if ((userInput >= 'a' && userInput <= 'z') || (userInput >= 'A' && userInput <= 'Z'))
			System.out.println("is a letter");
		else
			System.out.println("not eng letter");
		Scanner s = new Scanner(System.in);
		System.out.println("please enter a letter");
		char input2 = s.next().charAt(0);
		if (input2 >= 'a' && input2 <= 'z')
			System.out.println("small " +input2);
		
		System.out.println(Character.isLowerCase('a'));
	}


}
