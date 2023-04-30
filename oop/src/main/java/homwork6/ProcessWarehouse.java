package homwork6;

import java.util.List;

public interface ProcessWarehouse {

     List<Product>  findProduct(String name);
    void addProductinStock(Product product);
    void remoweProdinStock(Product product,List<Product> list);
}
