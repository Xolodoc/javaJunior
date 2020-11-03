package lesson7;

public class Main2 {
    public static void main(String[] args) {

       int perimetr1 = StringUtils.perimetrTreugolnika(2,4,7);
        System.out.println(perimetr1);

        int perimetr2 = StringUtils.perimetrTreugolnika(5,4,8);
        System.out.println(perimetr2);


        String text = StringUtils.reverseText("аргентинаманитнегра");
        System.out.println(text);
    }
}
