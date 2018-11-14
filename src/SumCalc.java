
public class SumCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] n = { 1, 2, 5, 6, 7 };
		double r = sum(n);
		System.out.println(r);

	}

	static double sum(double[] numbers) {
		double result = 0;
		for (int i = 0; i < numbers.length; i++) {
			result = result + numbers[i];
		}
		return result;
	}

}
