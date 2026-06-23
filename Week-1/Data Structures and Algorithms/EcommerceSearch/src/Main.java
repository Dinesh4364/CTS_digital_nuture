import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(1, "Shoes", "Fashion"),
            new Product(5, "Phone", "Electronics"),
            new Product(2, "Watch", "Accessories")
        };

        // Linear Search
        Product result1 = SearchAlgorithms.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + result1);

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        // Binary Search
        Product result2 = SearchAlgorithms.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + result2);
    }
}