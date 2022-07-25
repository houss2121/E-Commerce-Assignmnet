import java.text.NumberFormat;
import java.util.Scanner;

public class Shop {
    private static double totalAmount = 0;
    private static Product[] inventory = {
        new Product("Business Ritual Women's Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue"),
        new Product("The Art of Computer Programming", 190.54, "Books", 9,"Donald E. Kunth"),
        new Product("Men's Business Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal"),
        new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty", 1),
        new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freedman"),
    };
    public static void displayMenu() {
        System.out.println("\n Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4.");
        for (int i = 0; i < inventory.length ; i++) {
            System.out.println(i + ": " + inventory[i].getName());
        }
    }

    public static void main(String[] args) {
        int userInput = 0;
        Scanner scanner = new Scanner(System.in);
        while (userInput >= 0 && userInput <= 4) {
            displayMenu();
            userInput = scanner.nextInt();
            if (userInput >= 0 && userInput <= 4) {
                if (inventory[userInput].buy() == true) {
                    System.out.println("Item added to cart");
                    totalAmount += inventory[userInput].getPrice();
                }
                else {
                    break;
                }
            }
        }
        NumberFormat total = NumberFormat.getCurrencyInstance();
        System.out.println("Thank you for shopping with us! Your total is " + total.format(totalAmount));
    }
}
