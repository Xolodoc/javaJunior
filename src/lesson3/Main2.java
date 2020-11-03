package lesson3;

public class Main2 {
    public static void main(String[] args) {

        // int[] num = new int[8];
        int[] num = {5,7,9,3,1,4,2};
        for ( int i = 0; i < num.length; i ++ ){
            if(num[i] % 2 == 0){
                System.out.println(num[i]);
            }

        }
    }
}
