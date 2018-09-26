import java.util.Scanner;

public class AreaOfCircleWithCheck {

	public static void main(String[] args) {
		System.out.println("please enter the radius");
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		if (r < 0) {
			System.out.println("invalid rad");
		}
		if (r >= 0) {
			double area = r * r * 3.14;
			System.out.println("area is " + area);
		}

		int s = 0;
		int z = 10;
		if (3 > 9)
			s = 10;
		z = 0;
	}

}
