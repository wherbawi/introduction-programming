
public class GPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 11;
		boolean even;
		if (x % 2 == 0)
			even = true;
		else
			even = false;

		int z = 13;
		boolean even2 = z % 2 == 0;
		System.out.println("the number  z is even " + even2);
		System.out.println("the number is even " + even);

		int grade = 70;

		if (grade >= 90) {
			System.out.println("a");
		} else if (grade >= 80) {
			System.out.println("b");
		} else if (grade >= 70) {
			System.out.println("c");
		} else {
			System.out.println("f");
		}
	}
}
