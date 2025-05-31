public class Product {
    private String productName;
    private int productId;
    private double price;
    private int stockQuantity;

    public void setProductName(String name) {
        productName = name;
    }

    public void setProductId(int id) {
        productId = id;
    }

    public void setPrice(double p) {
        if (p >= 0) {
            price = p;
        }
    }

    public void purchaseProduct(int quantity) {
        if (quantity <= stockQuantity) {
            stockQuantity -= quantity;
        }
    }

    public void restockProduct(int quantity) {
        stockQuantity += quantity;
    }

    public double getPrice() {
        return price;
    }
}
