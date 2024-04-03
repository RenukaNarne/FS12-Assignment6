import java.util.Scanner;

public class TotalExpensesCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input quantity and price per item
        System.out.print("Enter quantity purchased: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();
        
        // Calculate total expenses without discount
        double totalExpenses = quantity * pricePerItem;
        
        // Apply discount based on quantity purchased
        double discount = 0;
        if (quantity > 50) {
            discount = 0.1 * totalExpenses; // 10% discount
        } else if (quantity >= 25 && quantity <= 50) {
            discount = 0.05 * totalExpenses; // 5% discount
        }
        
        // Calculate final total expenses after discount
        double finalTotalExpenses = totalExpenses - discount;
        
        // Output the total expenses
        System.out.println("Total expenses: $" + finalTotalExpenses);
        
        scanner.close();
    }
}
