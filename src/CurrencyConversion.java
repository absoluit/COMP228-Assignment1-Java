import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConversion {

    public static void main(String[] args) { cadtousd(); }

    public static void cadtousd() {
        Scanner input = new Scanner(System.in);     // Creating new scanner named "input"

        System.out.print("Please enter the amount of Canadian dollars you would like to convert: ");
        BigDecimal cad = input.nextBigDecimal();    // Takes the next BigDecimal number and saves it as "cad"

        BigDecimal conversionRate = BigDecimal.valueOf(0.71);   // Conversion rate at the time of completion
        BigDecimal usd = cad.multiply(conversionRate)   // Multiplying "cad" with "conversionRate"
                .setScale(2, RoundingMode.HALF_UP);    // Rounding the product to two decimal places

        System.out.println("$" +cad+ "CAD = $" +usd+ "USD");   
    }
}
