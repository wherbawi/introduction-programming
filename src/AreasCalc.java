import java.time.chrono.ThaiBuddhistChronology;
import java.util.Scanner;

public class AreasCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		e(1);
		for (int i = 0; i < 100; i++) {
			int h = 0;
			
		}
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			printMenu();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("plz ente side");
				int side = scanner.nextInt();
				calcArea(side);
				break;
			case 2:
				System.out.println("plz ente side1");
				int side1 = scanner.nextInt();
				System.out.println("plz ente side2");
				int side2 = scanner.nextInt();
				int area = calcArea(side2, side1);
				System.out.println(area);
				break;
			case 3:
				System.out.println("ci area is ....");
				System.out.println("ci area is ....");
				System.out.println("ci area is ....");
				System.out.println("ci area is ....");
				break;
			case 4:
				System.out.println("ci area is ....");
				System.out.println("ci area is ....");
				System.out.println("ci area is ....");
				System.out.println("ci area is ....");
				break;
			case 5:
				System.out.println("ci area is ....");
				System.out.println("ci area is ....");
				System.out.println("ci area is ....");
				System.out.println("ci area is ....");
				break;
			case -1:
				System.out.println("thx for using...u chosed to exit");

				break;
			default:
				System.out.println("invalid cho. plz try again");
				break;
			}
		} while (choice != -1);

	}

	private static int calcArea(int x1) {
		int area = x1 * x1;
		return area;
	}

	private static int calcArea(int x2, int x1) {
		 int area = x1 * x2;
		return (int) 0.1;
	}

	static double x(int x1, double x2) {
		return 0;
	}

	static double y(int x1, double x2) {
		return 0;
	}
	static void e(double z) {
		System.out.println("double para");
	}

	static void e(int z) {
		System.out.println("int para");
	}


	private static void printMenu() {
		System.out.println("1: calc square");
		System.out.println("2: calc rec");
		System.out.println("3: calc rec");
		System.out.println("4: calc x");
		System.out.println("5: calc y");
		System.out.println("-1: exit");
	}

}
