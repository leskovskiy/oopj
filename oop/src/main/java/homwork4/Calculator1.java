package homwork4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


public class Calculator1 {
    public Double mul(List<? extends Number> list){
        Double mul = 1.0;
        for (Number num:list
             ) {
            mul*=num.doubleValue();
        }
        return mul;
    }

    public Double div(List<? extends Number> list){
        Double div = 1.0;
        for (Number num:list
        ) {
            div/=num.doubleValue();
        }
        return div;
    }

    public static String bin(Integer binary){
        if (binary == 0){
            return "0";
        }
        return bin(binary / 2)+(binary % 2);
    }
}
