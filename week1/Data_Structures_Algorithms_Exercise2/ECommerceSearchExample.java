package Data_Structures_Algorithms_Exercise2;

/**
 * Author: Sharika
 * 
 * Exercise 2: E-commerce Platform Search Function
 * 
 * This program shows how to search products using Linear Search and Binary Search.
 * It also compares their time complexity.
 */
public class ECommerceSearchExample {

    // Product class with productId, productName, and category
    static class Product {
        int productId;
        String productName;
        String category;

        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
    }

    // Linear search for product name
    static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Binary search for productId (array must be sorted by productId)
    static int binarySearch(Product[] products, int id) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == id) {
                return mid;
            } else if (products[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // Asymptotic Notation:
        System.out.println("Big O notation shows how fast an algorithm runs as input grows.");
        System.out.println("Linear Search: Best = O(1), Average = O(n), Worst = O(n)");
        System.out.println("Binary Search: Best = O(1), Average/Worst = O(log n) (array must be sorted)");
        System.out.println();

        // Sample products
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "T-shirt", "Clothing"),
            new Product(104, "Book", "Education")
        };

        // Linear search example
        String searchName = "Phone";
        int index1 = linearSearch(products, searchName);
        if (index1 != -1) {
            System.out.println("Linear Search: Found " + searchName + " at index " + index1);
        } else {
            System.out.println("Linear Search: " + searchName + " not found");
        }

        // Binary search example (products array must be sorted by productId, which it is)
        int searchId = 103;
        int index2 = binarySearch(products, searchId);
        if (index2 != -1) {
            System.out.println("Binary Search: Found product ID " + searchId + " at index " + index2);
        } else {
            System.out.println("Binary Search: Product ID " + searchId + " not found");
        }

        // Analysis
        System.out.println();
        System.out.println("Linear Search checks each item one by one. Binary Search divides the list.");
        System.out.println("For big lists, Binary Search is faster but needs sorted data.");
    }
}
