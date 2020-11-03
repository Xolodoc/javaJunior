package lesson11;

public class Tiger implements ZooAnimal {


    @Override
    public void voice() {
        System.out.println("ppppppp");
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");
    }

    @Override
    public void run() {
        System.out.println("Тигр бегает");
    }

}
