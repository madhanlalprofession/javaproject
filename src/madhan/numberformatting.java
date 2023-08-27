package madhan;

import java.text.NumberFormat;

public class numberformatting {
	public static void main(String[]args) {
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		String amount=currency.format(12345678.67);
		System.out.println(amount);
		
	}

}
