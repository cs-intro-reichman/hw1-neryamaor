// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int InitialAmount = Integer.parseInt(args[0]);
		double InputRate = Double.parseDouble(args[1]);
		double Rate = InputRate / 100;
		int Years = Integer.parseInt(args[2]);
		double FinalAmount = InitialAmount * Math.pow(1 + Rate, Years);
		System.out.println("After " + Years + " years, $" + InitialAmount + " saved at " + InputRate + "% will yield $" + (int) FinalAmount );
	}
}