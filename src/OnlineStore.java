public class OnlineStore {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com");
        Product product1 = new Product("Laptop", 1000, "Lenovo", 4.5);
        Product product2 = new Product("Mouse", 20, "Logitech", 4.2);

        ProductRepository productRepository = new ProductRepository();
        productRepository.products.add(product1);
        productRepository.products.add(product2);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(product1, 1);
        shoppingCart.addItem(product2, 2);

        double totalCost = shoppingCart.calculateTotal();
        System.out.println("Total cost: $" + totalCost);

        OrderTracker orderTracker = new OrderTracker();
        orderTracker.trackOrder("12345");
    }
}