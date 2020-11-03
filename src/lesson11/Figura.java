package lesson11;
//Исходя из этого интерфейса, нужно сделать 4 любых его реализации.
public interface Figura {

    double ploshad();

    double ploshad(double storona1, double storona2);

    double perimetr();

    double perimetr(double storona1, double storona2, double storona3);

    void printFullInfo();
}
