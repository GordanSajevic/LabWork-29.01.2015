import java.math.BigDecimal;
import java.util.Currency;
import java.util.Scanner;


public class Money {
	
	BigDecimal value;
	java.util.Currency currency;
	
	public Money(BigDecimal value, Currency currency)
	{
		this.value = value;
		this.currency = currency;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(java.util.Currency currency) {
		this.currency = currency;
	}

	public String toString() {
		return value + " " + currency.getSymbol();
	}
	
	public static Money parse(String moneyString)
	{
		Scanner input = new Scanner(moneyString);
		String valueString = input.next();
		String currencyString = input.next();
		BigDecimal value = new BigDecimal(valueString);
		Currency currency = Currency.getInstance(currencyString);
		return new Money(value, currency);
	}
	

}
