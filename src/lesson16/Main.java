package lesson16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour();
        tour1.setDaysInTrip(7);
        tour1.setNameOfTour("Вена, я уже еду!");
        tour1.setPrice(23000);
        tour1.addCountryToTour("Австрия", "Венгрия", "Польша");

        Tour tour2 = new Tour();
        tour2.setDaysInTrip(4);
        tour2.setNameOfTour("Вип отдых!");
        tour2.setPrice(20000);
        tour2.addCountryToTour("Люксимбург", "Швейцария", "Монако");

        Tour tour3 = new Tour();
        tour3.setDaysInTrip(8);
        tour3.setNameOfTour("Мифы");
        tour3.setPrice(28000);
        tour3.addCountryToTour("Кипр", "Италия", "Греция");

        Tour tour4 = new Tour();
        tour4.setDaysInTrip(10);
        tour4.setNameOfTour("Завтрак в Мадриде");
        tour4.setPrice(30000);
        tour4.addCountryToTour("Испания", "Португалия", "Франция");

        Tour tour5 = new Tour();
        tour5.setDaysInTrip(14);
        tour5.setNameOfTour("У Славян");
        tour5.setPrice(35000);
        tour5.addCountryToTour("Словакия", "Словения", "Черногория");

        Tour tour6 = new Tour();
        tour6.setDaysInTrip(5);
        tour6.setNameOfTour("По пути фашистов!");
        tour6.setPrice(21000);
        tour6.addCountryToTour("Германия", "Польша", "Дания");

        ToursStorage storage = new ToursStorage();
        storage.addTour(tour1);
        storage.addTour(tour2);
        storage.addTour(tour3);
        storage.addTour(tour4);
        storage.addTour(tour5);
        storage.addTour(tour6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! В какую страну хотите поехать");

        String countryWantToTrip = scanner.next();
        storage.printToursByCountry(countryWantToTrip);

        System.out.println("Какой у вас бюджет?");
        int money = scanner.nextInt();
        storage.printToursByPrice(money);

        System.out.println("На сколько дней вам нужно?");
        int days = scanner.nextInt();
        storage.printToursByDays(days);

        System.out.println("Самый выгодный тур?");
        String bestTour = scanner.next();
        if (bestTour.equals("да")) {
            storage.printCheapestTour();


        }


    }
}