package Assignment2;
import java.util.ArrayList;
import java.util.List;

public class productvalue {
	

	    private List<Product> products;

	    // Constructor
	    public productvalue() {
	        products = new ArrayList<>();
	    }

	    // Method to add a product to the inventory
	    public void addProduct(Product product) {
	        products.add(product);
	    }

	    // Method to check if a product with given ID is available
	    public boolean isProductAvailable(int productId) {
	        for (Product product : products) {
	            if (product.getProductId() == productId) {
	                return product.isAvailable();
	            }
	        }
	        return false; // Product with given ID not found
	    }

	    // Main method to test the functionality
	    public static void main(String[] args) {
	        // Create inventory
	        productvalue inventory = new productvalue();

	        // Add some products
	        inventory.addProduct(new Product(0, "Laptop", 999.99, 5));
	        inventory.addProduct(new Product(1, "Mouse", 19.99, 10));
	        inventory.addProduct(new Product(2, "Keyboard", 29.99, 78)); // Out of stock

	        // Check availability
	        System.out.println("Product 1 available? " + inventory.isProductAvailable(1));
	        System.out.println("Product 3 available? " + inventory.isProductAvailable(3));
	    }
	}



