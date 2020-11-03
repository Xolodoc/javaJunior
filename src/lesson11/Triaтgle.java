package lesson11;

public abstract class Triaтgle implements Figura{
    private double storona1;
    private double storona2;
    private double storona3;
    private double height;


    @Override
    public double ploshad() {
        return 0;
    }

    @Override
    public double ploshad(double storona1, double height) {
        return this.storona1 * this.height / 2;
    }

    @Override
    public double perimetr(double storona1, double storona2, double storona3) {

        return this.storona1 + this.storona2 + this.storona3;
    }

    @Override
    public void printFullInfo() {
return;
    }
}
