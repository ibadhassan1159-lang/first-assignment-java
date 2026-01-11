import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original selling price: ");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (discountPercent / 100) * originalPrice;
        double discountedPrice = originalPrice - discountAmount;

        System.out.println("Discounted Selling Price: " + discountedPrice);

        sc.close();
    }
}
