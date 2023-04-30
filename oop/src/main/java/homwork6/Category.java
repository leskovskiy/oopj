package homwork6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements ProductCategory {

    String categoryName;

    @Override
    public String setCategory(Product product) {
        return null;
    }

    @Override
    public String getCategory() {
        return categoryName;
    }
}
