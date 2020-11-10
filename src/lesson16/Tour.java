package lesson16;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Tour {
    private String nameOfTour;
    private int price;
    private ArrayList<String> countries = new ArrayList<>();    //сделали пустой мешочек для стран
    private int daysInTrip;
    private ArrayList<Date> dates = new ArrayList<>();


    public Tour() {
    }

    public String getNameOfTour() {
        return nameOfTour;
    }

    public void setNameOfTour(String nameOfTour) {
        this.nameOfTour = nameOfTour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<String> countries) {
        this.countries = countries;
    }

    public int getDaysInTrip() {
        return daysInTrip;
    }

    public void setDaysInTrip(int daysInTrip) {
        this.daysInTrip = daysInTrip;
    }

    public void addCountryToTour(String... countries){
      for(String country:countries){
          this.countries.add(country);
      }
    }

    public void addDatesToTour(Date... dates){
        for(Date date:dates){
            this.dates.add(date);
        }
    }


    public ArrayList<Date> getDates() {
        return dates;
    }

    public void setDates(ArrayList<Date> dates) {
        this.dates = dates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return price == tour.price &&
                daysInTrip == tour.daysInTrip &&
                Objects.equals(nameOfTour, tour.nameOfTour) &&
                Objects.equals(countries, tour.countries) &&
                Objects.equals(dates, tour.dates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTour, price, countries, daysInTrip, dates);
    }

    @Override
    public String toString() {
        return "Тур{" + "nameOfTour='" + nameOfTour + '\'' +
                ", цена =" + price +
                ", страны =" + countries +
                ", дней в туре =" + daysInTrip +
                ", даты =" + dates +
                '}';
    }

    public boolean conteinsCountry(String country) {
        return countries.contains(country);
    }
}
