package PatikaStore;

// SmartPhone class representing a smartphone product, inheriting from Product class
class SmartPhone extends Product {
    int storage;
    double screenSize;
    int camera;
    double battery;
    int ram;
    String color;

    public SmartPhone(int id, double unitPrice, double discountRatio, int stockQuantity, String productName, Brand brand, int storage, double screenSize, int camera, double battery, int ram, String color) {
        super(id, unitPrice, discountRatio, stockQuantity, productName, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }
}
