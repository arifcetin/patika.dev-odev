package PatikaStore;

// Product class to represent a product
class Product {
    int id;
    double unitPrice;
    double discountRatio;
    int stockQuantity;
    String productName;
    Brand brand;

    public Product(int id, double unitPrice, double discountRatio, int stockQuantity, String productName, Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRatio = discountRatio;
        this.stockQuantity = stockQuantity;
        this.productName = productName;
        this.brand = brand;
    }
}
