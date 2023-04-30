package homwork6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock  implements ProductCategory{

    private static List<Product> list = new ArrayList<>();


    @Override
    public String setCategory(Product product) {
        return list.toString();
    }

    @Override
    public String getCategory(Product product) {
        return list.toString();
    }
}


}
