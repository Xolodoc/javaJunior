package homework1;

public class Domashka {
    public static void main(String[] args) {
        int allMoney = 1000;
        int pizza = 230;
        int gum = 26;
        double candy = 2.5;

        int allPizza = allMoney / pizza;
        int allGum = (allMoney % pizza) / gum;
        double allCandy = ((allMoney % pizza) % gum) / candy;
        double money = ((allMoney % pizza) % gum) % candy;

        System.out.println("Скока Пиццы - " + allPizza + " шт");
        System.out.println("Скока Жвачки - " + allGum + " шт");
            if (allCandy / 2 >= 1){
                System.out.println("А чо по конфетам? -" + allCandy + " шт");
            }else {
                System.out.println("На конфеты не хватило");
            }

        }
    }

