package uprazhneniya;

public class Square {
    public static void main(String[] args) {

        Kvadrat kvadrat = new Kvadrat(5);

        int result = kvadrat.perimetr();
        int result2 = kvadrat.square();
        System.out.println(result);
        System.out.println(result2);

        Pryamougolnik pryamougolnik = new Pryamougolnik(5, 8);

        int ishod = pryamougolnik.perimetr();
        int ishod2 = pryamougolnik.square();
        System.out.println(ishod);
        System.out.println(ishod2);

        Treugolnik treugolnik = new Treugolnik(5, 3, 8, 12);
        int perimetr = treugolnik.perimetr();
        int square = treugolnik.square();
        System.out.println(perimetr);
        System.out.println(square);

// как вставить условие про стороны из Отличника?????????????????
        Elips elips = new Elips(15,10);
        double perimetor = elips.perimetor();
        double squared = elips.squared();
        System.out.println(perimetor);
        System.out.println(squared);
    }


}
