package lesson16;

import java.util.ArrayList;

public class ToursStorage {
    private ArrayList<Tour> tours = new ArrayList<>();

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public void printToursByCountry(String country) {
        for (Tour t : tours) {
            if (t.conteinsCountry(country)) {
                System.out.println(t);

            }
        }
    }

    public void printToursByPrice(int money) {
        for (Tour t : tours) {
            if (t.getPrice() <= money) {
                System.out.println(t);
            }
        }

    }

    public void printToursByDays(int days) {
        for (Tour t : tours) {
            if (t.getDaysInTrip() == days || t.getDaysInTrip() == days + 1 || t.getDaysInTrip() == days - 1) {
                System.out.println(t);
            }

        }
    }

    public void printCheapestTour() {
        Tour deshevka = tours.get(0);
        for (Tour t : tours) {
            if (t.getPrice() < deshevka.getPrice()) {
                deshevka = t;
            }

        }
        System.out.println(deshevka);

    }
}