import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class VolumeConversion {

    public static void main(String[] args) { litrestogallons(); }

    public static void litrestogallons() {
        Scanner input = new Scanner(System.in);     // Creating new scanner as "input"

        System.out.print("Enter the amount of litres that you would like to convert to gallons: ");
        BigDecimal litres = input.nextBigDecimal();     // Saving the next inputted BigDecimal as "litres"

        BigDecimal conversionRate = BigDecimal.valueOf(0.264172);   // Conversion rate of litres to gallons
        BigDecimal gallons = litres.multiply(conversionRate)       // Multiplying "litres" by "conversionRate" to get "gallons"
                .setScale(2, RoundingMode.HALF_UP);     // Rounding to two decimal places

        System.out.println(litres+ " litres = " +gallons+ " gallons");
    }
}
