public class enumclass {
    
    public static void main(String[] args) {
        for(Laptop lap : Laptop.values())
        System.out.println(lap+" : "+lap.getPrice()+" -> "+lap.getSize());;
    }
}


enum Laptop{
    Macbook(2000,13.6),
    XPS(2200,14.0),
    Surface(1500,15.0);

    private int price;
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    private Laptop(int price, double size) {
        this.price = price;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price) {
        this.price = price;
    }
}