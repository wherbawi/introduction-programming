import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringLecture {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("c://teaching//tmp.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		System.out.println("end of file");

		System.out.printf("java \t\t\t is interesting %b %d percent \n", true, 80);
		System.out.printf("java                   is interesting" + true + " " + 80 + "percent\n");
		System.out.println("please enter a \" ");
		System.out.println("please enter a \\ ");
		Scanner s3 = new Scanner(System.in);
		String mytext = s3.next();
		int myInt = Integer.parseInt(mytext);
		System.out.println(myInt * 3);

		String x5 = "welcome to java";
		System.out.println(x5.endsWith("java"));
		System.out.println(x5.indexOf("c"));
		System.out.println(x5.indexOf("e"));
		System.out.println(x5.indexOf("e", 3));
		System.out.println(x5.lastIndexOf("a"));
		System.out.println(x5.indexOf("e", 7));
		System.out.println(x5.lastIndexOf("a", 13));

		String x3 = "ACb";
		String x4 = "ACB";
		int result = x3.compareTo(x4);
		System.out.println(result);

		String x1 = "hi";
		boolean r = x1.equalsIgnoreCase("Hi");
		System.out.println(r);

		String myWholeString = "you are welcome";
		String myNewString = myWholeString.substring(0, myWholeString.length());
		String myNewString2 = myWholeString.substring(4);

		System.out.println(myNewString2);

		String toTrimString = "     hi jkjj";
		System.out.println(toTrimString.trim());
		System.out.println(toTrimString);

		String x = "hello world";
		System.out.println(x.length());
		System.out.println(x.charAt(6));
		System.out.println(x.toUpperCase());
		x = x.concat(" java");

		System.out.println(x);

	}

}
