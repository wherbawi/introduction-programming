
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 0;
		if (i > 5)
			j = 20;
		else
			j = 12;
		i = 1;
		int z = i > 10 ? 20 : 12;

		int userInput = 2;
		switch (userInput) {
		case 1:
			System.out.println("here code for case 1. e.g. square area");
			// please enter sise.......area=sisde*side
			break;
		case 2:
			System.out.println("here code for case 2. e.g. rec area");
			break;
		default:
			System.out.println("invalid choice");
			break;
		}

		int userEnteredDay = 1;
		int grade = 99;
		switch (userEnteredDay) {
		case 9:

		case 2:

		case 3:

		case 4:

		case 5:
			System.out.println("week day");
			break;
		case 6:

		case 7:
			System.out.println("weekend");
			break;
		default:
			break;
		}
	}

}
