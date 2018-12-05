
public class GlobalVariable {
	static int numberOfStudents;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfStudents++);
		addstd();
		System.out.println(numberOfStudents);

	}

	private static void f(int x) {
		int numberOfStudents = 0;
		System.out.println(++numberOfStudents);
		// TODO Auto-generated method stub

	}

	private static int addstd() {
		// TODO Auto-generated method stub
		return 0;
	}

}
