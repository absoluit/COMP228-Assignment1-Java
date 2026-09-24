import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class DistanceConversion {

    public static void main(String[] args) {
        milestokm();
    }

    public static void milestokm() {
        Scanner input = new Scanner(System.in);     // Creating new scanner named "input"

        System.out.print("Please enter the number of miles you'd like to convert: ");
        BigDecimal miles = input.nextBigDecimal();  // Saves the next BigDecimal number as "miles"

        BigDecimal conversionRate = BigDecimal.valueOf(1.60934);    // The conversion rate to calculate miles to km
        BigDecimal km = miles.multiply(conversionRate)      // Multiply the value of "miles" with the conversion rate to calc. "km"
                .setScale(2, RoundingMode.HALF_UP);     // Rounding to two decimals

        System.out.println(miles + " miles = " + km + " kilometres");
    }
}
