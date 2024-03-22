public class OrderTracker {
    public void trackOrder(String orderNumber) {
        System.out.println("Tracking order " + orderNumber + "...");
        // Логика отслеживания статуса заказа
        String status = "Delivered";  // Предположим, что заказ был доставлен
        System.out.println("Order " + orderNumber + " status: " + status);
    }
}