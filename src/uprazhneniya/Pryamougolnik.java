package uprazhneniya;

public class Pryamougolnik {
    private int a;
    private int b;

public Pryamougolnik(){

}
    public Pryamougolnik(int a, int b) {

        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return this.b;
    }

    public int perimetr() {

        return this.a + this.b * 2;
    }

    public int square() {
        return this.a * this.b;
    }


}
