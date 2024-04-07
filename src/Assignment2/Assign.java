package Assignment2;

class Product {
	int productId;
    String name;
    double price;
    int quantity;

    public Product(int productId,String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int getProductId() {
        return productId;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean isAvailable() {
        return quantity > 0;
    }
}

class Inventory {
    Product[] products;
    int currentIndex;

    public Inventory(int capacity) {
        products = new Product[capacity];
        currentIndex = 0;
    }

    public void addProduct(int productId,String name, double price, int quantity) {
        if (currentIndex < products.length) {
            products[currentIndex++] = new Product(productId,name, price, quantity);
        } else {
            System.out.println("Inventory is full. Cannot add more products.");
        }
    }

    public void removeProduct(String name) {
        for (int i = 0; i < currentIndex; i++) {
            if (products[i].getName().equals(name)) {
                products[i] = products[currentIndex - 1];
                currentIndex--;
                System.out.println("Product " + name + " removed from inventory.");
                return;
            }
        }
        System.out.println("Product " + name + " not found in inventory.");
    }

    public void updateQuantity(String name, int quantity) {
        for (int i = 0; i < currentIndex; i++) {
            if (products[i].getName().equals(name)) {
                products[i].setQuantity(quantity);
                System.out.println("Quantity of product " + name + " updated to " + quantity + ".");
                return;
            }
        }
        System.out.println("Product " + name + " not found in inventory.");
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (int i = 0; i < currentIndex; i++) {
            Product product = products[i];
            System.out.println("Name: " + product.getName() +
                    ", Price: $" + product.getPrice() +
                    ", Quantity: " + product.getQuantity());
        }
    }
}

public class Assign {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(10); // Capacity of 10 products

        // Adding some initial products to inventory
        inventory.addProduct(0, "Laptop", 999.99, 10);
        inventory.addProduct(1, "Smartphone", 499.99, 20);
        inventory.addProduct(2, "Tablet", 299.99, 456);

        // Displaying inventory
        inventory.displayInventory();

        // Removing a product
        inventory.removeProduct("Tablet");

        // Updating quantity
        inventory.updateQuantity("Smartphone", 25);

        // Displaying updated inventory
        inventory.displayInventory();
    }
}

