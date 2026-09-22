import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class VolumeConversion {

    public static void main(String[] args) { litrestogallons(); }

    public static void litrestogallons() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of litres that you would like to convert to gallons: ");
        BigDecimal litres = input.nextBigDecimal();

        BigDecimal conversionRate = BigDecimal.valueOf(0.264172);
        BigDecimal gallons = litres.multiply(conversionRate)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println(litres+ " litres = " +gallons+ " gallons");
    }
}
