import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter voltage (in Volts): ");
        double volts = sc.nextDouble();

        System.out.print("Enter current (in Amperes): ");
        double amperes = sc.nextDouble();

        double watts = volts * amperes;

        System.out.println("Power Consumption: " + watts + " Watts");

        sc.close();
    }
}

