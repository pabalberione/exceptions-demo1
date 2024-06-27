package ejercicio5;

public class main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Phone", 5);

        try {
            inventory.sellProduct("Laptop", 3);
            System.out.println("Laptops left: " + inventory.getProductQuantity("Laptop"));

            inventory.sellProduct("Phone", 6);
        } catch (ProductNotAvailableException e) {
            System.out.println(e.getMessage()); // Debería imprimir "Product not available or insufficient quantity."
        }

        try {
            inventory.sellProduct("Tablet", 1);
        } catch (ProductNotAvailableException e) {
            System.out.println(e.getMessage()); // Debería imprimir "Product not available or insufficient quantity."
        }
    }
}

