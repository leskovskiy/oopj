package homwork6;

public class Order implements ProcessOder{
    @Override
    public String search(Product product) {
        return "Продукт: " + product.getName() + "в наличии" ;
    }
}
