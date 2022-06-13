package entities;

public class Product {
    private String id, nama;
    private double price;

    public Product(String id, String nama, double price) {
        this.id = id;
        this.nama = nama;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", price=" + price +
                '}';
    }
}
