import java.math.BigDecimal;
import java.util.Scanner;


public class BigDecimalIntro {

	public static void main(String[] args) {
		BigDecimal dec;
		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		String decimalString = input.nextLine();
		dec = new BigDecimal(decimalString);
		dec = dec.multiply(new BigDecimal(2));
		System.out.println( dec);

	}

}
