// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);
		int hundreds = (int) (number / 100);//אם אני רוצה שזה יהיה רלוונטי לכל מספר- אני ארשום נמבר מודולו 1000
		int tens = (int) ((number % 100)/10);
		int ones = (number % 10);
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}

