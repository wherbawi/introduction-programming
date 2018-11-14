import java.util.Scanner;

public class ArraysLectureUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] grades = new int[10];
		int x = 0;
		while (x < 10) {
			System.out.println("plz enter a grade");
			grades[x] = scanner.nextInt();
			x++;
		}

		findAvg(grades);

	}

	private static void findAvg(int[] grades) {
		double average;
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		average = sum / grades.length;
		System.out.println("the avg is " + average);
		for (int z = 0; z < grades.length; z++) {
			if (grades[z] > average) {
				System.out.println("this is greater than avg" + grades[z]);
			}
		}
	}

}
