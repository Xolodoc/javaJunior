package lesson3;

public class Main5 {
    public static void main(String[] args) {
        int[] numbs1 = {5, 48, 7, 9, 3, 1, 33, 4};

        int[] numbs2 = {5, 48, 7, 9, 3, 1, 33, 4};

        //      numbs1[0] = numbs2[1];
        //      numbs1[1] = numbs2[2];
        //      numbs1[2] = numbs2[3];
        //      numbs1[3] = numbs2[4];
        //      numbs1[4] = numbs2[5];
        //      numbs1[5] = numbs2[6];
        //      numbs1[6] = numbs2[7];
        //      numbs1[7] = numbs2[0];

        for (int i = 0; i < numbs1.length; i++) {

            if (i == numbs1.length - 1) {
                numbs1[i] = numbs2[0];
            } else {
                numbs1[i] = numbs2[i + 1];
            }
            System.out.println(numbs1[i]);
        }
    }
}
