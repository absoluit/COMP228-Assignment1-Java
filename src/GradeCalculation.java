import java.util.Scanner;

public class GradeCalculation {

    public static void main(String[] args) { gradecalc(); }

public static void gradecalc() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the percent grade you received for course 1: ");
        double grade1 = input.nextDouble();

        System.out.print("Please enter the percent grade you received for course 2: ");
        double grade2 = input.nextDouble();

        System.out.print("Please enter the percent grade you received for course 3: ");
        double grade3 = input.nextDouble();

        System.out.print("Please enter the percent grade you received for course 4: ");
        double grade4 = input.nextDouble();

        System.out.print("Please enter the percent grade you received for course 5: ");
        double grade5 = input.nextDouble();

        System.out.print("Please enter the percent grade you received for course 6: ");
        double grade6 = input.nextDouble();

        double avg = (grade1 +grade2 +grade3 +grade4 +grade5 +grade6)/6;
        String letteravg;

        if (avg >= 90) {
            letteravg = "A";
        } else if (avg >= 70) {
            letteravg = "B";
        } else if (avg >= 60) {
            letteravg = "C";
        } else if  (avg >= 50) {
            letteravg = "D";
        } else {
            letteravg = "F";
        }

        System.out.println("Your average letter grade for this semester is: " +letteravg);
    }
}
