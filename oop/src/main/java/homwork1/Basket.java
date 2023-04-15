package homwork1;

import java.util.List;

public class Basket {
    public List<String> bueYovar;

    public Basket(List<String> byeYovar) {
        this.bueYovar = byeYovar;
    }

    public Basket() {
    }

    public List<String> getByeYovar() {
        return bueYovar;
    }

    public void setByeYovar(List<String> byeYovar) {
        this.bueYovar = byeYovar;
    }
}
