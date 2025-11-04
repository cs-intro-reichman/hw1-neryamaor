// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int Max = (int) Integer.parseInt(args[0]);
	int a = (int) (Math.random() * Max);
	int b = (int) (Math.random() * Max);
	int c = (int) (Math.random() * Max);
	System.out.println(a + " " + b + " " + c);
	int small = Math.min(a, Math.min(b, c));
	int big = Math.max(a, Math.max(b, c));
	int middle = (a + b + c) - big - small;
	System.out.println(small + " " + middle + " " + big);
	}
}