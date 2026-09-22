import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConversion {

    public static void main(String[] args) { cadtousd(); }

    public static void cadtousd() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the amount of Canadian dollars you would like to convert: ");
        BigDecimal cad = input.nextBigDecimal();

        BigDecimal conversionRate = BigDecimal.valueOf(0.71);
        BigDecimal usd = cad.multiply(conversionRate)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("$" +cad+ "CAD = $" +usd+ "USD");
    }
}
