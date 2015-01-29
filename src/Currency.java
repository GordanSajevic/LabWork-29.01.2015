import java.util.Scanner;


public class Currency {

	
	public static void main(String[] args) {
		System.out.println("Enter currency: ");
		Scanner input = new Scanner(System.in);
		String currency = input.nextLine();
		java.util.Currency c = java.util.Currency.getInstance(currency);
		System.out.println("Name: " + c.getDisplayName());
		System.out.println("Symbol: " + c.getSymbol());
	}
}
