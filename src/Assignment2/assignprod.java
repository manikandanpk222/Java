package Assignment2;

public class assignprod {

	    private int productId;
	    private String productName;
	    private double unitPrice;
	    private int quantity;

	    // Constructor
	    public assignprod(int productId, String productName, double unitPrice, int quantity) {
	        this.productId = productId;
	        this.productName = productName;
	        this.unitPrice = unitPrice;
	        this.quantity = quantity;
	    }

	    // Getters
	    public int getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public double getUnitPrice() {
	        return unitPrice;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    // Method to check if the product is available
	    public boolean isAvailable() {
	        return quantity > 0;
	    }
	}

	