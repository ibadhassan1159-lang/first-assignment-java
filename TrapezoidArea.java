import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of first parallel side: ");
        double a = sc.nextDouble();

        System.out.print("Enter length of second parallel side: ");
        double b = sc.nextDouble();

        System.out.print("Enter the height: ");
        double c = sc.nextDouble();

        double area = c * (a + b) / 2;

        System.out.println("Area of the trapezoid is: " + area);

        sc.close();
    }
}
