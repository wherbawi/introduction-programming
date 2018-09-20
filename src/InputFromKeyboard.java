import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		int x;
		Scanner inputHelper = new Scanner(System.in);
		System.out.println("please enter a number to get it +5");
		x = inputHelper.nextInt();
		inputHelper.nextLine();
		System.out.println(x + 5);
		System.out.println("please enter your name");
		String name;
		name = inputHelper.nextLine();
		System.out.println("wlecome " + name);

	}

}
