
public class drawRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawRect(5, 3);
	}

	private static void drawRect(int width, int height) {
		for (int i = 0; i < height; i++) {
			System.out.println();
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
		}

	}

}
