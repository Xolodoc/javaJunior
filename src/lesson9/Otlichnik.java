package lesson9;

public class Otlichnik extends Student {

    @Override //анотация, есть где-то на уровень выше метод, кот. мы сейчас переопределяем
    public void printPerimetrTreugolnila(int a, int b, int c) {
    if(a + b < c || a + c < b || c + b < a){
        System.out.println("Это не треугольник!!! Не буду считать.");
        return;
    }

        System.out.println(a+b+c);

    }
}
