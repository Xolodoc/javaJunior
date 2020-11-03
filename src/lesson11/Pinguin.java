package lesson11;

public class Pinguin implements ZooAnimal {
    @Override
    public void voice() {
        System.out.println("AAAAAA");
    }

    @Override
    public void jump() {
        System.out.println("Пингвин прыгает");
    }

    @Override
    public void run() {
        System.out.println("Пингвин бегает");
    }
}
