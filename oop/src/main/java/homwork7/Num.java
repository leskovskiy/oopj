package homwork7;

public class Num {
   private Double real;
   private Double image;

    public Num(Double real, Double image) {
        this.real = real;
        this.image = image;
    }

    public Num() {
    }


    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public Double getImage() {
        return image;
    }

    public void setImage(Double image) {
        this.image = image;
    }
}
