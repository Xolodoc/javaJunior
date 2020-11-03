package uprazhneniya;

public class Elips {

    private double a;
    private double b;

    public Elips() {
    }

    public Elips(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return this.b;
    }

    public double squared() {
        return Math.PI * a * b;
    }

    public double perimetor() {
        return 4 * ((Math.PI * a * b + a - b) / (a + b));
    }

}
