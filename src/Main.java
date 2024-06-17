import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TASK 1
        int[] ThreeIntArray = new int[]{1, 2, 3};
        double[] ThreeFractionsArray = {1.57, 7.654, 9.986};
        String[] ThreeStringArray = {"One", "Two", "Three"};

        //TASK 2
        for (int i = 0; i < ThreeIntArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(ThreeIntArray[i]);
        }
        System.out.println();
        for (int i = 0; i < ThreeFractionsArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(ThreeFractionsArray[i]);
        }
        System.out.println();
        for (int i = 0; i < ThreeStringArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(ThreeStringArray[i]);
        }
        System.out.println();
        //TASK 3
        for (int i = ThreeIntArray.length - 1; i >= 0; i--){
            if (i < ThreeIntArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(ThreeIntArray[i]);
        }
        System.out.println();

        for (int i = ThreeFractionsArray.length - 1; i >= 0; i--){
            if (i < ThreeFractionsArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(ThreeFractionsArray[i]);
        }
        System.out.println();

        for (int i = ThreeStringArray.length - 1; i >= 0; i--){
            if (i < ThreeStringArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(ThreeStringArray[i]);
        }
        System.out.println();

        //TASK 4
        for (int i = 0; i < ThreeIntArray.length; i++) {
            if (ThreeIntArray[i] % 2 != 0) {
                ThreeIntArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(ThreeIntArray));

    }
}