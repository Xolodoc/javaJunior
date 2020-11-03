package uprazhneniya;

public class Kvadrat {
    // площадь и периметр
    private int storona;

    public Kvadrat() {

    }

    public Kvadrat(int storona) {
        this.storona = storona;
    }

    public void setStorona(int storona) {
        this.storona = storona;
    }

    public int getStorona() {
        return this.storona;
    }

    public int perimetr() {
        return 4 * this.storona;
    }

    public int square() {
        return this.storona * this.storona;
    }
}
