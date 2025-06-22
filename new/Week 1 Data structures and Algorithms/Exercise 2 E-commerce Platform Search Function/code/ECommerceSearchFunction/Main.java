import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "T-shirt", "Clothing"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Sneakers", "Footwear"),
            new Product(4, "Book", "Stationery"),
            new Product(5, "Smartphone", "Electronics")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product ID to search: ");
        int targetId = scanner.nextInt();

        Product linearResult = LinearSearch.search(products, targetId);
        Product binaryResult = BinarySearch.search(products, targetId);

        System.out.println("Linear Search Result:");
        System.out.println(linearResult != null ? linearResult : "Product not found");

        System.out.println("Binary Search Result:");
        System.out.println(binaryResult != null ? binaryResult : "Product not found");

        scanner.close();
    }
}
