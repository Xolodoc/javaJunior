package uprazhneniya;

public class GuessGame {
    Plauer p1;
    Plauer p2;
    Plauer p3;

    public void startGame() {
        p1 = new Plauer();
        p2 = new Plauer();
        p3 = new Plauer();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1Right = false;
        boolean p2Right = false;
        boolean p3Right = false;

        int targeNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targeNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй тгрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targeNumber) {
                boolean plisRight = true;
            }
            if (guessp2 == targeNumber) {
                boolean p2isRight = true;
            }
            if (guessp3 == targeNumber) {
                boolean p3isRight = true;
            }

            boolean p1isRight = false;
            boolean p2isRight = false;
            boolean p3isRight = false;
            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println("Конец игры.");
                break;

            } else {

                System.out.println("Игроки должны попробовать еще раз.");
            }
        }
    }
}
