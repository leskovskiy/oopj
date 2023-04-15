package homwork1;

import java.util.List;
import java.util.Locale;
import java.util.SplittableRandom;

public class Сategorya extends Tovar {
    public String nameCategor;
    public List<String> catalog;



    public Сategorya(String nameCategor, List<String> catalog) {
        this.nameCategor = nameCategor;
        this.catalog = catalog;

    }

    public Сategorya() {
    }

    public String getNameCategor() {
        return nameCategor;
    }

    public void setNameCategor(String nameCategor) {
        this.nameCategor = nameCategor;
    }

    public List<String> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<String> catalog) {
        this.catalog = catalog;
    }


}
