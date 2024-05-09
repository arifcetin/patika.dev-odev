package PatikaStore;

// Notebook class representing a notebook product, inheriting from Product class
class Notebook extends Product {
    int ram;
    int storage;
    double screenSize;

    public Notebook(int id, double unitPrice, double discountRatio, int stockQuantity, String productName, Brand brand, int ram, int storage, double screenSize) {
        super(id, unitPrice, discountRatio, stockQuantity, productName, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }
}
