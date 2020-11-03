package lesson11;

public class Main {
    public static void main(String[] args) {
        Pinguin pinguin1 = new Pinguin();
        Pinguin pinguin2 = new Pinguin();

        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        ZooAnimal[] animals = new ZooAnimal[4];
        animals[0] = pinguin1;
        animals[1] = pinguin2;
        animals[2] = tiger1;
        animals[3] = tiger2;

        for (ZooAnimal animal : animals) { // ЦИКЛ For ich
            animal.voice(); // проявление ПОЛИМОРФИЗМА - это свойство java
            // работать с разными типами как с одним и тем же. А выполнение
            // программы ьудет как будто мы работаем с разными типами.
        }
    }
}