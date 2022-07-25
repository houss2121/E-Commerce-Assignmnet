public class Product {

    //
    // Data Members
    //
    String name;
    double price;
    String category;
    int quantity;
    char size;
    String author;
    String color;

    //
    // Constructors
    //

    public Product(String name, double price, String category, int quantity, char size, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.size = size;
        this.color = color;

    }

    public Product(String name, double price, String category, int quantity, String author) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.author = author;
    }

    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    //
    // Methods
    //
    public boolean buy() {
        var val = false;
        if (quantity > 0) {
            quantity--;
            val = true;
        } else {
            val = false;
        }
        return val;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", size=" + size +
                ", author='" + author + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
