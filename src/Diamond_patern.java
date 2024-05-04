import java.util.Scanner;

public class Diamond_patern {
    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 3; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 3; k >= i; k--) {
//                System.out.print(" * ");
//            }
//            System.out.println(); // No extra space
//        }


                if (7 % 2 == 0) {

                }

                int midRow = (7 + 1) / 2;

                // Upper half of the diamond
                for (int i = 1; i <= midRow; i++) {
                    for (int j = 1; j <= midRow - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                // Lower half of the diamond
                for (int i = midRow - 1; i >= 1; i--) {
                    for (int j = 1; j <= midRow - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }



    }
}
