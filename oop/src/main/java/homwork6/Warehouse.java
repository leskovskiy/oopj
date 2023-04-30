package homwork6;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements ProcessWarehouse{


    private static List<Product> allprod = new ArrayList<>();


    @Override
    public List<Product> findProduct(String name) {
        List<Product> searcres = new ArrayList<>();
        for (Product p: allprod) {
            if(p.getName().equals(name)){
                searcres.add(p);
            }
        }
        return searcres;
    }

    @Override
    public void addProductinStock(Product product) {
        System.out.println("Добавлен продукт:" + product);

    }

    @Override
    public void remoweProdinStock(Product product, List<Product> list) {
        list.remove(product);
        System.out.println(list);

    }
}
