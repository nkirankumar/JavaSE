package my.misc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MyDecimalFormatValidate {
	public static void main(String args[]) {

		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat
				.getNumberInstance(new Locale("en"));
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat
				.getDecimalFormatSymbols();
		System.out.println("getNaN="+decimalFormatSymbols.getNaN());
		System.out.println("getDigit="+decimalFormatSymbols.getDigit());
		System.out.println("getExponentSeparator="+decimalFormatSymbols.getExponentSeparator());
		System.out.println("getPatternSeparator="+decimalFormatSymbols.getPatternSeparator());
		System.out.println("getDecimalSeparator="+decimalFormatSymbols.getDecimalSeparator());
		System.out.println("getGroupingSeparator="+decimalFormatSymbols.getGroupingSeparator());
		
		
		try {
			Number numberel = decimalFormat.parse("123.456.789,123");//el
			//Number numberen = decimalFormat.parse("123,456,789.123");//en
			String form=decimalFormat.format(numberel);
			System.out.println("numberel="+decimalFormat.format(numberel));
			//System.out.println("numberen="+decimalFormat.format(numberen));
			String pattern = "###.###,###";
			DecimalFormat decimalFormat1 = new DecimalFormat(pattern);
			Number number1 = decimalFormat1.parse("789,123");
			System.out.println(number1);
			String format = decimalFormat1.format(123456789);
			System.out.println(format);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
