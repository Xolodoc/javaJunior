package lesson9;

public class Main {
    public static void main(String[] args) {
        int a = 8;

        // тип переменной
        People vasya = new People (true);
        People petya = new People (true);
        People igor = new People (35, "Игорь", "Иванов", true);

        vasya.setAge(23);
        petya.setAge(14);

        vasya.setName("Вася");
        petya.setName("Петя");

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());
        System.out.println(igor.getAge());

    }
}
