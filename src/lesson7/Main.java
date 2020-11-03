package lesson7;

public class Main {
    public static void main(String[] args) {
        String email = "admin@gmail.com";

        //int otvet = email.length();
        //System.out.println(otvet);
        boolean containsDog = false;

        for (int i = 0; i < email.length(); i++){
            char currentChar = email.charAt(i);
            if (currentChar == '@'){
                containsDog = true;
                break;

            }

        }

        System.out.println(containsDog);

        String [] parthOfEmail = email.split("@");
        String lastPart = parthOfEmail [parthOfEmail.length - 1];
        lastPart.contains(".");
        boolean containsPoint = lastPart.contains(".");
        System.out.println(containsPoint);




    }
}
