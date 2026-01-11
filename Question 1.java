import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input obtained marks
        System.out.print("Enter total obtained marks: ");
        double obtainedMarks = sc.nextDouble();

        // Input maximum marks
        System.out.print("Enter maximum marks: ");
        double maximumMarks = sc.nextDouble();

        // Calculate percentage
        double percentage = (obtainedMarks / maximumMarks) * 100;

        // Display result
        System.out.println("Percentage Marks = " + percentage + "%");

        sc.close();
    }
}

    

