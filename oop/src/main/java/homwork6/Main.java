package homwork6;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("milk",35,100);
        Product product1 = new Product("bread",12,50);
        Stock stock = new Stock();
        stock.setCategory(product);
        stock.setCategory(product1);
        Warehouse warehouse = new Warehouse();
        warehouse.findProduct("milk");
        Order order = new Order();
        order.search(product);
    }
}
