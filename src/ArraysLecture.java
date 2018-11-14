import java.util.Scanner;

public class ArraysLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int grade;
		int[] grades = new int[10];
		int x = 0;
		while (x < 10) {
			System.out.println("plz enter a grade");
			grade = scanner.nextInt();
			grades[x] = grade;
			sum += grade;
			count++;
			x++;
		}

		double average = sum / count;
		System.out.println("the avg is " + average);
		for (int z = 0; z < grades.length; z++) {
			if (grades[z] > average) {
				System.out.println("this is greater than avg" + grades[z]);
			}
		}

	}

}
