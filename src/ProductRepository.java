import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProductsByKeyword(String keyword) {
        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.name.toLowerCase().contains(keyword.toLowerCase())) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }
}