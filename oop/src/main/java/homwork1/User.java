package homwork1;

import java.util.List;

public class User {
    Integer password;
    String log;

    List<Basket> buyUs;


    public User(Integer password, String log, List<Basket> buyUs) {
        this.password = password;
        this.log = log;
        this.buyUs = buyUs;
    }

    public User() {
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public List<Basket> getBuyUs() {
        return buyUs;
    }

    public void setBuyUs(List<Basket> buyUs) {
        this.buyUs = buyUs;
    }
}
