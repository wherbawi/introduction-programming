
public class AugmentedAssignment {

	public static void main(String[] args) {
		int x = 20;
		x += 10; // this equals x = x + 10;
		x *= 10;// x=x*10
		x /= 10; // x=x/10;

		int y = 100;
		int z = y++; // equals z=y then y=y+1
		System.out.println(z);
		System.out.println(y);

		int q = 20;
		int w = ++q; // equals q=q+1 then w=q
		System.out.println("q is " + q);
		System.out.println("w is " + w);
		
		int f = 10;
		System.out.println(f++*10);
		
		int g=10;
		System.out.println(++g*10);
	}

}
