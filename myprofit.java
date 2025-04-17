import java.util.Scanner;
public class myprofit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input cost price
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        // Input selling price
        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        // Input discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Close scanner
        scanner.close();

        // Calculate discounted selling price
        double discountAmount = sellingPrice * (discountPercentage / 100);
        double discountedSellingPrice = sellingPrice - discountAmount;

        // Determine profit or loss
        if (discountedSellingPrice > costPrice) {
            double profit = discountedSellingPrice - costPrice;
            System.out.printf("Profit: %.2f%n", profit);
        } else if (discountedSellingPrice < costPrice) {
            double loss = costPrice - discountedSellingPrice;
            System.out.printf("Loss: %.2f%n", loss);
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
    
}
