import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        this.items.add(new Item(product, quantity));
        System.out.println(quantity + " " + product.name + "(s) added to the cart");
    }

    public double calculateTotal() {
        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.product.price * item.quantity;
        }
        return totalCost;
    }
}