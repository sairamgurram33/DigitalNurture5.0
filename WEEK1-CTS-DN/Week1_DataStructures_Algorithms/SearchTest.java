package Week1_DataStructures_Algorithms;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        Product p = binarySearch(products, 102);

        if(p != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + p.productId);
            System.out.println("Name: " + p.productName);
            System.out.println("Category: " + p.category);
        }
        else {
            System.out.println("Product Not Found");
        }
    }

    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(products[mid].productId == id) {
                return products[mid];
            }

            if(products[mid].productId < id) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static Product linearSearch(Product[] products, String name) {

        for(Product p : products) {
            if(p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }

        return null;
    }
}