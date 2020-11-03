package lesson11;

import lesson12.FractionNumberOperationImpl;

public class Main1 {
    public static void main(String[] args) {
        FractionNumberImpl number1 = new FractionNumberImpl(3,4);
        FractionNumberImpl number2 = new FractionNumberImpl(8,5);
        System.out.println(number1);
        System.out.println(number2);

        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();
        FractionNumber resultAdd = operation.add(number1, number2);
        System.out.println(resultAdd);

    }

}
// умножение, деление, вычитание домашка