package Arrays;

public class Product {
    private String name;
    private int priceInCents;

    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }
    public static double findAveragePrice(Product[] products){
        int total = 0;
        for(Product p : products){
            total += p.priceInCents;
        }
        return (double) total/ products.length;
    };

    public static void main(String[] args) {
        Product[] product = new Product[4];
        product[0] = new Product("Wrench", 320);
        product[1] = new Product("Hammer", 300);
        product[2] = new Product("Bolts", 150);
        product[3] = new Product("Nails", 120);

        System.out.println("Average price of all products: " + Product.findAveragePrice(product));


    }
}
