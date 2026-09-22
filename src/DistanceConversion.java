import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class DistanceConversion {

    public static void main(String[] args) {
        milestokm();
    }

    public static void milestokm() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of miles you'd like to convert: ");
        BigDecimal miles = input.nextBigDecimal();

        BigDecimal conversionRate = BigDecimal.valueOf(1.60934);
        BigDecimal km = miles.multiply(conversionRate)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println(miles + " miles = " + km + " kilometres");
    }
}
